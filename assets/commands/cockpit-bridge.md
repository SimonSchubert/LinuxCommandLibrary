# TLDR

**List** all cockpit packages

```cockpit-bridge --packages```

Display **help**

```cockpit-bridge --help```

# SYNOPSIS

**cockpit-bridge** [_options_]

# DESCRIPTION

**cockpit-bridge** relays messages and commands between the Cockpit web front end and server-side configuration tools. It serves as the communication layer that enables the web interface to interact with system services.

This is typically started automatically by cockpit-ws and not run directly by users.

# PARAMETERS

**--packages**
> List all available Cockpit packages

**--help**
> Display help information

# CAVEATS

Part of the Cockpit suite. Normally invoked automatically by cockpit-ws rather than directly by users. Requires proper Cockpit installation.

# SEE ALSO

[cockpit-ws](/man/cockpit-ws)(8), [cockpit-tls](/man/cockpit-tls)(8)
