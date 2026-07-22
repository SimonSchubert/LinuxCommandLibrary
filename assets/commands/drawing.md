# TAGLINE

basic raster image editor for GNOME

# TLDR

**Start** Drawing

```drawing```

Open **specific files**

```drawing [path/to/image1] [path/to/image2]```

Open in **new window**

```drawing --new-window [path/to/image1] [path/to/image2]```

# SYNOPSIS

**drawing** [_options_] [_files_]

# DESCRIPTION

**drawing** is a simple raster image editor designed for the GNOME desktop environment. It provides basic drawing and editing tools including pencil, eraser, line, arc, shapes, text, and selection tools with crop, scale, and rotate capabilities.

The application fills the gap between basic screenshot annotation and full-featured image editors like GIMP. It's ideal for quick image edits, adding arrows and text to screenshots, creating simple diagrams, or making basic modifications to existing images.

Drawing supports common image formats including PNG, JPEG, and BMP, making it suitable for everyday image editing tasks without the complexity of professional graphics software.

# PARAMETERS

**--new-window**
> Open files in a new window

_files_
> Image files to open

# CAVEATS

Drawing is a **raster** editor, so scaling an image up loses quality and there is nothing resembling vector objects: use Inkscape for anything that must stay sharp at any size. It has no layers, which is the single feature people miss most, and no colour management, adjustment curves, or plugin system. That is a deliberate scope choice rather than an oversight, and anything beyond a quick edit belongs in GIMP or Krita.

It is a GTK application built for GNOME. It runs on other desktops, but it is distributed mainly as a **Flatpak**, so the version in a distribution's own repositories is often well behind.

# HISTORY

Drawing was created by **Romain Vigier** (maoschanz) around **2018**, as a deliberately simple raster editor for GNOME. Its stated inspiration was the old Microsoft Paint: something that opens instantly, lets you scribble an arrow onto a screenshot, and gets out of the way. The niche was real, since GNOME had no equivalent, and GIMP is a heavy answer to a light question. It was later adapted to run on phones, and ships as the default image editor in some mobile Linux distributions.

# INSTALL

```apt: sudo apt install drawing```

```dnf: sudo dnf install drawing```

```pacman: sudo pacman -S drawing```

```apk: sudo apk add drawing```

```zypper: sudo zypper install drawing```

```nix: nix profile install nixpkgs#drawing```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gimp](/man/gimp)(1), [inkscape](/man/inkscape)(1), [krita](/man/krita)(1), [pinta](/man/pinta)(1)

# RESOURCES

```[Source code](https://github.com/maoschanz/drawing)```

```[Homepage](https://apps.gnome.org/Drawing/)```

<!-- verified: 2026-07-14 -->

