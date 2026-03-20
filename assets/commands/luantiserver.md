# TAGLINE

runs a dedicated Luanti game server

# TLDR

**Start Luanti server**

```luantiserver```

**Start with specific world** and game

```luantiserver --world [/path/to/world] --gameid [minetest_game]```

**Start on specific port**

```luantiserver --port [30000]```

**Start with interactive terminal** and verbose logging

```luantiserver --terminal --verbose```

**Start with custom config** and logfile

```luantiserver --config [/path/to/minetest.conf] --logfile [/path/to/server.log]```

# SYNOPSIS

**luantiserver** [_options_]

# PARAMETERS

**--world** _path_
> World directory path.

**--worldname** _name_
> Set world path by name.

**--port** _port_
> Set network port (UDP). Default is 30000.

**--gameid** _id_ | **list**
> Set game ID to use, or list available games.

**--config** _file_
> Load configuration from specified file.

**--logfile** _file_
> Set logfile path ('' for no logging).

**--terminal**
> Display an interactive terminal over ncurses during execution.

**--info**
> Print more information to console.

**--verbose**
> Print even more information to console.

**--trace**
> Print enormous amounts of information to console.

**--quiet**
> Print only errors to console.

**--migrate** _backend_
> Migrate from current map backend to another (sqlite3, leveldb, postgresql, redis).

**--migrate-players** _backend_
> Migrate from current players backend to another (sqlite3, leveldb, postgresql, files).

**--migrate-auth** _backend_
> Migrate from current auth backend to another (sqlite3, leveldb, files).

**--go**
> Run server without a client directly.

**--help**
> Print allowed options and exit.

**--version**
> Print version information and exit.

# DESCRIPTION

**luantiserver** runs a dedicated Luanti game server. Luanti (formerly Minetest) is an open source voxel game-creation platform. The server hosts multiplayer worlds with full mod support, using UDP on port 30000 by default.

# CAVEATS

Luanti only uses UDP protocol; all other traffic can be safely dropped by a firewall. The --terminal option requires compilation with ncurses support.

# HISTORY

Luanti was originally known as **Minetest** and was renamed in **2024**. It is an open source voxel game engine and platform with an active modding community.

# SEE ALSO

[luanti](/man/luanti)(1), [minetestserver](/man/minetestserver)(1), [minetest](/man/minetest)(1)
