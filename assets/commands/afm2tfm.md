# TAGLINE

Adobe font metrics to TeX font metrics converter

# TLDR

**Convert an AFM file to TFM** format

```afm2tfm [font.afm] [font.tfm]```

**Convert with encoding** file

```afm2tfm [font.afm] -e [encoding.enc] -o [font.tfm]```

**Convert and generate virtual font**

```afm2tfm [font.afm] -v [font.vpl] [font.tfm]```

**Convert with slant transformation**

```afm2tfm [font.afm] -s [0.167] [font.tfm]```

**Convert with extended width**

```afm2tfm [font.afm] -e [1.2] [font.tfm]```

# SYNOPSIS

**afm2tfm** _afmfile_ [_options_] [_tfmfile_]

# PARAMETERS

**-e** _ratio_
> Extend (widen) the font by the given ratio.

**-s** _slant_
> Apply an artificial slant to simulate italics.

**-v** _vplfile_
> Generate a virtual property list file.

**-V** _vplfile_
> Like **-v** but include original font encoding.

**-T** _encfile_
> Use encoding file for both input and output.

**-p** _encfile_
> Use encoding for the PostScript font (input).

**-t** _encfile_
> Use encoding for the TeX font (output).

**-u**
> Use only specified encoding, ignore AFM encoding.

# DESCRIPTION

**afm2tfm** converts Adobe Font Metrics (AFM) files to TeX Font Metrics (TFM) format, enabling PostScript Type 1 fonts to be used with TeX and LaTeX typesetting systems. The TFM file contains character dimensions and kerning information that TeX needs for proper text layout.

The tool can apply transformations during conversion, including slanting for fake italics and extending for artificially widened fonts. When generating virtual fonts with **-v**, it creates a VPL (Virtual Property List) file that maps TeX character codes to PostScript glyph names, enabling encoding conversions.

This utility is part of the standard TeX distribution and is essential for integrating custom fonts into TeX workflows. The output may require additional processing with **vptovf** for virtual fonts.

# CAVEATS

The generated TFM files only contain metric information, not the actual font outlines. A proper font installation also requires the PFB/PFA font file and map file entries for dvips or pdfTeX. Virtual fonts need compilation with **vptovf** before use.

# HISTORY

**afm2tfm** was written by **Tom Rokicki** as part of the dvips package in the late **1980s**. It became essential when PostScript printers became common and users wanted to use professional Type 1 fonts with TeX instead of the limited Computer Modern family. The tool remains part of TeX Live and MiKTeX distributions today.

# SEE ALSO

[vptovf](/man/vptovf)(1), [dvips](/man/dvips)(1), [tftopl](/man/tftopl)(1), [pltotf](/man/pltotf)(1)
