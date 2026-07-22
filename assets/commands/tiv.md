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

**Show a directory as a thumbnail grid**

```tiv [/path/to/images/]```

**Use a custom number of thumbnail columns**

```tiv -c [5] [/path/to/images/]```

**Use 256-color mode** (e.g. macOS Terminal)

```tiv -2 [image.png]```

# SYNOPSIS

**tiv** [_options_] _image_ [_image_...]

# PARAMETERS

**-w** _num_
> Set the maximum output width to _num_ characters.

**-h** _num_
> Set the maximum output height to _num_ lines.

**-2**, **--256**
> Use 256 colors instead of 24-bit true color. Needed to display properly on macOS Terminal.

**-0**
> No block character adjustment: always use the top half block character.

**-c** _num_
> Number of thumbnail columns in 'dir' mode (3 by default).

**-d**, **--dir**
> Force 'dir' (thumbnail grid) mode. Selected automatically for more than one input.

**-f**, **--full**
> Force 'full' mode. Selected automatically for a single input.

**-C** _hex_
> Use _hex_ color (0xFFFFFF white by default) as the background for transparent PNG/GIF.

**-x**
> Use new Unicode Teletext/legacy characters (experimental).

**--help**
> Display help information.

# DESCRIPTION

**tiv** (Terminal Image Viewer) displays images directly in the terminal using RGB ANSI escape codes and Unicode block graphics characters. It maps each 4x8 pixel cell to the block character and foreground/background colors that best approximate the original.

Images are loaded with the bundled CImg library: PNG support is compiled in, while other formats (JPEG, GIF, BMP, and more) are handled by invoking ImageMagick's `convert`. Images are scaled to fit the terminal while preserving aspect ratio.

When given a directory or more than one file, **tiv** switches to 'dir' mode and renders a grid of thumbnails (override with **-f**/**-d**). For best results, use a terminal with true color (24-bit) support. The **-2** 256-color mode works on older terminals but produces lower quality output. Block characters provide roughly 2x vertical resolution compared to standard characters.

# CAVEATS

Quality depends on terminal capabilities and font. True color terminal support gives the best results. Non-PNG formats require ImageMagick to be installed. Animated GIFs display only the first frame. Results vary significantly between terminal emulators.

# HISTORY

**tiv** is the C++ TerminalImageViewer by Stefan Haustein, a lightweight way to preview images without leaving the terminal. It renders with RGB ANSI codes and Unicode block characters and is popular among developers who work primarily in terminals. Several unrelated tools also ship a `tiv` binary, so behavior can differ between installations.

# INSTALL

```apt: sudo apt install tiv```

```brew: brew install tiv```

```nix: nix profile install nixpkgs#tiv```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[chafa](/man/chafa)(1), [viu](/man/viu)(1), [timg](/man/timg)(1), [catimg](/man/catimg)(1), [img2txt](/man/img2txt)(1), [jp2a](/man/jp2a)(1)
