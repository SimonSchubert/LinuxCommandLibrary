# TAGLINE

Z-machine interactive fiction interpreter

# TLDR

**Play Z-machine game**

```frotz [game.z5]```

**Play with specific screen size**

```frotz -w [80] -h [24] [game.z5]```

**Play in dumb terminal mode**

```dfrotz [game.z5]```

**Save transcript**

```frotz -r [transcript.txt] [game.z5]```

**Use specific font size**

```frotz -s [14] [game.z5]```

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

**-s** _size_
> Font size (graphical mode).

**-r** _file_
> Record transcript to file.

**-p** _file_
> Playback recorded commands.

**-a**
> Watch commands during playback.

**-l** _file_
> Command log file.

**-c** _n_
> Context lines for scrollback.

**-R** _directory_
> Restricted path for file access.

# CAVEATS

Some games require specific Z-machine versions. Graphics limited in terminal mode. Color support depends on terminal. Save format not always portable.

# HISTORY

**Frotz** was written by **Stefan Jokisch** in the mid-**1990s** as a portable Z-machine interpreter. It became one of the most popular interpreters for Infocom games and modern interactive fiction. The name references the spell from Zork.

# SEE ALSO

[zork](/man/zork)(1), [inform](/man/inform)(1), [tads](/man/tads)(1), [glulxe](/man/glulxe)(1)
