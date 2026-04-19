# TAGLINE

Convert PBM to Microdesign MDA format

# TLDR

**Convert PBM to Microdesign Area format**

```pbmtomda [input.pbm] > [output.mda]```

**Invert colors**

```pbmtomda -i [input.pbm] > [output.mda]```

**Produce double-resolution MDA output**

```pbmtomda -d [input.pbm] > [output.mda]```

# SYNOPSIS

**pbmtomda** [**-d**] [**-i**] [_pbmfile_]

# PARAMETERS

**-d**
> Produce double-resolution MDA output instead of the default single resolution.

**-i**
> Invert the image so black pixels in the PBM become white in the MDA output.

_pbmfile_
> Input PBM file. If omitted, the image is read from standard input.

# DESCRIPTION

**pbmtomda** reads a PBM (Portable Bitmap) image and writes it to standard output in Microdesign Area (MDA) format, the native graphics format used by the Microdesign graphics program on the Amstrad PCW CP/M-based computer. The output is a raw MDA file without a header, suitable for pasting into a Microdesign document.

Part of the Netpbm toolkit.

# CAVEATS

Generates only uncompressed MDA data; a Microdesign file header must be added separately when producing a standalone file.

# SEE ALSO

[mdatopbm](/man/mdatopbm)(1), [pbmtolj](/man/pbmtolj)(1), [pbm](/man/pbm)(5)

