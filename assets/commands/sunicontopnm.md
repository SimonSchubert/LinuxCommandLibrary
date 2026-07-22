# TAGLINE

Convert Sun icon images to PNM format

# TLDR

**Convert** Sun icon to PNM (writes to stdout)

```sunicontopnm [input.icon] > [output.pnm]```

**Convert from stdin**

```sunicontopnm < [input.icon] > [output.pnm]```

# SYNOPSIS

**sunicontopnm** [_iconfile_]

# DESCRIPTION

**sunicontopnm** reads a Sun icon-format image (the monochrome icon format used historically on SunOS workstations) and writes a corresponding PBM (or PNM) image to standard output. If no input file is given, the icon is read from standard input.

The output is always monochrome since Sun icons store only black-and-white pixels. This program is part of the **Netpbm** toolkit, which provides building blocks for image-format conversion pipelines.

# CAVEATS

Sun icon files are an obsolete format. The tool is mainly useful for archival conversions. The complementary tool, **pbmtosunicon**, performs the reverse conversion from PBM to Sun icon format.

# HISTORY

Part of the **Netpbm** package. The Sun icon format dates from the SunView/NeWS era of SunOS in the 1980s; the converter has been part of pbmplus / Netpbm since the early 1990s.

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

[pbmtosunicon](/man/pbmtosunicon)(1), [xbmtopbm](/man/xbmtopbm)(1), [pnm](/man/pnm)(5)
