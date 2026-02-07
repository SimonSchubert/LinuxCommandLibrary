# TAGLINE

dynamic firewall management interface

# TLDR

**List** all zones and rules

```firewall-cmd --list-all-zones```

**Block** interface permanently

```firewall-cmd --permanent --zone block --change-interface enp1s0```

**Add** service permanently

```firewall-cmd --permanent --zone public --add-service https```

**Remove** service

```firewall-cmd --permanent --zone public --remove-service http```

**Forward** port

```firewall-cmd --permanent --zone public --add-rich-rule 'rule family "ipv4" forward-port port "443" protocol "tcp" to-port "8443"'```

**Reload** configuration

```firewall-cmd --reload```

**Save** runtime config

```firewall-cmd --runtime-to-permanent```

Enable **panic** mode

```firewall-cmd --panic-on```

# SYNOPSIS

**firewall-cmd** [_OPTIONS_]

# DESCRIPTION

**firewall-cmd** is the command-line interface for firewalld, providing dynamic management of the Linux firewall. It supports zones, services, port forwarding, masquerading, and rich rules with both runtime and permanent configurations.

# PARAMETERS

**--list-all-zones**
> List all available zones with their settings

**--zone** _zone_
> Specify the zone to operate on

**--add-service** _service_
> Add a service to the zone

**--remove-service** _service_
> Remove a service from the zone

**--add-port** _port/protocol_
> Add a port to the zone

**--permanent**
> Make changes permanent (survives reboot)

**--reload**
> Reload firewall configuration

**--runtime-to-permanent**
> Save runtime configuration to permanent

**--panic-on/--panic-off**
> Enable/disable panic mode (drops all traffic)

# CONFIGURATION

**/etc/firewalld/zones/*.xml**
> Zone definitions including allowed services, ports, and rich rules.

**/etc/firewalld/services/*.xml**
> Service definitions mapping service names to ports and protocols.

# CAVEATS

Changes without --permanent are lost on reload or reboot. After permanent changes, use --reload to apply them. Zone changes may disconnect active sessions.

# HISTORY

**firewall-cmd** is the client for **firewalld**, Red Hat's dynamic firewall management daemon used in RHEL, CentOS, and Fedora.

# SEE ALSO

[firewalld](/man/firewalld)(1), [iptables](/man/iptables)(8), [nft](/man/nft)(8)
