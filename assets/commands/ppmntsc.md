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

**ppmntsc** adjusts colors to NTSC broadcast safe range. Video compliance.

The tool clips illegal colors. Part of Netpbm.

ppmntsc makes broadcast safe.

# CAVEATS

For video production. Part of Netpbm suite.

# HISTORY

ppmntsc was created as part of **Netpbm** for NTSC color compliance.

# SEE ALSO

[ppm](/man/ppm)(5), [ppmchange](/man/ppmchange)(1)

