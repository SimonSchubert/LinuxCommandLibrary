# TAGLINE

Optimize PNG files with Zopfli compression

# TLDR

**Optimize PNG**

```zopflipng [input.png] [output.png]```

**In-place optimization**

```zopflipng -y [file.png] [file.png]```

**Lossy optimization**

```zopflipng --lossy_transparent [input.png] [output.png]```

**Maximum compression**

```zopflipng -m [input.png] [output.png]```

**Keep metadata**

```zopflipng --keepchunks=iCCP,sRGB [input.png] [output.png]```

**Quick mode**

```zopflipng -q [input.png] [output.png]```

**Show statistics**

```zopflipng --prefix=[optimized_] [input.png]```

# SYNOPSIS

**zopflipng** [_-m_] [_-q_] [_--lossy_transparent_] [_options_] _input_ _output_

# PARAMETERS

**-m**, **--more**
> More iterations.

**-q**
> Quick, less thorough.

**-y**
> Overwrite output.

**--lossy_transparent**
> Lossy alpha optimization.

**--keepchunks** _CHUNKS_
> Preserve chunks.

**--splitting** _N_
> Block splitting.

**--prefix** _PREFIX_
> Output prefix.

# DESCRIPTION

**zopflipng** optimizes PNG files using the Zopfli compression algorithm, which produces deflate-compatible output that works everywhere standard PNG files do. It typically achieves 3-8% smaller files compared to standard PNG optimization tools.

The tool strips metadata chunks by default for maximum size reduction, though specific chunks can be preserved with the **--keepchunks** option. A lossy transparency mode (**--lossy_transparent**) further reduces file size by optimizing invisible fully-transparent pixels without any visible quality change.

zopflipng is intentionally slow, trading compression time for smaller output. It is designed for final-stage optimization in build pipelines rather than interactive use. The **-m** flag enables additional iterations for even better compression at the cost of more processing time.

# CAVEATS

Very slow for large images. CPU intensive. Best for final builds.

# HISTORY

**Zopfli** was created by **Google** for maximum deflate compression. zopflipng applies it to PNG images.

# SEE ALSO

[optipng](/man/optipng)(1), [pngcrush](/man/pngcrush)(1), [pngquant](/man/pngquant)(1)
