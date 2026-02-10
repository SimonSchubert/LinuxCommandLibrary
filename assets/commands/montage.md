# TAGLINE

creates composite images by joining multiple images together

# TLDR

**Create image grid**

```montage [*.jpg] [output.jpg]```

**Specify tile layout**

```montage [*.jpg] -tile [3x2] [output.jpg]```

**Set thumbnail size**

```montage [*.jpg] -geometry [200x200+5+5] [output.jpg]```

**Add labels**

```montage [*.jpg] -label "%f" [output.jpg]```

**Set background color**

```montage [*.jpg] -background [white] [output.jpg]```

**Add border**

```montage [*.jpg] -border [5] -bordercolor [gray] [output.jpg]```

# SYNOPSIS

**montage** [_options_] _input-files_ _output-file_

# DESCRIPTION

**montage** creates composite images by joining multiple images together. Part of ImageMagick, it arranges images in a grid, optionally with labels, borders, and shadows.

The tool is useful for creating contact sheets, thumbnails galleries, and image collages.

# PARAMETERS

**-tile** _cols_x_rows_
> Grid layout.

**-geometry** _WxH+x+y_
> Thumbnail size and spacing.

**-label** _string_
> Label for each image.

**-title** _string_
> Title for montage.

**-background** _color_
> Background color.

**-border** _geometry_
> Border size.

**-bordercolor** _color_
> Border color.

**-shadow**
> Add shadow.

**-frame** _geometry_
> Add frame.

**-mode** _type_
> Frame style.

# CAVEATS

Many images can use lots of memory. Label formatting has special syntax. Output format from extension. Quality settings affect size.

# HISTORY

**montage** is part of **ImageMagick**, created by **John Cristy** in **1987**. It provides contact sheet functionality that was common in photography workflows.

# SEE ALSO

[convert](/man/convert)(1), [magick](/man/magick)(1), [identify](/man/identify)(1), [display](/man/display)(1)
