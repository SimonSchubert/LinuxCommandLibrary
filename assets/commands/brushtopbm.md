# TLDR

**Convert a deskjet brush file** to PBM

```brushtopbm [brushfile] > [output.pbm]```

**Convert from stdin**

```cat [brushfile] | brushtopbm > [output.pbm]```

**Convert brush to PNG** via pipe

```brushtopbm [brushfile] | pnmtopng > [output.png]```

# SYNOPSIS

**brushtopbm** [_brushfile_]

# DESCRIPTION

**brushtopbm** reads a deskjet brush file and produces a PBM (Portable BitMap) image as output. This is part of the Netpbm package of image manipulation utilities.

Brush files were used by certain HP DeskJet printer utilities for custom brush patterns. This converter allows extracting these patterns as standard bitmap images.

If no file is specified, the program reads from standard input. Output is written to standard output.

# CAVEATS

This tool handles a specific legacy format. The brush file format is rarely used in modern systems. Output is monochrome PBM; convert using other Netpbm tools if color output is needed.

# SEE ALSO

[pbmtogo](/man/pbmtogo)(1), [pnmtopng](/man/pnmtopng)(1), [netpbm](/man/netpbm)(1)
