# TAGLINE

Native GPU terminal with workspaces, splits, and SSH

# TLDR

**Start** Neptune

```neptune```

Open a workspace at a **directory**

```neptune --cwd [/path/to/project]```

Open an **SSH** workspace

```neptune --ssh [user@host]```

Use a **TOML config** and skip saved workspaces

```neptune --config [~/neptune.toml] --no-restore```

Run a **command** in the first local terminal

```neptune --command "[htop]"```

Print the **version**

```neptune --version```

# SYNOPSIS

**neptune** [_--cwd_ _PATH_] [_--ssh_ _DEST_] [_--config_ _PATH_] [_--data-root_ _PATH_] [_--command_ _CMD_] [_--size_ _WxH_] [_--screenshot_ _PATH_] [_--no-restore_] [_--diagnostics_]

# PARAMETERS

**--cwd** _PATH_
> Open a workspace at _PATH_. The directory must exist

**--ssh** _DEST_
> Open a workspace whose terminals run on an SSH host. _DEST_ is an OpenSSH destination (`host`, `user@host`, an `~/.ssh/config` alias, or `ssh://user@host:port`). Cannot be combined with **--command**

**--config** _PATH_
> Use a TOML configuration file instead of the default

**--data-root** _PATH_
> Isolate settings and saved workspace/window state under this directory

**--command** _CMD_
> Type this shell command into the first terminal after it starts. Local workspaces only

**--size** _WIDTHxHEIGHT_
> Override saved window size and maximized state. Width and height must be **640x400** to **8192x8192**

**--screenshot** _PATH_
> Capture the native window after 3 seconds and exit (ephemeral; does not restore saved window state)

**--no-restore**
> Start without saved workspaces

**--diagnostics**
> Print renderer and display details

**-V**, **--version**
> Print `Neptune` and the package version and exit

**-h**, **--help**
> Print usage and exit

Unknown options fail with "Unknown option … Try --help".

# DESCRIPTION

**Neptune** is a native Rust GPU terminal (egui/eframe, wgpu) with workspaces, tabs, split panes, groups, scrollback, terminal search, a command palette, and 715 built-in themes. It is inspired by cmux and Ghostty and has no webview. The binary is **neptune** (`default-run`); the crate is **neptune-terminal**. Version **0.1.0-rc.4**. MIT license. Rust **1.97.1**. Linux is the local verification platform.

Each workspace holds independent PTY sessions. Terminals are tabs; a split puts places side by side. SSH workspaces run the system **ssh** client once per terminal, so `~/.ssh/config`, keys, and the agent apply. Password and host-key prompts appear in the terminal. Neptune stores the destination and last remote directory, never a credential.

Local Unix terminals can resume Claude Code, Codex, OpenCode, pi, and Oh My Pi sessions. **Projects** is a lead-agent chat panel that starts other agents in their own terminals (local Unix, with Claude Code or Codex installed).

On Linux, starting **neptune** restores a saved host environment before the GUI, then runs the native window (`rs.neptune.terminal`). A graphical desktop and a working graphics driver are required. Debian/Ubuntu build deps include pkg-config, libxkbcommon, Wayland, and xcb development packages.

# CONFIGURATION

Use **neptune --config** _file_, or the application's default config. Omitted fields use defaults. Unknown keys are rejected. Restart after editing keybindings. Example keys from `config.example.toml`:

**theme**
> One theme for the window and terminal (for example `graphite`, `dusk`, `light`, or a palette id such as `iterm:Dracula`)

**font_family** / **font_size** / **line_height**
> Terminal monospace family (default JetBrains Mono), size 9–32 (default 14), line-height 1.0–2.0 (default 1.4)

**scrollback**
> History lines per terminal, 0–1,000,000 (default 10000)

**shell** / **shell_args**
> Local shell executable and its arguments. Omitted shell uses the platform default. SSH terminals use the remote login shell

**cursor** / **cursor_blink**
> `block`, `beam`, or `underline`; blink on or off

**restore_workspaces** / **confirm_close** / **warn_running_processes**
> Restore organization on launch; always confirm closes; warn when processes are running

**desktop_notifications**
> Native banners for BEL/OSC notifications

**[keybindings]**
> Override shortcuts. `[]` disables an action. Primary is Ctrl on Linux. Escape is reserved for cancelling UI

# CAVEATS

Needs a GPU and a graphical session. **--command** cannot be combined with **--ssh** (the first SSH prompt may not be a shell). macOS and Windows still need native runtime verification before a production release. SSH uses the system **ssh** on PATH. Remote port discovery currently needs a Linux or Unix host.

# HISTORY

**Neptune** is an MIT-licensed Rust terminal. Crate **neptune-terminal** **0.1.0-rc.4**. Homepage **neptune.rs**.

# SEE ALSO

[ghostty](/man/ghostty)(1), [kitty](/man/kitty)(1), [alacritty](/man/alacritty)(1), [wezterm](/man/wezterm)(1), [foot](/man/foot)(1), [tmux](/man/tmux)(1), [ssh](/man/ssh)(1)

# RESOURCES

```[Source code](https://github.com/zevem/neptune)```

```[Homepage](https://neptune.rs)```

<!-- verified: 2026-10-07 -->
