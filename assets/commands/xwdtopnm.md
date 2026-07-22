# TAGLINE

Convert XWD screenshots to PNM format

# TLDR

**Convert an XWD file to PNM**

```xwdtopnm [input.xwd] > [output.pnm]```

**Read from stdin and write to stdout**

```cat [input.xwd] | xwdtopnm > [output.pnm]```

# SYNOPSIS

**xwdtopnm** [_file_]

# DESCRIPTION

**xwdtopnm** reads an X Window Dump (XWD) image as input and produces a PNM (Portable aNy Map) image as output. XWD files are typically created by the X11 **xwd** utility for capturing window screenshots.

If no input file is specified, **xwdtopnm** reads from standard input. Output is always written to standard output. The output format (PBM, PGM, or PPM) depends on the color depth of the input image.

This tool is part of the **Netpbm** toolkit, a collection of image conversion and manipulation utilities.

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

[pnmtoxwd](/man/pnmtoxwd)(1), [pnmtopng](/man/pnmtopng)(1), [pnmtojpeg](/man/pnmtojpeg)(1), [netpbm](/man/netpbm)(1)

