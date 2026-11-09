# TAGLINE

Roguelike dungeon crawler in Middle Earth

# TLDR

**Start the game**

```tome```

**Use a specific savefile**

```tome -u[name]```

**Use the rogue-like keyset**

```tome -r```

**Use the original keyset**

```tome -o```

**Use a specific module**

```tome -M[module]```

**Display help**

```tome -h```

# SYNOPSIS

**tome** [_options_] [**--** _sub-options_]

# PARAMETERS

**-u**_NAME_
> Use the savefile for NAME.

**-r**
> Request the rogue-like keyset.

**-o**
> Request the original keyset.

**-M**_MODULE_
> Use the given game module.

**-w**
> Request wizard mode.

**-h**
> Display help.

**--**
> Pass the remaining options to the display front end.

# CONTROLS

**?**: Display help and key bindings.

**=**: Set game options.

**Movement**: Arrow keys, or hjklyubn with the rogue-like keyset.

**>**: Go down stairs.

**<**: Go up stairs.

**i**: View inventory.

**q**: Quaff potion.

**r**: Read scroll.

**w**: Wear/wield equipment.

# DESCRIPTION

**tome** (Tales of Middle Earth) is a roguelike dungeon crawling game derived from Angband and set in Tolkien's Middle Earth. Players explore procedurally generated dungeons, fight monsters, collect items, and develop their character through experience and equipment.

Character death is permanent. The game includes character customization with multiple races, classes and skills.

The tome2 repository maintains this 2.x line of the game, which is separate from the later Tales of Maj'Eyal.

# CAVEATS

Permadeath means lost progress on death. Options such as **-u** and **-M** take their value with no space. Available front ends and their sub-options depend on how the game was built.

# HISTORY

**ToME** is a variant of Angband. A later game, Tales of Maj'Eyal (ToME 4), moved to an original fantasy setting, while the Middle Earth version is maintained separately as tome2.

# SEE ALSO

[angband](/man/angband)(6), [nethack](/man/nethack)(6), [crawl](/man/crawl)(6), [rogue](/man/rogue)(6), [moria](/man/moria)(6)

# RESOURCES

```[Source code](https://github.com/tome2/tome2)```

<!-- verified: 2026-11-09 -->
