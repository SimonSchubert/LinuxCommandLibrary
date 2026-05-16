# TAGLINE

converts Lisp Machine bitmap format to PGM grayscale

# TLDR

**Convert Lisp Machine bitmap to PGM**

```lispmtopgm [input.lispm] > [output.pgm]```

**Read from stdin**

```cat [input.lispm] | lispmtopgm > [output.pgm]```

# SYNOPSIS

**lispmtopgm** [_lispmfile_]

# DESCRIPTION

**lispmtopgm** converts a Lisp Machine bitmap file into a PGM (Portable Graymap) image. It reads bitmaps written by the `tv:write-bit-array-file` function on TI Explorer and Symbolics Lisp Machines.

Multi-plane Lisp Machine bitmaps are inherently color, but because the file format lacks a color map the output is produced as grayscale PGM. If no input file is given, the bitmap is read from standard input.

# CAVEATS

The Lisp Machine format normally pads image width up to the next multiple of 32 pixels, but not always. Files with non-32-aligned widths may be up to 7 bits too short and are not handled gracefully. No tool-specific options exist; only standard libnetpbm options apply.

# SEE ALSO

[pgmtolispm](/man/pgmtolispm)(1), [pbmtolj](/man/pbmtolj)(1)

