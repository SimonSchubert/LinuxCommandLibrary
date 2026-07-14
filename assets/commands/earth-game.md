# TAGLINE

offline CLI for turning life goals into quests

# TLDR

**Initialize** local storage

```earth init```

Edit **character** values and purpose

```earth character edit```

**Add** and **start** a quest

```earth quest add
earth quest list
earth quest start [1]```

Show **today's** focus (current quest, next action, open loops)

```earth today```

**Close** open loops and **review**

```earth loop add --text "[task]"
earth review
earth export [path.json]```

Start the **local web UI** (loopback only)

```earth web```

# SYNOPSIS

**earth** _command_ [_options_]

**earth-game** _command_ [_options_]

# DESCRIPTION

**earth-game** (invoked as **earth** or **earth-game** after install) is a private, offline personal quest tracker. It uses only the Python standard library and local SQLite—no accounts, outbound network, scoring, or AI advice.

You maintain a character profile (values, strengths, purpose), quests with a single current focus and next action, open loops to close, and periodic reviews. Data defaults to **${XDG_DATA_HOME:-$HOME/.local/share}/earth-game/earth.db**, overridable with **EARTH_GAME_DB**. **earth web** serves the same database on **127.0.0.1** only.

# PARAMETERS

**init**
> Create local storage without overwriting an existing database

**character** **show**|**edit**
> View or edit personal profile fields

**quest** **add**|**list**|**start**|**done**|**drop**
> Manage quests; only one quest is current

**loop** **add**|**list**|**close**
> Capture and resolve open loops

**today**
> Summary of current quest, next action, and review status

**review**
> Record short reflections (**--update-quest** can set the next action)

**export** [_path_]
> Export all data as JSON (never overwrites existing files)

**web**
> Local browser UI (**--port**, **--no-open**)

# CONFIGURATION

Set **EARTH_GAME_DB** to point at another SQLite file. On Arch Linux the package may be installed from the AUR as **earth-game**.

# SEE ALSO

[taskwarrior](/man/task)(1)

# RESOURCES

```[Source code](https://github.com/skorotkiewicz/earth-game)```

<!-- verified: 2026-07-14 -->
