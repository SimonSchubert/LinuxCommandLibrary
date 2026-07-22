# TAGLINE

Terminal multiplexer with session persistence

# TLDR

**Start a new session**

```tmux```

**Start a new named session**

```tmux new -s [session_name]```

**List sessions**

```tmux ls```

**Attach to the most recently used session**

```tmux attach```

**Attach to a named session**

```tmux attach -t [session_name]```

**Detach from the current session** (inside tmux)

```Ctrl-b d```

**Kill a session**

```tmux kill-session -t [session_name]```

**Start a detached session running a command**

```tmux new -d -s [session_name] '[command]'```

**Reload the configuration file**

```tmux source-file ~/.tmux.conf```

# SYNOPSIS

**tmux** [**-2CDlNuvV**] [**-c** _shell-command_] [**-f** _file_] [**-L** _socket-name_] [**-S** _socket-path_] [_command_ [_flags_]]

# PARAMETERS

**-2**
> Force tmux to assume the terminal supports 256 colours.

**-c** _shell-command_
> Execute shell-command using the default shell, like sh -c.

**-f** _file_
> Specify an alternative configuration file.

**-L** _socket-name_
> Use a named socket, allowing independent servers to run in parallel.

**-S** _socket-path_
> Specify a full path to the server socket instead of a name.

**-u**
> Force tmux to assume the terminal supports UTF-8.

**-V**
> Report the tmux version.

**new-session**, **new** [**-d**] [**-s** _name_]
> Create a new session; -d starts it detached.

**attach-session**, **attach** [**-t** _target_]
> Attach to an existing session.

**list-sessions**, **ls**
> List managed sessions.

**detach-client**, **detach**
> Detach the current client from its session.

**kill-session** [**-t** _target_]
> Destroy a session, closing its windows.

**kill-server**
> Kill the tmux server and all sessions.

**split-window** [**-h**] [**-v**]
> Split the active pane; -h side by side, -v top and bottom (default).

**send-keys** [**-t** _target_] _keys_
> Send key strokes to a window or pane.

**source-file** _file_
> Execute commands from a configuration file.

**list-keys**, **lsk**
> List all bound keys and the commands they run.

**resize-pane** [**-UDLR**] [_amount_]
> Resize the active pane in the given direction.

**swap-window** [**-s** _src_] [**-t** _dst_]
> Swap two windows.

# KEY BINDINGS

All bindings are pressed after the prefix **Ctrl-b**:

**?**: List all key bindings
**:**: Open the tmux command prompt

**d**: Detach from session
**$**: Rename current session
**s**: Choose a session interactively
**(** / **)**: Switch to previous/next session

**c**: Create new window
**,**: Rename current window
**&**: Kill current window (asks for confirmation)
**n** / **p**: Next/previous window
**0-9**: Switch to window by number
**l**: Switch to the last selected window
**w**: Choose a window interactively

**"**: Split pane into top and bottom
**%**: Split pane into left and right
**Up/Down/Left/Right**: Move to the pane in that direction
**o**: Cycle through panes
**q**: Show pane numbers (press a number to select)
**x**: Kill current pane (asks for confirmation)
**z**: Toggle zoom of the current pane
**!**: Break current pane out into a new window
**{** / **}**: Swap current pane with the previous/next one
**Space**: Cycle through preset pane layouts

**[**: Enter copy mode (scroll back, search, copy text)
**]**: Paste the most recently copied text

# DESCRIPTION

**tmux** (terminal multiplexer) lets a single terminal hold multiple sessions, each containing windows (like tabs) that can be split into panes. It runs as a client-server system: the server keeps sessions alive in the background, and clients attach to and detach from them at will.

Because sessions persist on the server, work survives SSH disconnections and intentional detaches - reattaching with **tmux attach** restores everything exactly as it was. This makes tmux essential for remote server administration, long-running jobs, and pair programming (multiple clients can attach to the same session).

Inside tmux, the prefix key (default **Ctrl-b**) followed by a command key triggers actions, and the command prompt (prefix **:**) accepts any tmux command by name. Behaviour, key bindings, and the status bar are customised through the configuration file.

# CONFIGURATION

**~/.tmux.conf**, **~/.config/tmux/tmux.conf**
> User configuration file for key bindings, status bar customisation, default options, and plugins. Read when the server starts; reload a running server with **tmux source-file**.

**/etc/tmux.conf**
> System-wide configuration applied before the user file.

# CAVEATS

The default prefix **Ctrl-b** shadows the readline/emacs "back one character" binding; many users rebind it to **Ctrl-a**. Scrolling back through output requires entering copy mode first. tmux sets **TERM** to screen or tmux-256color inside sessions, which can confuse programs that test for specific terminals. When nesting tmux inside tmux, press the prefix twice to send it to the inner session. Configuration changes only take effect after the file is sourced or the server restarts.

# HISTORY

**tmux** was written by **Nicholas Marriott** and first released in **2007** as a BSD-licensed alternative to GNU Screen with a cleaner codebase and a client-server design. It became part of the OpenBSD base system in **2009** (OpenBSD 4.6), and a portable version is packaged for Linux, macOS, and other platforms. The project remains under active development.

# INSTALL

```apt: sudo apt install tmux```

```dnf: sudo dnf install tmux```

```pacman: sudo pacman -S tmux```

```apk: sudo apk add tmux```

```zypper: sudo zypper install tmux```

```brew: brew install tmux```

```nix: nix profile install nixpkgs#tmux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[screen](/man/screen)(1), [zellij](/man/zellij)(1), [byobu](/man/byobu)(1), [dtach](/man/dtach)(1), [abduco](/man/abduco)(1), [tmuxinator](/man/tmuxinator)(1)

# RESOURCES

```[Source code](https://github.com/tmux/tmux)```

```[Documentation](https://github.com/tmux/tmux/wiki)```

<!-- verified: 2026-06-12 -->
