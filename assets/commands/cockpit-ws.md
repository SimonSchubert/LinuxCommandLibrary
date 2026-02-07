# TAGLINE

Cockpit web service for server administration

# TLDR

Start with **SSH authentication** enabled

```cockpit-ws --local-ssh```

Start HTTP server on a **specific port**

```cockpit-ws --port [port]```

**Bind** to a specific IP address

```cockpit-ws --address [ip_address]```

Start **without TLS**

```cockpit-ws --no-tls```

# SYNOPSIS

**cockpit-ws** [_options_]

# DESCRIPTION

**cockpit-ws** is the Cockpit web service that communicates between the browser application and various configuration tools like cockpit-bridge. It serves the web interface and handles authentication.

By default, it binds to 0.0.0.0 and requires TLS.

# PARAMETERS

**--local-ssh**
> Enable SSH authentication at 127.0.0.1:22

**--port** _port_
> Listen on specified port

**--address** _address_
> Bind to specific IP address (default: 0.0.0.0)

**--no-tls**
> Run without TLS encryption

**--help**
> Display help information

# CAVEATS

Part of the Cockpit suite. Running without TLS is insecure and should only be used behind a reverse proxy. Typically managed by systemd.

# HISTORY

**Cockpit** was developed by Red Hat as a web-based server administration interface. It provides a modern alternative to traditional command-line administration.

# SEE ALSO

[cockpit-bridge](/man/cockpit-bridge)(1), [cockpit-tls](/man/cockpit-tls)(8)
