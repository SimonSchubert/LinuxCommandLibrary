# TAGLINE

create, edit, and optimize GIF images and animations

# TLDR

**Optimize** a GIF for smaller file size

```gifsicle -O3 [input.gif] -o [output.gif]```

**Shrink** further with lossy compression

```gifsicle -O3 --lossy=[80] [input.gif] -o [output.gif]```

**Resize** a GIF

```gifsicle --resize [320x240] [input.gif] -o [output.gif]```

**Resize** to a width, keeping the aspect ratio

```gifsicle --resize-width [320] [input.gif] -o [output.gif]```

**Select** a range of frames

```gifsicle [input.gif] '#0-9' -o [frames.gif]```

**Combine** images into an animation that loops forever

```gifsicle --delay=[10] --loopcount=forever [frame*.gif] -o [output.gif]```

**Change** animation speed

```gifsicle --delay=[5] [input.gif] -o [faster.gif]```

**Reduce** the number of colors

```gifsicle --colors [64] [input.gif] -o [output.gif]```

**Show** information about a GIF

```gifsicle --info [input.gif]```

**Optimize** files in place

```gifsicle -bO3 [*.gif]```

# SYNOPSIS

**gifsicle** [_options_, _frames_, and _filenames_] ...

# PARAMETERS

**-o**, **--output** _file_
> Write output to _file_. Use **-** for standard output.

**-O**, **--optimize**[=_level_]
> Optimize output. **1** stores only the changed portion of each frame (the default when **-O** is given without a level), **2** also uses transparency, **3** tries several methods and picks the best, which is slower.

**--lossy**[=_lossiness_]
> Alter colors to shrink the file at the cost of artifacts. Higher values mean smaller files and more noise. Default **20**.

**-U**, **--unoptimize**
> Expand each frame to a full-size image. Useful before editing individual frames.

**--resize** _WxH_
> Resize to exact dimensions. Use **_** for a dimension to preserve the aspect ratio.

**--resize-width** _W_, **--resize-height** _H_
> Resize to a width or height, preserving the aspect ratio.

**--resize-fit** _WxH_
> Shrink to fit inside a rectangle, preserving the aspect ratio. Does nothing if the GIF already fits.

**--resize-fit-width** _W_, **--resize-fit-height** _H_
> Shrink to fit a width or height, preserving the aspect ratio.

**--resize-method** _method_
> Resampling method: **sample** (fast, noisy when shrinking), **mix** (default, better quality), **box**, **catrom**, **mitchell**, **lanczos2**, **lanczos3**.

**--scale** _Xfactor_[x_Yfactor_]
> Scale by a factor, e.g. **0.5** for half size. _Yfactor_ defaults to _Xfactor_.

**--crop** _x1,y1+WxH_, **--crop** _x1,y1-x2,y2_
> Crop to a region. Zero dimensions extend to the image edge; negative values retract from it.

**--crop-transparency**
> Crop away transparent borders.

**-d**, **--delay** _time_
> Frame delay in hundredths of a second.

**-l**, **--loopcount**[=_count_]
> Set the Netscape loop extension to _count_, or **forever**. **--loopcount** alone means forever. The default is **--no-loopcount**, which adds no loop extension.

**-k**, **--colors** _num_
> Reduce to _num_ colors, between **2** and **256**.

**--color-method** _method_
> Color reduction method: **diversity** (default, xv's algorithm), **blend-diversity**, **median-cut** (Heckbert's algorithm).

**-f**, **--dither**[=_method_]
> Dither when the colormap changes. Methods include **floyd-steinberg** (default), **atkinson**, **ordered**, **halftone**, **ro64**, **o3**, **o4**, **o8**.

**--rotate-90**, **--rotate-180**, **--rotate-270**
> Rotate the image.

**--flip-horizontal**, **--flip-vertical**
> Flip the image.

**-e**, **--explode**
> Write each frame to a separate file named _file_**.**_number_.

**-m**, **--merge**
> Merge mode: combine inputs into one output. This is the default.

**-b**, **--batch**
> Batch mode: modify each input file in place.

**-I**, **--info**
> Print information about the input GIFs instead of writing an output file.

**--careful**
> Write slightly larger GIFs that avoid bugs in some other GIF readers, notably older Java and Internet Explorer versions.

**--conserve-memory**
> Use less memory at the cost of speed, for very large GIFs.

**-w**, **--no-warnings**
> Suppress warning messages.

# DESCRIPTION

**gifsicle** manipulates GIF images and animations from the command line: it merges files into animations, explodes animations into frames, edits individual frames in place, and reduces file sizes, all without a GUI.

Its arguments are order-dependent, which is what distinguishes it from most tools. Options, frame selections and filenames are read left to right, and an option applies to the input files that follow it. Frame selections use **#** notation attached to a file: **'#0'** is the first frame, **'#0-5'** a range, **'#-1'** the last. Quote them, since **#** starts a comment in most shells.

Optimization is the feature most people come for. **-O3** tries several encodings per frame and keeps the smallest, typically cutting an unoptimized animation substantially by storing only inter-frame differences, losslessly. When that is not enough, **--lossy** trades exactness for size by allowing nearby colors to be merged, and **--colors** shrinks the palette outright.

By default **gifsicle** runs in merge mode, combining all inputs into a single output written with **-o**. **--batch** switches to editing each input file in place, and **--explode** writes one file per frame.

# CAVEATS

Input must already be a GIF. **gifsicle** does not read PNG, JPEG or video, so pair it with **ffmpeg** or ImageMagick's **convert** to produce the GIF first, then optimize it here.

Because arguments are positional, **gifsicle --colors 64 a.gif b.gif** and **gifsicle a.gif --colors 64 b.gif** are not the same command. Options placed after a file do not apply to it retroactively.

The default is **--no-loopcount**, so an animation you assemble will play once unless you pass **--loopcount=forever**. Note also that _count_ is the number of repetitions *after* the first play-through, so **--loopcount=3** shows the animation four times.

**-b** rewrites your originals with no backup. Confirm the result on a copy before running it across a directory.

**--lossy** and **--colors** are not reversible, and repeatedly re-optimizing an already-lossy GIF compounds the artifacts.

Large animations can use a lot of memory, particularly with **-U**, which expands every frame to full size; **--conserve-memory** trades speed for footprint.

# HISTORY

**gifsicle** was written by **Eddie Kohler** and first released in **1997**, growing out of his earlier work on GIF tools while he was a graduate student. It became a standard tool for GIF manipulation and web optimization, and is the engine behind many "shrink this GIF" services. Development continues on GitHub, with **--lossy** added in **2015** based on work from the **giflossy** fork.

# SEE ALSO

[convert](/man/convert)(1), [ffmpeg](/man/ffmpeg)(1), [optipng](/man/optipng)(1), [pngquant](/man/pngquant)(1), [imagemagick](/man/imagemagick)(1)

# RESOURCES

```[Source code](https://github.com/kohler/gifsicle)```

```[Homepage](https://www.lcdf.org/gifsicle/)```

```[Documentation](https://www.lcdf.org/gifsicle/man.html)```

<!-- verified: 2026-07-16 -->
