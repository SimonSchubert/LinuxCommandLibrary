# TAGLINE

BIND name daemon controller

# TLDR

**Reload BIND configuration**

```ndc reload```

**Show BIND status**

```ndc status```

**Stop BIND server**

```ndc stop```

**Start BIND server**

```ndc start```

**Flush cache**

```ndc flush```

**Restart BIND**

```ndc restart```

# SYNOPSIS

**ndc** [_command_]

# PARAMETERS

_COMMAND_
> Control command.

**reload**
> Reload configuration.

**status**
> Show server status.

**stop**
> Stop server.

**start**
> Start server.

**flush**
> Flush DNS cache.

**restart**
> Restart server.

**--help**
> Display help information.

# DESCRIPTION

**ndc** is the BIND name daemon controller. It manages the BIND DNS server.

The tool sends commands to named. Legacy tool, replaced by rndc.

# CAVEATS

Legacy tool. Use rndc instead. Requires running named.

# HISTORY

ndc was the original **BIND** control utility, now deprecated in favor of rndc.

# SEE ALSO

[rndc](/man/rndc)(1), [named](/man/named)(1), [bind](/man/bind)(1)

