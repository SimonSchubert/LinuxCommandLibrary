# TAGLINE

Convert PNM to plain ASCII format (obsolete)

# TLDR

**Convert a PNM image to plain ASCII format**

```pnmtoplainpnm [input.pnm] > [output.pnm]```

**Read from stdin and write plain format to a file**

```cat [input.pnm] | pnmtoplainpnm > [output.pnm]```

# SYNOPSIS

**pnmtoplainpnm** [_file_]

# DESCRIPTION

**pnmtoplainpnm** reads a PNM image as input and writes an equivalent image in plain (ASCII) PNM format. Plain format is human-readable but significantly larger than the binary (raw) format. Part of the Netpbm toolkit.

**pnmtoplainpnm** was obsoleted in Netpbm 10.23 (July 2004) by **pamtopnm**. It is retained for backward compatibility; all it does is invoke `pamtopnm -plain`. The preferred modern approach is to use the **-plain** common option on any Netpbm program.

# HISTORY

**pnmtoplainpnm** was new in Netpbm 8.2 (March 2000) as a renaming of **pnmnoraw**, which was new in Pbmplus in November 1989. It was obsoleted by **pamtopnm** in Netpbm 10.23 (July 2004).

# SEE ALSO

[pamtopnm](/man/pamtopnm)(1), [pnmtopnm](/man/pnmtopnm)(1), [pnm](/man/pnm)(1)

