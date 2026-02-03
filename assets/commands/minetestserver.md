# TLDR

**Start Minetest server**

```minetestserver```

**Start with specific world**

```minetestserver --world [/path/to/world]```

**Start on specific port**

```minetestserver --port [30000]```

**Start with game ID**

```minetestserver --gameid [minetest_game] --world [/path/to/world]```

# SYNOPSIS

**minetestserver** [_options_]

# PARAMETERS

**--world** _path_
> World directory path.

**--port** _port_
> Server port (default 30000).

**--gameid** _id_
> Game ID to use.

**--config** _file_
> Configuration file.

**--logfile** _file_
> Log output file.

**--terminal**
> Run in terminal mode.

**--migrate** _backend_
> Migrate map data to backend.

# DESCRIPTION

**minetestserver** runs a dedicated Minetest game server. Hosts multiplayer worlds without a graphical client. Supports mods, custom games, and player management.

# SEE ALSO

[minetest](/man/minetest)(1)

