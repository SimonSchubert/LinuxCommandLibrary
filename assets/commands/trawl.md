# TAGLINE

Network connection viewer and monitor

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

**trawl** is a network connection viewer that displays information about active TCP connections on a system. It shows details including local and remote addresses, connection state, and the processes associated with each connection.

The watch mode provides continuous updates, refreshing the connection list at regular intervals for real-time monitoring. Connections can be filtered by process ID to focus on a specific application's network activity, and the listening-only mode shows sockets waiting for incoming connections.

Output is designed to be clean and readable, with options for numeric display to avoid DNS resolution delays.

# CAVEATS

Root may be needed. Platform specific. Network tool.

# HISTORY

**trawl** is a network connection viewer providing information about active TCP connections.

# SEE ALSO

[ss](/man/ss)(1), [netstat](/man/netstat)(1), [lsof](/man/lsof)(1)
