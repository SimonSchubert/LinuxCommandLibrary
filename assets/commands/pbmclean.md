# TAGLINE

removes isolated pixels

# TLDR

**Remove noise from bitmap**

```pbmclean [input.pbm] > [output.pbm]```

**Set minimum connected size**

```pbmclean -minneigh=[4] [input.pbm] > [output.pbm]```

**Flip black/white for cleaning**

```pbmclean -black [input.pbm] > [output.pbm]```

# SYNOPSIS

**pbmclean** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PBM file.

**-minneigh** _N_
> Minimum neighbor count.

**-black**
> Clean black pixels.

**-white**
> Clean white pixels.

# DESCRIPTION

**pbmclean** removes isolated pixels. Cleans up noisy bitmaps.

The tool removes speckles. Part of Netpbm.

# CAVEATS

Part of Netpbm. PBM format only. May remove small details.

# HISTORY

pbmclean is part of **Netpbm** for cleaning bitmap images.

# SEE ALSO

[pbm](/man/pbm)(5), [pgmedge](/man/pgmedge)(1), [netpbm](/man/netpbm)(1)

