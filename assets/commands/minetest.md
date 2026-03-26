# TAGLINE

open-source voxel game engine and sandbox game similar to Minecraft

# TLDR

**Start Minetest client**

```minetest```

**Connect to server**

```minetest --address [server.example.com] --port [30000]```

**Start with specific game**

```minetest --gameid [minetest_game]```

**Run in terminal mode**

```minetest --terminal```

# SYNOPSIS

**minetest** [_options_]

# PARAMETERS

**--address** _host_
> Server address to connect to.

**--port** _port_
> Server port (default 30000).

**--name** _name_
> Player name.

**--password** _pass_
> Player password.

**--gameid** _id_
> Game ID to use.

**--world** _path_
> World directory.

**--config** _file_
> Configuration file.

**--terminal**
> Run in terminal mode.

**--go**
> Disable main menu and connect directly to the specified server.

**--server**
> Run as a dedicated server (headless).

**--map-dir** _path_
> World map directory when running as server.

**--logfile** _file_
> Log to file (in addition to console).

**--run-unittests**
> Run built-in unit tests and exit.

**--videomodes**
> Show available video modes.

**--speedtests**
> Run speed tests and exit.

**--info**
> Print info and exit.

# DESCRIPTION

**minetest** is an open-source voxel game engine and sandbox game similar to Minecraft. It supports both client and dedicated server modes, multiplayer, modding, and custom content. The engine is highly extensible through Lua scripting and content packages.

Games, mods, and texture packs are managed through the built-in content browser or placed in **~/.minetest/** (Linux), **~/Library/Application Support/minetest/** (macOS). The default game is **Minetest Game**, but many community games exist.

Configuration is stored in **minetest.conf** in the user data directory.

# CAVEATS

The **--go** flag requires **--address** to be set. Running as server with **--server** requires a world directory (defaults to the first world found). The client requires OpenGL support.

# SEE ALSO

[minetestserver](/man/minetestserver)(1)

