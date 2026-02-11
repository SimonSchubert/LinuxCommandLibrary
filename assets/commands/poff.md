# TAGLINE

Terminate PPP dial-up connections

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

**poff** terminates PPP (Point-to-Point Protocol) connections established by **pon**. Without arguments, it disconnects the default provider; a provider name can be specified to target a specific connection.

The **-a** flag disconnects all active PPP connections. The **-r** flag reconnects automatically after disconnecting. This is a convenience wrapper around sending signals to the pppd daemon.

# CAVEATS

PPP-specific. Paired with pon command.

# HISTORY

poff was created for **PPP connection** termination on Linux systems.

# SEE ALSO

[pon](/man/pon)(1), [pppd](/man/pppd)(8), [pppconfig](/man/pppconfig)(8)

