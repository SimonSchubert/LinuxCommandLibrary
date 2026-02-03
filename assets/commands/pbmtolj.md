# TLDR

**Convert PBM to HP LaserJet format**

```pbmtolj [input.pbm] > [output.lj]```

**Specify resolution**

```pbmtolj -resolution [300] [input.pbm] > [output.lj]```

# SYNOPSIS

**pbmtolj** [_options_] [_file_]

# PARAMETERS

**-resolution** _n_
> Print resolution (75, 100, 150, 300, 600).

**-float**
> Don't set cursor position.

**-delta**
> Use delta row compression.

# DESCRIPTION

**pbmtolj** converts PBM bitmaps to HP LaserJet PCL format for direct printing. Supports various resolutions and compression. Part of Netpbm toolkit.

# SEE ALSO

[ppmtolj](/man/ppmtolj)(1), [pbmtoepson](/man/pbmtoepson)(1)

