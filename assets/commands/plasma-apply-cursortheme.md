# TLDR

List **available** cursor themes

```plasma-apply-cursortheme --list-themes```

**Apply** a cursor theme

```plasma-apply-cursortheme [breeze_cursors]```

Display **help**

```plasma-apply-cursortheme --help```

# SYNOPSIS

**plasma-apply-cursortheme** [**--list-themes**] [_theme_name_]

# PARAMETERS

**--list-themes**
> List all available cursor themes

**theme_name**
> Name of cursor theme to apply

**--help**
> Display help information

# DESCRIPTION

**plasma-apply-cursortheme** changes the cursor theme of KDE Plasma desktop from the command line. It provides the same functionality as the System Settings cursor configuration but in a scriptable form.

Cursor themes affect the mouse pointer appearance throughout the desktop and applications. Changes apply immediately without requiring session restart.

# CAVEATS

Requires running Plasma session. Some applications may need restart to display new cursor. Theme names are case-sensitive.

# HISTORY

**plasma-apply-cursortheme** is part of **KDE Plasma Workspace**, providing command-line control over cursor appearance for scripting and automation purposes.

# SEE ALSO

[plasma-apply-colorscheme](/man/plasma-apply-colorscheme)(1), [plasma-apply-desktoptheme](/man/plasma-apply-desktoptheme)(1)
