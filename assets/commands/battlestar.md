# TAGLINE

Text-based science fiction adventure game

# TLDR

**Start a new Battlestar game**

```battlestar```

**Restore a saved game from a file**

```battlestar -r [savefile]```

# SYNOPSIS

**battlestar** [_-r_] [_file_]

# PREVIEW

```
You are in the cockpit.
Strewn about are pieces
of broken instrumentation.

> look
```

# DESCRIPTION

**battlestar** is a text adventure game from the BSD games collection. Set aboard a battlestar at the tail end of a fierce space battle, players must explore the wreckage, find essential items, and survive encounters while navigating through various locations including tropical islands.

The game uses a parser-based input system where players type natural language commands to interact with the environment. Navigation uses compass directions (when carrying a compass) or relative directions (right, left, ahead, back).

# PARAMETERS

**-r**
> Restore a previously saved game.

_file_
> Name of saved game file to restore.

# COMMANDS

- **take/drop** - Manage items
- **wear/draw** - Equip items
- **inven** - Display inventory
- **score** - Show current game status
- **save** - Save game
- **!** - Shell escape
- **N/S/E/W** - Compass directions (requires compass)
- **R/L/A/B** - Right, left, ahead, back

# CAVEATS

Text-only interface. Requires understanding of adventure game conventions. Parser can be finicky about phrasing. Part of the bsd-games package, which may not be installed by default.

# HISTORY

**battlestar** was written by **David Riggle** in **1979** as an experiment with the C programming language. It has been part of BSD games distributions since then.

# SEE ALSO

[adventure](/man/adventure)(6), [nethack-console](/man/nethack-console)(6)
