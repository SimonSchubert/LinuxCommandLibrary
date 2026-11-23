# TAGLINE

converts binary PNM images to plain (ASCII) format

# TLDR

**Convert a PNM image to** plain text format

```pamnoraw [input.ppm] > [output.ppm]```

**Same conversion** with the current Netpbm program

```pamtopnm -plain [input.ppm] > [output.ppm]```

**Convert from standard input**

```cat [input.pgm] | pamtopnm -plain > [output.pgm]```

# SYNOPSIS

**pamnoraw** [_file_]

# DESCRIPTION

**pamnoraw** converts binary (raw) PNM images to plain (ASCII) format. Plain format is human-readable but much larger. Equivalent to running `pamtopnm -plain`. Note that PAM images have no plain format, so this tool only operates on PBM, PGM, and PPM inputs. Part of the Netpbm toolkit.

If no _file_ is given, the image is read from standard input. The result is always written to standard output.

# CAVEATS

Netpbm does not actually install a program called **pamnoraw**; the name is used as an alias by some cheat-sheet collections. The historical program was **pnmnoraw** (Pbmplus, 1989), renamed to **pnmtoplainpnm** in Netpbm 8.2 (2000) and obsoleted by **pamtopnm** in Netpbm 10.23 (2004). Current Netpbm still installs **pnmtoplainpnm** and a **pnmnoraw** symlink for compatibility, both of which simply run `pamtopnm -plain`. Use `pamtopnm -plain` in new scripts.

# SEE ALSO

[pamtopnm](/man/pamtopnm)(1), [pnmtoplainpnm](/man/pnmtoplainpnm)(1), [pamfile](/man/pamfile)(1), [netpbm](/man/netpbm)(1)

# RESOURCES

```[Homepage](https://netpbm.sourceforge.net/)```

```[Documentation](https://netpbm.sourceforge.net/doc/pamtopnm.html)```

<!-- verified: 2026-11-23 -->
