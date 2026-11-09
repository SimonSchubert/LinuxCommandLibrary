# TAGLINE

NetHack dungeon compiler

# TLDR

**Compile a dungeon description file**

```dgn_comp [dungeon.def]```

**Compile a description read from standard input**

```dgn_comp < [dungeon.def]```

# SYNOPSIS

**dgn_comp** [_file_]

# PARAMETERS

_FILE_
> Dungeon description file to compile. If no argument is given, standard input is read.

# DESCRIPTION

**dgn_comp** is the dungeon compiler for NetHack version 3.2 and higher. It takes a description file and produces a dungeon "script" that is loaded by NetHack at runtime, letting administrators and implementors create a custom dungeon for the game without recompiling it.

The description file defines the dungeon structure with statements such as **DUNGEON**, **DESCRIPTION**, **ALIGNMENT**, **ENTRY**, **PROTOFILE**, **BRANCH**, **LEVEL**, **RNDLEVEL** and **CHAINLEVEL**. Lines beginning with **#** are comments.

# CAVEATS

Not a general-purpose tool: it only produces data for NetHack. It belongs to the NetHack 3.6 and earlier build; the 3.7 development branch replaces the compiled format with **dungeon.lua** and no longer ships dgn_comp.

# HISTORY

Written by **M. Stephenson**, based on the level compiler by Jean-Christophe Collet.

# SEE ALSO

[nethack](/man/nethack)(6), [lev_comp](/man/lev_comp)(6)

# RESOURCES

```[Source code](https://github.com/NetHack/NetHack)```

```[Homepage](https://www.nethack.org/)```

<!-- verified: 2026-11-09 -->
