# TAGLINE

Automatically crop borders from PNM images

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

**pnmcrop** automatically detects and removes uniform-color borders from PNM images. It identifies rows and columns at the edges that consist entirely of the border color and trims them.

By default it detects the border color automatically, but **-white** and **-black** force specific border colors. Individual sides can be cropped selectively with **-left**, **-right**, **-top**, and **-bottom** flags. Part of the Netpbm toolkit.

# CAVEATS

Border color must be uniform. Part of Netpbm suite.

# HISTORY

pnmcrop was created as part of **Netpbm** for automatic image border removal.

# SEE ALSO

[pnmcut](/man/pnmcut)(1), [pnmpad](/man/pnmpad)(1), [pamcut](/man/pamcut)(1)

