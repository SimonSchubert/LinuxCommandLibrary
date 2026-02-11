# TAGLINE

Convert pixel art to SVG vectors

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

**vectorize-pixelart** converts pixel art images into scalable vector graphics (SVG). Unlike general-purpose image tracers, it is specifically designed for pixel art, preserving the sharp edges and clean geometric shapes that define the style.

The resulting SVG files can be scaled to any resolution without blurring or aliasing artifacts. This makes the tool useful for preparing pixel art assets for high-resolution displays, print media, or web use where crisp rendering at multiple sizes is needed.

# CAVEATS

Pixel art only. Not for photos. Rust implementation.

# HISTORY

**vectorize-pixelart** was created for converting pixel art images to scalable vector graphics.

# SEE ALSO

[potrace](/man/potrace)(1), [inkscape](/man/inkscape)(1), [convert](/man/convert)(1)
