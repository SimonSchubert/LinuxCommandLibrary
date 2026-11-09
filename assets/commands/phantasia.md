# TAGLINE

multiplayer terminal fantasy RPG game

# TLDR

**Start a game**

```phantasia```

**Start without header information**

```phantasia -s```

**List all character names**

```phantasia -a```

**Show the scoreboard**

```phantasia -b```

**List the monsters**

```phantasia -m```

# SYNOPSIS

**phantasia** [**-abHmpSsx**]

# PARAMETERS

**-a**
> Get a listing of all character names on file.

**-b**
> Show scoreboard of top characters per login.

**-H**
> Print header only.

**-m**
> Get a monster listing.

**-p**
> Purge old characters.

**-S**
> Turn on wizard options, if allowed, when running as root.

**-s**
> Invoke phantasia without header information.

**-x**
> Examine or change a particular character on file.

# PREVIEW

```
 Phantasia -- Level 3
 HP: 45/60  Str: 12
 Gold: 350  Gems: 2
 You encounter a Troll!
 (f)ight or (r)un?
```

# DESCRIPTION

**phantasia** is a multi-player fantasy RPG game from the **bsdgames** collection. Players create characters, fight monsters, gain experience and gold, and compete with other players on the same system for ranking.

The game features character progression, equipment, magic, and encounters with both monsters and other players.

# CAVEATS

Part of the bsdgames package. Multi-player features require shared file access on the same system.

# HISTORY

**phantasia** was written by **Edward Estes** and has been part of BSD games distributions since the **1980s**. It is one of the earliest multiplayer RPGs on Unix.

# SEE ALSO

[rogue](/man/rogue)(6), [nethack](/man/nethack)(6), [moria](/man/moria)(6)

# RESOURCES

```[Source code](https://cvsweb.netbsd.org/bsdweb.cgi/src/games/phantasia/)```

```[Documentation](https://man.netbsd.org/phantasia.6)```

<!-- verified: 2026-11-09 -->
