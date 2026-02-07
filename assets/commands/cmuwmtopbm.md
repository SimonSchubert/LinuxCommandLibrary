# TAGLINE

CMU window manager bitmap to PBM converter

# TLDR

**Convert CMU window manager bitmap** to PBM

```cmuwmtopbm [input.cmuwm] > [output.pbm]```

**Convert from stdin**

```cat [input.cmuwm] | cmuwmtopbm > [output.pbm]```

# SYNOPSIS

**cmuwmtopbm** [_cmuwmfile_]

# DESCRIPTION

**cmuwmtopbm** converts a CMU window manager bitmap file to PBM (Portable BitMap) format. This is part of the Netpbm package.

CMU window manager (CMU WM) was an early X Window System window manager from Carnegie Mellon University. This tool converts its bitmap format to the portable Netpbm format.

# SEE ALSO

[pbmtocmuwm](/man/pbmtocmuwm)(1), [netpbm](/man/netpbm)(1)
