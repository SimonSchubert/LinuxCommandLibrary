# TAGLINE

roguelike dungeon exploration game

# TLDR

**Start Dungeon Crawl Stone Soup**

```crawl```

**Start with specific character**

```crawl -name [CharacterName]```

**Start with seed for reproducible dungeon**

```crawl -seed [12345]```

**Play in console mode**

```crawl -console```

**Play in tiles mode**

```crawl -tiles```

**Start specific species and background**

```crawl -species [Minotaur] -background [Berserker]```

# SYNOPSIS

**crawl** [_options_]

# PARAMETERS

**-name** _name_
> Set character name.

**-species** _species_
> Choose starting species.

**-background** _background_
> Choose starting background (class).

**-seed** _n_
> Set dungeon generation seed.

**-console**
> Force console (ASCII) mode.

**-tiles**
> Force tiles (graphical) mode.

**-sprint**
> Start in Sprint mode.

**-tutorial**
> Start the tutorial.

**-morgue** _dir_
> Directory for morgue files.

**-version**
> Display version.

# DESCRIPTION

**Dungeon Crawl Stone Soup** (DCSS or Crawl) is a roguelike dungeon exploration game focused on combat, strategy, and careful resource management. The player descends through a procedurally generated dungeon to retrieve the Orb of Zot and escape alive.

The game features permadeath (death is permanent), turn-based gameplay, dozens of species and backgrounds with unique abilities, religion system with various gods, extensive magic and item systems, and deep tactical combat.

DCSS is known for its streamlined design philosophy, removing tedious elements common in roguelikes while maintaining depth. Both console (ASCII) and graphical tiles versions are available.

# GAMEPLAY BASICS

**Movement**: Arrow keys or numpad
**Commands**: **o** auto-explore, **g** get item, **i** inventory
**Combat**: Move into enemies to attack
**Rest**: **5** or **.** to rest/wait
**Stairs**: **>** descend, **<** ascend
**Save**: **Ctrl-S** (or quit, auto-saves)

# CONFIGURATION

**~/.crawlrc**
> User-specific configuration including keybindings, autopickup rules, display options, and game preferences.

# CAVEATS

Steep learning curve; expect many deaths while learning. No manual saves - death is permanent. Games can take many hours to complete. Console mode requires a terminal supporting Unicode or CP437 graphics.

# HISTORY

Dungeon Crawl Stone Soup forked from **Linley's Dungeon Crawl** in **2006** when the original development stalled. Named after the development philosophy of "stone soup" (collaborative improvement), DCSS has been continuously developed by a community of volunteers. It's considered one of the best modern roguelikes, praised for accessibility while maintaining challenge.

# SEE ALSO

[nethack](/man/nethack)(6), [angband](/man/angband)(6), [tome](/man/tome)(6), [brogue](/man/brogue)(6)
