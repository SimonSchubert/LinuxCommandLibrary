# TLDR

List **available** desktop themes

```plasma-apply-desktoptheme --list-themes```

**Apply** a desktop theme

```plasma-apply-desktoptheme [default]```

Display **help**

```plasma-apply-desktoptheme --help```

# SYNOPSIS

**plasma-apply-desktoptheme** [**--list-themes**] [_theme_name_]

# PARAMETERS

**--list-themes**
> List all available desktop themes

**theme_name**
> Name of desktop theme to apply

**--help**
> Display help information

# DESCRIPTION

**plasma-apply-desktoptheme** changes the Plasma desktop theme from the command line. Desktop themes control the appearance of panels, widgets, and other Plasma-specific UI elements.

The tool allows automated theme switching, useful for day/night themes or scripted desktop customization.

# CAVEATS

Requires running Plasma session. Desktop themes are separate from color schemes and icon themes. Changes apply immediately to Plasma components.

# HISTORY

**plasma-apply-desktoptheme** is part of **KDE Plasma Workspace**, enabling command-line theming control as part of KDE's comprehensive appearance customization tools.

# SEE ALSO

[plasma-apply-colorscheme](/man/plasma-apply-colorscheme)(1), [plasma-apply-lookandfeel](/man/plasma-apply-lookandfeel)(1)
