# TLDR

**Show network connections**

```trawl```

**Show all connections**

```trawl -a```

**Filter by process**

```trawl -p [pid]```

**Show listening only**

```trawl -l```

**Watch mode**

```trawl -w```

# SYNOPSIS

**trawl** [_-a_] [_-l_] [_-p pid_] [_-w_] [_options_]

# PARAMETERS

**-a**
> All connections.

**-l**
> Listening only.

**-p** _PID_
> Filter by process.

**-w**
> Watch mode.

**-n**
> Numeric output.

**--help**
> Show help.

# DESCRIPTION

**trawl** shows network connections. It's a network monitoring tool.

Connection display. Active sockets.

Process association. What's connecting.

Watch mode. Continuous updates.

Clean output. Easy to read.

# CAVEATS

Root may be needed. Platform specific. Network tool.

# HISTORY

**trawl** is a network connection viewer providing information about active TCP connections.

# SEE ALSO

[ss](/man/ss)(1), [netstat](/man/netstat)(1), [lsof](/man/lsof)(1)
