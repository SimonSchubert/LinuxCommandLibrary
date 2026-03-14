# TAGLINE

Open-source image editor for photo retouching and graphic design

# TLDR

**Start GIMP**

```gimp```

**Open an image**

```gimp [image.png]```

**Open multiple images**

```gimp [image1.png] [image2.jpg]```

**Run in batch mode without UI**

```gimp -i -b '(gimp-quit 0)'```

**Start without splash**

```gimp --no-splash```

# SYNOPSIS

**gimp** [_options_] [_files_]

# PARAMETERS

_FILES_
> Image files to open.

**-b** _COMMAND_, **--batch** _COMMAND_
> Run batch command non-interactively. May appear multiple times.

**--batch-interpreter** _PROC_
> Procedure to process batch commands (default: Script-Fu).

**-n**, **--new-instance**
> Start new instance.

**-i**, **--no-interface**
> Run without UI (for batch mode).

**--no-splash**
> Don't show splash screen.

**-d**, **--no-data**
> Don't load patterns, gradients, or brushes.

**-f**, **--no-fonts**
> Don't load fonts.

**--verbose**
> Show detailed startup messages.

**--help**
> Display help information.

# DESCRIPTION

**gimp** (GNU Image Manipulation Program) is a powerful open-source image editor. It provides tools for photo retouching, image composition, and image authoring, supporting numerous file formats.

GIMP features layers, masks, filters, color adjustments, and drawing tools. It supports scripting through Script-Fu and Python for automation. The plugin architecture enables extensive customization.

# CONFIGURATION

**~/.config/GIMP/3.0/** (or **~/.config/GIMP/2.10/**)
> User configuration directory, versioned per major release.

**gimprc**
> Main configuration file containing preferences and tool settings.

**sessionrc**
> Session configuration storing window positions and dialog states.

# CAVEATS

GTK application requires graphical environment. Large images can be memory-intensive. Plugin compatibility varies by version.

# HISTORY

GIMP was started by **Spencer Kimball** and **Peter Mattis** in **1995** at UC Berkeley. It became a GNU project and remains one of the most popular open-source graphics applications. **GIMP 3.0** was released in **2025** with GTK3 support and non-destructive editing.

# SEE ALSO

[imagemagick](/man/imagemagick)(1), [inkscape](/man/inkscape)(1), [krita](/man/krita)(1)
