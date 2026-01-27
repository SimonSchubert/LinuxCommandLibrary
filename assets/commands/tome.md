# TLDR

**Start the game**

```tome```

**Start with specific character file**

```tome -u [savefile]```

**Start in graphics mode**

```tome -g```

**Start in text/ASCII mode**

```tome -m```

**Start with specific display size**

```tome -- -geometry [80x50]```

# SYNOPSIS

**tome** [_options_]

# PARAMETERS

**-u** _file_
> Use specific save file.

**-g**
> Force graphics mode.

**-m**
> Force monochrome/ASCII mode.

**-n**
> Start a new character.

**-r**
> Restore from save file.

**-s**
> Show high scores.

**-v**
> Display version.

# CONTROLS

**?**: Display help and key bindings.

**=**: Set game options.

**Movement**: Arrow keys or vi keys (hjklyubn).

**>**: Go down stairs.

**<**: Go up stairs.

**i**: View inventory.

**d**: Drop item.

**e**: Eat food.

**q**: Quaff potion.

**r**: Read scroll.

**w**: Wear/wield equipment.

**Ctrl+S**: Save and exit.

# DESCRIPTION

**tome** (Tales of Middle Earth) is a roguelike dungeon crawling game set in Tolkien's Middle Earth. Players explore procedurally generated dungeons, fight monsters, collect items, and develop their character through experience and equipment.

The game features permadeath, meaning character death is permanent and save files are deleted upon death. It includes extensive character customization with multiple races, classes, and skills. The world includes themed locations from the Middle Earth setting.

ToME descended from Angband and introduced many innovations including overworld travel, multiple dungeons, and expanded skill systems. The interface combines traditional roguelike keyboard commands with optional graphical tiles.

# CAVEATS

Permadeath means lost progress on death. Games can last many hours. Some versions require specific terminal sizes. The learning curve is steep for new roguelike players. Save files are deleted upon character death.

# HISTORY

**ToME** began as PernAngband in 1994, evolving through several name changes before becoming Tales of Middle Earth. It forked from Angband to add story elements and a connected world. The name later changed to Tales of Maj'Eyal (ToME 4) after 2010, moving to an original fantasy setting while the Middle Earth version continued separately. ToME won the ASCII Dreams Roguelike of the Year award multiple times.

# SEE ALSO

[angband](/man/angband)(6), [nethack](/man/nethack)(6), [crawl](/man/crawl)(6), [rogue](/man/rogue)(6), [moria](/man/moria)(6)
