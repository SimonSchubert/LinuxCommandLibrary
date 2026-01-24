# TLDR

**Optimize PNG file**

```oxipng [image.png]```

**Optimize with maximum compression**

```oxipng -o max [image.png]```

**Optimize preserving original**

```oxipng [input.png] -o [output.png]```

**Optimize all PNGs in directory**

```oxipng [*.png]```

**Strip all metadata**

```oxipng --strip all [image.png]```

**Use multiple threads**

```oxipng -t [4] [image.png]```

**Reduce to 8-bit palette if possible**

```oxipng --reduce [image.png]```

**Dry run** (show savings without writing)

```oxipng --pretend [image.png]```

# SYNOPSIS

**oxipng** [_-o level_] [_--strip mode_] [_-t threads_] [_--reduce_] [_options_] _files_

# PARAMETERS

**-o**, **--opt** _LEVEL_
> Optimization level (0-6, max).

**-s**, **--strip** _MODE_
> Strip metadata: none, safe, all.

**-a**, **--alpha**
> Additional alpha optimizations.

**-t**, **--threads** _NUM_
> Number of threads.

**--out** _DIR_
> Output directory.

**--dir** _DIR_
> Recursively process directory.

**-r**, **--recursive**
> Process directories recursively.

**--reduce**
> Attempt bit depth reduction.

**--interlace** _MODE_
> Interlacing: 0 (none), 1 (Adam7), keep.

**--pretend**
> Dry run, show savings without writing.

**-b**, **--backup**
> Keep backup of original file.

**-f** _NUM_, **--filters** _NUM_
> Filter strategies to try (0-5).

**-z**, **--zopfli**
> Use Zopfli for better compression (slower).

**--check**
> Verify output integrity.

**-q**, **--quiet**
> Quiet mode.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**oxipng** is a multithreaded PNG optimization tool written in Rust. It reduces PNG file sizes through lossless recompression without affecting image quality.

Optimization levels (0-6) control the trade-off between compression and speed. Level 2 is default, providing good compression quickly. Level 6 and "max" try more strategies for maximum compression but take longer.

The tool tries different PNG filter strategies and compression parameters to find the smallest output. Metadata stripping further reduces size - "safe" removes non-essential chunks, "all" removes everything except critical image data.

Bit depth reduction automatically converts 16-bit to 8-bit or RGBA to palette when possible without quality loss. This can significantly reduce file sizes for suitable images.

Zopfli mode uses a more exhaustive compression algorithm for ~5% better compression at the cost of much longer processing time. This is useful for images that will be served repeatedly.

# CAVEATS

Cannot reduce file size if PNG is already optimally compressed. Zopfli mode is very slow. Maximum optimization level uses significant CPU time. Some PNG features may not be fully supported. Large images need substantial memory.

# HISTORY

**oxipng** was created by **Josh Holmer** around **2016** as a Rust rewrite of OptiPNG. The goal was to provide a faster, multithreaded PNG optimizer with modern code. It has become popular for build pipelines and asset optimization, particularly in web development where PNG size directly affects page load times.

# SEE ALSO

[optipng](/man/optipng)(1), [pngcrush](/man/pngcrush)(1), [pngquant](/man/pngquant)(1), [zopflipng](/man/zopflipng)(1)
