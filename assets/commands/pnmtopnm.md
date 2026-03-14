# TAGLINE

Copy and normalize PNM image format

# TLDR

**Copy a PNM image normalizing to raw format**

```pnmtopnm [input.pnm] > [output.pnm]```

**Convert a PNM image to plain (ASCII) format**

```pnmtopnm -plain [input.pnm] > [output.pnm]```

# SYNOPSIS

**pnmtopnm** [**-plain**] [_pnmfile_]

# DESCRIPTION

**pnmtopnm** copies a PNM image to standard output. The output has the same PNM format (PBM, PGM, or PPM) and maxval as the input. Though similar to `cat`, it allows conversion between the plain (ASCII) and raw (binary) subformats of PNM. Use **-plain** to produce ASCII output; omit it to produce raw (binary) output.

Since Netpbm 10.27, **pnmtopnm** is simply an alternate name for **pamtopnm**. Part of the Netpbm toolkit.

# HISTORY

**pnmtopnm** was introduced in Netpbm 10.23 (July 2004), obsoleting **pnmtoplainpnm**. In Netpbm 10.27 (March 2005) it became an alias for **pamtopnm**.

# SEE ALSO

[pamtopnm](/man/pamtopnm)(1), [pnmtoplainpnm](/man/pnmtoplainpnm)(1), [netpbm](/man/netpbm)(1)
