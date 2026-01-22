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

**pnmdepth** changes the depth of PNM images. Scales sample values.

The tool adjusts bit depth. Useful for format conversion.

pnmdepth scales values.

# CAVEATS

Values are scaled proportionally. Part of Netpbm suite.

# HISTORY

pnmdepth was created as part of **Netpbm** for image depth conversion.

# SEE ALSO

[pamdepth](/man/pamdepth)(1), [pnm](/man/pnm)(5), [ppmquant](/man/ppmquant)(1)

