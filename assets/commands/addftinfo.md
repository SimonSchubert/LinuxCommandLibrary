# TAGLINE

Add font metric information to troff font files

# TLDR

**Add** font metrics to a troff font file

```addftinfo [resolution] [unitwidth] [font] < [input.tfm] > [output.tfm]```

Add metrics for **300 dpi** resolution

```addftinfo 300 300 TR < times-roman.tfm > TR.tfm```

# SYNOPSIS

**addftinfo** [_-v_] _resolution_ _unitwidth_ _font_ < _input_ > _output_

# DESCRIPTION

**addftinfo** is a groff (GNU troff) utility that adds computed font metric information to troff font files. It reads a font file, calculates additional metrics needed for typesetting, and outputs an enhanced font file.

The tool is typically used as part of the font installation process for groff, adding metrics like character heights and depths that aren't always present in basic font files.

# PARAMETERS

**resolution**
> Device resolution in dots per inch

**unitwidth**
> Point size at which the font unitwidth was designed

**font**
> Groff font name (R, I, B, BI, etc.)

**-v**, **--version**
> Print version information

# CAVEATS

The input must be a valid troff font description file. Output metrics are computed approximations and may not perfectly match the actual font rendering. This tool is specific to the groff typesetting system.

# HISTORY

**addftinfo** is part of GNU groff, which was developed starting in **1989** as a free replacement for the Unix troff typesetting system. The utility was created to simplify font installation.

# SEE ALSO

[groff](/man/groff)(1), [afmtodit](/man/afmtodit)(1), [tfmtodit](/man/tfmtodit)(1)
