# TAGLINE

Side-view block world in the terminal, solo or with other players

# TLDR

**Play** a solo world

```termcraft```

**Lantern Run**, the scripted trial

```termcraft trial```

**Host** a game on every interface

```termcraft host```

**Join** a server on this machine

```termcraft client [127.0.0.1:25565]```

**List** saved worlds

```termcraft world list```

**Play** one saved world

```termcraft world play [harbor]```

# SYNOPSIS

**termcraft** [_command_] [_arguments_]

# PREVIEW

```
   *
 ######
 #.@.#
 ######
```

# DESCRIPTION

**termcraft** is an unofficial terminal fan game in the style of Minecraft. With no arguments it creates a save directory and starts a solo world. **trial** runs Lantern Run (traverse, fight, rebuild). **host** listens on every interface. **server** listens on loopback unless you pass an address. **client** (alias **connect**) joins a server. **join** reaches a host over SSH, then the game port.

**director schema** prints the game-master schema. **mcp** speaks the Model Context Protocol on standard input and output, and **mcp config** prints a client config for this binary. Help lists those commands, and turns on in-game game-master controls, when this variable is set:

```
TERMCRAFT_EXPERIMENTAL_GAME_MASTER=1 termcraft --help
```

# COMMANDS

**trial** [_ID_]
> Play Lantern Run. The default id is **lantern-run**. **trial create** [_ID_] writes that trial and does not launch it.

**host** [_ADDRESS_] [**--player** _PROFILE_]
> Listen for players. The default address is **0.0.0.0:25565** and the default profile is **host**.

**server** [_ADDRESS_]
> Run a headless server. The default address is **127.0.0.1:25565**.

**client** [_ADDRESS_] [**--player** _PROFILE_]
> Connect to a server. Alias **connect**. The default address is **127.0.0.1:25565** and the default profile is **player**.

**join** _USER@HOST_ [**--player** _PROFILE_] [**--ssh-port** _PORT_] [**--game-port** _PORT_]
> Open an SSH session to the host, then attach to the game. The default profile is **player**, the SSH port is **22**, and the game port is **25565**.

**world list**
> Print saved worlds.

**world play** _ID_
> Play a saved world.

**world serve** _ID_ [_ADDRESS_]
> Serve a saved world. The default address is **127.0.0.1:25565**.

**world create** _ID_ _RECIPE.json_ [_PROMPT_]
> Build a world from a recipe file (at most 256 KiB) and an optional prompt.

**world generate** _ID_ _PROMPT_ [**--generator** _PROGRAM_]
> Ask an external generator to build a world. The program is **--generator** or the environment variable below, and it must be a trusted executable.

```
TERMCRAFT_WORLD_GENERATOR=/usr/local/bin/generator termcraft world generate harbor "a coastal village"
```

**world schema**
> Print the world schema.

**director schema**
> Print the game-master schema and an example.

**mcp**
> Serve the Model Context Protocol on standard input and output.

**mcp config** [**--format** _json_|_toml_]
> Print an MCP client snippet that runs this binary with argument **mcp**. The default format is **json**.

**-h**, **--help**, **help**
> Print help. **-V** and **--version** print the version.

# CONTROLS

**A** / **D**
> Walk. Double-tap and hold to sprint.

**Space**
> Jump.

**E**
> Inventory and crafting.

**V** / **Shift+V**
> Drop one item, or the whole stack.

**T**
> Player chat in co-op, or solo commands. **Enter** sends. **Esc** closes the line.

**+** / **-**
> Zoom.

**F4**
> Cycle views.

**O**
> Settings.

**Q** / **Esc**
> Save and quit.

# CAVEATS

This is a fan project, unaffiliated with Minecraft. **host** binds **0.0.0.0:25565** unless you pass another address. **server** and **world serve** bind **127.0.0.1:25565** unless you pass another address. **world generate** runs whatever program you name, so point it only at a generator you trust. **mcp** waits on standard input; solo and hosted play do not start it.

# HISTORY

**termcraft** is written in Rust by pagel-s. It is licensed under AGPL-3.0-only.

# INSTALL

```aur: yay -S termcraft```

<!-- packages: 2026-10-27 -->

# SEE ALSO

[vibeworld](/man/vibeworld)(1), [nethack](/man/nethack)(1), [vitetris](/man/vitetris)(1)

# RESOURCES

```[Source code](https://github.com/pagel-s/termcraft)```

```[Homepage](https://pagel-s.github.io/termcraft/)```

<!-- verified: 2026-10-27 -->
