# TAGLINE

converts PBM bitmaps to HP PPA format for certain HP DeskJet printers

# TLDR

**Convert PBM to HP PPA format**

```pbmtoppa [input.pbm] > [output.ppa]```

**Specify gamma correction**

```pbmtoppa -g [1.0] [input.pbm] > [output.ppa]```

# SYNOPSIS

**pbmtoppa** [_options_] [_file_]

# PARAMETERS

**-g** _value_
> Gamma correction value.

**-b** _n_
> Blackness value.

# DESCRIPTION

**pbmtoppa** converts PBM bitmaps to HP PPA (Printing Performance Architecture) format for certain HP DeskJet printers. Part of Netpbm toolkit.

# SEE ALSO

[pbmtolj](/man/pbmtolj)(1), [pbmtoepson](/man/pbmtoepson)(1)

