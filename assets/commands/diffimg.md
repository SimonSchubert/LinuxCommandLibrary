# TAGLINE

compute a pixel-by-pixel difference image between two input images

# TLDR

**Compute the difference** of two images and save it

```diffimg [image1.png] [image2.png] [diff.png]```

**Use it for visual regression tests**

```diffimg [expected.png] [actual.png] [report/diff.png]```

# SYNOPSIS

**diffimg** _image1_ _image2_ _output_

# DESCRIPTION

**diffimg** computes the per-pixel difference between two equally sized images and writes the result to a third file. Each output pixel encodes the delta between the corresponding pixels of the two inputs — identical areas appear black, changed areas light up. This makes it an easy drop-in for visual regression checks, before/after comparisons, and QA pipelines.

Implementations vary — some are Python/PIL wrappers, some are Qt-based GUIs with a CLI front end, and some are Go/Rust rewrites. All agree on the basic three-argument signature and on support for PNG, JPEG, and GIF input.

# PARAMETERS

_image1_
> First input image.

_image2_
> Second input image. Must be the same dimensions as _image1_.

_output_
> Path where the difference image will be written. The extension selects the output format.

# SUPPORTED FORMATS

PNG, JPEG, GIF, and (where ImageMagick is available under the hood) PostScript and TIFF.

# CAVEATS

Both images must have the same dimensions; resize or crop first if they don't. Output reflects raw pixel deltas, not perceptual differences — a 1-pixel shift lights up every edge. For perceptual or structural comparisons, use **compare** (ImageMagick) with `-metric SSIM` or a dedicated tool like `pixelmatch`, `odiff`, or `perceptualdiff`.

Different tools also named `diffimg` exist — check `diffimg --version` or the package description to know which you have.

# HISTORY

Multiple tools named **diffimg** have circulated since the early 2000s. The most widely packaged is a Python CLI/GUI by **Jonathan Zurflueh (thebulb)**. Other implementations include Qt-based desktop GUIs and Go/Rust rewrites.

# SEE ALSO

[compare](/man/compare)(1), [diff](/man/diff)(1), [convert](/man/convert)(1)
