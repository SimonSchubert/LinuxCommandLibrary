# TLDR

**Release** all address leases

```sudo dhcpcd -k```

**Request** new leases

```sudo dhcpcd -n```

# SYNOPSIS

**dhcpcd** [_options_] [_interface_]

# DESCRIPTION

**dhcpcd** is a DHCP and DHCPv6 client. It obtains IP addresses, default routes, and DNS servers from DHCP servers on the network. It can also use IPv6 Router Advertisement.

Commonly used for automatic network configuration on Linux systems.

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

**-T, --test**
> Test mode, don't configure

# CAVEATS

May conflict with NetworkManager or systemd-networkd. Configuration file is /etc/dhcpcd.conf. Requires root privileges.

# SEE ALSO

[dhclient](/man/dhclient)(8), [nmcli](/man/nmcli)(1), [ip](/man/ip)(8)
