# TAGLINE

TLS-terminating proxy for Cockpit web service

# TLDR

Serve HTTP requests on a **specific port**

```cockpit-tls --port [port]```

Display **help**

```cockpit-tls --help```

# SYNOPSIS

**cockpit-tls** [_options_]

# DESCRIPTION

**cockpit-tls** is a TLS-terminating HTTP proxy that handles HTTPS connections for the Cockpit web-based server management interface. It accepts encrypted connections from clients, terminates the TLS session, and forwards the decrypted HTTP requests to cockpit-ws for processing.

By default, it listens on port 9090 and uses TLS certificates from **/etc/cockpit/ws-certs.d/**. The process is designed to run with minimal privileges, handling only the cryptographic layer while delegating all application logic to cockpit-ws.

This component is typically managed by systemd via the **cockpit.socket** unit and is not usually invoked directly. It replaced the built-in TLS handling that was previously part of cockpit-ws, following a security-oriented separation of concerns.

# PARAMETERS

**--port** _port_
> Listen on specified port instead of 9090

**--help**
> Display help information

# CONFIGURATION

**/etc/cockpit/ws-certs.d/**
> Directory containing TLS certificate and key files used for HTTPS connections.

**/etc/cockpit/cockpit.conf**
> Main Cockpit configuration file controlling web service behavior, origins, and login settings.

# CAVEATS

Part of the Cockpit suite. Requires valid TLS certificates. Typically managed by systemd rather than run directly.

# SEE ALSO

[cockpit-ws](/man/cockpit-ws)(8), [cockpit-bridge](/man/cockpit-bridge)(1)
