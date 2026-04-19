# TAGLINE

Convert SBIG ST-4 autoguider images to PGM

# TLDR

**Convert** an SBIG ST-4 image file to PGM

```st4topgm [input.st4] > [output.pgm]```

**Read from stdin** and convert to PGM

```cat [input.st4] | st4topgm > [output.pgm]```

# SYNOPSIS

**st4topgm** [_st4file_]

# DESCRIPTION

**st4topgm** reads an image in the native format used by the Santa Barbara Instrument Group (SBIG) ST-4 astronomical CCD autoguider cameras and writes the data to standard output as a PGM (Portable Graymap) image.

It is part of the Netpbm toolkit. If no input file is specified, it reads from standard input. The program does not provide any custom options; it honors the common libnetpbm options (e.g., `-quiet`, `-plain`).

# CAVEATS

ST-4 files are a legacy astronomical imaging format. Use **pgmtost4** to perform the reverse conversion.

# SEE ALSO

[pgmtost4](/man/pgmtost4)(1), [sbigtopgm](/man/sbigtopgm)(1)

