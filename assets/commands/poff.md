# TLDR

**Disconnect PPP connection**

```poff```

**Disconnect specific provider**

```poff [provider]```

**Disconnect all connections**

```poff -a```

# SYNOPSIS

**poff** [_options_] [_provider_]

# PARAMETERS

_PROVIDER_
> PPP provider name.

**-a**, **--all**
> Disconnect all connections.

**-r**, **--reconnect**
> Reconnect after disconnect.

# DESCRIPTION

**poff** terminates PPP connections. Complementary to pon.

The tool disconnects dial-up. Manages PPP sessions.

poff stops PPP.

# CAVEATS

PPP-specific. Paired with pon command.

# HISTORY

poff was created for **PPP connection** termination on Linux systems.

# SEE ALSO

[pon](/man/pon)(1), [pppd](/man/pppd)(8), [pppconfig](/man/pppconfig)(8)

