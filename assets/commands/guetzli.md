# TAGLINE

JPEG encoder that optimizes for visual quality at small file sizes

# TLDR

**Compress JPEG**

```guetzli [input.jpg] [output.jpg]```

**Set quality level**

```guetzli --quality [90] [input.jpg] [output.jpg]```

**Compress PNG to JPEG**

```guetzli [input.png] [output.jpg]```

**Maximum compression**

```guetzli --quality [84] [input.jpg] [output.jpg]```

# SYNOPSIS

**guetzli** [_options_] _input_ _output_

# PARAMETERS

_INPUT_
> Input image (JPEG or PNG).

_OUTPUT_
> Output JPEG file.

**--quality** _N_
> Quality (84-100, default 95).

**--memlimit** _N_
> Memory limit in MB.

**--verbose**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**Guetzli** is a JPEG encoder that optimizes for visual quality at small file sizes. It uses a perceptual model to achieve 20-30% smaller files than libjpeg.

The tool is computationally intensive, trading encoding time for better compression. It maintains visual quality while reducing file size significantly.

# CAVEATS

Very slow encoding. High memory usage. Quality below 84 not recommended.

# HISTORY

Guetzli was developed by **Google** and released in **2017** as a perceptually-guided JPEG encoder.

# SEE ALSO

[cjpeg](/man/cjpeg)(1), [jpegoptim](/man/jpegoptim)(1), [mozjpeg](/man/mozjpeg)(1)
