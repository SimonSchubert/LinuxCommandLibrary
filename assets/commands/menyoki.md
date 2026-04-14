# TAGLINE

Screenshot, screencast, and image operations on the command line

# TLDR

**Capture a screenshot** of the focused window and save as PNG

```menyoki capture png save```

**Record a screencast** of a window as a GIF

```menyoki record gif save```

**Split a GIF** into individual frames

```menyoki split [animation.gif]```

**Edit an image** by converting to grayscale

```menyoki edit --grayscale [path/to/image] png save```

**Analyze an image** and print its details

```menyoki analyze [path/to/image]```

**View an image** in the terminal

```menyoki view [path/to/image]```

# SYNOPSIS

**menyoki** [_flags_] [_options_] _subcommand_

# PARAMETERS

**-v**, **--verbose**
> Increase logging verbosity.

**-q**, **--quiet**
> Do not show output.

**-c**, **--config** _FILE_
> Set the configuration file.

**--color** _HEX_
> Set the main color (default: 3AA431).

**capture**
> Capture a screenshot. Accepts format subcommand (png, jpg, webp, bmp, ico, tiff, tga, pnm, ff, exr).

**record**
> Record an animation. Accepts format subcommand (gif, apng).

**split**
> Split an animation into frames.

**make**
> Make an animation from frames.

**edit**
> Edit an image. Supports --grayscale, --invert, --convert, --crop, --resize, --rotate, --flip, --blur, --hue, --contrast, --brightness.

**analyze**
> Analyze an image and print its properties.

**view**
> View an image in the terminal.

# DESCRIPTION

**menyoki** is a screenshot and screencast utility that can also perform various image operations such as making/splitting GIFs and modifying/analyzing/viewing image files. Originally designed for recording terminal windows, it can be adapted for other purposes.

Subcommands include **capture** for screenshots, **record** for screencasts, **split** and **make** for GIF operations, **edit** for image manipulation, **analyze** for image analysis, and **view** for terminal image display. Output formats include PNG, JPG, WebP, BMP, ICO, TIFF, PNM, and GIF/APNG.

Actions are composed as a chain of subcommands: the action subcommand is mandatory, while format and **save** subcommands are optional. During capture or record, key bindings allow selecting the target area or window.

# CAVEATS

Screen capture requires X11 on Linux. Key bindings are only active during capture or record operations.

# HISTORY

**menyoki** was created by **Orhun Parmaksız** and is written in **Rust**.

# SEE ALSO

[scrot](/man/scrot)(1), [import](/man/import)(1), [ffmpeg](/man/ffmpeg)(1)
