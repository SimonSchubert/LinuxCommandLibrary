# TAGLINE

applies Game of Life rules

# TLDR

**Run Game of Life iteration**

```pbmlife [input.pbm] > [output.pbm]```

**Multiple generations**

```pbmlife [input.pbm] | pbmlife | pbmlife > [output.pbm]```

# SYNOPSIS

**pbmlife** [_file_]

# PARAMETERS

_FILE_
> Input PBM file (initial state).

# DESCRIPTION

**pbmlife** applies Game of Life rules. Single generation step.

The tool simulates cellular automata. Conway's Game of Life.

# CAVEATS

Part of Netpbm. One generation per call. Chain for animation.

# HISTORY

pbmlife is part of **Netpbm** implementing Conway's Game of Life.

# SEE ALSO

[pbm](/man/pbm)(5), [pbmmake](/man/pbmmake)(1), [netpbm](/man/netpbm)(1)

