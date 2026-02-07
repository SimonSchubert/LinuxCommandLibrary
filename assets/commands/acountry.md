# TAGLINE

IP address geolocation lookup via DNS

# TLDR

Print the **country** where an IPv4 address or host is located

```acountry [example.com]```

Print extra **debugging** output

```acountry -d [example.com]```

Print more **verbose** information

```acountry -v [example.com]```

# SYNOPSIS

**acountry** [_-d_] [_-v_] _hostname_or_ip_

# DESCRIPTION

**acountry** prints the country where an IPv4 address or hostname is located. It works by performing DNS-based lookups against country code databases to determine the geographic origin of an IP address. The tool is part of the **c-ares** library utilities, which provide asynchronous DNS resolution capabilities.

Unlike GeoIP database tools, acountry relies on DNS TXT record queries to specialized services that map IP ranges to country codes. This makes it lightweight and dependency-free but limited to country-level granularity.

# PARAMETERS

**-d**
> Print extra debugging output

**-v**
> Print more verbose information

# CAVEATS

Geographic IP location is approximate and may not reflect the actual physical location of the server or user. IP addresses can be reassigned or routed through different countries.

# HISTORY

Part of the **c-ares** asynchronous DNS resolver library tools.

# SEE ALSO

[ahost](/man/ahost)(1), [adig](/man/adig)(1), [host](/man/host)(1), [dig](/man/dig)(1)
