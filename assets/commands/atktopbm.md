# TLDR

**Convert** Andrew Toolkit raster to PBM

```atktopbm [input.atk] > [output.pbm]```

# SYNOPSIS

**atktopbm** [_atkfile_]

# DESCRIPTION

**atktopbm** converts Andrew Toolkit raster format files to PBM (Portable Bitmap) format. The Andrew Toolkit was a widget set and application framework from Carnegie Mellon University.

This converter handles legacy ATK format graphics.

# PARAMETERS

**atkfile**
> Input ATK raster file (or stdin)

# CAVEATS

ATK format is obsolete. Primarily for converting legacy files. Few modern applications produce ATK rasters.

# HISTORY

Part of Netpbm, supporting the Andrew Toolkit format which was developed at Carnegie Mellon in the **1980s**.

# SEE ALSO

[pbmtoatk](/man/pbmtoatk)(1), [pnmtopng](/man/pnmtopng)(1)
