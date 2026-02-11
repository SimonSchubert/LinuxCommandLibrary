# TAGLINE

Apply KDE Plasma color schemes

# TLDR

**List** available color schemes

```plasma-apply-colorscheme --list-schemes```

**Apply** a color scheme

```plasma-apply-colorscheme BreezeLight```

Apply **dark** theme

```plasma-apply-colorscheme BreezeDark```

Display **help**

```plasma-apply-colorscheme --help```

# SYNOPSIS

**plasma-apply-colorscheme** [_options_] [_scheme_name_]

# DESCRIPTION

**plasma-apply-colorscheme** switches the KDE Plasma desktop color scheme. It allows changing themes from the command line without opening System Settings.

# PARAMETERS

**--list-schemes**
> List all available color schemes

**scheme_name**
> Name of the color scheme to apply

**--help**
> Display help information

# CAVEATS

Requires a running Plasma desktop session. Color scheme names are case-sensitive. Changes take effect immediately without requiring logout.

# HISTORY

**plasma-apply-colorscheme** is part of the **KDE Plasma** desktop environment, providing command-line access to appearance settings.

# SEE ALSO

[plasma-apply-wallpaperimage](/man/plasma-apply-wallpaperimage)(1), [plasma-apply-cursortheme](/man/plasma-apply-cursortheme)(1)
