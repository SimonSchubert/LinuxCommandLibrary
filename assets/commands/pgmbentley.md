# TAGLINE

Apply Bentley effect to PGM images

# TLDR

**Apply Bentley effect to grayscale image**

```pgmbentley [input.pgm] > [output.pgm]```

**Read from stdin and write to stdout**

```cat [input.pgm] | pgmbentley > [output.pgm]```

# SYNOPSIS

**pgmbentley** [_pgmfile_]

# DESCRIPTION

**pgmbentley** applies the "Bentley effect" to a PGM image, creating a melted or dripping appearance by displacing each pixel vertically based on surrounding brightness. The result resembles wax that has softened and run downward.

If no input file is specified, the image is read from standard input. Output is always written to standard output as a PGM file.

Part of the Netpbm toolkit.

# CAVEATS

Only accepts PGM (grayscale) input. For color images, split channels first with **ppmtopgm** or process with a separate workflow.

# SEE ALSO

[pgmoil](/man/pgmoil)(1), [pgmnoise](/man/pgmnoise)(1), [pnm](/man/pnm)(5)

