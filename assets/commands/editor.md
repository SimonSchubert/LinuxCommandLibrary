# TLDR

**Open the default editor**

```editor [file.txt]```

**Change default editor**

```sudo update-alternatives --config editor```

**Set editor via environment**

```export EDITOR=vim```

**Set visual editor**

```export VISUAL=nano```

# SYNOPSIS

**editor** [_file_]

# DESCRIPTION

**editor** is a symbolic link or alias to the system's default text editor. On Debian-based systems, it's managed by the alternatives system and typically points to nano, vim, or another installed editor.

The editor command provides a standard way for programs to invoke a text editor. Commands like crontab, visudo, and git commit use the EDITOR or VISUAL environment variables to determine which editor to launch.

# CONFIGURATION

```bash
# Check current editor
update-alternatives --display editor

# Set default (Debian/Ubuntu)
sudo update-alternatives --config editor

# Set via environment
export EDITOR=vim
export VISUAL="code --wait"
```

# EDITOR PRIORITY

Programs typically check in order:
1. VISUAL (for graphical terminals)
2. EDITOR (for any terminal)
3. System default (editor, /usr/bin/editor)

# CAVEATS

The editor command may not exist on all systems. Environment variables override system settings. Some programs ignore EDITOR and use their own configuration. Graphical editors need --wait or similar flag for proper integration.

# SEE ALSO

[vim](/man/vim)(1), [nano](/man/nano)(1), [emacs](/man/emacs)(1), [update-alternatives](/man/update-alternatives)(8)
