# TLDR

**Dither image**

```ppmdither [input.ppm] > [output.ppm]```

**Specify colors per channel**

```ppmdither -red [4] -green [4] -blue [4] [input.ppm] > [output.ppm]```

**Floyd-Steinberg dithering**

```ppmdither -fs [input.ppm] > [output.ppm]```

# SYNOPSIS

**ppmdither** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PPM file.

**-red** _N_
> Red channel levels.

**-green** _N_
> Green channel levels.

**-blue** _N_
> Blue channel levels.

**-fs**
> Floyd-Steinberg dithering.

# DESCRIPTION

**ppmdither** dithers PPM images. Reduces color count with dithering.

The tool creates dithered output. Part of Netpbm.

ppmdither reduces colors.

# CAVEATS

Different from quantization. Part of Netpbm suite.

# HISTORY

ppmdither was created as part of **Netpbm** for color dithering.

# SEE ALSO

[ppmquant](/man/ppmquant)(1), [pnmremap](/man/pnmremap)(1), [ppm](/man/ppm)(5)

