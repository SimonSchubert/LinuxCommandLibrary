# TAGLINE

creates PBM images

# TLDR

**Create white bitmap**

```pbmmake -white [100] [100] > [white.pbm]```

**Create black bitmap**

```pbmmake -black [100] [100] > [black.pbm]```

**Create gray pattern**

```pbmmake -gray [100] [100] > [gray.pbm]```

# SYNOPSIS

**pbmmake** [_options_] _width_ _height_

# PARAMETERS

_WIDTH_
> Image width in pixels.

_HEIGHT_
> Image height in pixels.

**-white**
> White background.

**-black**
> Black background.

**-gray**
> Checkerboard pattern.

# DESCRIPTION

**pbmmake** creates PBM images. Generates solid or pattern backgrounds.

The tool makes blank bitmaps. Part of Netpbm.

# CAVEATS

Part of Netpbm. Simple patterns only. PBM format.

# HISTORY

pbmmake is part of **Netpbm** for creating bitmap images.

# SEE ALSO

[pbm](/man/pbm)(5), [ppmmake](/man/ppmmake)(1), [netpbm](/man/netpbm)(1)

