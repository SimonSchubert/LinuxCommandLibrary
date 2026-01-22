# TLDR

**Add drop shadow**

```ppmshadow [input.ppm] > [output.ppm]```

**Specify blur radius**

```ppmshadow -b [8] [input.ppm] > [output.ppm]```

**Specify shadow offset**

```ppmshadow -x [5] -y [5] [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmshadow** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PPM file.

**-b** _N_
> Blur radius.

**-x** _N_
> X offset.

**-y** _N_
> Y offset.

**-t**
> Translucent shadow.

# DESCRIPTION

**ppmshadow** adds drop shadow to images. Creates shadow effects.

The tool produces shadowed output. Part of Netpbm.

ppmshadow adds shadows.

# CAVEATS

Requires transparent background. Part of Netpbm suite.

# HISTORY

ppmshadow was created as part of **Netpbm** for shadow effect generation.

# SEE ALSO

[ppm](/man/ppm)(5), [pnmcomp](/man/pnmcomp)(1)

