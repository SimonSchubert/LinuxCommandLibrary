# TAGLINE

converts PBM bitmaps to GraphOn terminal graphics format

# TLDR

**Convert a PBM file to GraphOn format**

```pbmtogo [input.pbm] > [output.go]```

**Convert from standard input**

```cat [input.pbm] | pbmtogo > [output.go]```

# SYNOPSIS

**pbmtogo** [_file_]

# PARAMETERS

_file_
> Input PBM file. If not specified, reads from standard input.

# DESCRIPTION

**pbmtogo** reads a PBM (Portable Bitmap) image as input and produces GraphOn graphics format output. GraphOn was a company that made terminal emulators with graphics capabilities. This tool is part of the Netpbm toolkit for image format conversion.

The output is sent to standard output and can be redirected to a file.

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

[pbm](/man/pbm)(1), [netpbm](/man/netpbm)(1), [pbmtoascii](/man/pbmtoascii)(1), [pbmtoplot](/man/pbmtoplot)(1)

