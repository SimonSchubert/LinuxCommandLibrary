# TAGLINE

Graphical PTY multiplexer with a JSON-RPC CLI and MCP control surface

# TLDR

**Open a terminal pane** (starts the GUI if it is not running)

```gpty new-pane```

Open a pane running a **specific command**

```gpty new-pane -t terminal -c [htop]```

**List** active panes (ids, labels, types, positions)

```gpty list-panes```

**Send text** to a pane (a trailing newline is added)

```gpty inject [T1] --text "[ls -la]"```

Read a pane's **screen and scrollback**

```gpty pane-read [T1] --lines [200]```

**Run a command** in a new terminal pane

```gpty pane-run --command "[cargo test]"```

**Wait** until pane output matches a regex

```gpty pane-wait [T1] --pattern "[tests passed]" --timeout-ms [30000]```

**Save** and **load** a named layout

```gpty layout save [my-setup]```

```gpty layout load [my-setup]```

**Check** whether the GUI is running

```gpty daemon status```

Run as an **MCP server** over stdio

```gpty mcp```

Print **version** and protocol

```gpty version```

# SYNOPSIS

**gpty** [_OPTIONS_] _COMMAND_

# PARAMETERS

**--skill**
> Print the bundled agent skill (`SKILL.md`) and exit. No IPC, no GUI.

**--json**
> Machine-readable JSON output (global).

**--socket** _PATH_
> IPC socket path. Default is `$XDG_RUNTIME_DIR/gpty.sock` on Linux when that directory is user-owned and mode `0700`; otherwise `/run/user/<uid>/gpty.sock`, then `/tmp/gpty-<uid>.sock`. Overridden by **GPTY_SOCKET**.

**--timeout** _MS_
> Connection timeout in milliseconds (default `5000`).

**--no-daemon**
> Do not auto-spawn the GUI if it is not running.

**-v**, **--verbose**
> Verbose logging to stderr.

**new-pane**
> Open a pane. **-t**, **--pane-type** is `terminal` (default), `code_viewer`, `file_tree`, `inspector`, or `reasoning` (`observer` is a deprecated alias for `inspector`). **-c**, **--command** runs a shell command in a terminal pane. **-s**, **--split** is `left`, `right`, `top`, or `bottom` (default `bottom`). **--title** sets the pane title. **-f**, **--focus** focuses the new pane (default true). **--tags** is a comma-separated list of broadcast tags.

**list-panes**
> List active panes with stable ids, labels, types, and positions.

**kill-pane** _PANE_
> Close a pane by id, label (for example `T1`), or `active`.

**focus-pane** _PANE_
> Focus a pane by id or label.

**inject** _PANE_ **--text** _TEXT_
> Send text to a terminal pane. A trailing newline is appended.

**pane-read** _PANE_ [**--lines** _N_]
> Print plain-text output (viewport plus scrollback). **--lines** is 1–2000 (default `200`).

**pane-status** [_PANE_]
> Status for one pane (`pid`, `running`, `exit_code`, `idle_ms`). Omit the pane to list every pane.

**pane-run** **--command** _CMD_
> Run a command in a new terminal pane through the configured shell.

**pane-wait** _PANE_ **--pattern** _REGEX_ [**--timeout-ms** _MS_]
> Block until pane output matches a Rust regex (max 1024 characters). Server-side deadline is 100–60000 ms (default `10000`).

**broadcast** **--tags** _TAGS_ **--text** _TEXT_
> Inject text into every terminal pane that carries one of the given tags.

**concept list**
> List concept triggers and whether each is enabled.

**concept toggle** _NAME_
> Enable or disable a concept by name.

**layout save** _NAME_ / **layout load** _NAME_ / **layout list**
> Save, restore, or list named workspace layouts. Loading an untrusted profile over the control socket is refused (a CLI caller cannot answer the Workspace Trust dialog).

**schema** [**--format** _FMT_]
> Print a JSON Schema of every command. `--format mcp` prints an MCP tool manifest. Works without a running GUI.

**mcp**
> Run as an MCP server over stdio. Tools map to the same clap subcommands (`new-pane`, `inject`, `pane-read`, and so on).

