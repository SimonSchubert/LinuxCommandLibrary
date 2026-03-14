# TAGLINE

DHCP and DHCPv6 client daemon

# TLDR

**Obtain a lease** on a specific interface

```sudo dhcpcd [eth0]```

**Release** all address leases and exit

```sudo dhcpcd -k```

**Request** new leases (rebind)

```sudo dhcpcd -n```

**Configure IPv4 only**

```sudo dhcpcd -4 [eth0]```

**Configure IPv6 only**

```sudo dhcpcd -6 [eth0]```

**Test mode** (don't configure, just print variables)

```sudo dhcpcd -T [eth0]```

# SYNOPSIS

**dhcpcd** [_options_] [_interface_]

# DESCRIPTION

**dhcpcd** is a DHCP and DHCPv6 client daemon that automatically configures network interfaces. It obtains IP addresses, default routes, and DNS servers from DHCP servers on the network, and can also process IPv6 Router Advertisements for stateless autoconfiguration.

The daemon runs in the background managing network configuration as interfaces come up and down. It handles lease renewal, rebinding, and release operations automatically. Configuration hooks allow running custom scripts when network state changes.

dhcpcd is commonly used as the default network configuration tool on many Linux distributions, particularly those without NetworkManager. It's lightweight, follows RFC standards closely, and integrates well with embedded and server environments.

# PARAMETERS

**-k, --release**
> Release current leases and exit

**-n, --rebind**
> Request new leases (rebind)

**-x, --exit**
> Exit daemon

**-d, --debug**
> Debug mode (don't fork)

**-B, --nobackground**
> Don't run in background

**-4, --ipv4only**
> Only configure IPv4

**-6, --ipv6only**
> Only configure IPv6

**-b, --background**
> Background immediately

**-S, --static** _value_
> Configure a static DHCP value (e.g., ip_address, routers, domain_name_servers)

**-s, --inform** _address_
> Send DHCP INFORM instead of DISCOVER/REQUEST

**-T, --test**
> Test mode, don't configure interfaces

# CONFIGURATION

**/etc/dhcpcd.conf**
> Main configuration file controlling interface behavior, static addresses, hooks, and client options.

# CAVEATS

May conflict with NetworkManager or systemd-networkd. Configuration file is /etc/dhcpcd.conf. Requires root privileges.

# SEE ALSO

[dhclient](/man/dhclient)(8), [nmcli](/man/nmcli)(1), [ip](/man/ip)(8)
