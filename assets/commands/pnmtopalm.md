# TAGLINE

Convert PNM images to Palm image format

# TLDR

**Convert PNM to Palm image**

```pnmtopalm [input.pnm] > [output.palm]```

**Specify color depth**

```pnmtopalm -depth [8] [input.pnm] > [output.palm]```

**Use a custom colormap**

```pnmtopalm -colormap [input.pnm] > [output.palm]```

**Mark a color as transparent**

```pnmtopalm -transparent [rgb:ff/ff/ff] [input.pnm] > [output.palm]```

**Apply scanline compression**

```pnmtopalm -scanline_compression [input.pnm] > [output.palm]```

# SYNOPSIS

**pnmtopalm** [_options_] [_pnmfile_]

# PARAMETERS

**-depth** _n_
> Output bits per pixel: 1, 2, 4, 8, or 16. Grayscale inputs are limited to 4 bits maximum.

**-maxdepth** _n_
> Create the minimal-depth output that does not exceed _n_ bits. Setting 16 forces direct-color output.

**-colormap**
> Build a custom colormap and embed it in the output. Less efficient than the default Palm colormap.

**-transparent** _colorspec_
> Mark one color as fully transparent (Palm OS 3.5+).

**-density** _n_
> Palm Bitmap density. Valid values: 72, 108, 144, 216, or 288.

**-offset**
> Set the `nextDepthOffset` field and pad to 4-byte boundaries, allowing multiple image renditions to be concatenated.

**-withdummy**
> Insert a dummy image header after the image so subsequent high-density renditions stay readable by older interpreters. Requires **-offset**.

**-scanline_compression**
> Use Palm scanline compression (Palm OS 2.0+).

**-rle_compression**
> Use Palm RLE compression (Palm OS 3.5+).

**-packbits_compression**
> Use Palm packbits compression (Palm OS 4.0+). Invalid with 16-bit direct color.

**-verbose**
> Print the format of the output file.

# DESCRIPTION

**pnmtopalm** converts a PNM image to the Palm Pilot bitmap format. It is part of the Netpbm toolkit. The inverse conversion is performed by **palmtopnm**.

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

[palmtopnm](/man/palmtopnm)(1), [pnmtopng](/man/pnmtopng)(1)
