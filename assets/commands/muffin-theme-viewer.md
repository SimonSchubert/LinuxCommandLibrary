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
> Name of an installed theme to preview, case-sensitive (default: Atlanta).

# DESCRIPTION

**muffin-theme-viewer** previews installed Muffin window manager themes by rendering window decorations in a test window. It can be used to measure the performance of a window frame option and to preview its appearance.

Themes are read from `/usr/share/themes/*/muffin-1/muffin-theme-1.xml`.

# CAVEATS

Removed upstream: the tool ships with Muffin up to the 5.2 series and is gone from 5.4 onward, after Muffin was rebased onto Mutter 3.36. Current Cinnamon installations will not have it. Requires a running X display.

# HISTORY

muffin-theme-viewer derives from Metacity's theme viewer and is part of **Muffin**, a fork of GNOME's Mutter window manager adapted for the Cinnamon desktop environment by the Linux Mint project.

# SEE ALSO

[muffin](/man/muffin)(1), [muffin-window-demo](/man/muffin-window-demo)(1), [cinnamon](/man/cinnamon)(1)

# RESOURCES

```[Source code](https://github.com/linuxmint/muffin)```

<!-- verified: 2026-11-09 -->
