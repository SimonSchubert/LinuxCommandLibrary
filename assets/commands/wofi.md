# TLDR

Show **apps** list

```wofi -S drun```

Show **all** commands

```wofi -S run```

**Dmenu** mode from stdin

```printf "Choice1\nChoice2\nChoice3" | wofi -d```

# SYNOPSIS

**wofi** [_OPTIONS_]

# PARAMETERS

**-S, --show** _MODE_
> Show mode: drun (applications), run (commands), dmenu

**-d, --dmenu**
> Run in dmenu mode (read from stdin)

**--style** _FILE_
> Custom CSS stylesheet

**--conf** _FILE_
> Configuration file

# DESCRIPTION

**wofi** is an application launcher for wlroots-based Wayland compositors. It functions similarly to rofi and dmenu, providing a searchable menu for launching applications or selecting items.

The drun mode shows desktop applications while run mode shows all executables in PATH.

# CAVEATS

Wayland only (wlroots-based compositors). Styling uses CSS. Some rofi features may not be available.

# SEE ALSO

[rofi](/man/rofi)(1), [dmenu](/man/dmenu)(1), [fuzzel](/man/fuzzel)(1)
