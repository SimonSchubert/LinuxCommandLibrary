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

**eog** (Eye of GNOME) is the official image viewer for the GNOME desktop. It displays images in various formats with support for slideshows, fullscreen viewing, and basic image operations.

Integrates with GNOME desktop services and file managers.

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

# CAVEATS

GNOME desktop application. Some features may not work outside GNOME. Large images may consume significant memory.

# SEE ALSO

[feh](/man/feh)(1), [gpicview](/man/gpicview)(1), [gimp](/man/gimp)(1)
