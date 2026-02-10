# TAGLINE

command-line tool for working with colors

# TLDR

**Display color information**

```pastel color [red]```

**Show color from hex**

```pastel color ["#ff5500"]```

**Convert color format**

```pastel format hsl ["#ff5500"]```

**List color names**

```pastel list```

**Generate color palette**

```pastel gradient [blue] [red] --number [5]```

**Pick color interactively**

```pastel pick```

**Lighten a color**

```pastel lighten [0.2] [blue]```

**Mix two colors**

```pastel mix [red] [blue]```

# SYNOPSIS

**pastel** _command_ [_options_] [_arguments_]

# PARAMETERS

**color** _COLOR_
> Show color information.

**list**
> List named colors.

**format** _FORMAT_ _COLOR_
> Convert color to format.

**pick**
> Interactive color picker.

**gradient** _COLOR1_ _COLOR2_
> Generate gradient between colors.

**mix** _COLOR1_ _COLOR2_
> Mix two colors.

**lighten** _AMOUNT_ _COLOR_
> Lighten color (0.0-1.0).

**darken** _AMOUNT_ _COLOR_
> Darken color.

**saturate** _AMOUNT_ _COLOR_
> Increase saturation.

**desaturate** _AMOUNT_ _COLOR_
> Decrease saturation.

**rotate** _DEGREES_ _COLOR_
> Rotate hue.

**complement** _COLOR_
> Get complementary color.

**distinct** _NUM_ [_COLORS_]
> Generate distinct colors.

**random**
> Generate random color.

**paint** _COLOR_ _TEXT_
> Print colored text.

**--number** _N_
> Number of colors to generate.

**--colorspace** _SPACE_
> Color space for operations.

# DESCRIPTION

**pastel** is a command-line tool for working with colors. It displays color information, converts between formats, generates palettes, and manipulates colors programmatically.

Color input accepts multiple formats: names (red, blue), hex (#ff0000), RGB (rgb(255,0,0)), HSL (hsl(0,100%,50%)), and more. The tool displays color blocks in terminal with accurate previews using true color.

The color command shows comprehensive information: RGB, HSL, CIELAB values, closest named color, and contrast information. This helps in design work and accessibility checking.

Manipulation functions work in perceptually uniform color spaces (CIELAB) for natural-looking results. Lightening, darkening, and saturation changes appear consistent across the spectrum.

Palette generation creates harmonious color schemes. Gradient produces smooth transitions. Distinct generates maximally different colors for visualization. Random creates aesthetic random colors.

The paint command enables colored terminal output in scripts. Format conversion helps with CSS, code, and design tool integration.

# CAVEATS

Requires true color terminal for accurate display. Terminal color accuracy varies. Color perception depends on display calibration. Some operations may produce out-of-gamut results. Interactive picker requires terminal with mouse support.

# HISTORY

**pastel** was created by **David Peter** (sharkdp) around **2019**. Written in Rust, it's part of a suite of modern CLI tools including fd and bat. The tool addresses the need for color manipulation in terminal workflows, design, and accessibility testing. It emphasizes perceptually uniform color operations.

# SEE ALSO

[color](/man/color)(1), [tput](/man/tput)(1), [convert](/man/convert)(1)
