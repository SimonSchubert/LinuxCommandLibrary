# TAGLINE

voxel game engine and sandbox game

# TLDR

**Start the game**

```luanti```

**Start with specific game**

```luanti --game [minetest_game]```

**Start server only**

```luanti --server```

**Connect to server**

```luanti --address [server.example.com] --port [30000]```

**Start with specific world**

```luanti --world [/path/to/world]```

**Set player name**

```luanti --name [playername]```

**Migrate map database**

```luanti --migrate [sqlite3] --world [/path/to/world]```

**Run in terminal** (no graphics)

```luanti --terminal --server```

# SYNOPSIS

**luanti** [_--server_] [_--address addr_] [_--world path_] [_--game name_] [_options_]

# PARAMETERS

**--server**
> Run as dedicated server.

**--address** _ADDR_
> Address to connect to or bind.

**--port** _PORT_
> Network port (default 30000).

**--world** _PATH_
> Path to world directory.

**--worldname** _NAME_
> World name in worlds directory.

**--game**, **--gameid** _ID_
> Game to use.

**--name** _NAME_
> Player name.

**--password** _PASS_
> Password for server.

**--config** _FILE_
> Configuration file.

**--info**
> Print more information.

**--verbose**
> Print even more information.

**--terminal**
> Run in terminal mode (server).

**--migrate** _BACKEND_
> Migrate world to different backend.

**--version**
> Print version.

**--help**
> Show help.

# DESCRIPTION

**Luanti** (formerly Minetest) is a voxel game engine and sandbox game. Players explore, build, and modify procedurally generated worlds made of cubic blocks.

The engine supports modding through Lua scripts. Games are modpacks that define gameplay, blocks, crafting, and creatures. The default Minetest Game provides survival and creative modes.

Multiplayer servers host persistent worlds where players collaborate or compete. Servers can run different games with custom rules and content.

World data stores in SQLite by default, with options for LevelDB or PostgreSQL for larger servers. Map generation uses various algorithms for terrain, caves, and structures.

Content is available through the built-in content browser, including games, mods, and texture packs from the community.

# CAVEATS

Performance depends on hardware and world complexity. Large servers need tuning. Some mods may conflict. The engine was renamed from Minetest to Luanti in 2024.

# HISTORY

**Minetest** was created by **Perttu Ahola** (celeron55) in **2010**, inspired by Minecraft and InfiniMiner. It was designed as an open-source, moddable voxel engine. In **2024**, the project was renamed to **Luanti** to establish its own identity separate from Minecraft.

# SEE ALSO

[luantiserver](/man/luantiserver)(1), [minetestserver](/man/minetestserver)(1)
