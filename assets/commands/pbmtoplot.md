# TAGLINE

Convert a PBM image to Unix plot format

# TLDR

**Convert a PBM image to Unix plot format**

```pbmtoplot [input.pbm] > [output.plot]```

**Convert from stdin**

```cat [input.pbm] | pbmtoplot > [output.plot]```

# SYNOPSIS

**pbmtoplot** [_pbmfile_]

# DESCRIPTION

**pbmtoplot** reads a PBM image as input and produces a Unix plot(5) format file as output. The plot format was a device-independent vector graphics format used for output to plotters and other graphics devices.

If no input file is specified, the program reads from standard input. The output is always written to standard output. There is no reverse conversion tool (plottopbm does not exist).

Part of the **Netpbm** toolkit.

# CAVEATS

The Unix plot format is largely obsolete. The conversion is one-way; there is no corresponding tool to convert plot format back to PBM.

# SEE ALSO

[pbmtoascii](/man/pbmtoascii)(1), [pbmtogem](/man/pbmtogem)(1)
