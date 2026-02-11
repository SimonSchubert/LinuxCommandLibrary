# TAGLINE

Combine multiple images into a montage

# TLDR

**Create image montage**

```pnmmontage [image1.pnm] [image2.pnm] [image3.pnm] > [montage.pnm]```

**Create montage with border**

```pnmmontage -margin [5] [image*.pnm] > [montage.pnm]```

**Create specific layout**

```pnmmontage -across [3] [image*.pnm] > [montage.pnm]```

# SYNOPSIS

**pnmmontage** [_options_] _files_...

# PARAMETERS

**-across** _n_
> Images per row.

**-margin** _pixels_
> Margin between images.

**-border** _pixels_
> Border around montage.

**-back** _color_
> Background color.

# DESCRIPTION

**pnmmontage** combines multiple PNM images into a single montage. Arranges images in a grid layout. Part of Netpbm toolkit for image composition.

# SEE ALSO

[pamundice](/man/pamundice)(1), [pnmcat](/man/pnmcat)(1)

