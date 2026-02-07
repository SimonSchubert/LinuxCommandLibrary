# TAGLINE

networked aerial combat flight simulator

# TLDR

**Start** the aerial combat game

```acm```

Connect to a **server** for multiplayer

```acm -server [hostname]```

Host a **multiplayer game** as server

```acm -host```

Set **callsign** for multiplayer

```acm -name [callsign]```

# SYNOPSIS

**acm** [_-server host_] [_-host_] [_-name callsign_] [_options_]

# DESCRIPTION

**acm** (Aerial Combat Multiplayer) is a flight combat simulator that allows networked dogfighting between players. The game simulates aerial combat with various aircraft types, featuring realistic flight physics and weapons systems.

The game can be played in single-player mode against AI opponents or in multiplayer mode across a network. Players control jet aircraft, engaging in air-to-air combat with guns and missiles.

# PARAMETERS

**-server** _host_
> Connect to specified multiplayer server

**-host**
> Run as a multiplayer server

**-name** _callsign_
> Set your pilot callsign

**-plane** _type_
> Select aircraft type

**-team** _n_
> Join specified team number

**-geometry** _WxH_
> Set window geometry

# CAVEATS

Requires X Window System for display. Network play requires proper firewall configuration for UDP traffic. Performance depends on graphics hardware and network latency for multiplayer games.

# HISTORY

**acm** was developed in the early **1990s** as one of the first networked multiplayer combat flight simulators for Unix/X11 systems. It demonstrated the potential of networked gaming on Unix workstations during an era when such games were primarily found on dedicated gaming platforms.

# SEE ALSO

[flightgear](/man/flightgear)(1), [xpilot](/man/xpilot)(1)
