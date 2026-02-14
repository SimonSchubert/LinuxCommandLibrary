# TAGLINE

Simulate the digital rain from "The Matrix"

# TLDR

**Run the default Matrix rain animation**

```neo```

**Run with a specific color**

```neo -c [green|red|blue|cyan|gold|rainbow|purple|pink|vaporwave]```

**Run with a specific character set**

```neo --charset [katakana|ascii|cyrillic|greek|braille|runic|binary|hex]```

**Adjust scrolling speed and droplet density**

```neo -S [12] -d [1.5]```

**Display a centered message** within the rain

```neo -m "[message]"```

**Run with async scrolling and 256-color mode**

```neo -S 12 -a --colormode=256```

# SYNOPSIS

**neo** [_options_]

# PARAMETERS

**-c, --color** _color_
> Set foreground text color. Available: **green**, **green2**, **green3**, **yellow**, **orange**, **red**, **blue**, **cyan**, **gold**, **rainbow**, **purple**, **pink**, **pink2**, **vaporwave**, **gray**

**-S, --speed** _num_
> Set the scrolling speed

**-d, --density** _num_
> Control how many droplets appear onscreen (default: 1.0)

**--charset** _name_
> Character set to use: **ascii**, **extended**, **english**, **dec**, **digits**, **punc**, **bin**, **hex**, **katakana**, **greek**, **cyrillic**, **arabic**, **hebrew**, **devanagari**, **braille**, **runic**

**--chars** _range_
> Specify custom Unicode character ranges via hex codes

**--colormode** _mode_
> Color assignment method: **0** = random (default), **1** = gradient

**-m, --message** _text_
> Display centered ASCII text revealed as characters stream past

**-a, --async**
> Enable faster asynchronous scrolling

**-F, --fullwidth**
> Use fullwidth character rendering

**--noglitch**
> Disable glitch effects

**-h, --help**
> Display help information

# DESCRIPTION

**neo** recreates the iconic digital rain effect from "The Matrix" films. Streams of random characters endlessly scroll down the terminal screen, closely mimicking the movie scene where Cypher explains the code to Neo. It imitates finer details such as the half-width katakana characters, uneven colors, glitching, and flickering.

The animation can be customized with different character sets, color palettes, scrolling speeds, and density settings. Interactive controls allow real-time adjustments using arrow keys for speed and glitch intensity, and number keys for color switching.

# CAVEATS

Performance depends on terminal emulator capabilities. A GPU-accelerated terminal significantly improves rendering. Unicode character sets require appropriate font support. Does not support native Windows; use WSL instead.

# HISTORY

**neo** was created by **st3w** as a modern rewrite of **CMatrix** (originally by Chris Allegretta). It adds **32-bit color** and full **Unicode support**, going beyond the original CMatrix capabilities. The project is available on Linux, macOS, and FreeBSD.

# SEE ALSO

[cmatrix](/man/cmatrix)(1), [sl](/man/sl)(1)
