# TAGLINE

Convert Sun raster images to PNM format

# TLDR

**Convert Sun raster to PNM**

```rasttopnm [input.ras] > [output.pnm]```

# SYNOPSIS

**rasttopnm** [_file_]

# DESCRIPTION

**rasttopnm** converts Sun Rasterfile images (.ras) to Portable Anymap (PNM) format, automatically selecting PBM, PGM, or PPM output based on the input image's color depth. Sun Rasterfile was the native image format on SunOS and Solaris systems, and this converter enables those legacy images to be processed with modern Netpbm tools or converted to contemporary formats.

# SEE ALSO

[pnmtorast](/man/pnmtorast)(1), [xwdtopnm](/man/xwdtopnm)(1)

