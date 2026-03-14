# TAGLINE

Map PPM colors to evenly distributed grayscale levels

# TLDR

Sort by **intensity** and map to grayscale

```ppmdist -intensity [input.ppm] > [output.pgm]```

Sort by **frequency** and map to grayscale

```ppmdist -frequency [input.ppm] > [output.pgm]```

# SYNOPSIS

**ppmdist** [**-intensity** | **-frequency**] [_ppmfile_]

# PARAMETERS

**-intensity**
> Sort input colors by grayscale intensity before mapping to evenly distributed gray levels.

**-frequency**
> Sort input colors by number of occurrences before mapping to evenly distributed gray levels.

# DESCRIPTION

**ppmdist** reads a PPM image and produces a PGM output with evenly distributed gray levels. An input of n colors produces n gray levels, maximizing contrast in the output. The mapping order is controlled by the **-intensity** or **-frequency** options. Most useful for images with a small number of colors. Part of the Netpbm toolkit.

# CAVEATS

Only helpful for images with a very small number of colors. Reads from stdin if no file is specified.

# SEE ALSO

[ppmcolormask](/man/ppmcolormask)(1)

