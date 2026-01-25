# TLDR

**Create image index**

```pnmindex [image1.pnm] [image2.pnm] [image3.pnm] > [index.pnm]```

**Specify size**

```pnmindex -size [100] [*.pnm] > [index.pnm]```

**With labels**

```pnmindex -title [*.pnm] > [index.pnm]```

**Multiple columns**

```pnmindex -across [4] [*.pnm] > [index.pnm]```

# SYNOPSIS

**pnmindex** [_options_] _pnmfiles_...

# PARAMETERS

**-size** _n_
> Size of each thumbnail.

**-across** _n_
> Number of images per row.

**-colors** _n_
> Number of colors.

**-title**
> Add filenames as titles.

**-black**
> Black background.

**-quant**
> Quantize colors.

# DESCRIPTION

**pnmindex** creates a visual index (contact sheet) from multiple PNM images. Each image is scaled to a thumbnail and arranged in a grid.

Useful for creating image previews and galleries.

# EXAMPLES

```bash
# Create index of all PPM files
pnmindex *.ppm > index.ppm

# Thumbnails 150 pixels, 5 across
pnmindex -size 150 -across 5 photos/*.ppm > gallery.ppm

# With labels on black
pnmindex -title -black images/*.pnm > contact.ppm

# Convert to JPEG
pnmindex *.pnm | pnmtojpeg > index.jpg
```

# CAVEATS

Large numbers of images can produce huge output. Consider pamundice for splitting back.

# HISTORY

pnmindex is part of **Netpbm**, providing contact sheet generation since early Pbmplus versions.

# SEE ALSO

[pnmcat](/man/pnmcat)(1), [pnmscale](/man/pnmscale)(1), [pnmtile](/man/pnmtile)(1), [netpbm](/man/netpbm)(1)
