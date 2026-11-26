# TAGLINE

SCP: Secret Laboratory dedicated server

# TLDR

Start the **headless** server

```[path/to]/LocalAdmin```

# SYNOPSIS

**LocalAdmin** [_port_]

# DESCRIPTION

**LocalAdmin** is the dedicated-server program shipped with SCP: Secret Laboratory. It runs the game server without the player client and prints an administration console on the terminal. The binary sits in the server install, not on the default PATH.

Northwood distributes the server files through SteamCMD. After the files are installed, start **LocalAdmin** from that directory. With no port argument it asks which port to bind. The console then accepts the server's administration commands.

# CAVEATS

This page is the game server, not the OpenSSH **scp** file-copy command. **LocalAdmin** must be able to listen on the chosen port before players outside the machine can connect. The server build has to match the game version players are running.

# SEE ALSO

[steamcmd](/man/steamcmd)(1)

# RESOURCES

```[Homepage](https://scpslgame.com)```

```[Documentation](https://steamcommunity.com/sharedfiles/filedetails/?id=1940772492)```

<!-- verified: 2026-11-26 -->
