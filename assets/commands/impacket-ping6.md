# TAGLINE

ICMPv6 ping implementation using raw sockets via the Impacket library

# TLDR

**Send ICMPv6 echo requests** to a target

```impacket-ping6 [2001:db8::1]```

**Ping IPv6 address with specific source**

```impacket-ping6 -src [2001:db8::50] [2001:db8::1]```

# SYNOPSIS

**impacket-ping6** [_-h_] [_-src IP_] _target_

# PARAMETERS

**-src** _IP_
> Source IPv6 address to use for the ping packets

# DESCRIPTION

**impacket-ping6** is an ICMPv6 ping implementation using raw sockets via the Impacket library. It sends ICMPv6 echo request packets to the specified IPv6 target and reports responses.

This tool provides IPv6 ping functionality using Impacket's raw socket capabilities, useful for testing IPv6 connectivity in security testing scenarios.

# CAVEATS

Requires root/administrator privileges to create raw sockets. Target must be an IPv6 address. May be blocked by firewalls that filter ICMPv6 traffic. For most use cases, the standard **ping6** or **ping -6** command is more feature-rich.

# HISTORY

Part of the **Impacket** library by SecureAuth. Provides IPv6 counterpart to impacket-ping for environments using IPv6 networking.

# SEE ALSO

[ping](/man/ping)(1), [impacket-ping](/man/impacket-ping)(1), [ping6](/man/ping6)(1)
