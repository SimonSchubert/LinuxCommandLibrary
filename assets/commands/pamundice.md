# TAGLINE

reassembles tiled images

# TLDR

**Reassemble tiled images**

```pamundice -across=[4] -down=[3] -listfile=[tiles.txt] > [output.pam]```

**With naming pattern**

```pamundice -across=[4] -down=[3] tile%02d_%02d.pam > [output.pam]```

# SYNOPSIS

**pamundice** [_options_] [_input_pattern_]

# PARAMETERS

**-across** _N_
> Tiles across.

**-down** _N_
> Tiles down.

**-listfile** _FILE_
> File listing tile names.

**-hoverlap** _PIXELS_
> Horizontal overlap.

**-voverlap** _PIXELS_
> Vertical overlap.

# DESCRIPTION

**pamundice** reassembles tiled images. Reverse of pamdice operation.

The tool combines image tiles. Part of Netpbm.

# CAVEATS

Part of Netpbm. Tiles must match. Overlap handling.

# HISTORY

pamundice is part of **Netpbm** for reassembling tiled images.

# SEE ALSO

[pamdice](/man/pamdice)(1), [pnmcat](/man/pnmcat)(1), [netpbm](/man/netpbm)(1)

