# TAGLINE

RADIUS authentication plugin for PPP daemon

# TLDR

**Start PPP with RADIUS authentication**

```pppd plugin radius.so [options]```

**Configure RADIUS plugin**

```pppd plugin radius.so server [radius_server]```

# SYNOPSIS

**pppd** plugin radius.so [_options_]

# PARAMETERS

**plugin** radius.so
> Load RADIUS plugin.

**server** _HOST_
> RADIUS server address.

**secret** _KEY_
> Shared secret.

# DESCRIPTION

**pppd-radius** is a plugin for the PPP daemon that enables RADIUS (Remote Authentication Dial-In User Service) authentication. Instead of using local credentials files, pppd delegates authentication and accounting to a central RADIUS server.

This is commonly used by ISPs and enterprise networks to centrally manage dial-up, DSL, and VPN user authentication. The plugin communicates with RADIUS servers using a shared secret for secure credential exchange.

# CAVEATS

Requires RADIUS server. Plugin must be installed.

# HISTORY

pppd-radius was created for **RADIUS authentication** integration with PPP.

# SEE ALSO

[pppd](/man/pppd)(8), [radiusd](/man/radiusd)(8)

