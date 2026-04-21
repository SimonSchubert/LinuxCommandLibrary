# TAGLINE

Roguelike dungeon exploration game

# TLDR

**Start a new game**

```angband```

**Load a specific character savefile**

```angband -u[character]```

**Start a brand-new character** (skip load)

```angband -n```

**Run with the X11 front end**, opening 4 windows

```angband -mx11 -- -n4```

**Run with the SDL front end**

```angband -msdl```

**Start in wizard (debug) mode**, disables high scores

```angband -w```

**Show top high scores**

```angband -s[10]```

**Display the usage message**

```angband -h```

# SYNOPSIS

**angband** [_options_] [**--** _suboptions_]

# PARAMETERS

**-h**
> Display usage information.

**-n**
> Start a new character (do not load an existing savefile).

**-w**
> Enable wizard (debug) mode; high scores are disabled.

**-g**
> Request graphics mode when the front end supports it.

**-r**
> Rebalance monsters.

**-s**_num_
> Show the specified number of high scores and exit.

**-u**_who_
> Load the savefile belonging to character _who_.

**-m**_sys_
> Select the core display system (**gcu** for curses/console, **x11**, **sdl**, etc.).

**-d**_lib_**=**_path_
> Override a library subdirectory path. Valid _lib_ keys include **help**, **info**, **user**, **save**, **data**, **scores**, **xtra**, **edit**, and **file**.

**--**
> Pass any remaining arguments to the selected front end (e.g. **-n**_N_ to open _N_ X11 windows).

# PREVIEW

```
 ######
 #....#  ####
 #..@.####..#
 #....#  #..#
 ######  ####
```

# DESCRIPTION

**Angband** is a classic single-player roguelike dungeon exploration game. The player creates a character and descends through 100 levels of a dungeon to ultimately defeat Morgoth, the Lord of Darkness. The game features permadeath, procedurally generated levels, and turn-based gameplay.

Characters are created from multiple races (Human, Elf, Dwarf, Hobbit, etc.) and classes (Warrior, Mage, Priest, Rogue, etc.), each with different abilities and playstyles. Combat, magic, and equipment management are central mechanics, with rare artifacts providing powerful bonuses.

The game runs in a terminal using ASCII characters to represent the dungeon, monsters, and items, though graphical tilesets are available. Each session saves automatically, and death is permanent by default, deleting the savefile.

# GAMEPLAY BASICS

**Movement**: Use number pad or **hjklyubn** keys
**Commands**: **i** inventory, **e** equipment, **m** magic, **g** get item, **d** drop, **R** rest
**Stairs**: **>** descend, **<** ascend
**Target**: ***** to target, **t** to fire
**Save and quit**: **Ctrl-X**

# CONFIGURATION

**~/.angband/Angband/**
> User directory containing save files, character dumps, and preferences.

**~/.angband/Angband/user/pref.prf**
> User preference file for keymaps, colors, and display settings.

# CAVEATS

Permadeath means losing hours of progress to a single mistake. The learning curve is steep with many keyboard commands to memorize. Save scumming is possible but defeats the intended experience. Some terminal emulators may have issues with the display or key bindings.

# HISTORY

Angband originated as a variant of **Moria** (1983), which itself was inspired by **Rogue** (1980). The name comes from Tolkien's fortress of Morgoth. Development began in **1990** by students at the University of Warwick. It became one of the most influential roguelikes, spawning numerous variants including ZAngband, ToME, and Sil. The game remains actively maintained by the community.

# SEE ALSO

[nethack](/man/nethack)(1), [crawl](/man/crawl)(6), [tome](/man/tome)(6), [moria](/man/moria)(6), [rogue](/man/rogue)(6)
