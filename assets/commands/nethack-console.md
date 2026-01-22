# TLDR

**Start NetHack**

```nethack```

**Start with a specific username**

```nethack -u [playername]```

**Start in discovery mode** (non-scoring exploration)

```nethack -X```

**Display high scores** and exit

```nethack -s```

**Start with a specific game directory**

```nethack -d [path/to/directory]```

**Show version information**

```nethack --version```

**Show configuration file paths**

```nethack --showpaths```

# SYNOPSIS

**nethack** [_-d directory_] [_-n_] [_-u playername_] [_-X_]

**nethack** -s [_-v_] [_-p profession_] [_names_...]

# PARAMETERS

**-u** _NAME_
> Start game with specified player name

**-d** _DIR_
> Use alternate game directory

**-D**
> Start in debug/wizard mode (admin only)

**-X**
> Start in discovery mode (non-scoring)

**-n**
> Suppress news from game administrator

**-s**
> Display high scores and exit

**-v**
> Show version information

**-p** _PROFESSION_
> Filter scores by profession/role

**--version**
> Print version and exit

**--showpaths**
> Show expected configuration file locations

# ENVIRONMENT

**NETHACKOPTIONS**
> Game options and settings

**NETHACKDIR**, **HACKDIR**
> Game directory location

**HOME**
> User home directory for config files

**TERM**
> Terminal type for display

# DESCRIPTION

**nethack** is a classic roguelike dungeon exploration game where you descend through the Mazes of Menace to retrieve the Amulet of Yendor. The console version uses ASCII characters to represent the game world, making it playable on any terminal.

The player character (**@**) explores procedurally generated dungeons, fighting monsters, collecting items, and avoiding traps. The game features permanent death—when you die, the game is over and you must start fresh. This design philosophy emphasizes careful play and learning from mistakes.

Game options are configured through **~/.nethackrc** or the **NETHACKOPTIONS** environment variable. Within the game, press **?** for help and **O** to view and change options. Movement uses **hjklyubn** keys (vi-style) or numpad with **number_pad** option enabled.

# CAVEATS

NetHack has a steep learning curve with hundreds of commands and interactions. The game does not hold your hand—experimentation and learning from deaths is expected. Save files are deleted on death (permadeath). Different distributions may have slightly different binary names (nethack, nethack-console, nethack-tty).

# HISTORY

NetHack evolved from **Hack** (1982), which itself descended from **Rogue** (1980), the original roguelike game. Development began in **1987** by the NetHack DevTeam, with the name reflecting its origins as a collaborative project over the early internet. It became one of the most influential games in computer gaming history, inspiring countless roguelikes and the "roguelike" genre. The game continues active development, with version 3.6 released in **2015** after a 12-year hiatus.

# SEE ALSO

[rogue](/man/rogue)(6), [angband](/man/angband)(6), [crawl](/man/crawl)(6)
