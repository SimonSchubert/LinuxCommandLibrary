# TAGLINE

server daemon for the hunt game

# TLDR

**Start the hunt server**

```huntd```

**Host a private game on a specific port**

```huntd -p [9999]```

**Run in server mode** (run forever)

```huntd -s```

**Fork into the background** (OpenBSD only, logs via syslog)

```huntd -b```

**Listen on one interface address only** (BSD only)

```huntd -a [192.168.1.10]```

**Override a game setting for this run** (BSD only)

```huntd -D [linger=-1]```

# SYNOPSIS

**huntd** [**-bs**] [**-a** _addr_] [**-D** _var=value_] [**-p** _port_]

# PARAMETERS

**-p** _port_
> Change the UDP port number used to rendezvous with the player process, allowing private games.

**-s**
> Run in server mode (run forever). Similar to running under inetd, but consumes a process table entry when no one is playing, and monitor clients are not disconnected.

**-b**
> Fork into the background. Errors are logged via syslog instead of stderr. OpenBSD only.

**-a** _addr_
> Listen only on a specific interface address (given as an IP address). BSD only.

**-D** _var=value_
> Override a value read from the configuration files. BSD only.

# DESCRIPTION

**huntd** is the back-end daemon of the multi-player **hunt** game. It manages the maze and handles player connections, shots and scoring.

When **hunt** starts, it broadcasts on attached networks to find a game in progress. A **huntd** that hears the request replies with the port number for the player to connect to.

# CONFIGURATION

On BSD systems, game parameters are read from **/etc/hunt.conf**, **$HOME/.hunt.conf** and **./.hunt.conf**, in that order, as lines of the form **var = value**. Examples include **linger**, the seconds to keep a game open with no players (default 90, -1 means forever).

To run from inetd, add a line such as **hunt dgram udp wait nobody /usr/games/huntd HUNT** to **/etc/inetd.conf** and pass no options. Use **/etc/services** to choose a private port.

# CAVEATS

Options differ by system: the Debian and Ubuntu **bsdgames** package only accepts **-s** and **-p**, while **-a**, **-b** and **-D** come from the BSDs. Incoming connections are checked with **hosts_access** using the service name **huntd**.

# HISTORY

**hunt** was written by **Conrad Huang**, **Ken Arnold** and **Greg Couch** at the University of California, San Francisco Computer Graphics Lab.

# SEE ALSO

[hunt](/man/hunt)(6), [bsdgames](/man/bsdgames)(6)

# RESOURCES

```[Source code](https://github.com/openbsd/src/tree/master/games/hunt)```

```[Documentation](https://man.openbsd.org/huntd.6)```

<!-- verified: 2026-11-09 -->
