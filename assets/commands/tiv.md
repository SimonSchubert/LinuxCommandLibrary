# TAGLINE

Display images in terminal using ANSI

# TLDR

**Display an image**

```tiv [image.png]```

**Display with specific width**

```tiv -w [80] [image.jpg]```

**Display with specific height**

```tiv -h [24] [image.png]```

**Display multiple images**

```tiv [image1.png] [image2.jpg] [image3.gif]```

**Display all images in directory**

```tiv [/path/to/images/]```

**Display with 256 colors**

```tiv -256 [image.png]```

# SYNOPSIS

**tiv** [_options_] _file_|_directory_ [...]

# PARAMETERS

**-w** _width_
> Set output width in characters.

**-h** _height_
> Set output height in characters.

**-256**
> Use 256-color mode instead of true color.

**-x** _num_
> Image x-offset in pixels.

**-y** _num_
> Image y-offset in pixels.

**-0**
> Do not output newline after image.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**tiv** (Terminal Image Viewer) displays images directly in the terminal using ANSI escape codes and Unicode block characters. It converts images to a text representation that approximates the original using colored characters.

The viewer supports various image formats through ImageMagick including PNG, JPEG, GIF, BMP, and more. It automatically scales images to fit the terminal dimensions while preserving aspect ratio.

For best results, use a terminal with true color (24-bit) support. The 256-color fallback mode works on older terminals but produces lower quality output. Unicode block characters provide approximately 2x vertical resolution compared to standard characters.

# CAVEATS

Quality depends on terminal capabilities and font. Requires true color terminal support for best results. Large images may take longer to render. Animated GIFs display only the first frame. Results vary significantly between terminal emulators.

# HISTORY

**tiv** was developed as a lightweight way to preview images without leaving the terminal. Multiple implementations exist with varying features, the most popular being the C++ TerminalImageViewer by Stefan Haustein. The tool gained popularity among developers who work primarily in terminal environments and need quick visual feedback.

# SEE ALSO

[img2txt](/man/img2txt)(1), [catimg](/man/catimg)(1), [chafa](/man/chafa)(1), [jp2a](/man/jp2a)(1), [timg](/man/timg)(1)
