# TAGLINE

Initiate PPP dial-up connections

# TLDR

**Start PPP connection**

```pon```

**Start specific provider**

```pon [provider]```

**Start with debugging**

```pon [provider] debug```

# SYNOPSIS

**pon** [_provider_] [_options_]

# PARAMETERS

_PROVIDER_
> PPP provider name.

**debug**
> Enable debug output.

# DESCRIPTION

**pon** initiates a PPP (Point-to-Point Protocol) connection using a named provider configuration. Provider configurations are stored in **/etc/ppp/peers/** and define the connection parameters including phone number, authentication, and modem settings.

Without a provider argument, it uses the default provider. The **debug** option enables verbose logging to syslog. Use **poff** to terminate the connection.

# CAVEATS

PPP-specific. Paired with poff command. Legacy dial-up.

# HISTORY

pon was created for **PPP connection** initiation on Linux systems.

# SEE ALSO

[poff](/man/poff)(1), [pppd](/man/pppd)(8), [pppconfig](/man/pppconfig)(8)

