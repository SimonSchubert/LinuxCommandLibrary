# TAGLINE

previews Muffin window manager themes

# TLDR

**Preview a theme by name (case-sensitive)**

```muffin-theme-viewer [theme-name]```

**Preview the default theme (Atlanta)**

```muffin-theme-viewer```

# SYNOPSIS

**muffin-theme-viewer** [_theme_]

# PARAMETERS

_THEME_
> Theme name or path to preview.

**--help**
> Display help information.

# DESCRIPTION

**muffin-theme-viewer** previews Muffin window manager themes by rendering window decorations in a test window. It can be used to measure the performance of a window frame option and to preview its appearance. The theme name is case-sensitive, and defaults to Atlanta if none is specified.

Useful for theme development, testing, and selection within the Cinnamon desktop environment.

# CAVEATS

Cinnamon/Muffin specific. Requires a running display server. Only previews Metacity-compatible window decoration themes.

# HISTORY

muffin-theme-viewer is part of **Muffin**, a fork of GNOME's Mutter window manager adapted for the Cinnamon desktop environment maintained by the Linux Mint project.

# SEE ALSO

[muffin](/man/muffin)(1), [muffin-window-demo](/man/muffin-window-demo)(1), [cinnamon](/man/cinnamon)(1)

