# TAGLINE

CMU window manager bitmap to PBM converter

# TLDR

**Convert CMU window manager bitmap** to PBM

```cmuwmtopbm [input.cmuwm] > [output.pbm]```

**Convert from stdin**

```cat [input.cmuwm] | cmuwmtopbm > [output.pbm]```

# SYNOPSIS

**cmuwmtopbm** [_cmuwmfile_]

# DESCRIPTION

**cmuwmtopbm** converts a CMU window manager bitmap file to PBM (Portable BitMap) format. This is part of the Netpbm package.

CMU window manager (CMU WM) was an early X Window System window manager from Carnegie Mellon University. This tool converts its bitmap format to the portable Netpbm format.

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

[pbmtocmuwm](/man/pbmtocmuwm)(1), [netpbm](/man/netpbm)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/cmuwmtopbm.html)```

<!-- verified: 2026-06-22 -->
