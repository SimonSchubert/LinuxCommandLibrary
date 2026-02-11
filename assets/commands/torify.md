# TAGLINE

Route application traffic through Tor

# TLDR

**Route** traffic via Tor

```torify [command]```

**Toggle** Tor in shell

```torify [on|off]```

Spawn Tor-enabled **shell**

```torify --shell```

**Check** if Tor is enabled

```torify show```

Use **config** file

```torify -c [config-file] [command]```

Use specific **proxy**

```torify -P [proxy] [command]```

# SYNOPSIS

**torify** [_OPTIONS_] [_COMMAND_ [_ARGS_...]]

# PARAMETERS

**--shell**
> Spawn a new Tor-enabled shell

**on|off**
> Toggle Tor routing in current shell

**show**
> Check if current shell is Tor-enabled

**-c** _FILE_
> Use specified Tor configuration file

**-P** _PROXY_
> Use specified SOCKS proxy

# DESCRIPTION

**torify** routes network traffic from applications through the Tor anonymity network. It wraps commands to redirect their network connections through Tor's SOCKS proxy.

Note: This command has been deprecated and is now a backwards-compatible wrapper for torsocks. New scripts should use torsocks directly.

# CAVEATS

Deprecated in favor of torsocks. Requires running Tor daemon. DNS leaks possible with some applications. Not all protocols work through Tor.

# HISTORY

**torify** was the original tool for routing application traffic through Tor. It has been superseded by **torsocks** which provides better functionality and security.

# SEE ALSO

[torsocks](/man/torsocks)(1), [tor](/man/tor)(1)
