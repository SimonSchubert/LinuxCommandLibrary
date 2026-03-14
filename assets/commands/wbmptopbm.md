# TAGLINE

Convert Wireless Bitmap to PBM format

# TLDR

**Convert WBMP to PBM**

```wbmptopbm [input.wbmp] > [output.pbm]```

# SYNOPSIS

**wbmptopbm** [_file_]

# PARAMETERS

_file_
> Input WBMP file (reads from stdin if omitted)

# DESCRIPTION

**wbmptopbm** converts WBMP (Wireless Bitmap) format images to PBM (Portable Bitmap) format. WBMP is a monochrome bitmap format that was used in WAP (Wireless Application Protocol) mobile web pages. Part of the Netpbm toolkit.

The output is written to stdout.

# CAVEATS

WBMP only supports monochrome (1-bit) images, so the output PBM is always black and white.

# SEE ALSO

[pbmtowbmp](/man/pbmtowbmp)(1), [netpbm](/man/netpbm)(1)

