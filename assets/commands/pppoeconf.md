# TAGLINE

Configure PPPoE on Debian systems

# TLDR

**Configure PPPoE connection**

```pppoeconf```

**Run with specific interface**

```pppoeconf [eth0]```

# SYNOPSIS

**pppoeconf** [_interface_]

# PARAMETERS

_INTERFACE_
> Network interface.

# DESCRIPTION

**pppoeconf** is a Debian-specific interactive tool that automatically detects and configures PPPoE DSL connections. It scans network interfaces for PPPoE access concentrators, prompts for authentication credentials, and creates the necessary system configuration files.

The wizard handles the complete setup including interface selection, credential storage, DNS configuration, and integration with the system's networking scripts so the connection starts automatically at boot.

# CAVEATS

Debian-specific. Requires root.

# HISTORY

pppoeconf was created for **Debian** PPPoE configuration.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-setup](/man/pppoe-setup)(8), [pppd](/man/pppd)(8)

