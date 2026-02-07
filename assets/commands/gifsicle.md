# TAGLINE

Create, edit, and optimize GIF images and animations

# TLDR

**Optimize a GIF** for smaller file size

```gifsicle --optimize=3 [input.gif] -o [output.gif]```

**Resize a GIF**

```gifsicle --resize [320x240] [input.gif] -o [output.gif]```

**Extract frames** from a GIF

```gifsicle [input.gif] '#0-9' -o [frames.gif]```

**Create a GIF** from multiple images

```gifsicle --delay=[10] [frame1.gif] [frame2.gif] -o [output.gif]```

**Change animation speed**

```gifsicle --delay=[5] [input.gif] -o [faster.gif]```

**Loop animation** specific number of times

```gifsicle --loopcount=[3] [input.gif] -o [output.gif]```

**Make infinite loop**

```gifsicle --loopcount=forever [input.gif] -o [output.gif]```

**Reduce colors** for smaller size

```gifsicle --colors [64] [input.gif] -o [output.gif]```

# SYNOPSIS

**gifsicle** [_options_] [_input.gif ..._] [_-o output.gif_]

# PARAMETERS

**-o**, **--output** _file_
> Write output to file.

**--optimize**, **-O** [_level_]
> Optimize GIF (1=store only changed, 2=shrink, 3=max).

**--resize** _WxH_
> Resize to specified dimensions.

**--resize-width** _W_
> Resize to width, maintaining aspect ratio.

**--resize-height** _H_
> Resize to height, maintaining aspect ratio.

**--scale** _factor_
> Scale by factor (e.g., 0.5 for half size).

**--delay** _time_
> Set frame delay in hundredths of a second.

**--loopcount** _n_
> Set loop count (0 or forever for infinite).

**--colors** _n_
> Reduce to n colors (2-256).

**--color-method** _method_
> Color reduction method: diversity, blend-diversity, median-cut.

**--crop** _x,y+WxH_
> Crop to specified region.

**--rotate-90**, **--rotate-180**, **--rotate-270**
> Rotate image.

**--flip-horizontal**, **--flip-vertical**
> Flip image.

**--unoptimize**, **-U**
> Unoptimize (expand each frame to full image).

**--explode**
> Write each frame to separate file.

**--info**, **-I**
> Show information about the GIF.

**--batch**, **-b**
> Modify files in place.

# DESCRIPTION

**gifsicle** is a command-line tool for creating, editing, and optimizing GIF images and animations. It can manipulate existing GIFs, combine multiple images into animations, extract frames, and significantly reduce file sizes.

The optimization feature is particularly valuable: level 3 optimization can reduce GIF file sizes by 30-50% without quality loss by storing only changed pixels between frames. Frame selection uses '#' notation (e.g., '#0' for the first frame, '#0-5' for a range).

# CAVEATS

Input must be valid GIF format. Very large GIFs may require significant memory. Heavy optimization can be slow on complex animations. Color reduction may cause visible quality loss. Does not convert from other formats (use ImageMagick for that).

# HISTORY

**gifsicle** was written by Eddie Kohler starting in **1997** at UCLA. It became a standard tool for GIF manipulation in the open-source community, particularly for web optimization.

# SEE ALSO

[convert](/man/convert)(1), [ffmpeg](/man/ffmpeg)(1), [optipng](/man/optipng)(1), [pngquant](/man/pngquant)(1)
