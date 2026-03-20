# TAGLINE

creates composite images from multiple images arranged in a grid

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

**Create montage with title and shadow**

```magick montage -title "[My Gallery]" -shadow [*.jpg] [output.png]```

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

**-shadow**
> Add soft shadow beneath each thumbnail.

**-title** _string_
> Title for the montage image.

**-font** _name_
> Font for labels and title.

**-pointsize** _value_
> Font size for labels and title.

**-mode** _type_
> Framing style: Frame, Unframe, or Concatenate.

# DESCRIPTION

**magick montage** creates composite images from multiple images arranged in a grid. Part of ImageMagick. Useful for creating contact sheets, galleries, and image previews. Supports labels and frames.

# SEE ALSO

[magick](/man/magick)(1), [magick-convert](/man/magick-convert)(1)

