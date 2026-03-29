# TAGLINE

converts PGM images to SBIG Type 3 format used by astronomical CCD cameras

# TLDR

**Convert a PGM file to SBIG format**

```pgmtosbig [input.pgm] > [output.sbig]```

**Convert from stdin to SBIG format**

```pgmtosbig < [input.pgm] > [output.sbig]```

# SYNOPSIS

**pgmtosbig** [_pgmfile_]

# DESCRIPTION

**pgmtosbig** converts a PGM (Portable Graymap) image into SBIG Type 3 format, the uncompressed image format used by Santa Barbara Instrument Group (SBIG) astronomical CCD cameras.

The output is uncompressed image data with a header identifying the source as an ST-6 camera, along with camera type, image dimensions, and saturation level metadata.

Note that SBIG Type 3 is distinct from the older SBIG ST-4 format handled by [pgmtost4](/man/pgmtost4)(1). The reverse conversion is performed by [sbigtopgm](/man/sbigtopgm)(1).

The program accepts input from a file argument or standard input, and writes to standard output. It has no tool-specific options beyond the common Netpbm options. Part of the Netpbm toolkit (since Netpbm 10.70).

# SEE ALSO

[sbigtopgm](/man/sbigtopgm)(1), [pgmtost4](/man/pgmtost4)(1), [fitstopnm](/man/fitstopnm)(1), [netpbm](/man/netpbm)(1)
