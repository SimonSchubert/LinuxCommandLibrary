# TLDR

**Crop borders from image**

```pnmcrop [input.pnm] > [output.pnm]```

**Crop only white borders**

```pnmcrop -white [input.pnm] > [output.pnm]```

**Crop only black borders**

```pnmcrop -black [input.pnm] > [output.pnm]```

**Crop specific sides**

```pnmcrop -left -right [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmcrop** [_options_] [_file_]

# PARAMETERS

_FILE_
> Input PNM file.

**-white**
> Crop white borders.

**-black**
> Crop black borders.

**-left**
> Crop left side only.

**-right**
> Crop right side only.

**-top**
> Crop top only.

**-bottom**
> Crop bottom only.

**-verbose**
> Show cropping information.

# DESCRIPTION

**pnmcrop** removes borders from PNM images. Part of Netpbm toolkit.

The tool detects uniform color borders. Removes padding automatically.

pnmcrop trims images.

# CAVEATS

Border color must be uniform. Part of Netpbm suite.

# HISTORY

pnmcrop was created as part of **Netpbm** for automatic image border removal.

# SEE ALSO

[pnmcut](/man/pnmcut)(1), [pnmpad](/man/pnmpad)(1), [pamcut](/man/pamcut)(1)

