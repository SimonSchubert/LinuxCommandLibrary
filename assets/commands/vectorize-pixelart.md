# TAGLINE

Convert pixel art to SVG vectors

# TLDR

**Convert pixel art**

```vectorize-pixelart [input.png] [output.svg]```

**Convert to EPS**

```vectorize-pixelart [input.png] [output.eps]```

# SYNOPSIS

**vectorize-pixelart** _input.png_ _output.svg|output.eps_

# DESCRIPTION

**vectorize-pixelart** converts PNG pixel art images into scalable vector graphics (SVG or EPS). It takes only the two file arguments and has no options; the output format follows the output file extension. Unlike general-purpose image tracers, it is specifically designed for pixel art, preserving the sharp edges and clean geometric shapes that define the style.

The resulting SVG files can be scaled to any resolution without blurring or aliasing artifacts. This makes the tool useful for preparing pixel art assets for high-resolution displays, print media, or web use where crisp rendering at multiple sizes is needed.

# CAVEATS

Pixel art only. Not for photos. Node.js tool, installed from npm. PNG input only.

# HISTORY

**vectorize-pixelart** was written by **Sergii Zasenko** and is released under the GPL 3.0 or later.

# SEE ALSO

[potrace](/man/potrace)(1), [inkscape](/man/inkscape)(1), [convert](/man/convert)(1)

# RESOURCES

```[Source code](https://github.com/und3f/vectorize-pixelart)```

<!-- verified: 2026-11-09 -->
