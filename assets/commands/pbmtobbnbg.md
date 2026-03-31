# TAGLINE

Convert PBM bitmaps to BBN BitGraph terminal format

# TLDR

**Convert a PBM file to BBN BitGraph format**

```pbmtobbnbg [input.pbm] > [output.bg]```

**Read from standard input**

```cat [input.pbm] | pbmtobbnbg > [output.bg]```

# SYNOPSIS

**pbmtobbnbg** [_pbmfile_]

# DESCRIPTION

**pbmtobbnbg** reads a PBM image as input and produces BBN BitGraph graphics terminal format as output. If no file is specified, it reads from standard input.

The BitGraph was a graphics terminal manufactured by BBN (Bolt Beranek and Newman). This tool is part of the **Netpbm** toolkit.

# SEE ALSO

[pbmtoplot](/man/pbmtoplot)(1), [pbmtoascii](/man/pbmtoascii)(1), [pbm](/man/pbm)(1), [netpbm](/man/netpbm)(1)

