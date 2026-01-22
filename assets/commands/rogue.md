# TLDR

**Start a new game**

```rogue```

**Restore a saved game**

```rogue -r [save_file]```

**Display high scores**

```rogue -s```

# SYNOPSIS

**rogue** [_-r save_file_] [_-s_]

# PARAMETERS

**-r** _FILE_
> Restore a previously saved game

**-s**
> Display the high score list

# IN-GAME COMMANDS

**?**
> Display help and list of commands

**/**
> Identify symbols on screen

**h j k l**
> Move left, down, up, right

**y u b n**
> Move diagonally

**.**
> Rest one turn

**s**
> Search for traps and secret doors

**>**
> Go down stairs

**<**
> Go up stairs

**i**
> Display inventory

**e**
> Eat food

**w**
> Wield a weapon

**W**
> Wear armor

**T**
> Take off armor

**P**
> Put on a ring

**R**
> Remove a ring

**q**
> Quaff a potion

**r**
> Read a scroll

**z**
> Zap a wand

**t**
> Throw an object

**d**
> Drop an object

**,**
> Pick up object

**S**
> Save game and exit

**Q**
> Quit (abandon game)

# DESCRIPTION

**rogue** is the original dungeon-crawling game that defined the roguelike genre. The player explores procedurally generated dungeon levels, fighting monsters, collecting treasure, and searching for the Amulet of Yendor on the 26th level.

The game displays the dungeon using ASCII characters: **@** represents the player, letters represent monsters (stronger monsters use later alphabet letters), **#** shows corridors, **.** shows floor, **+** shows doors, and **%** shows stairs. Items include **!** potions, **?** scrolls, **/** wands, **=** rings, **]** armor, and **)** weapons.

Rogue features permanent death—when your character dies, the game ends permanently. There is no reloading saves to retry. This creates tension and makes each decision meaningful. The game requires a minimum 24x80 terminal.

# CAVEATS

The game is intentionally difficult and unforgiving. Most items are unidentified until used or identified by scrolls. Cursed items cannot be removed without special scrolls. Food management is critical—starvation kills. The save file is deleted after restoring, preventing save-scumming.

# HISTORY

Rogue was created by **Michael Toy** and **Glenn Wichman** at UC Santa Cruz in **1980**, with later contributions from **Ken Arnold**. Originally written for Unix using the curses library, it popularized procedural generation and permadeath in games. The game spawned the entire "roguelike" genre, including NetHack, Angband, and modern games like Hades and Spelunky. The name comes from the Dungeons & Dragons character class, and the subtitle "Exploring the Dungeons of Doom" references early D&D modules.

# SEE ALSO

[nethack](/man/nethack)(6), [angband](/man/angband)(6), [crawl](/man/crawl)(6), [moria](/man/moria)(6)
