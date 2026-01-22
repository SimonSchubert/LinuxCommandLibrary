# TLDR

**Convert** any image to PNM format

```anytopnm [input.jpg] > [output.pnm]```

Convert with **verbose** output

```anytopnm -v [input.png] > [output.pnm]```

# SYNOPSIS

**anytopnm** [_-v_] _file_

# DESCRIPTION

**anytopnm** is a Netpbm utility that converts images from virtually any format to PNM (Portable Any Map) format. It acts as a wrapper, detecting the input format and calling the appropriate converter automatically.

PNM is an intermediate format in the Netpbm toolkit, useful for image processing pipelines where a common format simplifies conversions between any two formats.

# PARAMETERS

**-v**
> Verbose output showing conversion steps

**file**
> Input image file (or stdin if omitted)

# CAVEATS

Depends on having the correct format-specific converter installed. Some formats may require additional libraries. Output is always PNM; use other tools to convert to different target formats.

# HISTORY

**anytopnm** is part of the Netpbm package, which evolved from the original PBMPLUS toolkit created by Jef Poskanzer in the late **1980s**.

# SEE ALSO

[pnmtopng](/man/pnmtopng)(1), [pnmtojpeg](/man/pnmtojpeg)(1), [convert](/man/convert)(1)
