# TAGLINE

Suckless simple terminal emulator

# TLDR

**Open** a terminal

```st```

Open with specific **title**

```st -T [title]```

**Execute command** and write output to file

```st -o [path/to/file] -e [command] [args]```

**Execute command** in terminal

```st -e [command] [args]```

Set **geometry**

```st -g [columns]x[rows]```

Open a **serial line**

```st -l [/dev/ttyS0] [115200]```

# KEYBOARD SHORTCUTS

**Ctrl+Shift+PageUp/PageDown**
> Increase/decrease font size

**Ctrl+Shift+Home**
> Reset font size

**Ctrl+Shift+c**
> Copy to clipboard

**Ctrl+Shift+v**
> Paste from clipboard

**Ctrl+Shift+y**, **Shift+Insert**
> Paste from selection

**Print Screen**
> Print the selection to the iofile

**Shift+Print Screen**
> Print the full screen to the iofile

**Ctrl+Print Screen**
> Toggle printing to the iofile

**Break**
> Send a break on the serial line

# SYNOPSIS

**st** [_OPTIONS_] [**-e** _command_ [_args_...]]

# PARAMETERS

**-T** _title_
> Set window title

**-t** _title_
> Set window title (alias for -T)

**-e** _command_ [_args_]
> Execute command instead of shell

**-o** _iofile_
> Write all I/O to a file; **-** means standard output

**-l** _line_ [_stty_args_...]
> Use a tty line such as a serial device instead of a pseudo terminal

**-g** _geometry_
> Set window geometry as an X11 string in columns and rows ([=][cols]x[rows][+x][+y])

**-f** _font_
> Set font (fontconfig pattern, such as Monospace:size=12)

**-c** _class_
> Set window class (default $TERM)

**-n** _name_
> Set window instance name (default $TERM)

**-w** _windowid_
> Embed in given window ID

**-a**
> Disable alternate screens

**-i**
> Fixate the position given with -g

**-v**
> Print version

# DESCRIPTION

**st** is a simple terminal emulator for X11 from the suckless project. It aims to be lightweight and follows the suckless philosophy of simplicity, providing a minimal terminal with core functionality and configuration through source code modification.

Features include UTF-8 support, true color, clipboard handling, and configurable keybindings. Unlike feature-rich terminals, st is designed to be patched and recompiled for customization rather than configured through files.

# CAVEATS

Configuration requires editing config.h and recompiling. No scrollback by default; requires a patch or external tool like **scroll** or **tmux**. No tabs or splits; use a multiplexer. Requires X11; does not work on Wayland without XWayland.

# HISTORY

**st** was created by the **suckless.org** community, known for minimalist software including **dwm** window manager. The project follows the suckless philosophy emphasizing simplicity, clarity, and frugality in software design. st has been developed since **2008** as an alternative to bloated terminal emulators.

# SEE ALSO

[xterm](/man/xterm)(1), [urxvt](/man/urxvt)(1), [alacritty](/man/alacritty)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Source code](https://git.suckless.org/st)```

```[Homepage](https://st.suckless.org/)```

<!-- verified: 2026-11-08 -->
