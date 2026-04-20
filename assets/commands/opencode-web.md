# TAGLINE

Start OpenCode with web interface

# TLDR

**Start OpenCode** with web UI on a random local port

```opencode web```

**Bind to all interfaces** on a fixed port (for remote access)

```opencode web --hostname 0.0.0.0 --port [4096]```

**Advertise the service over mDNS/Bonjour**

```opencode web --mdns```

**Enable CORS** for cross-origin browser clients

```opencode web --cors```

**Stream server logs** to the terminal

```opencode web --print-logs --log-level debug```

# SYNOPSIS

**opencode web** [_options_]

# PARAMETERS

**--hostname** _HOST_
> Interface to bind to (default **127.0.0.1**).

**--port** _PORT_
> TCP port (default **0** — pick an ephemeral port).

**--mdns**
> Announce the server on the local network via mDNS.

**--mdns-domain** _DOMAIN_
> Override the mDNS service domain (default **.local**).

**--cors**
> Allow cross-origin requests from browsers.

**--print-logs**
> Print server-side logs to the terminal.

**--log-level** _LEVEL_
> Log verbosity: **trace**, **debug**, **info**, **warn**, **error**.

**-h**, **--help**, **-v**, **--version**
> Display help or version information.

# DESCRIPTION

**opencode web** starts a headless OpenCode server that exposes a web-based interface instead of the terminal TUI. This allows interacting with OpenCode through a browser, which can be useful for remote access, sharing sessions, or when a graphical interface is preferred over the terminal. When **--mdns** is enabled the service is discoverable on the local network without needing to know its IP.

# SEE ALSO

[opencode](/man/opencode)(1), [opencode-session](/man/opencode-session)(1)
