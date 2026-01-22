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

**catimg** renders images in the terminal using Unicode characters. Supports JPEG, PNG, and GIF formats. Works over SSH connections with no dependencies.

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
