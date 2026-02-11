# TAGLINE

XFCE terminal emulator

# TLDR

**Open** new terminal

```xfce4-terminal```

Set **title**

```xfce4-terminal --initial-title "[initial_title]"```

Open new **tab**

```xfce4-terminal --tab```

**Execute** command

```xfce4-terminal --command "[command_with_args]"```

Execute and **hold**

```xfce4-terminal --command "[command_with_args]" --hold```

Open **multiple** tabs

```xfce4-terminal --tab --command "[command1]" --tab --command "[command2]"```

# SYNOPSIS

**xfce4-terminal** [_OPTIONS_]

# PARAMETERS

**--initial-title** _TITLE_
> Set initial window title

**--tab**
> Open new tab

**--command** _COMMAND_
> Execute command in terminal

**--hold**
> Keep terminal open after command exits

**--working-directory** _DIR_
> Set working directory

**--geometry** _WxH+X+Y_
> Window geometry

**--fullscreen**
> Start in fullscreen mode

# DESCRIPTION

**xfce4-terminal** is the terminal emulator for the XFCE desktop environment. It provides tabs, configurable appearance, and drop-down mode support.

The terminal supports multiple profiles and can execute commands on startup.

# CAVEATS

Designed for XFCE but works on other desktops. Requires GTK and VTE libraries.

# SEE ALSO

[gnome-terminal](/man/gnome-terminal)(1), [konsole](/man/konsole)(1), [xterm](/man/xterm)(1)
