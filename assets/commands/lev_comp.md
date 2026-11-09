# TAGLINE

NetHack special levels compiler

# TLDR

**Compile a level description file**

```lev_comp [file.des]```

**Compile with extra checks** and warnings

```lev_comp -w [file.des]```

**Compile several files**

```lev_comp [file1.des] [file2.des]```

**Read a description** from standard input

```lev_comp < [file.des]```

# SYNOPSIS

**lev_comp** [**-w**] [_files_]

# PARAMETERS

_FILES_
> Level description files to compile. If none are given, standard input is read.

**-w**
> Perform extra checks on the level and display additional warnings, which are sometimes superfluous.

# DESCRIPTION

**lev_comp** is the special level compiler for NetHack. It takes level description files and produces binary level files, with a **.lev** extension, that the game loads at runtime.

It gives NetHack administrators and implementors a way to add special levels or modify existing ones without recompiling the game. Each level defined in a description file is written to its own output file, named after the level.

# FILE FORMAT

```
MAZE : "fortress", random
GEOMETRY : center , center
MAP
}}}|-|}}}
}}|-.-|}}
}}}|-|}}}
ENDMAP
MONSTER: '@', "Wizard of Yendor", (4,1)
OBJECT: '"', "Amulet of Yendor", (4,1)
```

# CAVEATS

Compiled levels are tied to the NetHack version that built them. The tool is usually installed with the game's data files or only in the build tree, so it may not be on PATH.

# HISTORY

**lev_comp** ships with NetHack and its man page documents the compiler for version 3.2 and higher. NetHack 3.7 no longer includes it, having moved special levels to Lua scripts.

# SEE ALSO

[nethack](/man/nethack)(6), [dgn_comp](/man/dgn_comp)(6), [dlb](/man/dlb)(6)

# RESOURCES

```[Source code](https://github.com/NetHack/NetHack)```

```[Homepage](https://www.nethack.org/)```

```[Documentation](https://github.com/NetHack/NetHack/blob/NetHack-3.6/doc/lev_comp.txt)```

<!-- verified: 2026-11-09 -->
