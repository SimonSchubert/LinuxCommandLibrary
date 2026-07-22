# TAGLINE

Terminal image collage / browser for image directories

# TLDR

**Browse** images in a directory

```ucollage [directory]```

**Open** current directory

```ucollage```

# SYNOPSIS

**ucollage** [*options*] [*path*]

# DESCRIPTION

**ucollage** displays collections of images as a navigable collage inside the terminal (using terminal graphics capabilities where available). Useful for quickly surveying photo directories without leaving the shell.

# PARAMETERS

*path*

> Directory of images (default: **.**).

Keybindings for navigate/open/delete depend on version—see **ucollage --help** and the upstream README.

# CAVEATS

Requires a terminal with image protocol support for best results (Kitty/iTerm/Sixel, etc.). Behavior degrades on plain VT100 terminals.

# INSTALL

```aur: yay -S ucollage```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[viu](/man/viu)(1), [timg](/man/timg)(1), [ranger](/man/ranger)(1)

# RESOURCES

```[Source code](https://github.com/ckardaris/ucollage)```

<!-- verified: 2026-07-19 -->
