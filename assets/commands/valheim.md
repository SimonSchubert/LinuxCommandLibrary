# TAGLINE

Dedicated Valheim game server

# TLDR

**Start** the server

```[path/to]/start_server.sh```

**Stop** server gracefully

```<Ctrl c>```

Run the **server binary** with explicit settings

```./valheim_server.x86_64 -name "[name]" -port 2456 -world "[world]" -password "[secret]" -crossplay```

Start with **Docker** script

```[path/to/docker_start_server.sh] [path/to/start_server.sh]```

# SYNOPSIS

**./start_server.sh**

# PARAMETERS

Set in the server launch line inside **start_server.sh**.

**-name** _NAME_
> Server name shown in the server list.

**-port** _PORT_
> Port to use; Valheim also uses port+1. Default ports are 2456-2457.

**-world** _WORLD_
> Create a world with this name, or load an existing one.

**-password** _PASSWORD_
> Server password.

**-savedir** _PATH_
> Override the default path for worlds and permission files.

**-public** _0|1_
> List the server in the browser (1, default) or hide it for joining by IP (0).

**-logFile** _PATH_
> Location of the log file.

**-saveinterval** _SECONDS_
> Seconds between world saves. Default 1800.

**-backups** _N_
> Number of automatic backups to keep.

**-backupshort** _SECONDS_
> Interval before the first automatic backup. Default 7200.

**-backuplong** _SECONDS_
> Interval between later backups. Default 43200.

**-crossplay**
> Use the PlayFab backend so players on any platform can join.

**-instanceid** _ID_
> Unique value per server when hosting several on the same port and MAC address.

**-preset** _PRESET_
> World modifier preset: Normal, Casual, Easy, Hard, Hardcore, Immersive or Hammer.

**-modifier** _NAME_ _VALUE_
> Set one world modifier value. Set it after any preset.

**-setkey** _KEY_
> Enable a world modifier: nobuildcost, playerevents, passivemobs or nomap.

# DESCRIPTION

**Valheim** dedicated server creates and runs a headless Valheim game server. Players can connect to the server for multiplayer survival gameplay.

Server configuration is done by editing a copy of the start_server.sh script, where you can set the server name, world name, password, and port.

# CAVEATS

The server files are installed through Steam (Tools > Valheim Dedicated Server). Server configuration requires editing the startup script. With the Steam backend, ports 2456-2457 must be forwarded on your router; the Crossplay backend does not need port forwarding. Without **-crossplay**, only Steam users can join. **-preset** overwrites other modifiers.

# HISTORY

**Valheim** is a survival and exploration game developed by **Iron Gate AB**, released in early access in **2021**. The dedicated server allows hosting persistent worlds.

# SEE ALSO

[steamcmd](/man/steamcmd)(1), [screen](/man/screen)(1), [tmux](/man/tmux)(1)

# RESOURCES

```[Homepage](https://www.valheim.com/)```

```[Documentation](https://www.valheim.com/support/a-guide-to-dedicated-servers/)```

<!-- verified: 2026-11-09 -->
