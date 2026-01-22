# TLDR

Serve HTTP requests on a **specific port**

```cockpit-tls --port [port]```

Display **help**

```cockpit-tls --help```

# SYNOPSIS

**cockpit-tls** [_options_]

# DESCRIPTION

**cockpit-tls** is a TLS-terminating HTTP proxy that encrypts traffic between clients and cockpit-ws. It handles HTTPS connections and forwards decrypted requests to the Cockpit web service.

By default, it listens on port 9090.

# PARAMETERS

**--port** _port_
> Listen on specified port instead of 9090

**--help**
> Display help information

# CAVEATS

Part of the Cockpit suite. Requires valid TLS certificates. Typically managed by systemd rather than run directly.

# SEE ALSO

[cockpit-ws](/man/cockpit-ws)(8), [cockpit-bridge](/man/cockpit-bridge)(1)
