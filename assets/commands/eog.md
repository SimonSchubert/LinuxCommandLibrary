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

Open a single image **without** image gallery

```eog --disable-gallery [path/to/image.jpg]```

Open an image in a **new** instance

```eog --new-instance [path/to/image.jpg]```

# SYNOPSIS

**eog** [_options_] [_files..._]

# DESCRIPTION

**eog** (Eye of GNOME) is the official image viewer for the GNOME desktop environment. It provides a fast, lightweight interface for displaying images in many formats including JPEG, PNG, GIF, SVG, TIFF, BMP, and more. The viewer supports slideshows, fullscreen viewing, zoom, rotation, and basic image operations.

The application integrates with GNOME desktop services and file managers, supporting drag-and-drop, thumbnail generation, and EXIF metadata display. While designed for GNOME, eog can run on other desktop environments, though some features may require GNOME libraries.

# PARAMETERS

**-f**, **--fullscreen**
> Open in fullscreen mode.

**-s**, **--slide-show**
> Open in slideshow mode.

**-g**, **--disable-gallery**
> Disable the image gallery panel.

**-n**, **--new-instance**
> Open in a new instance rather than reusing an existing one.

**-w**, **--single-window**
> Force all images to be opened in a single window.

**--display=**_DISPLAY_
> X display to use.

**--version**
> Display version information.

**-?**, **--help**
> Show help message.

# CONFIGURATION

**~/.config/eog/**
> User configuration directory for preferences managed through GNOME.

**dconf/gsettings**
> Settings accessible via `gsettings` for the `org.gnome.eog` schema controlling UI, plugins, and behavior.

# CAVEATS

Designed for GNOME desktop; some features may not work outside GNOME. Large images may consume significant memory. As of GNOME 43, eog has been superseded in many distributions by **Loupe** (the new default GNOME image viewer written in Rust).

# INSTALL

```apt: sudo apt install eog```

```dnf: sudo dnf install eog```

```pacman: sudo pacman -S eog```

```apk: sudo apk add eog```

```zypper: sudo zypper install eog```

```nix: nix profile install nixpkgs#eog```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[feh](/man/feh)(1), [gpicview](/man/gpicview)(1), [gimp](/man/gimp)(1)
