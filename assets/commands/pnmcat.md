# TAGLINE

Concatenate PNM images horizontally or vertically

# TLDR

**Concatenate horizontally**

```pnmcat -lr [image1.pnm] [image2.pnm] > [result.pnm]```

**Concatenate vertically**

```pnmcat -tb [image1.pnm] [image2.pnm] > [result.pnm]```

**With background color**

```pnmcat -lr -white [image1.pnm] [image2.pnm] > [result.pnm]```

**Center alignment**

```pnmcat -tb -jcenter [image1.pnm] [image2.pnm] > [result.pnm]```

# SYNOPSIS

**pnmcat** [_options_] _pnmfiles_...

# PARAMETERS

**-lr**
> Left to right (horizontal).

**-tb**
> Top to bottom (vertical).

**-jleft**, **-jcenter**, **-jright**
> Horizontal justification.

**-jtop**, **-jcenter**, **-jbottom**
> Vertical justification.

**-white**
> White background.

**-black**
> Black background.

# DESCRIPTION

**pnmcat** concatenates multiple PNM images either horizontally or vertically. It's the image equivalent of cat for files.

Handles images of different sizes with alignment and background options.

# EXAMPLES

```bash
# Side by side
pnmcat -lr left.ppm right.ppm > combined.ppm

# Stack vertically
pnmcat -tb top.ppm bottom.ppm > stacked.ppm

# Multiple images
pnmcat -lr img1.ppm img2.ppm img3.ppm > row.ppm

# Centered with white background
pnmcat -tb -jcenter -white small.ppm large.ppm > out.ppm
```

# CAVEATS

All images must be same type (PBM, PGM, or PPM). Different depths are handled. Part of Netpbm.

# HISTORY

pnmcat is part of **Netpbm** by **Jef Poskanzer**, providing image concatenation since early Pbmplus.

# SEE ALSO

[pamcat](/man/pamcat)(1), [pnmtile](/man/pnmtile)(1), [pnmpaste](/man/pnmpaste)(1), [netpbm](/man/netpbm)(1)
