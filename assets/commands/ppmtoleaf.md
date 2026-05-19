# TAGLINE

Convert PPM to Interleaf image format

# TLDR

**Convert a PPM to Interleaf image** format on stdout

```ppmtoleaf [input.ppm] > [output.leaf]```

**Read from stdin** and write Interleaf on stdout

```cat [input.ppm] | ppmtoleaf > [output.leaf]```

# SYNOPSIS

**ppmtoleaf** [_ppmfile_]

# DESCRIPTION

**ppmtoleaf** reads a PPM image and writes it as an Interleaf raster image on standard output. The Interleaf format was used by the Interleaf desktop publishing system in the late 1980s and early 1990s.

With no input file, **ppmtoleaf** reads from standard input. Part of the Netpbm toolkit.

# CAVEATS

The Interleaf format is obsolete; this utility exists for compatibility with legacy documents. No options are provided beyond the input filename. Output goes to stdout, so redirect to a file.

# HISTORY

Part of the **Netpbm** package, originally from Jef Poskanzer's PBMplus toolkit.

# SEE ALSO

[leaftoppm](/man/leaftoppm)(1), [ppmtopict](/man/ppmtopict)(1), [ppm](/man/ppm)(5)

