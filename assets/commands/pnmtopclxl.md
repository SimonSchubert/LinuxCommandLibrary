# TLDR

**Convert PNM to PCL-XL format**

```pnmtopclxl [input.pnm] > [output.pclxl]```

**Specify paper size**

```pnmtopclxl -paper [a4] [input.pnm] > [output.pclxl]```

# SYNOPSIS

**pnmtopclxl** [_options_] [_files_...]

# PARAMETERS

**-paper** _size_
> Paper size (letter, a4, etc.).

**-dpi** _n_
> Print resolution.

**-duplex**
> Enable duplex printing.

# DESCRIPTION

**pnmtopclxl** converts PNM images to PCL-XL (PCL6) printer language format for HP LaserJet printers. Part of Netpbm toolkit.

# SEE ALSO

[pbmtolj](/man/pbmtolj)(1), [pnmtops](/man/pnmtops)(1)

