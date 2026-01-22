# TLDR

Translate an **IP address** to its corresponding ARPA name

```arpaname [ip_address]```

Translate an **IPv6 address** to ARPA format

```arpaname [2001:db8::1]```

# SYNOPSIS

**arpaname** _ip_address_...

# DESCRIPTION

**arpaname** converts IP addresses (both IPv4 and IPv6) to their corresponding reverse DNS ARPA domain names. These names are used for reverse DNS lookups, which map IP addresses back to hostnames.

For IPv4 addresses, the output is in the **in-addr.arpa** domain. For IPv6 addresses, the output is in the **ip6.arpa** domain with each hexadecimal digit reversed and separated by dots.

# CAVEATS

This is a simple conversion utility that does not perform DNS queries. It only formats IP addresses into ARPA notation. Use **dig** or **host** with the **-x** flag to perform actual reverse DNS lookups.

# HISTORY

**arpaname** is part of the BIND (Berkeley Internet Name Domain) utilities, the most widely used DNS software. ARPA names follow the format defined in RFC 1035 for IPv4 and RFC 3596 for IPv6.

# SEE ALSO

[dig](/man/dig)(1), [host](/man/host)(1), [nslookup](/man/nslookup)(1)
