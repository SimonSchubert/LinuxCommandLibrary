# TAGLINE

Optimize PNG files for smaller size

# TLDR

**Optimize PNG**

```pngcrush [input.png] [output.png]```

**Optimize in place**

```pngcrush -ow [image.png]```

**Remove metadata**

```pngcrush -rem alla [input.png] [output.png]```

**Best compression**

```pngcrush -brute [input.png] [output.png]```

**Reduce colors**

```pngcrush -reduce [input.png] [output.png]```

# SYNOPSIS

**pngcrush** [_options_] _input_ [_output_]

# PARAMETERS

_INPUT_
> Input PNG file.

_OUTPUT_
> Output PNG file.

**-ow**
> Overwrite input.

**-rem** _CHUNK_
> Remove chunk.

**-brute**
> Brute force optimization.

**-reduce**
> Reduce color depth.

# DESCRIPTION

**pngcrush** optimizes PNG files by testing multiple compression strategies and selecting the smallest result. The optimization is completely lossless - the image data is preserved exactly while reducing file size through better compression parameters.

The **-brute** option tries all filter and compression combinations for maximum reduction at the cost of processing time. The **-rem** option strips metadata chunks like text comments, timestamps, and color profiles to further reduce size.

# CAVEATS

Lossless optimization. Processing time varies.

# HISTORY

pngcrush was created for **PNG file size optimization**.

# SEE ALSO

[optipng](/man/optipng)(1), [pngcheck](/man/pngcheck)(1), [pngquant](/man/pngquant)(1)

