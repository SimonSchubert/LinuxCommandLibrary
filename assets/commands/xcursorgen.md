# TLDR

Create cursor from **config**

```xcursorgen [path/to/config.cursor] [path/to/output_file]```

Create with image **prefix**

```xcursorgen --prefix [path/to/image_directory]/ [path/to/config.cursor] [path/to/output_file]```

Write to **stdout**

```xcursorgen [path/to/config.cursor]```

# SYNOPSIS

**xcursorgen** [_OPTIONS_] _CONFIG_ [_OUTPUT_]

# PARAMETERS

**--prefix** _PATH_
> Path to image directory

# DESCRIPTION

**xcursorgen** creates X cursor files from a collection of PNG images. The configuration file specifies image sizes, hotspots, and frame delays for animated cursors.

The config file format defines each cursor frame with size, hotspot coordinates, filename, and optional delay.

# CAVEATS

Images must be PNG format. Configuration file format is specific. Without --prefix, images must be in current directory.

# SEE ALSO

[Xcursor](/man/Xcursor)(3)