**daemon start** / **daemon status** / **daemon stop**
> Probe or stop the GUI. Most other subcommands already auto-spawn it unless **--no-daemon** is set. **stop** sends `shutdown` over IPC.

**version**
> Print the CLI version and IPC protocol (currently `2.0`). No GUI required.

With no subcommand, **gpty** prints help and exits `2`.

# DESCRIPTION

**gpty** is the command-line client for **gPTY**, a Godot-and-Rust multi-PTY workspace. The GUI tiles independent shell sessions (and code, file-tree, Inspector, and Reasoning panes) in a resizable grid. Terminal rendering uses `alacritty_terminal` (DEC STD 070, 16/256/true color, scrollback with regex search, wrapped selection). The same binary launches or talks to that GUI over a JSON-RPC Unix socket so scripts and AI agents can spawn panes, inject input, and read output without scraping a TUI.

Pane commands connect to `$XDG_RUNTIME_DIR/gpty.sock` (or **GPTY_SOCKET** / **--socket**). If nothing is listening and **--no-daemon** was not passed, the CLI tries to spawn a sibling **gpty-editor** or **gpty-gui** binary, or the path in **GPTY_GUI**. **schema**, **version**, and **--skill** do not need the GUI.

A **concept** is a regex trigger on PTY output that captures a reply and routes it into another pane (code viewer or Inspector). Concepts are display-only: they never write into a shell. The Inspector and Reasoning panes observe agent lifecycle events; gpty does not orchestrate agent state.

Linux, macOS, and Windows binaries are published on GitHub Releases. No Godot or Rust toolchain is required to run them. The project is licensed **GPL-3.0-or-later**.

# CONFIGURATION

**GPTY_SOCKET**
> Absolute path of the control socket. Relative values are ignored on Unix.

**GPTY_SECRET**
> Optional shared secret for the control socket. The GUI and CLI must agree; a mismatch is treated as unauthorized.

**GPTY_GUI**
> Absolute path of the GUI binary used when auto-spawning. The path must be a user-owned regular file that is not group- or world-writable.

The GUI persists settings, named layouts/profiles, and scrollback (SQLite, full-text search) in Godot's `user://` store (`settings.json`, `profiles.json`, `layout.json`). Default concepts ship with the app; user overrides merge on top. Set **mcp.json** to `{"mcpServers": {"gpty": {"command": "gpty", "args": ["mcp"]}}}` for MCP auto-discovery.

# CAVEATS

This is a **graphical** multiplexer, not a drop-in **tmux**/**zellij** replacement. There is no attach-from-an-existing-tty session model; the CLI drives a Godot GUI.

Same-UID processes are trusted. **GPTY_SECRET** raises the bar for the socket but does not change that trust class. The socket is mode `0600` with a peer-UID check on Linux and macOS. When `$XDG_RUNTIME_DIR` is missing, the fallback under `/tmp` can be pre-created by another user (denial of service, not traffic spoofing).

Panes run as you, with no sandbox. Scrollback is stored in plaintext. Concept definitions cannot execute commands (that path was removed in 0.5.x). `layout load` over IPC refuses an untrusted profile; only the GUI Workspace Trust dialog can approve one.

The current line is **0.5.x** (0.5.3 as of 2026-09-10). Versions below 0.5 are unsupported. The project documents that much of the Godot UI and Rust GDExtension bridge was LLM-generated and may contain bugs.

# HISTORY

**gPTY** was created by **Neil Pathare**. **0.1.0** (2026-07-21) shipped the tiling multi-PTY GUI, `gpty-core` engine, and a first CLI. The public API (JSON-RPC, clap CLI, MCP) and agent-oriented panes landed through the 0.5 series. The CLI crate is the **gpty** binary, versioned with the rest of the workspace.

# SEE ALSO

[tmux](/man/tmux)(1), [zellij](/man/zellij)(1), [screen](/man/screen)(1), [kitty](/man/kitty)(1), [wezterm](/man/wezterm)(1), [alacritty](/man/alacritty)(1)

# RESOURCES

```[Source code](https://github.com/godot-pty/gpty)```

```[Homepage](https://godot-pty.github.io/gpty/)```

```[Documentation](https://godot-pty.github.io/gpty/docs/overview/cli/)```

<!-- verified: 2026-09-11 -->
