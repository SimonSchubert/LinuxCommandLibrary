# TLDR

**Animate** images (ImageMagick 6)

```animate.im6 [image1.png] [image2.png]```

Play **animated GIF**

```animate.im6 [animation.gif]```

Set **frame delay**

```animate.im6 -delay [10] [*.png]```

Set **infinite loop**

```animate.im6 -loop [0] [animation.gif]```

# SYNOPSIS

**animate.im6** [_options_] _files_

# DESCRIPTION

**animate.im6** is the ImageMagick 6 version of the animate command, used on systems where both ImageMagick 6 and 7 are installed. It displays sequences of images as animations in an X Window.

The .im6 suffix distinguishes it from the ImageMagick 7 version, allowing both versions to coexist on the same system.

# PARAMETERS

**-delay** _ticks_
> Delay between frames (centiseconds)

**-loop** _count_
> Loop count (0 = infinite)

**-geometry** _WxH_
> Display geometry

**-coalesce**
> Merge GIF animation layers

**-remote**
> Enable remote control

# CAVEATS

This is the ImageMagick 6 version; syntax may differ slightly from ImageMagick 7. Requires X Window System. Some options may be deprecated in newer versions.

# HISTORY

The .im6 naming convention was introduced when ImageMagick 7 was released in **2016**, allowing parallel installation of both major versions.

# SEE ALSO

[animate](/man/animate)(1), [display.im6](/man/display.im6)(1), [convert.im6](/man/convert.im6)(1)
