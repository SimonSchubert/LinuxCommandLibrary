# TAGLINE

Run PPPoE access concentrator server

# TLDR

**Start PPPoE server**

```pppoe-server -I [eth0]```

**Specify local IP and starting remote IP** (allocate up to N consecutive addresses)

```pppoe-server -I [eth0] -L [10.0.0.1] -R [10.0.0.100] -N [100]```

**Run with specific service name**

```pppoe-server -I [eth0] -S [myservice]```

# SYNOPSIS

**pppoe-server** [_options_]

# PARAMETERS

**-I** _INTERFACE_
> Ethernet interface to listen on. Repeatable to serve multiple interfaces.

**-L** _IP_
> Local (server-side) IP address (default **10.0.0.1**).

**-R** _IP_
> Remote IP pool starting address (default **10.67.15.1**); each session gets the next address.

**-p** _FILE_
> Read the remote IP pool from a text file (one address per line).

**-S** _NAME_
> Advertised service name. Repeatable to advertise multiple services.

**-C** _AC_NAME_
> Access-concentrator name announced in PADO replies (default: hostname).

**-N** _NUM_
> Maximum concurrent sessions (default **64**).

**-x** _N_
> Limit concurrent sessions from a single peer MAC.

**-O** _FILE_
> Path to a **pppd** options file used for every spawned session.

**-T** _SECONDS_
> Idle timeout passed through to **pppoe**.

**-m** _MSS_
> Clamp the negotiated TCP MSS to _MSS_.

**-D**
> Delegate IP address assignment to **pppd** (do not allocate from the local pool).

**-k**
> Use the in-kernel PPPoE driver (Linux 2.4+).

**-F**
> Run in the foreground rather than daemonising.

**-X** _PIDFILE_
> Write the daemon PID to _PIDFILE_ with locking.

**-q** _PATH_
> Path to the **pppd** binary.

**-Q** _PATH_
> Path to the user-space **pppoe** binary.

**-u**
> Invoke **pppd** with the **unit** option for predictable interface naming.

**-i**
> Silently drop PADI broadcasts when no session slots remain.

**-r**
> Randomise PPPoE session IDs.

**-h**
> Print usage and exit.

# DESCRIPTION

**pppoe-server** implements a PPPoE access concentrator that accepts incoming PPPoE client (PADI/PADR) frames on a specified Ethernet interface. For each accepted session it spawns a **pppd** instance plumbed to the user-space **pppoe** plugin (or the in-kernel driver with **-k**) and assigns a remote IP from the local pool unless **-D** delegates that to **pppd**.

Typical deployments run **pppoe-server** as part of a small lab DSL/PPPoE setup; ISPs more commonly use it as the front end to a RADIUS-backed AAA stack via **pppd**'s **radius** plugin.

# CAVEATS

The Ethernet interface used by **pppoe-server** typically must be brought up without an IP, since PPPoE works at layer 2. Combine with a RADIUS plugin in **pppd** for real authentication; the built-in pool assignment is meant for simple/lab use. The default session cap (**-N 64**) is the absolute maximum per interface for **rp-pppoe** unless raised.

# HISTORY

**pppoe-server** is part of **rp-pppoe** by **Roaring Penguin Software** (originally written by **Dianne Skoll**), the canonical user-space PPPoE implementation on Linux and \*BSD.

# INSTALL

```apt: sudo apt install pppoe```

```dnf: sudo dnf install rp-pppoe```

```pacman: sudo pacman -S rp-pppoe```

```apk: sudo apk add rp-pppoe```

```zypper: sudo zypper install rp-pppoe```

```nix: nix profile install nixpkgs#rp-pppoe```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-relay](/man/pppoe-relay)(8), [pppd](/man/pppd)(8)

