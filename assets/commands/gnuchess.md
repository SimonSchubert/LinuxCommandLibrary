# TAGLINE

GNU Chess engine

# TLDR

**Start an interactive chess game**

```gnuchess```

**Play in two-player mode** (user vs user)

```gnuchess -u```

**Play in easy mode** (no pondering)

```gnuchess -e```

**Load a game from a PGN file**

```gnuchess -l [game.pgn]```

**Set search depth level**

```gnuchess -S [5]```

**Run as UCI engine**

```gnuchess --uci```

**Run as XBoard engine**

```gnuchess --xboard```

# SYNOPSIS

**gnuchess** [_options_]

# PARAMETERS

**-h**, **--help**
> Display usage help.

**-v**, **--version**
> Display version information.

**-u**
> Two-player mode (user vs user).

**-e**
> Easy mode. The engine does not think during the opponent's turn.

**-l** _PGNFILE_, **--load** _PGNFILE_
> Load game from a PGN file.

**-S** _LEVEL_, **--setlevel** _LEVEL_
> Set search depth level (1-10).

**--xboard**, **-x**
> XBoard/WinBoard engine protocol mode.

**--uci**
> UCI engine protocol mode.

**--post**, **-p**
> Show engine thinking output.

**--manual**, **-m**
> Manual mode. The engine does not play until told to.

**-M** _SIZE_, **--memory** _SIZE_
> Set hash table memory size in MB.

# PREVIEW

```
 r n b q k b n r
 p p p p p p p p
 . . . . . . . .
 . . . . . . . .
 P P P P P P P P
 R N B Q K B N R
```

# DESCRIPTION

**gnuchess** is a free chess-playing program that can be used as a standalone interactive chess game or as a backend engine for graphical chess frontends like **XBoard** or **GNOME Chess**. It supports both the **XBoard** and **UCI** communication protocols.

In interactive mode, enter moves in algebraic notation (e.g. e2e4, Nf3). Type **help** for a list of commands. The engine includes an opening book and uses alpha-beta search with iterative deepening.

# CAVEATS

The default opening book may not be installed on all systems. Engine strength depends on the search depth and available memory for hash tables.

# HISTORY

GNU Chess was first written by **Stuart Cracraft** in **1984**, making it one of the earliest programs in the GNU Project. It has been maintained by numerous contributors over the decades and remains one of the most well-known free software chess engines.

# SEE ALSO

[nbcheckers](/man/nbcheckers)(1), [gnugo](/man/gnugo)(1)

