# TAGLINE

Simple and fast image viewer

# TLDR

**Open an image file**

```viewnior [path/to/image.jpg]```

**Open an image in fullscreen mode**

```viewnior --fullscreen [path/to/image.jpg]```

**Start a slideshow from an image or directory**

```viewnior --slideshow [path/to/image.jpg]```

**Browse all images in a directory**

```viewnior [path/to/folder/]```

# SYNOPSIS

**viewnior** [_OPTIONS_] [_FILES_|_FOLDERS_]...

# DESCRIPTION

**viewnior** is a simple and elegant image viewer designed with minimalism, speed, and usability in mind. It provides a clean interface that maximizes screen space for viewing images.

# PARAMETERS

**--fullscreen**
> Start the viewer in fullscreen mode.

**--slideshow**
> Launch in slideshow mode.

**--version**
> Show version information and exit.

**-?, --help**
> Display help information and exit.

# CAVEATS

Supports common image formats through GDK-Pixbuf (JPEG, PNG, GIF, BMP, SVG, etc.). Navigate between images in a folder with arrow keys or mouse scroll. Slideshow interval is configured in the preferences dialog.

# HISTORY

**viewnior** was created by Siyan Panayotov as a fast, simple alternative to heavier image viewers, focusing on a minimal interface for desktop Linux users.

# SEE ALSO

[feh](/man/feh)(1), [sxiv](/man/sxiv)(1), [eog](/man/eog)(1), [gpicview](/man/gpicview)(1)
