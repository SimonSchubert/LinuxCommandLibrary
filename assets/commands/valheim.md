# TAGLINE

Dedicated Valheim game server

# TLDR

**Start** the server

```[path/to]/start_server.sh```

**Stop** server gracefully

```<Ctrl c>```

Start with **Docker** script

```[path/to/docker_start_server.sh] [path/to/start_server.sh]```

# SYNOPSIS

**start_server.sh** [_OPTIONS_]

# DESCRIPTION

**Valheim** dedicated server creates and runs a headless Valheim game server. Players can connect to the server for multiplayer survival gameplay.

Server configuration is done by editing a copy of the start_server.sh script, where you can set the server name, world name, password, and port.

# CAVEATS

Requires a valid Steam account and Valheim dedicated server files. Server configuration requires editing the startup script. Adequate system resources needed for hosting multiple players.

# HISTORY

**Valheim** is a survival and exploration game developed by **Iron Gate AB**, released in early access in **2021**. The dedicated server allows hosting persistent worlds.

# SEE ALSO

[screen](/man/screen)(1), [tmux](/man/tmux)(1)
