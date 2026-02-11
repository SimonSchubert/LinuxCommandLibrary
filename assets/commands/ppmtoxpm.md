# TAGLINE

Convert PPM to X11 pixmap format

# TLDR

**Convert PPM to XPM**

```ppmtoxpm [input.ppm] > [output.xpm]```

**Convert with custom name**

```ppmtoxpm -name [icon] [input.ppm] > [icon.xpm]```

# SYNOPSIS

**ppmtoxpm** [_options_] [_file_]

# PARAMETERS

**-name** _name_
> Variable name in output.

**-hexonly**
> Use hex color codes only.

**-rgb** _file_
> RGB color name file.

# DESCRIPTION

**ppmtoxpm** converts PPM images to X11 pixmap format (.xpm). XPM is a C source format for color images in X11. Part of Netpbm toolkit.

# SEE ALSO

[xpmtoppm](/man/xpmtoppm)(1), [pbmtoxbm](/man/pbmtoxbm)(1)

