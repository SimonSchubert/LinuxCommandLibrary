# TAGLINE

Apply KDE Plasma global themes

# TLDR

List **available** global themes

```plasma-apply-lookandfeel --list```

**Apply** a global theme

```plasma-apply-lookandfeel --apply [org.kde.breeze.desktop]```

Run **without display** server

```plasma-apply-lookandfeel --platform offscreen```

Display **help**

```plasma-apply-lookandfeel --help```

# SYNOPSIS

**plasma-apply-lookandfeel** [**--list**] [**--apply** _theme_] [**--platform** _platform_]

# PARAMETERS

**--list**
> List all available global themes

**--apply _theme_**
> Apply specified global theme

**--platform _platform_**
> Platform plugin (offscreen for headless)

**--help**
> Display help information

# DESCRIPTION

**plasma-apply-lookandfeel** applies KDE Plasma global themes (Look and Feel packages). Global themes bundle color schemes, desktop themes, cursor themes, icons, and other appearance settings into cohesive packages.

The tool can operate without a running display server using the offscreen platform, enabling automated theme deployment.

# CAVEATS

Global themes may override individual theme settings. Theme IDs use reverse domain notation. Offscreen mode limited to configuration changes only.

# HISTORY

**plasma-apply-lookandfeel** is part of **KDE Plasma Workspace**, providing unified theme application for KDE's modular appearance system.

# SEE ALSO

[plasma-apply-colorscheme](/man/plasma-apply-colorscheme)(1), [plasma-apply-desktoptheme](/man/plasma-apply-desktoptheme)(1)
