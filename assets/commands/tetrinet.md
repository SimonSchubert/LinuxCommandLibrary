# TLDR

**Connect to a server**

```tetrinet [nickname] [server.example.com]```

**Connect with fancy graphics**

```tetrinet -fancy [nickname] [server]```

**Connect in tetrifast mode**

```tetrinet -fast [nickname] [server]```

**Use custom window size**

```tetrinet -log [logfile] [nickname] [server]```

**Enable shadow piece preview**

```tetrinet -shadow [nickname] [server]```

# SYNOPSIS

**tetrinet** [_options_] _nickname_ _server_

# PARAMETERS

**-fancy**
> Use fancy TTY graphics with box-drawing characters.

**-fast**
> Connect using tetrifast mode (faster gameplay).

**-log** _file_
> Log partyline messages to file.

**-shadow**
> Enable shadow piece showing where piece will land.

**-slide**
> Enable piece sliding after landing.

**-noshadow**
> Disable shadow piece.

**-noslide**
> Disable piece sliding.

**-windows**
> Emulate Windows client behavior.

# CONTROLS

**Left/Right arrows**: Move piece horizontally.

**Up arrow**: Rotate piece clockwise.

**Down arrow**: Soft drop.

**Space**: Hard drop.

**d**: Discard special block.

**1-6**: Use special on player field.

**t**: Talk in partyline.

# DESCRIPTION

**tetrinet** is a multiplayer Tetris game for up to six players that runs in a text terminal. It connects to TetriNET servers and supports both cooperative team play and competitive matches.

The game features special blocks that appear when clearing lines containing them. Specials include add lines, clear lines, nuke field, block bomb, gravity, and various other attacks that can be used against opponents or to help teammates.

The terminal client uses ncurses for display and requires a terminal with at least 50 lines. It's compatible with original Windows TetriNET servers and supports the faster tetrifast variant.

# CAVEATS

Requires a terminal with at least 50 lines. Server availability varies; public servers may have limited uptime. The -fancy option requires Unicode support in the terminal. Network latency can affect competitive play.

# HISTORY

**TetriNET** was created by St0rmCat in 1997 as a multiplayer Tetris variant for Windows. The Linux client was developed to provide compatible access from Unix systems. The game became popular in the late 1990s and early 2000s for its unique special block mechanics that added strategic depth to multiplayer Tetris.

# SEE ALSO

[tint](/man/tint)(1), [bastet](/man/bastet)(1), [vitetris](/man/vitetris)(1), [netris](/man/netris)(1)
