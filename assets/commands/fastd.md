# TAGLINE

fast and secure VPN daemon

# TLDR

**Start fastd with config**

```fastd --config [/etc/fastd/fastd.conf]```

**Generate key pair**

```fastd --generate-key```

**Show public key from secret**

```fastd --show-key --secret [secret.key]```

**Start in foreground**

```fastd --config [config] --log-level debug```

**Verify configuration** syntax

```fastd --verify-config --config [config]```

**Run as daemon** with a PID file

```fastd --config [config] --daemon --pid-file [/var/run/fastd.pid]```

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

**--pid-file** _file_
> Write PID to file.

**--user** _user_
> Drop privileges to specified user.

**--interface** _name_
> TUN/TAP interface name.

# CONFIGURATION

**/etc/fastd/fastd.conf**
> Main configuration file defining interface, peers, encryption methods, and network settings.

# DESCRIPTION

**fastd** is a fast and secure VPN daemon designed for building mesh networks and tunneling traffic. It's commonly used in Freifunk community wireless networks to create encrypted mesh topologies.

The tool supports multiple encryption methods and is optimized for low-latency, high-performance VPN connections. It uses UDP for transport and supports various authentication and encryption ciphers. Configuration defines peers, network interfaces, and security parameters.

# SEE ALSO

[wg](/man/wg)(8), [openvpn](/man/openvpn)(8), [ipsec](/man/ipsec)(8)

