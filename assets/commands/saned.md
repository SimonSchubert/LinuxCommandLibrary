# TLDR

**Run saned in standalone daemon mode**

```saned -a```

**Run in debug mode** waiting for connections

```saned -d```

**Run with verbose debugging**

```saned -d128```

**Run in debug mode** with SANE_DEBUG output

```saned -s```

**Specify a custom data port range**

```saned -a -b```

# SYNOPSIS

**saned** [_-a_] [_-d [n]_] [_-s [n]_] [_-b_] [_-u_] [_-e_]

# PARAMETERS

**-a**
> Run in standalone daemon mode, detached from console

**-d** [_n_]
> Debug mode; wait for connections explicitly. Optional number sets verbosity (higher = more verbose)

**-s** [_n_]
> Debug mode with SANE_DEBUG output; optional verbosity level

**-b**
> Negotiate a data port range with the client

**-u**
> Run as user after binding to port

**-e**
> Exit after first client disconnects (debug mode only)

# DESCRIPTION

**saned** is the SANE network daemon that allows remote clients to access locally-connected scanners. It listens on TCP port 6566 for scanning requests, communicates with local SANE backends, and returns scan data to clients.

The daemon can run standalone with **-a** or be managed by inetd/xinetd. Access control is configured in **/etc/sane.d/saned.conf**, which lists allowed hostnames, IP addresses, or CIDR subnets. Connections from localhost are always permitted.

Clients configure the server address in their **/etc/sane.d/net.conf** file to access remote scanners transparently through the network backend.

# CAVEATS

saned is not designed for exposure to untrusted networks. Always restrict access via saned.conf and firewall rules. Using a single **+** in the access list allows any host to connect and poses a security risk. Firewall configuration may require specifying a data port range for the scanning data connection.

# HISTORY

saned is part of the **SANE** (Scanner Access Now Easy) project, which began in **1996** to provide standardized scanner access on Unix systems. The network daemon enables scanner sharing across local networks without proprietary protocols.

# SEE ALSO

[scanimage](/man/scanimage)(1), [sane-find-scanner](/man/sane-find-scanner)(1), [xsane](/man/xsane)(1), [sane-net](/man/sane-net)(5)
