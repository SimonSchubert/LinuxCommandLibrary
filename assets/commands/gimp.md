# TLDR

**Start GIMP**

```gimp```

**Open an image**

```gimp [image.png]```

**Open multiple images**

```gimp [image1.png] [image2.jpg]```

**Run in batch mode**

```gimp -b '(gimp-quit 0)'```

**Start without splash**

```gimp --no-splash```

# SYNOPSIS

**gimp** [_options_] [_files_]

# PARAMETERS

_FILES_
> Image files to open.

**-b** _COMMAND_, **--batch** _COMMAND_
> Run batch command.

**-n**, **--new-instance**
> Start new instance.

**--no-splash**
> Don't show splash screen.

**--no-interface**
> Run without UI (batch mode).

**-d**, **--no-data**
> Don't load patterns and brushes.

**-g**, **--gimprc** _FILE_
> Use alternate config file.

**--help**
> Display help information.

# DESCRIPTION

**gimp** (GNU Image Manipulation Program) is a powerful open-source image editor. It provides tools for photo retouching, image composition, and image authoring, supporting numerous file formats.

GIMP features layers, masks, filters, color adjustments, and drawing tools. It supports scripting through Script-Fu and Python for automation. The plugin architecture enables extensive customization.

gimp serves as a free alternative to commercial image editors like Photoshop.

# CAVEATS

GTK application requires graphical environment. Large images can be memory-intensive. Plugin compatibility varies by version.

# HISTORY

GIMP was started by **Spencer Kimball** and **Peter Mattis** in **1995** at UC Berkeley. It became a GNU project and remains one of the most popular open-source graphics applications.

# SEE ALSO

[imagemagick](/man/imagemagick)(1), [inkscape](/man/inkscape)(1), [krita](/man/krita)(1)
