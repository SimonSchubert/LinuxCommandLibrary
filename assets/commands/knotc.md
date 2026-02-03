# TLDR

**Check server status**

```knotc status```

**Reload server configuration**

```knotc reload```

**Stop DNS server**

```knotc stop```

**Force zone transfer**

```knotc zone-retransfer [zone]```

**Sign zone with DNSSEC**

```knotc zone-sign [zone]```

**Flush zone to file**

```knotc zone-flush [zone]```

# SYNOPSIS

**knotc** [_options_] _action_ [_args_...]

# PARAMETERS

**status**
> Check if server is running.

**reload**
> Reload configuration and zones.

**stop**
> Stop the server.

**zone-retransfer** _zone_
> Force zone transfer from master.

**zone-sign** _zone_
> Trigger DNSSEC re-signing.

**zone-flush** _zone_
> Flush zone journal to file.

**-c** _file_
> Configuration file path.

**-s** _path_
> Control socket path.

**-t** _seconds_
> Control timeout.

# DESCRIPTION

**knotc** is the control utility for Knot DNS server. It communicates with the running knotd daemon through a control socket to manage zones, check status, and trigger operations. Supports interactive mode with command completion.

# SEE ALSO

[knotd](/man/knotd)(1), [kdig](/man/kdig)(1)

