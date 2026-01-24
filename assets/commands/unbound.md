# TLDR

**Start the unbound DNS server**

```sudo unbound```

**Start with a specific config file**

```sudo unbound -c [path/to/unbound.conf]```

**Start in foreground** (don't daemonize)

```sudo unbound -d```

**Start with verbose output**

```sudo unbound -v```

**Check configuration file** for errors

```unbound-checkconf [path/to/unbound.conf]```

**Show version**

```unbound -V```

# SYNOPSIS

**unbound** [**-c** _configfile_] [**-d**] [**-p**] [**-v**] [**-V**] [**-h**]

# PARAMETERS

**-c** _configfile_
> Use the specified configuration file instead of /etc/unbound/unbound.conf.

**-d**
> Debug mode. Do not fork into the background, stay in foreground.

**-p**
> Do not use chroot or drop privileges.

**-v**
> Increase verbosity level. Can be specified multiple times for more output.

**-V**
> Show version information.

**-h**
> Show help message.

# DESCRIPTION

**Unbound** is a validating, recursive, and caching DNS resolver designed for security and performance. It performs DNS lookups on behalf of clients, validates responses using DNSSEC, and caches results to improve response times for subsequent queries.

Unlike forwarding resolvers, Unbound is a full recursive resolver that can query root DNS servers directly, eliminating dependency on upstream DNS providers. It supports DNSSEC validation by default, verifying the authenticity of DNS responses to protect against cache poisoning and other DNS attacks.

Configuration is done through /etc/unbound/unbound.conf, which controls listening interfaces, access control, DNSSEC settings, cache sizes, and performance tuning. Unbound can operate as a local resolver for a single machine or as a network-wide DNS server.

Related utilities include **unbound-control** for runtime management, **unbound-checkconf** for configuration validation, **unbound-anchor** for DNSSEC root key management, and **unbound-host** for DNS lookups.

# CAVEATS

Running as a public DNS resolver requires careful access control configuration to prevent abuse. DNSSEC validation may cause resolution failures for misconfigured domains. Cache size should be tuned based on expected query volume and available memory. Ensure root trust anchors are updated periodically with unbound-anchor.

# HISTORY

**Unbound** was developed by **NLnet Labs** in the Netherlands, with the first version released in **May 2008**. It was designed as a modern, secure alternative to BIND, focusing on code cleanliness and security. Unbound has become the default DNS resolver in several BSD operating systems and is widely used with Pi-hole and other DNS filtering solutions.

# SEE ALSO

[unbound-control](/man/unbound-control)(8), [unbound-checkconf](/man/unbound-checkconf)(8), [unbound-host](/man/unbound-host)(1), [dig](/man/dig)(1), [nslookup](/man/nslookup)(1)
