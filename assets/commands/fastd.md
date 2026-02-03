# TLDR

**Start fastd with config**

```fastd --config [/etc/fastd/fastd.conf]```

**Generate key pair**

```fastd --generate-key```

**Show public key from secret**

```fastd --show-key --secret [secret.key]```

**Start in foreground**

```fastd --config [config] --log-level debug```

**Verify configuration**

```fastd --verify-config --config [config]```

# SYNOPSIS

**fastd** [_options_]

# PARAMETERS

**--config** _file_
> Configuration file path.

**--generate-key**
> Generate new key pair.

**--show-key**
> Show public key.

**--secret** _file_
> Secret key file.

**--log-level** _level_
> Log level (fatal, error, warn, info, verbose, debug).

**--verify-config**
> Verify configuration syntax.

**--daemon**
> Run as daemon.

# DESCRIPTION

**fastd** is a fast and secure VPN daemon. Used for building mesh networks and tunneling traffic. Commonly used in Freifunk community networks.

# SEE ALSO

[wireguard](/man/wireguard)(8), [openvpn](/man/openvpn)(8)

