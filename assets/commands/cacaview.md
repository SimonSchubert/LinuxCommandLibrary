# TAGLINE

Display images as ASCII art in the terminal

# TLDR

Display an **image** as ASCII art

```cacaview [path/to/image]```

# SYNOPSIS

**cacaview** [_options_] _image_

# DESCRIPTION

**cacaview** displays images in the terminal as ASCII art using the libcaca library. It converts image files into colored text characters for viewing in text-mode environments.

The viewer supports navigation and zooming within the displayed image.

# KEY BINDINGS

**n** / **p** or **PageDown** / **PageUp**
> Next / previous image.

**+** / **-**
> Zoom in / out.

**x**
> Reset the view.

**f**
> Toggle fullscreen.

**d**
> Cycle dithering mode.

**a**
> Cycle antialiasing mode.

**q** or **Esc**
> Quit.

# INSTALL

```apt: sudo apt install caca-utils```

```dnf: sudo dnf install caca-utils```

```apk: sudo apk add libcaca-apps```

```zypper: sudo zypper install caca-utils```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cacaclock](/man/cacaclock)(1), [cacademo](/man/cacademo)(1), [cacafire](/man/cacafire)(1), [img2txt](/man/img2txt)(1)
