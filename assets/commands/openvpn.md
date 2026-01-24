# TLDR

**Connect using config file**

```sudo openvpn --config [client.ovpn]```

**Connect with authentication file**

```sudo openvpn --config [client.ovpn] --auth-user-pass [credentials.txt]```

**Start as daemon**

```sudo openvpn --config [client.ovpn] --daemon```

**Generate static key**

```openvpn --genkey secret [static.key]```

**Test config without connecting**

```openvpn --config [client.ovpn] --verb 3 --pull```

**Show version and compile options**

```openvpn --version```

# SYNOPSIS

**openvpn** [_--config file_] [_--remote host_] [_--dev tun_|_tap_] [_--ca file_] [_--cert file_] [_--key file_] [_options_]

# PARAMETERS

**--config** _file_
> Read configuration from file.

**--remote** _host_ [_port_]
> Remote VPN server address.

**--port** _num_
> Local and remote port number.

**--dev** _type_
> TUN/TAP device type (tun, tap).

**--proto** _proto_
> Protocol: udp, tcp-client, tcp-server.

**--ca** _file_
> Certificate authority file.

**--cert** _file_
> Local certificate file.

**--key** _file_
> Local private key file.

**--auth-user-pass** [_file_]
> Username/password authentication.

**--tls-auth** _file_ [_direction_]
> HMAC authentication on control channel.

**--cipher** _alg_
> Encryption cipher.

**--auth** _alg_
> HMAC digest algorithm.

**--compress** [_alg_]
> Compression algorithm.

**--daemon** [_name_]
> Daemonize after initialization.

**--log** _file_
> Log to file.

**--verb** _level_
> Verbosity level (0-11).

**--ping** _n_
> Ping remote every n seconds.

**--ping-restart** _n_
> Restart if no ping response in n seconds.

**--script-security** _level_
> Script execution policy.

# DESCRIPTION

**OpenVPN** is an open-source VPN solution using SSL/TLS for key exchange. It can create secure point-to-point or site-to-site connections, operating over UDP or TCP.

Two modes exist: routed (TUN) and bridged (TAP). TUN mode creates point-to-point IP tunnels, efficient for most VPN needs. TAP mode bridges Ethernet frames, required for non-IP protocols.

Configuration typically uses .ovpn files containing all connection parameters. These files can embed certificates or reference external files. Commercial VPN providers distribute pre-configured .ovpn files.

Security features include: certificate-based authentication, perfect forward secrecy, HMAC packet authentication, and optional username/password verification. TLS-auth adds an additional HMAC layer for DoS protection.

Client and server modes use the same binary. Server configurations include routing, client management, and multi-client handling. Scripts can execute on connection events for dynamic routing and firewall rules.

# CAVEATS

Requires root/administrator for TUN/TAP creation. Firewalls must allow VPN traffic. Certificate management adds complexity. Performance depends on cipher choice and hardware. MTU issues can cause connectivity problems. Some networks block OpenVPN signatures.

# HISTORY

**OpenVPN** was created by **James Yonan** and first released in **2001**. It was designed as an open-source alternative to IPsec, using standard TLS for the control channel. The project has become one of the most widely deployed VPN solutions, used by both commercial providers and enterprises. OpenVPN 3 introduced a new core library in C++.

# SEE ALSO

[wireguard](/man/wireguard)(1), [ipsec](/man/ipsec)(8), [stunnel](/man/stunnel)(8), [ssh](/man/ssh)(1)
