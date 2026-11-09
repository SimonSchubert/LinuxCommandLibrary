# TAGLINE

networked aerial combat flight simulator

# TLDR

**Start** the aerial combat game

```acm```

Fly a specific **aircraft**

```acm -plane [F-16]```

Join a **network game** on the LAN with a unique site ID (GNU ACM)

```acm -dis-site [1] -team [1]```

Set the **window size**

```acm -geometry [800x600]```

Limit the **frame rate**

```acm -frame-rate [30]```

# SYNOPSIS

**acm** [_options_]

# DESCRIPTION

**acm** is a flight simulator and distributed air combat simulator for the X Window System that allows networked dogfighting between players. The game simulates aerial combat with various aircraft types, featuring realistic flight physics and weapons systems.

The game can be played alone, with target drones, or in multiplayer mode across a network using the DIS protocol over UDP: broadcast on a LAN, or through a relay server on a WAN. Players control jet aircraft, engaging in air-to-air combat with radar, heat-seeking missiles and cannon.

# PARAMETERS

**-plane** _model_
> Select aircraft type, for example F-16, MiG-29 or C-172. An invalid name lists the available models.

**-team** _n_
> Select a team; players on the same team start at the same point (GNU ACM)

**-dis-site** _id_
> DIS site ID, which must be unique among the players

**-dis-exercise** _id_
> DIS exercise number, shared by all participants (1-255)

**-geometry** _WxH_
> Set window geometry

**-frame-rate** _n_
> Limit the displayed frame rate

**-init** _file_
> Read additional command-line options from a file

**-version**
> Display the program version and exit

# CAVEATS

Requires X Window System for display. Network play requires proper firewall configuration for UDP traffic (typically port 3000). Option sets differ between GNU ACM and the 6.0 fork packaged by Debian, and **acm** releases before 5.0 used a separate **acms** server instead of DIS. Performance depends on graphics hardware and network latency for multiplayer games.

# HISTORY

**acm** was developed by **Riley Rainey** in the early **1990s** as one of the first networked multiplayer combat flight simulators for Unix/X11 systems. It demonstrated the potential of networked gaming on Unix workstations during an era when such games were primarily found on dedicated gaming platforms.

# SEE ALSO

[xpilot](/man/xpilot)(1)

# RESOURCES

```[Source code](https://savannah.gnu.org/projects/acm)```

```[Homepage](https://www.gnu.org/software/acm/)```

```[Documentation](https://www.gnu.org/software/acm/manual/acm.html)```

<!-- verified: 2026-11-09 -->
