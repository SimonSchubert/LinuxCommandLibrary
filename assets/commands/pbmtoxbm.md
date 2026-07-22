# TAGLINE

converts PBM bitmap images to X11 bitmap format

# TLDR

**Convert PBM to X bitmap**

```pbmtoxbm [input.pbm] > [output.xbm]```

**Convert with custom name**

```pbmtoxbm -name [icon] [input.pbm] > [icon.xbm]```

# SYNOPSIS

**pbmtoxbm** [_options_] [_file_]

# PARAMETERS

**-name** _name_
> Variable name in output.

# DESCRIPTION

**pbmtoxbm** converts PBM bitmap images to X11 bitmap format (.xbm). X bitmaps are C source files usable in X11 applications. Part of Netpbm toolkit.

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[xbmtopbm](/man/xbmtopbm)(1)

