# TAGLINE

Z-machine interactive fiction interpreter

# TLDR

**Play Z-machine game**

```frotz [game.z5]```

**Set screen width and height**

```frotz -w [80] -h [24] [game.z5]```

**Play in dumb terminal mode**

```dfrotz [game.z5]```

**Load a saved game on startup**

```frotz -L [savefile] [game.z5]```

**Restrict file access to a directory**

```frotz -R [/path/to/directory] [game.z5]```

# SYNOPSIS

**frotz** [_options_] _story-file_

# DESCRIPTION

**frotz** is an interpreter for Infocom-style interactive fiction (Z-machine games). It runs text adventure games in formats from Z3 through Z8, including classic titles and modern IF works.

The tool provides terminal and graphical interfaces for playing these games, with support for save/restore, transcripts, and input recording.

# PARAMETERS

**-w** _columns_
> Screen width.

**-h** _rows_
> Screen height.

**-d**
> Disable color output.

**-e**
> Enable sound effects.

**-i**
> Ignore fatal Z-machine errors.

**-l** _n_
> Left margin in characters.

**-r** _n_
> Right margin in characters.

**-p**
> Plain ASCII output only (no accented characters).

**-x**
> Expand abbreviations "g", "x", "z" to "again", "examine", "wait".

**-L** _file_
> Load a saved game file on startup.

**-R** _directory_
> Restrict file read/write to specified directory.

**-S** _n_
> Set transcript width (0 to disable line splitting).

**-Z** _n_
> Error checking mode (0=none, 1=first, 2=all, 3=exit on error; default 1).

# CAVEATS

Some games require specific Z-machine versions. Color support depends on terminal capabilities. Save format may not be portable between different interpreters. Three variants exist: **frotz** (curses), **dfrotz** (dumb terminal), and **sfrotz** (SDL graphical).

# HISTORY

**Frotz** was written by **Stefan Jokisch** in the mid-**1990s** as a portable Z-machine interpreter. It became one of the most popular interpreters for Infocom games and modern interactive fiction. The name references the spell from Zork.

# SEE ALSO

[nethack](/man/nethack)(6)
