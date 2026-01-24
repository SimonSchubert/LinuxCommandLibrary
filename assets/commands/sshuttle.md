# TLDR

**Tunnel all traffic**

```sshuttle -r [user@host] 0/0```

**Tunnel specific network**

```sshuttle -r [user@host] [192.168.0.0/24]```

**Tunnel multiple networks**

```sshuttle -r [user@host] [10.0.0.0/8] [172.16.0.0/12]```

**Exclude addresses**

```sshuttle -r [user@host] 0/0 -x [192.168.1.0/24]```

**Tunnel with DNS**

```sshuttle --dns -r [user@host] 0/0```

**Auto-detect networks** (from server routes)

```sshuttle -r [user@host] --auto-nets```

**Verbose mode**

```sshuttle -v -r [user@host] [10.0.0.0/8]```

# SYNOPSIS

**sshuttle** [_-r server_] [_--dns_] [_-x exclude_] [_options_] _subnets_

# PARAMETERS

**-r** _SERVER_
> Remote server (user@host).

**--dns**
> Tunnel DNS queries.

**-x** _SUBNET_
> Exclude subnet.

**-l** _ADDR_
> Listen address.

**--auto-nets**
> Auto-detect server networks.

**--auto-hosts**
> Scan for hosts.

**-N**
> Auto-detect DNS server.

**-e** _CMD_
> SSH command.

**-v**
> Verbose.

**--daemon**
> Run as daemon.

**--pidfile** _FILE_
> PID file.

**--method** _METHOD_
> NAT method (auto, nat, tproxy).

# DESCRIPTION

**sshuttle** creates a VPN-like tunnel over SSH. It transparently redirects traffic through a remote server without configuring VPN software.

Unlike VPNs, sshuttle requires only SSH access. No server-side installation is needed beyond Python. It works where VPN ports are blocked.

Subnet specifications determine what traffic is tunneled. 0/0 tunnels everything. Specific subnets route only matching traffic.

DNS tunneling prevents leaks. Remote DNS resolution hides query patterns from local networks.

The tool uses iptables/pf to redirect traffic. Root access is needed locally for routing setup. The remote needs only SSH access.

Auto-nets reads the remote routing table to tunnel all its accessible networks.

# CAVEATS

Requires root locally. Not a full VPN (no UDP by default). Latency added by SSH. Some applications may not work through tunnel.

# HISTORY

**sshuttle** was created by **Avery Pennarun** around **2010**. It was described as a "poor man's VPN" that works wherever SSH works.

# SEE ALSO

[ssh](/man/ssh)(1), [openvpn](/man/openvpn)(8), [wireguard](/man/wireguard)(8), [proxychains](/man/proxychains)(1)
