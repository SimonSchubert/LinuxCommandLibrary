# TAGLINE

Compare two GIF images and report differences

# TLDR

**Compare two GIF files**

```gifdiff [file1.gif] [file2.gif]```

**Output differences**

```gifdiff -o [diff.gif] [file1.gif] [file2.gif]```

**Brief output**

```gifdiff -b [file1.gif] [file2.gif]```

# SYNOPSIS

**gifdiff** [_options_] _gif1_ _gif2_

# PARAMETERS

**-o** _file_
> Output difference image.

**-b**
> Brief output.

**-w**
> Ignore whitespace.

# DESCRIPTION

**gifdiff** is a specialized comparison tool for GIF image files, part of the gifsicle toolkit. It performs pixel-by-pixel comparison between two GIF files and reports the differences found.

The tool can produce a visual difference image when using the -o flag, where differing pixels are highlighted. Without the brief flag, **gifdiff** provides detailed information about differences in image dimensions, color palettes, animation frames, and pixel data.

# SEE ALSO

[gifsicle](/man/gifsicle)(1)
