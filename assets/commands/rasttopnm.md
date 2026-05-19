# TAGLINE

Convert Sun raster images to PNM format

# TLDR

**Convert** a Sun raster file to PNM on stdout

```rasttopnm [input.ras] > [output.pnm]```

**Read from stdin** and write PNM on stdout

```cat [input.ras] | rasttopnm > [output.pnm]```

**Output the index plane** of a colormapped raster (debugging)

```rasttopnm -index [input.ras] > [output.pgm]```

**Convert and pipe** to PNG

```rasttopnm [input.ras] | pnmtopng > [output.png]```

# SYNOPSIS

**rasttopnm** [**-index**] [_rastfile_]

# PARAMETERS

_rastfile_
> Sun Rasterfile (.ras) input. Reads from stdin if omitted.

**-index**
> For colormapped rasters, output the raw color-index plane as PGM instead of dereferencing it through the colormap to produce PPM. Mainly useful for inspecting the underlying data.

# DESCRIPTION

**rasttopnm** converts Sun Rasterfile images (.ras) to Portable Anymap (PNM) format, automatically selecting PBM, PGM, or PPM output based on the input image's color depth and colormap. Sun Rasterfile was the native image format on SunOS and Solaris systems and is commonly produced by older X11 tools.

Output goes to standard output. Part of the **Netpbm** toolkit.

# CAVEATS

Some less-common Rasterfile encodings (e.g. RT_BYTE_ENCODED RLE with unusual colormaps) may not be supported on every Netpbm build. The converter chooses the narrowest PNM subtype that can losslessly represent the input.

# SEE ALSO

[pnmtorast](/man/pnmtorast)(1), [xwdtopnm](/man/xwdtopnm)(1), [pnm](/man/pnm)(5)
