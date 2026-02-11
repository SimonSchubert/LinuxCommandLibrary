# TAGLINE

WireGuard VPN configuration utility

# TLDR

**Check** status of currently active interfaces

```sudo wg```

**Generate** a new private key

```wg genkey```

**Generate** a public key from a private key

```wg pubkey < [path/to/private_key] > [path/to/public_key]```

**Generate** both public and private keys

```wg genkey | tee [path/to/private_key] | wg pubkey > [path/to/public_key]```

**Show** the current configuration of an interface

```sudo wg showconf [wg0]```

# SYNOPSIS

**wg** [_command_] [_arguments_]

# PARAMETERS

**show**
> Show current configuration and status

**showconf _interface_**
> Show configuration in config file format

**genkey**
> Generate a new private key

**pubkey**
> Generate public key from private key on stdin

**genpsk**
> Generate a preshared key

**set _interface_ _options_**
> Change configuration of an interface

**setconf _interface_ _file_**
> Apply configuration from file

**addconf _interface_ _file_**
> Add configuration from file

# DESCRIPTION

**wg** is the configuration utility for WireGuard, a modern VPN tunnel. It manages WireGuard interfaces including key generation, peer configuration, and status monitoring.

WireGuard uses state-of-the-art cryptography and is designed to be simpler, faster, and more secure than traditional VPN protocols like OpenVPN or IPsec.

# CAVEATS

Requires root privileges for most operations. Private keys should be kept secure with restricted file permissions. Interface must be created (e.g., with **ip link add**) before configuration. For easier setup, consider using **wg-quick**.

# SEE ALSO

[wg-quick](/man/wg-quick)(8), [ip](/man/ip)(8)
