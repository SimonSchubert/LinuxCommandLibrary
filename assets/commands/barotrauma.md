# TAGLINE

Run a dedicated multiplayer game server.

# TLDR

**Start** the dedicated server

```[path/to]/DedicatedServer```

# SYNOPSIS

**DedicatedServer**

# DESCRIPTION

**DedicatedServer** runs a headless Barotrauma game server for multiplayer sessions. Barotrauma is a 2D co-op submarine survival game set on Jupiter's moon Europa.

Server configuration is managed through the **serversettings.xml** file located in the game directory. This file controls game settings, player slots, passwords, and other server parameters.

# CONFIGURATION

**serversettings.xml**
> Main server configuration file in the game directory. Controls game settings, player slots, passwords, and server parameters.

**config_player.xml**
> Player-specific configuration in the game directory.

# CAVEATS

Requires the Barotrauma dedicated server files to be installed. Server settings must be configured by editing XML files before starting. Port forwarding may be required for internet-accessible servers.

# SEE ALSO

[steamcmd](/man/steamcmd)(1)
