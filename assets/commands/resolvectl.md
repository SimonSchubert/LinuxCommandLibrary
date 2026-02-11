# TAGLINE

Query and manage systemd-resolved DNS settings

# TLDR

Show **DNS settings**

```resolvectl status```

**Resolve** domain names

```resolvectl query domain1 domain2```

**Reverse lookup** IP address

```resolvectl query 8.8.8.8```

**Flush** DNS caches

```resolvectl flush-caches```

Show DNS **statistics**

```resolvectl statistics```

Query **MX record** for domain

```resolvectl --type MX query domain```

Query **SRV record**

```resolvectl service _xmpp-server._tcp example.com```

Query **TLS key**

```resolvectl tlsa tcp example.com:443```

# SYNOPSIS

**resolvectl** [_OPTIONS_] _COMMAND_ [_NAME_...]

# DESCRIPTION

**resolvectl** resolves domain names, IPv4 and IPv6 addresses, DNS resource records, and services. It introspects and reconfigures the DNS resolver through systemd-resolved.

# COMMANDS

**query HOSTNAME|ADDRESS**
> Resolve hostnames or reverse lookup addresses

**service [[NAME] TYPE] DOMAIN**
> Resolve DNS-SD or SRV service

**openpgp EMAIL**
> Query OpenPGP keys

**tlsa [FAMILY] DOMAIN[:PORT]**
> Query TLS server certificates

**status [LINK]**
> Show DNS settings per interface

**statistics**
> Show resolver statistics

**reset-statistics**
> Reset resolver statistics

**flush-caches**
> Flush all local DNS caches

**reset-server-features**
> Reset learned server features

**dns [LINK [SERVER...]]**
> Get/set DNS servers per link

**domain [LINK [DOMAIN...]]**
> Get/set search domains per link

**dnssec [LINK [MODE]]**
> Get/set DNSSEC mode

**nta [LINK [DOMAIN...]]**
> Get/set DNSSEC negative trust anchors

# PARAMETERS

**-4, --ipv4**
> Query only IPv4 addresses

**-6, --ipv6**
> Query only IPv6 addresses

**-t, --type TYPE**
> Query specific DNS record type

**--class CLASS**
> Query specific DNS class

**--legend yes|no**
> Show/hide result legend

**--cname yes|no**
> Follow CNAME redirects

**-p, --protocol**
> Specify protocol (dns, llmnr, mdns)

# CAVEATS

This command works with systemd-resolved. If systemd-resolved is not running, many commands will fail. Use **flush-caches** after making DNS configuration changes.

# HISTORY

**resolvectl** is part of **systemd**, providing DNS resolution through systemd-resolved. It replaces the older systemd-resolve command.

# SEE ALSO

[systemd-resolved](/man/systemd-resolved)(8), [dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [resolved.conf](/man/resolved.conf)(5)
