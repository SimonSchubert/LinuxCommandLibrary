# TAGLINE

figlet font listing utility

# TLDR

**List available figlet fonts**

```figlist```

# SYNOPSIS

**figlist** [_options_]

# DESCRIPTION

**figlist** enumerates all installed figlet fonts and control files by scanning the default figlet font directory, typically /usr/share/figlet. It provides a simple way to discover available font names for use with the figlet command.

The output includes both .flf font files and .flc control files, showing the complete set of available character rendering options. This is more convenient than manually browsing the font directory.

figlist is particularly useful when exploring different text banner styles or writing scripts that need to verify font availability before rendering.

# INSTALL

```apt: sudo apt install figlet```

```dnf: sudo dnf install figlet```

```pacman: sudo pacman -S figlet```

```apk: sudo apk add figlet```

```zypper: sudo zypper install figlet```

```brew: brew install figlet```

```nix: nix profile install nixpkgs#figlet```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[figlet](/man/figlet)(6), [showfigfonts](/man/showfigfonts)(6)

# RESOURCES

```[Source code](https://github.com/cmatsuoka/figlet)```

```[Homepage](http://www.figlet.org/)```

<!-- verified: 2026-07-15 -->

