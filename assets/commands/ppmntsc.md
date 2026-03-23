# TAGLINE

Adjust colors to NTSC broadcast safe range

# TLDR

**Convert to NTSC-safe colors**

```ppmntsc [input.ppm] > [output.ppm]```

**Use PAL limits** instead of NTSC

```ppmntsc --pal [input.ppm] > [output.ppm]```

**Show count of illegal pixels**

```ppmntsc --verbose [input.ppm] > [output.ppm]```

**Output only corrected pixels** (compliant pixels become black)

```ppmntsc --correctedonly [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmntsc** [**--pal**] [**--legalonly**] [**--illegalonly**] [**--correctedonly**] [**--verbose**] [**--debug**] [_infile_]

# PARAMETERS

_infile_
> Input PPM file. Reads from standard input if omitted.

**--pal**
> Use PAL broadcast color limits instead of the default NTSC.

**--verbose**
> Display a count of illegal pixels found.

**--debug**
> Display detailed output listing each illegal color and its corrected version.

**--legalonly**
> Output only compliant pixels; replace non-compliant ones with black.

**--illegalonly**
> Output only non-compliant pixels uncorrected; replace compliant ones with black.

**--correctedonly**
> Output only corrected versions of non-compliant pixels; replace compliant ones with black.

# DESCRIPTION

**ppmntsc** adjusts the colors in a PPM image to fall within the legal range for NTSC television broadcast. It tests each pixel and reduces saturation for those outside the legal range, while leaving compliant pixels unchanged. Colors that exceed the NTSC signal limits are clipped to the nearest legal value, preventing artifacts like blooming and color bleeding on broadcast displays.

The **--pal** option switches to PAL broadcast limits instead. The **--verbose** mode reports how many pixels were illegal, helping assess whether the source image is significantly out of gamut. The filtering options (**--legalonly**, **--illegalonly**, **--correctedonly**) allow isolating specific pixels for analysis. Part of the Netpbm toolkit.

# CAVEATS

For video production. Part of the Netpbm suite. The program processes multi-image PPM streams.

# HISTORY

ppmntsc was created by Wes Barris at the Minnesota Supercomputer Center as part of the **Netpbm** toolkit for NTSC color compliance.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmdim](/man/ppmdim)(1), [pambrighten](/man/pambrighten)(1), [pamdepth](/man/pamdepth)(1)

