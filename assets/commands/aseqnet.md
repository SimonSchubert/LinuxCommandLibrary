# TAGLINE

ALSA MIDI sequencer over network

# TLDR

**Start** MIDI network server

```aseqnet```

Connect to **remote server**

```aseqnet [hostname]```

Specify **port**

```aseqnet -p [40002] [hostname]```

# SYNOPSIS

**aseqnet** [_-p port_] [_hostname_]

# DESCRIPTION

**aseqnet** transmits ALSA sequencer events over a network connection. It enables MIDI communication between machines, allowing remote MIDI control or distributed music setups.

Running without arguments starts a server; specifying a hostname connects as client.

# PARAMETERS

**hostname**
> Connect to this server (client mode)

**-p** _port_
> Network port (default: 40002)

**-v**, **--verbose**
> Verbose output

# CAVEATS

No encryption; use SSH tunneling for security. Network latency affects MIDI timing. Requires same byte order on both machines (or use -s flag).

# HISTORY

**aseqnet** is part of the ALSA utilities, enabling network MIDI functionality for distributed audio setups.

# SEE ALSO

[aconnect](/man/aconnect)(1), [jack](/man/jack)(1)
