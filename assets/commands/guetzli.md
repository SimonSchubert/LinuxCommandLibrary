# TAGLINE

Perceptual JPEG encoder that optimizes for visual quality at small file sizes

# TLDR

**Re-encode a JPEG**

```guetzli [input.jpg] [output.jpg]```

**Encode a PNG to JPEG**

```guetzli [input.png] [output.jpg]```

**Set quality level (84-100)**

```guetzli --quality [90] [input.jpg] [output.jpg]```

**Maximum compression (lowest supported quality)**

```guetzli --quality [84] [input.jpg] [output.jpg]```

**Show progress trace**

```guetzli --verbose [input.png] [output.jpg]```

# SYNOPSIS

**guetzli** [**--quality** _Q_] [**--verbose**] _input_ _output.jpg_

# PARAMETERS

_input_
> Source image. PNG and JPEG inputs are supported.

_output.jpg_
> Destination JPEG file.

**--quality** _Q_
> Visual quality, expressed in libjpeg-equivalent units. Range 84-100, default 95. Values below 84 are not supported.

**--verbose**
> Print a trace of encoding attempts.

# DESCRIPTION

**Guetzli** is a JPEG encoder that targets the human visual system. It uses Butteraugli, a psychovisual model, to search the JPEG quantization space and produce baseline-compatible JPEG files that are typically 20-30% smaller than equivalent libjpeg output at the same perceived quality.

Output files are compatible with all standard JPEG decoders. The trade-off is encoding cost: guetzli is computationally and memory intensive.

# CAVEATS

Very slow: encoding a single megapixel can take a minute or more. Memory usage is roughly 300 MB per megapixel. Only quality values 84-100 are accepted. Best results come from non-degraded sources (PNG or high-quality JPEG); re-encoding heavily compressed JPEGs offers limited gains.

# HISTORY

**Guetzli** was developed by **Google Research** and released as open source in **March 2017** alongside the Butteraugli perceptual distance metric.

# INSTALL

```apt: sudo apt install guetzli```

```pacman: sudo pacman -S guetzli```

```apk: sudo apk add guetzli```

```brew: brew install guetzli```

```nix: nix profile install nixpkgs#guetzli```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[cjpeg](/man/cjpeg)(1), [jpegoptim](/man/jpegoptim)(1)
