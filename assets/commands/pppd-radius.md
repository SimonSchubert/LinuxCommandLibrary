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

**pppd-radius** enables RADIUS authentication for PPP. Plugin for pppd.

The tool authenticates via RADIUS servers. Enterprise authentication.

pppd-radius adds RADIUS support.

# CAVEATS

Requires RADIUS server. Plugin must be installed.

# HISTORY

pppd-radius was created for **RADIUS authentication** integration with PPP.

# SEE ALSO

[pppd](/man/pppd)(8), [radiusd](/man/radiusd)(8)

