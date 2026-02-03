# TLDR

**Generate printer test page**

```pbmpage [1] > [output.pbm]```

**Generate A4 test page**

```pbmpage -a4 [1] > [output.pbm]```

# SYNOPSIS

**pbmpage** [_options_] _pagenum_

# PARAMETERS

_pagenum_
> Test page number (1-3).

**-a4**
> Generate A4 size instead of letter.

# DESCRIPTION

**pbmpage** generates printer calibration and test pages as PBM images. Different page numbers produce different test patterns. Part of Netpbm toolkit.

# SEE ALSO

[pbmtext](/man/pbmtext)(1), [pbmtolj](/man/pbmtolj)(1)

