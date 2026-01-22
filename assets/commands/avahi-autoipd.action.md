# TLDR

**Add** an acquired IPv4LL address to a network interface (BIND event)

```/etc/avahi/avahi-autoipd.action BIND [interface] [ip_address]```

**Remove** address due to conflict detection (CONFLICT event)

```/etc/avahi/avahi-autoipd.action CONFLICT [interface] [ip_address]```

**Remove** address when routable address becomes available (UNBIND event)

```/etc/avahi/avahi-autoipd.action UNBIND [interface] [ip_address]```

**Remove** address on daemon shutdown (STOP event)

```/etc/avahi/avahi-autoipd.action STOP [interface] [ip_address]```

# SYNOPSIS

**/etc/avahi/avahi-autoipd.action** _event_ _interface_ _address_

# PARAMETERS

**_event_**
> Event type: **BIND**, **CONFLICT**, **UNBIND**, or **STOP**

**_interface_**
> Network interface name (e.g., eth0, wlan0)

**_address_**
> IPv4LL address from the 169.254.0.0/16 range

# DESCRIPTION

**avahi-autoipd.action** is the action script automatically called by **avahi-autoipd** whenever an IPv4 Link-Local address has been acquired or when an IP address conflict is detected. The script handles adding or removing the specified address from the network interface.

The script receives three arguments: an event string, the network interface name, and the IPv4LL address. Based on the event type, it performs the appropriate network configuration:

> **BIND** - An IP address has been successfully acquired; the script adds it to the network interface

> **CONFLICT** - avahi-autoipd detected the IP address is already in use on the local network; the script removes the configured address

> **UNBIND** - A routable address has been configured to the interface by another program; the script removes the IPv4LL address to avoid conflicts

> **STOP** - avahi-autoipd is shutting down; the script removes the IP address from the interface

The default script typically uses **ip** or **ifconfig** commands to manipulate interface addresses. Users can customize this script to integrate with specific network management systems or add additional configuration steps.

# CAVEATS

The script runs with elevated privileges and is executed automatically by **avahi-autoipd**. Modifications to this script should be tested carefully as errors can prevent proper IPv4LL address configuration. Always maintain a backup before customization.

# SEE ALSO

[avahi-autoipd](/man/avahi-autoipd)(8), [dhclient-script](/man/dhclient-script)(8), [ip](/man/ip)(8), [ifconfig](/man/ifconfig)(8)
