# TAGLINE

Split PPM into separate RGB channel files

# TLDR

**Split** a PPM image into three PGM component files

```ppmtorgb3 [input.ppm]```

**Read from stdin** (produces noname.red/.grn/.blu)

```cat [input.ppm] | ppmtorgb3```

# SYNOPSIS

**ppmtorgb3** [_ppmfile_]

# DESCRIPTION

**ppmtorgb3** reads a PPM (Portable Pixmap) image and writes three PGM (Portable Graymap) images as output: one each for the red, green, and blue channels.

Output filenames are derived from the input filename by stripping any extension and appending **.red**, **.grn**, and **.blu**. For example, separating **lenna.ppm** produces **lenna.red**, **lenna.grn**, and **lenna.blu**. When input comes from stdin, the names default to **noname.red**, **noname.grn**, and **noname.blu**.

There are no options specific to **ppmtorgb3**, but it accepts the common options shared by all programs based on libnetpbm.

# HISTORY

Written by **Jef Poskanzer** in 1991 as part of **Netpbm** (originally **Pbmplus**), a classic toolkit of image-processing utilities that uses simple PBM/PGM/PPM formats as intermediate pipelines.

# SEE ALSO

[rgb3toppm](/man/rgb3toppm)(1), [ppmtopgm](/man/ppmtopgm)(1), [pgmtoppm](/man/pgmtoppm)(1), [ppmtoyuvsplit](/man/ppmtoyuvsplit)(1), [ppm](/man/ppm)(5), [pgm](/man/pgm)(5)
