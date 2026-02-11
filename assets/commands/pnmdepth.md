# TAGLINE

Change color depth of PNM images

# TLDR

**Change image depth**

```pnmdepth [newdepth] [input.pnm] > [output.pnm]```

**Reduce to 8-bit**

```pnmdepth 255 [input.pnm] > [output.pnm]```

**Reduce to 4-bit**

```pnmdepth 15 [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmdepth** _newmaxval_ [_file_]

# PARAMETERS

_NEWMAXVAL_
> New maximum sample value (depth).

_FILE_
> Input PNM file.

# DESCRIPTION

**pnmdepth** changes the maximum sample value (color depth) of PNM images by proportionally rescaling all pixel values. For example, converting from maxval 65535 (16-bit) to 255 (8-bit) scales each sample value accordingly.

This is useful for reducing file size by lowering bit depth or for ensuring compatibility with tools that expect specific depth values. Part of the Netpbm toolkit; superseded by **pamdepth**.

# CAVEATS

Values are scaled proportionally. Part of Netpbm suite.

# HISTORY

pnmdepth was created as part of **Netpbm** for image depth conversion.

# SEE ALSO

[pamdepth](/man/pamdepth)(1), [pnm](/man/pnm)(5), [ppmquant](/man/ppmquant)(1)

