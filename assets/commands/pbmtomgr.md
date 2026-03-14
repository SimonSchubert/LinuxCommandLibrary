# TAGLINE

Convert PBM bitmaps to MGR window system format

# TLDR

**Convert PBM to MGR format**

```pbmtomgr [input.pbm] > [output.mgr]```

**Convert from stdin**

```cat [input.pbm] | pbmtomgr > [output.mgr]```

# SYNOPSIS

**pbmtomgr** [_file_]

# PARAMETERS

_file_
> Input PBM file. Reads from stdin if omitted.

# DESCRIPTION

**pbmtomgr** reads a PBM image as input and produces a MGR bitmap as output. MGR is a window manager that was a smaller alternative to the X Window System, developed at Bellcore in the 1980s. Part of the Netpbm toolkit.

# SEE ALSO

[mgrtopbm](/man/mgrtopbm)(1), [xbmtopbm](/man/xbmtopbm)(1)

