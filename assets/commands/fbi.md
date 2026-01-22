# TLDR

**Display** an image

```sudo fbi [path/to/file]```

Display **multiple** images

```sudo fbi [path/to/file1] [path/to/file2]```

Start **slideshow** with custom delay

```sudo fbi [-t|--timeout] [delay] [path/to/files/*]```

**Scale** image to fit screen

```sudo fbi [-a|--autozoom] [path/to/file]```

Display **help**

```fbi [-h|--help]```

# SYNOPSIS

**fbi** [_options_] _files_

# DESCRIPTION

**fbi** (framebuffer imageviewer) displays images directly on the Linux framebuffer console without requiring X11 or Wayland. It supports various image formats including JPEG, PNG, GIF, and TIFF.

Useful for viewing images on headless servers or minimal systems.

# PARAMETERS

**-t, --timeout** _seconds_
> Slideshow delay between images

**-a, --autozoom**
> Scale to fit screen

**-h, --help**
> Display help

**-1, --once**
> Don't loop slideshow

**-u, --random**
> Randomize slideshow order

# CAVEATS

Requires framebuffer support. Usually needs root or console access. Part of fbida package. Not for use in X11/Wayland sessions.

# SEE ALSO

[fim](/man/fim)(1), [feh](/man/feh)(1), [fbset](/man/fbset)(8)
