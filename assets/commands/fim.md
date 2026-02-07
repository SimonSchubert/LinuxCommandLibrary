# TAGLINE

framebuffer and terminal image viewer

# TLDR

**View images** in framebuffer or terminal

```fim [image.jpg]```

**View all images** in a directory

```fim [path/to/directory/]```

**View images recursively** and sorted

```fim -R [path/to/directory/] --sort```

**Force ASCII art output** (for terminal without graphics)

```fim -t [image.jpg]```

**Enable autozoom** to fit images to screen

```fim -a [image.jpg]```

**Run slideshow** with 5-second intervals

```fim --slideshow [5] [path/to/directory/]```

**Specify output device** explicitly

```fim --output-device [sdl|fb|aa|ca] [image.jpg]```

# SYNOPSIS

**fim** [_OPTIONS_] [**--**] _IMAGEPATH_ [_IMAGEPATHS_...]

# PARAMETERS

**-a**, **--autozoom**
> Automatically pick a reasonable zoom factor for each image.

**-t**, **--no-framebuffer**
> Use ASCII art driver (libcaca for color, aalib for monochrome).

**-R**
> Recursively load images from directories.

**--sort**
> Sort the file list alphabetically.

**--slideshow** _SECONDS_
> Run slideshow mode, pausing specified seconds between images.

**--output-device** _DEVICE_
> Force output device: fb (framebuffer), sdl, gtk, aa (aalib), ca (libcaca), dumb.

**-c** _COMMAND_
> Execute command after startup.

**-F** _FILE_
> Execute commands from script file.

**--no-auto-scale**
> Disable automatic scaling.

**-h**, **--help**
> Display help message.

# KEYBINDINGS

**h, j, k, l** or Cursor keys
> Scroll large images left, down, up, right.

**+**, **-**
> Zoom in / zoom out.

**n**, **PgDn**
> Next image.

**p**, **PgUp**
> Previous image.

**Tab**
> Toggle output console visualization.

**q**, **ESC**
> Quit.

# CONFIGURATION

**~/.fimrc**
> User configuration file for FIM settings, keybindings, and startup commands.

# DESCRIPTION

**FIM** (Fbi IMproved) is a versatile image viewer that works across different graphical environments. It automatically selects the most suitable display method: SDL under X, framebuffer on console, or ASCII art (via aalib/libcaca) when no graphical output is available.

FIM supports common image formats natively (BMP, PCX) and through libraries (JPEG, PNG, GIF, TIFF, PPM, WEBP, AVIF). Additional formats are supported via external converters. The companion script **fimgs** can display PDF, PostScript, DVI, and compressed archives containing images.

The viewer is keyboard-oriented with no graphical menus. It features an internal command language for scripting and customization, and can interact with standard input/output for pipeline integration.

# CAVEATS

Framebuffer access typically requires appropriate permissions (video group membership or root). ASCII art output quality depends on terminal capabilities and the aalib/libcaca libraries. Some image formats require additional libraries to be installed.

# HISTORY

FIM was developed by Michele Martone as an improved version of **fbi** (Linux framebuffer imageviewer), originally created by Gerd Hoffmann. FIM extends fbi with multiple output backends, an internal scripting language, and enhanced features while maintaining keyboard-driven operation suitable for console use.

# SEE ALSO

[fbi](/man/fbi)(1), [feh](/man/feh)(1), [display](/man/display)(1), [fimgs](/man/fimgs)(1)
