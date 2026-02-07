# TAGLINE

Discover mDNS browsing domains on the network

# TLDR

**Browse** for browsing domains on the local network

```avahi-browse-domains```

**Browse** with verbose output

```avahi-browse-domains --verbose```

**Terminate** after dumping a complete list

```avahi-browse-domains --terminate```

**Browse** in a specific domain

```avahi-browse-domains --domain=[domain_name]```

**Parsable output** for use in scripts (semicolon-separated)

```avahi-browse-domains --parsable```

**Ignore local** services and show only remote ones

```avahi-browse-domains --ignore-local```

# SYNOPSIS

**avahi-browse-domains** [_options_]

# PARAMETERS

**-d, --domain=**_DOMAIN_
> Specify search domain (defaults to local)

**-v, --verbose**
> Enable verbose output with detailed information

**-t, --terminate**
> Exit after displaying a complete list of domains

**-c, --cache**
> Exit after dumping all cached entries

**-l, --ignore-local**
> Show only remote services, exclude local ones

**-r, --resolve**
> Automatically resolve discovered services

**-f, --no-fail**
> Wait for daemon if unavailable; reconnect if disconnected

**-p, --parsable**
> Format output for script usage (semicolon-separated fields, escaped service names)

**-k, --no-db-lookup**
> Skip service type database lookups

**-h, --help**
> Display help information

**-V, --version**
> Show version details

# DESCRIPTION

**avahi-browse-domains** browses for mDNS/DNS-SD browsing domains on the local network using the Avahi daemon. This command is equivalent to **avahi-browse --browse-domains** and provides a convenient shortcut for discovering available browsing domains.

The tool connects to the Avahi daemon and displays browsing domains as they appear on the network. Network items appearing are shown with a **"+"** prefix, disappearing items use **"-"**, and resolved items display with **"="** when the resolve flag is enabled.

By default, **avahi-browse-domains** searches in the **local** domain, but can be configured to search in other domains using the **--domain** option. The output can be formatted for easy parsing in scripts using the **--parsable** option, which separates fields with semicolons.

The tool runs continuously by default, monitoring for domain changes. Use **--terminate** to exit after displaying the initial complete list, or **--cache** to dump only cached entries and exit immediately.

# CAVEATS

Requires the **avahi-daemon** to be running. If the daemon is not available, the command will fail unless **--no-fail** is specified, which makes it wait for the daemon to become available.

# HISTORY

Part of the **Avahi** suite, developed as a free software implementation of Apple's Bonjour/Zeroconf protocols. Avahi enables service discovery on local networks without requiring configuration, standardized by **IETF** as mDNS and DNS-SD protocols.

# SEE ALSO

[avahi-browse](/man/avahi-browse)(1), [avahi-publish](/man/avahi-publish)(1), [avahi-resolve](/man/avahi-resolve)(1), [avahi-daemon](/man/avahi-daemon)(8)
