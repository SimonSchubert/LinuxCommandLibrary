# TLDR

**Open a new terminal window** via foot server

```footclient```

**Open a terminal running** a specific command

```footclient [command]```

**Open a terminal in** a specific directory

```footclient -D [path/to/directory]```

**Open a terminal with** a custom title

```footclient -T "[My Terminal]"```

**Connect to a custom socket** path

```footclient --server-socket=[path/to/foot.sock]```

**Open a maximized terminal** window

```footclient --maximized```

**Open a fullscreen terminal** window

```footclient --fullscreen```

# SYNOPSIS

**footclient** [_OPTIONS_] [_COMMAND_ [_ARGS_...]]

# PARAMETERS

**-D**, **--working-directory**=_DIR_
> Start terminal in specified directory.

**-T**, **--title**=_TITLE_
> Set initial window title.

**-a**, **--app-id**=_ID_
> Set Wayland app-id (for window manager matching).

**-m**, **--maximized**
> Start window maximized.

**-F**, **--fullscreen**
> Start window in fullscreen mode.

**-s**, **--server-socket**=_PATH_
> Connect to foot server at specified socket path.

**-H**, **--hold**
> Keep terminal open after command exits.

**-N**, **--no-wait**
> Detach from server immediately (don't wait for window close).

**-h**, **--help**
> Display help message.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**footclient** is a client for the foot terminal emulator's server mode. When foot runs as a server (**foot --server**), footclient connects to it to open new terminal windows. This architecture provides faster startup times and reduced memory usage since fonts, glyph caches, and configuration are shared across all terminal windows.

The server listens on a Unix socket, defaulting to **$XDG_RUNTIME_DIR/foot-$WAYLAND_DISPLAY.sock**. Footclient remains running until the associated terminal window closes, unless **--no-wait** is specified.

Typical usage involves starting **foot --server** at login (often via systemd socket activation) and using footclient for all subsequent terminal launches.

# CAVEATS

Requires foot server to be running. All terminals share the same server process, so a server crash affects all windows. Heavy load on multiple terminals may reduce performance compared to standalone foot instances. Only works on Wayland; foot does not support X11.

# HISTORY

Foot was created by Daniel Eklöf as a fast, lightweight terminal emulator designed specifically for Wayland compositors. The server/client architecture was implemented to address the startup time and memory overhead of launching multiple terminal instances. Foot has gained popularity in the Wayland ecosystem for its performance and simplicity.

# SEE ALSO

[foot](/man/foot)(1), [alacritty](/man/alacritty)(1), [kitty](/man/kitty)(1), [wezterm](/man/wezterm)(1)
