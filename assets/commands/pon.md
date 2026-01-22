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

**pon** initiates PPP connections. Starts dial-up networking.

The tool connects via modem. Uses provider configurations.

pon starts PPP.

# CAVEATS

PPP-specific. Paired with poff command. Legacy dial-up.

# HISTORY

pon was created for **PPP connection** initiation on Linux systems.

# SEE ALSO

[poff](/man/poff)(1), [pppd](/man/pppd)(8), [pppconfig](/man/pppconfig)(8)

