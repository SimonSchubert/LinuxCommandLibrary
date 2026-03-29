# TAGLINE

ALSA MIDI sequencer over network

# TLDR

**Start** MIDI network server

```aseqnet```

Connect to **remote server**

```aseqnet [hostname]```

Specify **port**

```aseqnet -p [40002] [hostname]```

Auto-connect **read** port on startup

```aseqnet -s [client:port] [hostname]```

Auto-connect **write** port on startup

```aseqnet -d [client:port] [hostname]```

# SYNOPSIS

**aseqnet** [_options_] [_hostname_]

# DESCRIPTION

**aseqnet** transmits ALSA sequencer events over a network connection. It enables MIDI communication between machines, allowing remote MIDI control or distributed music setups.

Running without arguments starts a server; specifying a hostname connects as client. Ports created by aseqnet can be connected to other sequencer ports via [aconnect](/man/aconnect)(1).

# PARAMETERS

**hostname**
> Connect to this server (client mode)

**-p** _port_
> TCP port number or service name (default: 40002)

**-s** _addr_
> Subscribe to the given address for read automatically (client:port)

**-d** _addr_
> Subscribe to the given address for write automatically (client:port)

**-n** _name_
> Specify the MIDI name of the process

**-v**
> Verbose output

# CAVEATS

No encryption; use SSH tunneling for security. Network latency affects MIDI timing.

# HISTORY

**aseqnet** is part of the ALSA utilities, enabling network MIDI functionality for distributed audio setups.

# SEE ALSO

[aconnect](/man/aconnect)(1), [aseqdump](/man/aseqdump)(1), [aplaymidi](/man/aplaymidi)(1)
