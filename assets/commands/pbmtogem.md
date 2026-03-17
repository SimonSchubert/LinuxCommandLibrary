# TAGLINE

Convert a PBM image to GEM .img format

# TLDR

**Convert a PBM image to GEM IMG format**

```pbmtogem [input.pbm] > [output.img]```

**Convert from stdin**

```cat [input.pbm] | pbmtogem > [output.img]```

# SYNOPSIS

**pbmtogem** [_pbmfile_]

# DESCRIPTION

**pbmtogem** reads a PBM image as input and produces a compressed GEM .img file as output. GEM (Graphics Environment Manager) was a GUI system used on Atari ST computers and early IBM PCs.

If no input file is specified, the program reads from standard input. The output is always written to standard output. This tool does not support compression of repeated lines.

Part of the **Netpbm** toolkit.

# CAVEATS

Does not support compression of repeated lines in the output. The GEM IMG format is largely obsolete and mainly of historical interest.

# HISTORY

pbmtogem was created by **David Beckemeyer** and **Jef Poskanzer** as part of the Netpbm suite.

# SEE ALSO

[gemtopbm](/man/gemtopbm)(1), [gemtopnm](/man/gemtopnm)(1), [pbmtomacp](/man/pbmtomacp)(1)

