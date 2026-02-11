# TAGLINE

Transparently route traffic through Tor

# TLDR

**Run** command using Tor

```torsocks [command]```

**Toggle** Tor in shell

```. torsocks [on|off]```

Spawn Tor-enabled **shell**

```torsocks --shell```

**Check** if Tor is enabled

```torsocks show```

**Isolate** traffic through different circuit

```torsocks -i [curl https://check.torproject.org/api/ip]```

Connect to specific **proxy**

```torsocks -a [ip_address] -P [port] [command]```

# SYNOPSIS

**torsocks** [_OPTIONS_] [_COMMAND_ [_ARGS_...]]

# PARAMETERS

**--shell**
> Spawn a new Tor-enabled shell

**-i, --isolate**
> Isolate traffic through a different Tor circuit

**-a, --address** _IP_
> Connect to Tor proxy at specified address

**-P, --port** _PORT_
> Connect to Tor proxy on specified port

**show**
> Check if current shell is Tor-enabled

**on|off**
> Toggle Tor routing in current shell

# DESCRIPTION

**torsocks** routes network traffic from applications through the Tor network by intercepting network calls and redirecting them through Tor's SOCKS proxy. By default, it connects to the Tor daemon running at 127.0.0.1:9050.

The tool uses LD_PRELOAD to intercept network system calls, providing transparent Tor routing for applications that don't natively support SOCKS proxies.

# CAVEATS

Requires running Tor daemon. Some applications may leak DNS or use protocols incompatible with Tor. UDP traffic is not supported. Applications using raw sockets bypass torsocks.

# HISTORY

**torsocks** was developed as an improved replacement for **torify**, providing better security and functionality for routing traffic through the Tor anonymity network.

# SEE ALSO

[tor](/man/tor)(1), [torify](/man/torify)(1)
