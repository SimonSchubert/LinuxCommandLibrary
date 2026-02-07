# TAGLINE

Official image viewer for the GNOME desktop

# TLDR

**Open** an image file

```eog [path/to/image.png]```

Open **multiple** images

```eog [image1.jpg] [image2.png]```

Open images in **fullscreen** mode

```eog --fullscreen [path/to/image.jpg]```

Start a **slideshow**

```eog --slide-show [path/to/directory]```

Open a single image **without** image collection

```eog --single-window [path/to/image.jpg]```

Open an image in a **new** window instance

```eog --new-instance [path/to/image.jpg]```

# SYNOPSIS

**eog** [_options_] [_files_]

# DESCRIPTION

**eog** (Eye of GNOME) is the official image viewer for the GNOME desktop environment. It provides a fast, lightweight interface for displaying images in various formats including JPEG, PNG, GIF, SVG, and many others. The viewer supports slideshows, fullscreen viewing, and basic image operations like rotation and zooming.

The application integrates seamlessly with GNOME desktop services and file managers, supporting drag-and-drop, thumbnail generation, and EXIF metadata display. While designed for GNOME, eog can run on other desktop environments, though some features may require GNOME libraries.

# PARAMETERS

**--fullscreen**
> Open in fullscreen mode

**--slide-show**
> Start slideshow

**--single-window**
> Open without collection sidebar

**--new-instance**
> Open in new window instance

**-n, --new-instance**
> Start new instance

# CONFIGURATION

**~/.config/eog/**
> Configuration directory for user preferences and settings managed through GNOME.

**dconf/gsettings**
> Settings accessible via gsettings for org.gnome.eog schema controlling UI, plugins, and behavior.

# CAVEATS

GNOME desktop application. Some features may not work outside GNOME. Large images may consume significant memory.

# SEE ALSO

[feh](/man/feh)(1), [gpicview](/man/gpicview)(1), [gimp](/man/gimp)(1)
