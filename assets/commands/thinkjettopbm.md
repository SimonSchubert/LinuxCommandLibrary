# TAGLINE

Convert HP ThinkJet to PBM format

# TLDR

**Convert HP ThinkJet to PBM**

```thinkjettopbm [input.thinkjet] > [output.pbm]```

**Convert with debug output**

```thinkjettopbm -debug [input.thinkjet] > [output.pbm]```

# SYNOPSIS

**thinkjettopbm** [**-debug**] [_thinkjet_file_]

# PARAMETERS

**-debug**
> Enable diagnostic output on standard error.

# DESCRIPTION

**thinkjettopbm** reads HP ThinkJet printer commands from the specified file (or standard input) and produces a PBM image on standard output. It silently ignores text and non-graphics command sequences.

The program handles only a small subset of ThinkJet command sequences, but enough to convert screen images from older HP test equipment. It is part of the **Netpbm** toolkit.

# SEE ALSO

[pbmtolj](/man/pbmtolj)(1), [ppmtolj](/man/ppmtolj)(1), [ppmtopj](/man/ppmtopj)(1), [pjtoppm](/man/pjtoppm)(1), [pnmtopclxl](/man/pnmtopclxl)(1), [netpbm](/man/netpbm)(1)

