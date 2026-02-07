# TAGLINE

display images in the terminal using Unicode characters

# TLDR

**Display image in terminal**

```catimg [image.png]```

**Set custom width**

```catimg -w [80] [image.jpg]```

**Double resolution**

```catimg -r 2 [image.png]```

**Disable 24-bit color**

```catimg -t [image.gif]```

# SYNOPSIS

**catimg** [_options_] _image_

# DESCRIPTION

**catimg** renders images directly in the terminal using Unicode block characters and ANSI color codes. It supports JPEG, PNG, and GIF formats, with animated GIF playback via configurable loop counts.

The tool requires no external dependencies and works over SSH connections, making it useful for previewing images on remote servers or in minimal environments without a graphical display. Image resolution can be adjusted with width, height, and resolution multiplier options to balance detail against terminal size.

# PARAMETERS

**-w** _width_
> Display width (default: terminal width)

**-r** _factor_
> Resolution multiplier (e.g., 2 for double)

**-t**
> Disable 24-bit color (use 256 colors)

**-H** _height_
> Set display height

**-l** _loops_
> GIF animation loops (0 for infinite)

# INSTALLATION

```
git clone https://github.com/posva/catimg.git
cd catimg
cmake .
sudo make install
```

# SIMILAR TOOLS

**chafa**
> Advanced terminal graphics

**timg**
> Terminal image/video viewer

**tiv**
> Terminal image viewer

**imcat**
> Image to terminal

# CAVEATS

Uses Unicode block characters for rendering. Quality depends on terminal font and color support. Works best in terminals with 24-bit color support.

# SEE ALSO

[chafa](/man/chafa)(1), [timg](/man/timg)(1)
