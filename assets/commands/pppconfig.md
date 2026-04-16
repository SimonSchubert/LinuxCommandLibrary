# TAGLINE

Configure PPP dial-up connections interactively

# TLDR

**Launch interactive PPP configuration menu** (requires root)

```sudo pppconfig```

**Create a new provider** configuration

```sudo pppconfig create [provider_name]```

**Change an existing provider** configuration

```sudo pppconfig change [provider_name]```

**Delete a provider** configuration

```sudo pppconfig delete [provider_name]```

**Quickly change phone number, username, or password**

```sudo pppconfig quickchange [provider_name]```

# SYNOPSIS

**pppconfig** [_action_] [_provider_]

# PARAMETERS

**create** _provider_
> Create a new provider configuration.

**change** _provider_
> Change an existing provider configuration.

**delete** _provider_
> Delete an existing provider configuration.

**quickchange** _provider_
> Change only the phone number, username, and password.

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

[pppd](/man/pppd)(8), [pon](/man/pon)(1), [poff](/man/poff)(1), [pppoeconf](/man/pppoeconf)(8)

