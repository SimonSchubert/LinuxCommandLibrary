var emulator = null;
var v86Loading = false;
var pendingCommand = null;
var spinInterval = null;

(function() {
    if (typeof terminalCmd === 'undefined') return;
    if (window.innerWidth <= 768) return;

    var panel = document.createElement('div');
    panel.id = 'terminal-panel';

    var savedState = localStorage.getItem('terminal-collapsed');
    var isMobile = window.innerWidth <= 550;
    var isCollapsed = savedState !== null ? savedState === '1' : isMobile;
    if (isCollapsed) panel.className = 'terminal-collapsed';

    panel.innerHTML =
        '<div id="terminal-header">' +
            '<span>Terminal</span>' +
            '<span id="terminal-status"></span>' +
        '</div>' +
        '<div id="terminal-body">' +
            '<div id="terminal-placeholder">' +
                '<pre id="terminal-ascii">' +
                    '           /\\          \n' +
                    '          /  \\         \n' +
                    '         / /\\ \\        <span class="tp-title">Alpine Linux Terminal</span>\n' +
                    '        / /  \\ \\       \n' +
                    '       / /    \\ \\      <span class="tp-info">Click here or press ▶ on a command</span>\n' +
                    '      / / /\\/\\ \\ \\     <span class="tp-info">to launch a real Linux terminal</span>\n' +
                    '     / / /    \\ \\ \\    <span class="tp-info">in your browser.</span>\n' +
                    '    /___/      \\___\\   \n' +
                '</pre>' +
            '</div>' +
            '<div id="v86-screen"></div>' +
        '</div>' +
        '<div id="terminal-footer">' +
            'Powered by <a href="https://github.com/copy/v86" target="_blank" rel="noopener">v86</a> · ' +
            '<a href="https://alpinelinux.org" target="_blank" rel="noopener">Alpine Linux</a>' +
        '</div>';
    document.body.appendChild(panel);

    document.getElementById('terminal-header').addEventListener('click', toggleTerminalPanel);
    document.getElementById('terminal-body').addEventListener('click', activateTerminal);

    // Disable v86 keyboard when Cmd/Ctrl is held so browser shortcuts (copy/paste) work
    document.addEventListener('keydown', function(e) {
        if (!emulator) return;
        if (e.metaKey || e.ctrlKey) {
            emulator.keyboard_set_status(false);
        }
    });
    document.addEventListener('keyup', function(e) {
        if (!emulator) return;
        if (e.key === 'Meta' || e.key === 'Control') {
            emulator.keyboard_set_status(true);
        }
    });

    // Intercept paste and send to emulator
    document.addEventListener('paste', function(e) {
        if (!emulator) return;
        var text = (e.clipboardData || window.clipboardData).getData('text');
        if (text) {
            e.preventDefault();
            emulator.keyboard_set_status(true);
            emulator.keyboard_send_text(text);
        }
    });

    updateTerminalSpacing();

    // Add run buttons to code blocks (batched)
    var codeWrappers = document.querySelectorAll('.code-wrapper');
    for (var i = 0; i < codeWrappers.length; i++) {
        (function(cw) {
            var codeSpan = cw.querySelector('.code');
            if (!codeSpan) return;

            var rawText = codeSpan.textContent || '';
            var cmd = rawText.replace(/\u00A0/g, ' ').replace(/^\$\s*/, '').trim();
            if (!cmd) return;

            var runBtn = document.createElement('div');
            runBtn.className = 'run-button';
            runBtn.title = 'Run in terminal';
            runBtn.addEventListener('click', function() { runInTerminal(cmd); });
            runBtn.innerHTML = '<img src="/images/icon-play.svg" alt="run" width="24" height="24">';
            cw.appendChild(runBtn);
        })(codeWrappers[i]);
    }
})();

function updateTerminalSpacing() {
    var panel = document.getElementById('terminal-panel');
    if (!panel) return;
    var h = panel.offsetHeight;
    var footer = document.querySelector('footer');
    if (footer) footer.style.paddingBottom = (h + 10) + 'px';
    var btn = document.querySelector('.toggle-all-button');
    if (btn) btn.style.bottom = (h + 10) + 'px';
}

