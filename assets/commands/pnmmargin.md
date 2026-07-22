# TAGLINE

Add solid color borders to PNM images

# TLDR

**Add border around image**

```pnmmargin [10] [input.pnm] > [output.pnm]```

**Add colored border**

```pnmmargin -color [blue] [20] [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmmargin** [_options_] _size_ [_file_]

# PARAMETERS

_size_
> Border width in pixels.

**-color** _color_
> Border color.

**-white**
> White border.

**-black**
> Black border.

**-plain**
> Produce output in plain PNM format.

# DESCRIPTION

**pnmmargin** adds a uniform solid-color border around all four sides of a PNM image. The border width is specified in pixels and is applied equally on all sides.

If no color option is specified, the program makes a guess. Use **-color** to specify a custom color, or the shortcuts **-white** and **-black** for common choices. This is a convenience wrapper around **pnmpad**. For different margins on each side, use **pnmpad** directly. To remove borders, use **pamcut**. Part of the Netpbm toolkit.

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

[pnmpad](/man/pnmpad)(1), [pamcut](/man/pamcut)(1), [pnmcat](/man/pnmcat)(1), [pnmcrop](/man/pnmcrop)(1)

