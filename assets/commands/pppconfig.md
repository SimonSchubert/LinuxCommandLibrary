# TAGLINE

Configure PPP dial-up connections interactively

# TLDR

**Configure PPP connection**

```pppconfig```

**Run text-based setup**

```pppconfig```

# SYNOPSIS

**pppconfig** [_options_]

# PARAMETERS

**--help**
> Display help.

# DESCRIPTION

**pppconfig** is an interactive text-based tool for configuring PPP (Point-to-Point Protocol) dial-up connections on Debian systems. It guides users through setting up modem parameters, phone numbers, authentication credentials, and connection options.

The tool creates provider configuration files in **/etc/ppp/peers/** that can be used with **pon** and **poff** to start and stop connections. It handles both PAP and CHAP authentication methods and can configure multiple ISP profiles.

# CAVEATS

Debian-specific. For dial-up networking.

# HISTORY

pppconfig was created for **Debian** PPP connection configuration.

# SEE ALSO

[pppd](/man/pppd)(8), [pon](/man/pon)(1), [poff](/man/poff)(1)

