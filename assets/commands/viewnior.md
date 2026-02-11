# TAGLINE

Simple and fast image viewer

# TLDR

**View** an image

```viewnior path/to/image.jpg```

View in **fullscreen** mode

```viewnior --fullscreen path/to/image.jpg```

View as **slideshow**

```viewnior --slideshow path/to/image.jpg```

View all images in a **folder**

```viewnior path/to/folder/```

# SYNOPSIS

**viewnior** [_OPTIONS_] [_FILES_|_FOLDERS_]...

# DESCRIPTION

**viewnior** is a simple and elegant image viewer designed with minimalism, speed, and usability in mind. It provides a clean interface that maximizes screen space for viewing images.

# PARAMETERS

**--fullscreen**
> Start the viewer in fullscreen mode

**--slideshow**
> Launch in slideshow mode

**-?, --help**
> Display help information and exit

**--version**
> Show version information and exit

# CAVEATS

Viewnior supports common image formats through GDK-Pixbuf. Navigation between images in a folder uses arrow keys or mouse. The slideshow interval can be configured in the preferences.

# HISTORY

**viewnior** was created by Siyan Panayotov as a fast, simple alternative to heavier image viewers, focusing on a minimal interface for desktop Linux users.

# SEE ALSO

[feh](/man/feh)(1), [sxiv](/man/sxiv)(1), [eog](/man/eog)(1), [gpicview](/man/gpicview)(1)
