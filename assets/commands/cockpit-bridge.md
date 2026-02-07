# TAGLINE

Cockpit web service message relay

# TLDR

**List** all cockpit packages

```cockpit-bridge --packages```

Display **help**

```cockpit-bridge --help```

# SYNOPSIS

**cockpit-bridge** [_options_]

# DESCRIPTION

**cockpit-bridge** relays messages and commands between the Cockpit web front end and server-side system configuration tools. It serves as the communication layer that enables the browser-based interface to interact with system services like systemd, NetworkManager, and storage management.

The bridge runs in the user's session and translates JSON-based Cockpit protocol messages into D-Bus calls, file operations, and process management actions. It enforces the permissions of the logged-in user, ensuring that the web interface cannot perform actions beyond what the user is authorized to do.

This process is typically started automatically by cockpit-ws and is not intended to be run directly by users. The **--packages** option is useful for debugging to list all installed Cockpit UI packages.

# PARAMETERS

**--packages**
> List all available Cockpit packages

**--help**
> Display help information

# CONFIGURATION

**/etc/cockpit/cockpit.conf**
> Main Cockpit configuration file controlling bridge behavior, allowed origins, and authentication settings.

# CAVEATS

Part of the Cockpit suite. Normally invoked automatically by cockpit-ws rather than directly by users. Requires proper Cockpit installation.

# SEE ALSO

[cockpit-ws](/man/cockpit-ws)(8), [cockpit-tls](/man/cockpit-tls)(8)
