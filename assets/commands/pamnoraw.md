# TAGLINE

converts binary PNM images to plain (ASCII) format

# TLDR

**Convert PNM image to** plain text format

```pamnoraw [input.ppm] > [output.ppm]```

# SYNOPSIS

**pamnoraw** [_file_]

# DESCRIPTION

**pamnoraw** converts binary (raw) PNM images to plain (ASCII) format. Plain format is human-readable but much larger. Equivalent to running `pamtopnm -plain`. Note that PAM images have no plain format, so this tool only operates on PBM, PGM, and PPM inputs. Part of the Netpbm toolkit.

# SEE ALSO

[pamtopnm](/man/pamtopnm)(1), [pnmtoplainpnm](/man/pnmtoplainpnm)(1), [pamfile](/man/pamfile)(1), [netpbm](/man/netpbm)(1)

