# TLDR

**Convert PNM to Utah RLE format**

```pnmtorle [input.pnm] > [output.rle]```

**Add alpha channel**

```pnmtorle -alpha [mask.pgm] [input.pnm] > [output.rle]```

# SYNOPSIS

**pnmtorle** [_options_] [_file_]

# PARAMETERS

**-alpha** _file_
> Alpha mask file.

**-verbose**
> Print progress information.

# DESCRIPTION

**pnmtorle** converts PNM images to Utah RLE (Run Length Encoded) format used by the Utah Raster Toolkit. Part of Netpbm toolkit.

# SEE ALSO

[rletopnm](/man/rletopnm)(1), [pnmtosgi](/man/pnmtosgi)(1)

