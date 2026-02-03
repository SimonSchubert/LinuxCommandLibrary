# TLDR

**Convert SVG to PAM**

```svgtopam [input.svg] > [output.pam]```

**Convert with specific resolution**

```svgtopam -resolution [300] [input.svg] > [output.pam]```

# SYNOPSIS

**svgtopam** [_options_] [_file_]

# PARAMETERS

**-resolution** _dpi_
> Output resolution.

**-dimension** _WxH_
> Output dimensions.

# DESCRIPTION

**svgtopam** converts SVG vector graphics to PAM raster format. Rasterizes SVG at specified resolution. Part of Netpbm toolkit.

# SEE ALSO

[rsvg-convert](/man/rsvg-convert)(1), [inkscape](/man/inkscape)(1)

