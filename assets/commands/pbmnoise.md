# TAGLINE

creates random noise images

# TLDR

**Create random noise bitmap**

```pbmnoise [100] [100] > [noise.pbm]```

**Set density**

```pbmnoise -ratio=[0.5] [100] [100] > [noise.pbm]```

**Set random seed**

```pbmnoise -randomseed=[12345] [100] [100] > [noise.pbm]```

# SYNOPSIS

**pbmnoise** [_options_] _width_ _height_

# PARAMETERS

_WIDTH_
> Image width.

_HEIGHT_
> Image height.

**-ratio** _RATIO_
> Black pixel ratio (0-1).

**-randomseed** _SEED_
> Random seed.

# DESCRIPTION

**pbmnoise** creates random noise images. Generates random black and white pixels.

The tool produces noise patterns. Part of Netpbm.

# CAVEATS

Part of Netpbm. Random output. Reproducible with seed.

# HISTORY

pbmnoise is part of **Netpbm** for generating random bitmap noise.

# SEE ALSO

[pbm](/man/pbm)(5), [pgmnoise](/man/pgmnoise)(1), [netpbm](/man/netpbm)(1)

