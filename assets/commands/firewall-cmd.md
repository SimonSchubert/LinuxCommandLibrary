# TAGLINE

dynamic firewall management interface

# TLDR

**Check** firewalld daemon status

```firewall-cmd --state```

**List** all active zones with their interfaces

```firewall-cmd --get-active-zones```

**List** all rules in the default zone

```firewall-cmd --list-all```

**Add** a service permanently to a zone

```firewall-cmd --permanent --zone public --add-service https```

**Add** a port permanently to a zone

```firewall-cmd --permanent --zone public --add-port 8080/tcp```

**Remove** a service permanently

```firewall-cmd --permanent --zone public --remove-service http```

**Reload** configuration (apply permanent changes at runtime)

```firewall-cmd --reload```

**Save** runtime config to permanent

```firewall-cmd --runtime-to-permanent```

**Enable masquerade** (NAT) on a zone

```firewall-cmd --permanent --zone public --add-masquerade```

# SYNOPSIS

**firewall-cmd** [_OPTIONS_]

# DESCRIPTION

**firewall-cmd** is the command-line interface for firewalld, providing dynamic management of the Linux firewall. It supports zones, services, port forwarding, masquerading, and rich rules with both runtime and permanent configurations.

# PARAMETERS

**--state**
> Check whether the firewalld daemon is active (returns exit code 0 if running).

**--reload**
> Reload firewall rules while keeping state information. Applies permanent rules to the runtime configuration.

**--complete-reload**
> Reload the firewall completely, including netfilter kernel modules. May terminate active connections.

**--runtime-to-permanent**
> Save the current runtime configuration to permanent.

**--get-zones**
> List all predefined zones.

**--get-default-zone**
> Print the default zone for connections and interfaces.

**--set-default-zone** _zone_
> Set the default zone.

**--get-active-zones**
> Print currently active zones with their bound interfaces and sources.

**--list-all-zones**
> List all available zones with their complete settings.

**--list-all**
> List everything added or enabled in the current or specified zone.

**--zone** _zone_
> Specify the zone to operate on.

**--get-services**
> List all predefined services.

**--add-service** _service_
> Add a service to the zone.

**--remove-service** _service_
> Remove a service from the zone.

**--add-port** _port/protocol_
> Add a port (or port range) to the zone (e.g. `8080/tcp` or `5000-5100/tcp`).

**--remove-port** _port/protocol_
> Remove a previously added port from the zone.

**--add-masquerade**
> Enable IPv4 masquerade (NAT) on the zone. Useful when the machine is a router.

**--remove-masquerade**
> Disable IPv4 masquerade on the zone.

**--query-masquerade**
> Return whether IPv4 masquerade is enabled in the zone.

**--add-rich-rule** _rule_
> Add a rich language firewall rule.

**--remove-rich-rule** _rule_
> Remove a rich language firewall rule.

**--permanent**
> Make changes permanent (survives reboot). Requires `--reload` to take effect at runtime.

**--panic-on** / **--panic-off**
> Enable/disable panic mode (drops all incoming and outgoing traffic).

**--change-interface** _interface_
> Change the zone binding of a network interface.

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
