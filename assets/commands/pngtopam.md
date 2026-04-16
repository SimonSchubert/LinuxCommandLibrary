# TAGLINE

Convert PNG images to PAM format

# TLDR

**Convert PNG to PAM**

```pngtopam [input.png] > [output.pam]```

**Convert with alpha channel**

```pngtopam -alpha [input.png] > [output.pam]```

# SYNOPSIS

**pngtopam** [_options_] [_file_]

# PARAMETERS

**-alphapam**
> Output a PAM with tuple type depending on the PNG (supports transparency).

**-alpha**
> Extract only the alpha channel as a PGM-style PAM.

**-mix**
> Composite the image against a background color when transparency is present.

**-background** _color_
> Specify the background color used with -mix (e.g., "rgb:FF/FF/FF" or a color name).

**-gamma** _value_
> Set the gamma value used for display correction.

**-text**
> Emit any tEXt chunks from the PNG to stderr.

**-verbose**
> Print information about the conversion to stderr.

# DESCRIPTION

**pngtopam** converts a PNG image to a PAM (Portable Arbitrary Map) image. Part of the Netpbm toolkit, it preserves transparency when **-alphapam** is specified. If the input has no transparency, the output is typically an RGB or grayscale PAM.

# CAVEATS

Reads from standard input if no file is given. Without **-alphapam** or **-alpha**, transparency information may be lost. Replaces older **pngtopnm** for images needing alpha channel support.

# HISTORY

Part of the **Netpbm** package, which descends from Jef Poskanzer's pbmplus from the late 1980s. PAM was introduced in Netpbm 10.x to unify PBM/PGM/PPM/PAM handling.

# SEE ALSO

[pamtopng](/man/pamtopng)(1), [pngtopnm](/man/pngtopnm)(1), [pnmtopng](/man/pnmtopng)(1)

