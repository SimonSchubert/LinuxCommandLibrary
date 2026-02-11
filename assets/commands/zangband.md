# TAGLINE

Roguelike dungeon exploration game

# TLDR

**Start a new game**

```zangband```

**Start with a specific savefile**

```zangband -u [savefile]```

**Start in wizard mode (debugging)**

```zangband -w```

# SYNOPSIS

**zangband** [**-n** _num_] [**-u** _name_] [**-w**] [**-v**]

# PARAMETERS

**-n** _num_
> Start with specified server number

**-u** _name_
> Use specified savefile name

**-w**
> Start in wizard (debug) mode

**-v**
> Enable verbose mode

**--**
> Ignore remaining options

# DESCRIPTION

**ZAngband** is a single-player roguelike dungeon exploration game, a variant of Angband which itself derives from Moria and ultimately Rogue. The goal is to descend through increasingly dangerous dungeon levels, gain experience and equipment, and ultimately defeat a powerful end boss.

ZAngband adds numerous features to Angband including wilderness areas between towns, additional races and classes, new monsters, and expanded magic systems. The game features permadeath - when your character dies, they're gone forever.

The interface is text-based using ASCII characters to represent the dungeon, monsters, and items. Movement and actions use keyboard commands.

Savefiles are stored in **~/.angband/ZAngband/save/** by default.

# CAVEATS

ZAngband is a complex game with a steep learning curve. Pressing **?** in-game provides extensive help documentation.

The game uses permadeath. Save frequently, but savefile manipulation (save-scumming) defeats the intended challenge.

Development of ZAngband has been largely superseded by other Angband variants like ToME, Sil, and FAangband.

# SEE ALSO

[angband](/man/angband)(6), [nethack](/man/nethack)(6), [crawl](/man/crawl)(6), [tome](/man/tome)(6)
