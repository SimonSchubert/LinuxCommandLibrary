# TLDR

**Convert pixel art**

```vectorize-pixelart [input.png] [output.svg]```

**With scale**

```vectorize-pixelart -s [4] [input.png] [output.svg]```

**Simplify curves**

```vectorize-pixelart --simplify [input.png] [output.svg]```

# SYNOPSIS

**vectorize-pixelart** [_-s scale_] [_options_] _input_ _output_

# PARAMETERS

**-s** _SCALE_
> Output scale.

**--simplify**
> Simplify paths.

**--help**
> Show help.

# DESCRIPTION

**vectorize-pixelart** converts pixel art. It creates SVG vectors.

Pixel-perfect vectors. Sharp edges.

Scale independent. Infinite zoom.

SVG output. Standard format.

Designed for pixel art. Not photos.

# CAVEATS

Pixel art only. Not for photos. Rust implementation.

# HISTORY

**vectorize-pixelart** was created for converting pixel art images to scalable vector graphics.

# SEE ALSO

[potrace](/man/potrace)(1), [inkscape](/man/inkscape)(1), [convert](/man/convert)(1)
