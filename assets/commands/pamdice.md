# TAGLINE

slices images into tiles

# TLDR

**Slice image into tiles**

```pamdice -width=[100] -height=[100] -outstem=[tile] [input.pam]```

**Slice with overlap**

```pamdice -width=[100] -height=[100] -hoverlap=[10] -voverlap=[10] [input.pam]```

# SYNOPSIS

**pamdice** [_options_] [_file_]

# PARAMETERS

**-width** _PIXELS_
> Tile width.

**-height** _PIXELS_
> Tile height.

**-outstem** _PREFIX_
> Output filename prefix.

**-hoverlap** _PIXELS_
> Horizontal overlap.

**-voverlap** _PIXELS_
> Vertical overlap.

# DESCRIPTION

**pamdice** slices images into tiles. Creates multiple output files.

The tool divides images into grid. Part of Netpbm.

# CAVEATS

Part of Netpbm. Creates multiple files. Use pamundice to reassemble.

# HISTORY

pamdice is part of **Netpbm** for slicing images into tiles.

# SEE ALSO

[pamundice](/man/pamundice)(1), [pnmcut](/man/pnmcut)(1), [netpbm](/man/netpbm)(1)

