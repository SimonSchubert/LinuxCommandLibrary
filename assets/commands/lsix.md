# TLDR

**Display images**

```lsix [*.jpg]```

**Display all images in directory**

```lsix```

**Display specific images**

```lsix [image1.png] [image2.png]```

**Set thumbnail size**

```LSIX_SIZE=[200x200] lsix```

**Display with border**

```lsix -b [*.png]```

# SYNOPSIS

**lsix** [_options_] [_files_]

# PARAMETERS

_FILES_
> Image files to display.

**-b**
> Show border around images.

**LSIX_SIZE**
> Environment variable for size.

# DESCRIPTION

**lsix** displays images in the terminal. It requires a terminal with sixel graphics support.

The tool creates thumbnails in the terminal. It works with terminals like xterm, mlterm, and foot.

lsix shows images in terminal.

# CAVEATS

Requires sixel-capable terminal. ImageMagick needed. Not all terminals supported.

# HISTORY

lsix was created to display images directly in terminals that support **sixel graphics** format.

# SEE ALSO

[img2sixel](/man/img2sixel)(1), [viu](/man/viu)(1), [chafa](/man/chafa)(1)

