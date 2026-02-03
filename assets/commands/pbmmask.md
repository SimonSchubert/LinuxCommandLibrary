# TLDR

**Create mask from bitmap edges**

```pbmmask [input.pbm] > [output.pbm]```

**Expand mask by pixels**

```pbmmask -expand [2] [input.pbm] > [output.pbm]```

# SYNOPSIS

**pbmmask** [_options_] [_file_]

# PARAMETERS

**-expand** _n_
> Expand mask by n pixels.

# DESCRIPTION

**pbmmask** creates a mask bitmap from the outline of shapes in a PBM image. Useful for creating selection masks or outlines. Part of Netpbm toolkit.

# SEE ALSO

[ppmcolormask](/man/ppmcolormask)(1), [pbmtext](/man/pbmtext)(1)

