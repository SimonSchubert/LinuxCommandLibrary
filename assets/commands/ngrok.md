# TAGLINE

creates secure tunnels to localhost

# TLDR

**Expose local port**

```ngrok http [8080]```

**Expose with subdomain**

```ngrok http --subdomain=[myapp] [8080]```

**TCP tunnel**

```ngrok tcp [22]```

**Inspect traffic**

```ngrok http [8080] --inspect```

**Start with config**

```ngrok start [tunnel-name]```

**Show authtoken**

```ngrok config add-authtoken [token]```

**TLS tunnel**

```ngrok tls [443]```

# SYNOPSIS

**ngrok** [_command_] [_options_]

# PARAMETERS

_COMMAND_
> ngrok command.

**http** _PORT_
> HTTP tunnel to port.

**tcp** _PORT_
> TCP tunnel.

**tls** _PORT_
> TLS tunnel.

**config** _SUBCOMMAND_
> Configuration commands.

**--subdomain** _NAME_
> Custom subdomain.

**--help**
> Display help information.

# DESCRIPTION

**ngrok** creates secure tunnels to localhost. It exposes local servers to the internet.

The tool provides public URLs. Useful for webhooks, demos, and testing.

# CAVEATS

Free tier has limitations. Account required for features. URLs change on restart.

# HISTORY

ngrok was created by **Alan Shreve** to provide secure tunnels for local development.

# SEE ALSO

[localtunnel](/man/localtunnel)(1), [ssh](/man/ssh)(1), [cloudflared](/man/cloudflared)(1)

