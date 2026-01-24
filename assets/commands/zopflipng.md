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

**zopflipng** optimizes PNG files. It uses Zopfli compression.

Zopfli is deflate-compatible. Works everywhere PNG works.

Smaller files than standard tools. 3-8% typical reduction.

Lossy mode optimizes transparency. Invisible changes, smaller files.

Slow but effective. Designed for final optimization.

Metadata stripped by default. Keep chunks if needed.

# CAVEATS

Very slow for large images. CPU intensive. Best for final builds.

# HISTORY

**Zopfli** was created by **Google** for maximum deflate compression. zopflipng applies it to PNG images.

# SEE ALSO

[optipng](/man/optipng)(1), [pngcrush](/man/pngcrush)(1), [pngquant](/man/pngquant)(1)
