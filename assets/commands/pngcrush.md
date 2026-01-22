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

**pngcrush** optimizes PNG files. Reduces file size.

The tool recompresses PNG data. Lossless optimization.

pngcrush compresses PNGs.

# CAVEATS

Lossless optimization. Processing time varies.

# HISTORY

pngcrush was created for **PNG file size optimization**.

# SEE ALSO

[optipng](/man/optipng)(1), [pngcheck](/man/pngcheck)(1), [pngquant](/man/pngquant)(1)