function toggleTerminalPanel() {
    var panel = document.getElementById('terminal-panel');
    if (!panel) return;
    if (panel.classList.contains('terminal-collapsed')) {
        panel.classList.remove('terminal-collapsed');
        localStorage.removeItem('terminal-collapsed');
    } else {
        panel.classList.add('terminal-collapsed');
        localStorage.setItem('terminal-collapsed', '1');
    }
    updateTerminalSpacing();
}

function activateTerminal() {
    if (!emulator && !v86Loading) startTerminal();
}

function runInTerminal(rawCmd) {
    var cmd = rawCmd.replace(/\[/g, '').replace(/\]/g, '');

    var panel = document.getElementById('terminal-panel');
    if (panel && panel.classList.contains('terminal-collapsed')) {
        panel.classList.remove('terminal-collapsed');
        localStorage.removeItem('terminal-collapsed');
    }

    if (emulator) {
        emulator.keyboard_send_text(cmd + '\n');
    } else {
        pendingCommand = cmd;
        startTerminal();
    }
}

function startTerminal() {
    if (emulator || v86Loading) return;
    v86Loading = true;

    var status = document.getElementById('terminal-status');
    if (status) status.textContent = 'Loading...';

    // Replace placeholder with loading animation
    var tbody = document.getElementById('terminal-body');
    if (tbody) tbody.classList.add('loading');
    var ph = document.getElementById('terminal-placeholder');
    if (ph) {
        ph.innerHTML =
            '<pre id="terminal-ascii">' +
                '<span id="terminal-spinner"></span>\n\n' +
                '<span class="tp-info">Loading Alpine Linux terminal...</span>\n' +
            '</pre>';
        var frames = ['|', '/', '-', '\\'];
        var fi = 0;
        var spinner = document.getElementById('terminal-spinner');
        spinInterval = setInterval(function() {
            if (spinner) spinner.textContent = '  ' + frames[fi++ % 4];
        }, 150);
    }

    var script = document.createElement('script');
    script.src = '/v86/libv86.js';
    script.onload = function() {
        var screen = document.getElementById('v86-screen');
        if (!screen) return;

        var config = {
            wasm_path: '/v86/v86.wasm',
            memory_size: 256 * 1024 * 1024,
            vga_memory_size: 2 * 1024 * 1024,
            screen_container: screen,
            bios: { url: '/v86/seabios.bin' },
            vga_bios: { url: '/v86/vgabios.bin' },
            bzimage: { url: '/v86/vmlinuz' },
            initrd: { url: '/v86/initramfs.gz' },
            cmdline: 'rdinit=/init console=tty0',
            autostart: true,
            disable_keyboard: false,
            disable_mouse: true,
        };

        // Try to enable networking (may fail in some browsers)
        var booted = false;
        function boot(withNetwork) {
            if (booted) return;
            booted = true;
            if (withNetwork) {
                config.net_device = { type: 'virtio', relay_url: 'wss://relay.widgetry.org/' };
            }
            if (status) status.textContent = withNetwork ? 'Booting...' : 'Booting (offline)...';
            bootEmulator(config, status);
        }
        try {
            var ws = new WebSocket('wss://relay.widgetry.org/');
            var timeout = setTimeout(function() { ws.close(); boot(false); }, 3000);
            ws.onopen = function() { clearTimeout(timeout); ws.close(); boot(true); };
            ws.onerror = function() { clearTimeout(timeout); boot(false); };
        } catch(e) {
            boot(false);
        }
    };
    script.onerror = function() {
        if (status) status.textContent = 'Failed to load';
        v86Loading = false;
    };
    document.head.appendChild(script);
}

function bootEmulator(config, status) {
    emulator = new V86(config);

    emulator.add_listener('emulator-ready', function() {
        if (status) status.textContent = '';
        if (spinInterval) { clearInterval(spinInterval); spinInterval = null; }
        var ph = document.getElementById('terminal-placeholder');
        if (ph) ph.remove();
        var tbody = document.getElementById('terminal-body');
        if (tbody) tbody.classList.remove('loading');
        v86Loading = false;
        updateTerminalSpacing();

        if (pendingCommand) {
            setTimeout(typePendingCommand, 30000);
        }
    });
}

function typePendingCommand() {
    if (!pendingCommand || !emulator) return;

    var cmd = pendingCommand;
    pendingCommand = null;

    if (terminalStatus === 'installable') {
        emulator.keyboard_send_text('apk add ' + terminalCmd + ' && ' + cmd + '\n');
    } else {
        emulator.keyboard_send_text(cmd + '\n');
    }
}
