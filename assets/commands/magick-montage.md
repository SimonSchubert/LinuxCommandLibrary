# TLDR

**Create image montage**

```magick montage [*.jpg] [output.png]```

**Set tile layout**

```magick montage -tile [3x3] [*.jpg] [output.png]```

**Set thumbnail size**

```magick montage -geometry [200x200+5+5] [*.jpg] [output.png]```

**Add labels**

```magick montage -label '%f' [*.jpg] [output.png]```

**Set background color**

```magick montage -background white [*.jpg] [output.png]```

# SYNOPSIS

**magick** **montage** [_options_] _images_... _output_

# PARAMETERS

**-tile** _geometry_
> Grid layout (columns x rows).

**-geometry** _geometry_
> Thumbnail size and spacing.

**-label** _string_
> Add label to thumbnails.

**-background** _color_
> Background color.

**-border** _geometry_
> Border around thumbnails.

**-frame** _geometry_
> Frame around thumbnails.

# DESCRIPTION

**magick montage** creates composite images from multiple images arranged in a grid. Part of ImageMagick. Useful for creating contact sheets, galleries, and image previews. Supports labels and frames.

# SEE ALSO

[magick](/man/magick)(1), [magick-convert](/man/magick-convert)(1)

