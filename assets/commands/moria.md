# TAGLINE

classic single-player dungeon exploration game

# TLDR

**Start Moria** (restores the default savefile if one exists)

```moria```

Play or restore a **specific savefile**

```moria [path/to/savefile]```

Force a **new game**, ignoring any existing savefile

```moria -n [path/to/savefile]```

Start with a fixed **dungeon seed**

```moria -s [12345]```

Show the **high scores** and exit

```moria -d```

Enable **roguelike keys** (hjkl movement, newer and older builds)

```moria -r```

# SYNOPSIS

**moria** [_options_] [_savefile_]

# PARAMETERS

_savefile_
> Savefile to create or restore (default **game.sav**, or moria.save on older builds).

**-n**
> Force start of a new game.

**-r**
> Enable roguelike key set on startup (missing in Umoria 5.7.x releases; use **=** in-game there).

**-d**
> Display high scores and exit.

**-s** _NUMBER_
> Game seed, a decimal number up to 2147483647.

**-w**
> Wizard (debug) mode; can resurrect a dead character. Games are not scored.

**-v**
> Print version and exit.

**-h**
> Display usage help.

# PREVIEW

```
 ##########
 #........#   ####
 #..@.....+###+..#
 #....k...#   #.>#
 #####.####   ####
     #.#
 Str:18 HP:24 AC:6 L:250ft
```

# DESCRIPTION

**Moria** is a classic single-player dungeon exploration game (roguelike). The player creates a character, buys equipment in the town and descends through increasingly dangerous levels of a dungeon, fighting monsters and collecting treasure. The ultimate goal is to kill the **Balrog** on level 50, 2,500 feet underground.

Moria features permadeath, randomly generated levels and ASCII graphics. Most Linux distributions ship the modernised **Umoria** 5.7 codebase under the name moria.

# CONTROLS

```
1-9 / numpad    - Move (original keys)
hjkl yubn       - Move (with -r)
i / e           - Inventory / equipment
w / t           - Wear / take off
m / p           - Cast spell / pray
f               - Fire or throw
q / r           - Quaff potion / read scroll
< / >           - Go up / down stairs
R               - Rest
=               - Set options
?               - Command summary
Ctrl-X          - Save and quit
```

# CHARACTER CLASSES

```
Warrior, Mage, Priest, Rogue
Ranger, Paladin
```

# CAVEATS

Permadeath: the savefile is deleted when the character dies. Older 5.5/5.6 builds use different flags (**-o** original keys, **-s** show scores, **-S** own scores only). The key set can also be switched in-game with **=**.

# HISTORY

Moria was developed at the University of Oklahoma by **Robert Alan Koeneke** starting in **1983**, inspired by Rogue. Jim Wilson ported it to C as **Umoria** in 1987, and it became the ancestor of Angband and many other roguelikes. Umoria was released under the GPL in 2008 and has been modernised in C++ since 2017.

# INSTALL

```nix: nix profile install nixpkgs#moria```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[angband](/man/angband)(1), [nethack](/man/nethack)(1), [rogue](/man/rogue)(1), [crawl](/man/crawl)(1)

# RESOURCES

```[Source code](https://github.com/dungeons-of-moria/umoria)```

```[Homepage](https://umoria.org)```

<!-- verified: 2026-09-29 -->
