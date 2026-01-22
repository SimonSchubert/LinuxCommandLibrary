# TLDR

**Spawn** a terminal

```foot```

**Verify** your config

```foot -C```

Start the **server** (use footclient to start terminal windows)

```foot -s```

Display **help**

```foot -h```

Display **version**

```foot -v```

# SYNOPSIS

**foot** [_options_] [_command_ [_args_]]

# PARAMETERS

**-c**, **--config=**_FILE_
> Use configuration file _FILE_ instead of the default

**-C**, **--check-config**
> Verify configuration file and exit

**-s**, **--server**
> Run as a server; use footclient to spawn terminals

**-t**, **--term=**_TERM_
> Set TERM environment variable value

**-T**, **--title=**_TITLE_
> Set initial window title

**-a**, **--app-id=**_ID_
> Set Wayland app-id

**-w**, **--window-size-pixels=**_WxH_
> Set initial window size in pixels

**-W**, **--window-size-chars=**_COLSxROWS_
> Set initial window size in characters

**-f**, **--font=**_FONT_
> Override font from config

**-h**, **--help**
> Display help message

**-v**, **--version**
> Display version information

# DESCRIPTION

**foot** is a fast, lightweight, and minimalistic terminal emulator designed for Wayland compositors. It emphasizes speed, low memory footprint, and simplicity while providing modern features.

Key features include sixel image support, synchronized rendering to prevent tearing, font ligatures, scrollback search, and URL detection. It can run in server mode where a single daemon handles multiple terminal windows via **footclient**, reducing memory overhead.

Configuration is done through **~/.config/foot/foot.ini** with extensive customization options for colors, fonts, keybindings, and behavior.

# CAVEATS

foot is Wayland-only and does not support X11. Some applications expecting xterm-specific behavior may not work correctly. Server mode requires footclient for spawning additional terminals.

# HISTORY

foot was created by Daniel Eklof and first released in **2020**. It was designed from the ground up for Wayland, avoiding the legacy baggage of X11 terminal emulators while achieving exceptional performance.

# SEE ALSO

[footclient](/man/footclient)(1), [alacritty](/man/alacritty)(1), [kitty](/man/kitty)(1), [wezterm](/man/wezterm)(1)
