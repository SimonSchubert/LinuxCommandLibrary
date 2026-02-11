# TAGLINE

Adjust colors to NTSC broadcast safe range

# TLDR

**Convert to NTSC-safe colors**

```ppmntsc [input.ppm] > [output.ppm]```

**Verbose output**

```ppmntsc -verbose [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmntsc** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PPM file.

**-verbose**
> Show adjustment info.

**-pal**
> Use PAL limits instead.

# DESCRIPTION

**ppmntsc** adjusts the colors in a PPM image to fall within the legal range for NTSC television broadcast. Colors that exceed the NTSC signal limits are clipped to the nearest legal value, preventing artifacts like blooming and color bleeding on broadcast displays.

The **-pal** option switches to PAL broadcast limits instead. The verbose mode reports how many pixels were adjusted and by how much, helping assess whether the source image is significantly out of gamut. Part of the Netpbm toolkit.

# CAVEATS

For video production. Part of Netpbm suite.

# HISTORY

ppmntsc was created as part of **Netpbm** for NTSC color compliance.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmchange](/man/ppmchange)(1)

