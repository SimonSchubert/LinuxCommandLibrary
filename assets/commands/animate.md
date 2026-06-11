# TAGLINE

Display image sequences as animations

# TLDR

**Animate** a sequence of images

```animate [image1.png] [image2.png] [image3.png]```

Animate a **GIF** file

```animate [animation.gif]```

Set **delay** between frames (in centiseconds)

```animate -delay [50] [*.png]```

**Loop** animation

```animate -loop [0] [animation.gif]```

Set **display size**

```animate -geometry [800x600] [animation.gif]```

# SYNOPSIS

**animate** [_options_] _files_

# DESCRIPTION

**animate** is an ImageMagick utility that displays a sequence of images as an animation in an X Window. It supports numerous image formats and can play animated GIFs, multi-page files, or sequences of separate images.

The viewer provides interactive controls for playback, including pause, single-step, speed adjustment, and looping options.

# PARAMETERS

**-delay** _ticks_
> Inter-frame delay (centiseconds)

**-loop** _count_
> Number of loops (0 = infinite)

**-geometry** _WxH_
> Window size

**-colorspace** _type_
> Image colorspace

**-coalesce**
> Merge a GIF animation sequence into full frames

**-dispose** _method_
> Frame disposal method

**-display** _server_
> X server to display the animation on

**-backdrop**
> Display the image centered on a backdrop

**-window** _id_
> Display in an existing window

**-remote** _command_
> Send a command to an already running animate program

**-pause** _seconds_
> Extra pause at the end of each animation loop

# CAVEATS

Requires X Window System. Large animations consume significant memory. Frame timing may not be precise on all systems. Superseded by display command with -coalesce for some use cases.

# HISTORY

**animate** has been part of ImageMagick since the early **1990s**, providing animation preview capabilities for image processing workflows.

# SEE ALSO

[display](/man/display)(1), [magick](/man/magick)(1), [convert](/man/convert)(1), [identify](/man/identify)(1)

# RESOURCES

```[Source code](https://github.com/ImageMagick/ImageMagick)```

```[Homepage](https://imagemagick.org)```

```[Documentation](https://imagemagick.org/script/animate.php)```

<!-- verified: 2026-06-11 -->
