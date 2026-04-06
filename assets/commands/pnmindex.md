# TAGLINE

Create thumbnail contact sheets from images

# TLDR

**Create image index**

```pnmindex [image1.pnm] [image2.pnm] [image3.pnm] > [index.pnm]```

**Specify size**

```pnmindex -size [100] [*.pnm] > [index.pnm]```

**With a title**

```pnmindex -title ["My Gallery"] [*.pnm] > [index.pnm]```

**Multiple columns**

```pnmindex -across [4] [*.pnm] > [index.pnm]```

# SYNOPSIS

**pnmindex** [_options_] _pnmfiles_...

# PARAMETERS

**-size** _n_
> Maximum thumbnail size in pixels. Each image is scaled to fit within an N x N box while preserving aspect ratio. Default: 100.

**-across** _n_
> Number of thumbnails per row. Default: 6.

**-colors** _n_
> Maximum number of colors in the output image. Default: 256.

**-title** _title_
> Add a title string at the top of the image.

**-black**
> Use black background with white labels instead of the default white background with black labels.

**-noquant**
> Disable color quantization. By default, colors are reduced for PPM input.

**-quant**
> Enable color quantization (default for PPM input).

**-quiet**
> Suppress informational messages.

# DESCRIPTION

**pnmindex** creates a visual index (contact sheet) from multiple PNM images. Each image is scaled to a thumbnail and arranged in a grid.

Useful for creating image previews and galleries.

# EXAMPLES

```bash
# Create index of all PPM files
pnmindex *.ppm > index.ppm

# Thumbnails 150 pixels, 5 across
pnmindex -size 150 -across 5 photos/*.ppm > gallery.ppm

# With title on black background
pnmindex -title "Photos" -black images/*.pnm > contact.ppm

# Convert to JPEG
pnmindex *.pnm | pnmtojpeg > index.jpg
```

# CAVEATS

Large numbers of images can produce huge output. Consider pamundice for splitting back.

# HISTORY

pnmindex is part of **Netpbm**, providing contact sheet generation since early Pbmplus versions.

# SEE ALSO

[pnmcat](/man/pnmcat)(1), [pnmscale](/man/pnmscale)(1), [pnmtile](/man/pnmtile)(1), [pnmmontage](/man/pnmmontage)(1), [pnmtojpeg](/man/pnmtojpeg)(1), [pamundice](/man/pamundice)(1), [netpbm](/man/netpbm)(1)
