# TLDR

**Convert PNM to SGI image**

```pnmtosgi [input.pnm] > [output.rgb]```

**Use RLE compression**

```pnmtosgi -rle [input.pnm] > [output.rgb]```

# SYNOPSIS

**pnmtosgi** [_options_] [_file_]

# PARAMETERS

**-rle**
> Use RLE compression.

**-verbatim**
> No compression.

# DESCRIPTION

**pnmtosgi** converts PNM images to SGI (Silicon Graphics) image format. Part of Netpbm toolkit.

# SEE ALSO

[sgitopnm](/man/sgitopnm)(1), [pnmtorle](/man/pnmtorle)(1)

