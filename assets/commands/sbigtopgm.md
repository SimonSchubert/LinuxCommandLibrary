# TAGLINE

Convert SBIG CCD camera images to PGM format

# TLDR

**Convert SBIG to PGM**

```sbigtopgm [input.sbig] > [output.pgm]```

# SYNOPSIS

**sbigtopgm** [_file_]

# DESCRIPTION

**sbigtopgm** reads an image file in the native SBIG (Santa Barbara Instrument Group) Type 3 format used by astronomical CCD cameras and produces a PGM (portable graymap) image as output. If no file is specified, it reads from standard input. The program handles variations in the SBIG format including flexible header capitalization and line endings. Part of the Netpbm toolkit.

# SEE ALSO

[pgmtosbig](/man/pgmtosbig)(1), [fitstopnm](/man/fitstopnm)(1)

