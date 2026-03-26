# TAGLINE

DNS lookup utility using Unbound resolver

# TLDR

**Look up a hostname**

```unbound-host [example.com]```

**Look up with DNSSEC validation status**

```unbound-host -v [example.com]```

**Query specific record type**

```unbound-host -t [MX] [example.com]```

**Enable DNSSEC validation using the default root anchor**

```unbound-host -D [example.com]```

**Use system resolvers from resolv.conf**

```unbound-host -r [example.com]```

**Use custom config file**

```unbound-host -C [/etc/unbound/unbound.conf] [example.com]```

**Reverse lookup of an IP address**

```unbound-host [93.184.216.34]```

**Force IPv4 only**

```unbound-host -4 [example.com]```

# SYNOPSIS

**unbound-host** [**-C** _configfile_] [**-vdhr46D**] [**-c** _class_] [**-t** _type_] [**-y** _key_] [**-f** _keyfile_] [**-F** _namedkeyfile_] _hostname_

# PARAMETERS

**-v**
> Enable verbose output showing DNSSEC validation status on every line (secure, insecure, or bogus).

**-d**
> Enable debug output to stderr. Repeat the flag (-d -d) for increased verbosity including full packet details.

**-t** _type_
> Query specific record type (A, AAAA, MX, TXT, NS, SOA, etc.). Defaults to A, AAAA, and MX for forward lookups, or PTR for reverse lookups.

**-c** _class_
> Query specific DNS class. Defaults to IN (internet). Other values: CH (chaos), HS (hesiod).

**-r**
> Read /etc/resolv.conf and use the forward DNS servers listed there. Note: this may break DNSSEC validation if those servers do not support it.

**-f** _keyfile_
> Read DS or DNSKEY trust anchor records from a file in zone file format (one record per line). Used to supply trust anchors for DNSSEC validation.

**-F** _namedkeyfile_
> Read trust anchor keys from a BIND-style named.conf file. Only trusted-key {} entries are read.

**-y** _key_
> Specify a single trust anchor directly on the command line in DS or DNSKEY record format.

**-D**
> Enable DNSSEC validation using the root anchor from the default location (/usr/share/dns/root.key or /etc/trusted-key.key depending on the system).

**-C** _file_
> Use the specified unbound.conf configuration file to configure the resolver.

**-4**
> Use IPv4 only for sending packets.

**-6**
> Use IPv6 only for sending packets.

**-h**
> Display version and help information.

# DESCRIPTION

**unbound-host** performs DNS lookups using the Unbound resolver library (libunbound). It provides DNSSEC validation capabilities, reporting whether responses are secure (cryptographically validated), insecure (no DNSSEC chain of trust for the domain), or bogus (validation failed, possible tampering).

If _hostname_ is an IPv4 or IPv6 address, a reverse lookup (PTR record) is performed automatically.

By default, the tool reads no configuration file whatsoever and attempts to reach internet root servers directly. The **-r** option uses resolvers from /etc/resolv.conf, and **-C** loads a full unbound configuration.

DNSSEC validation requires trust anchors. Use **-D** for automatic root anchor loading, or supply anchors manually with **-y**, **-f**, or **-F**.

# EXIT STATUS

**0**
> Success (though the queried data may not exist).

**1**
> A fatal error occurred during the lookup.

# CAVEATS

Direct root queries may be slow or blocked by firewalls. Using **-r** with non-DNSSEC-capable servers breaks validation. Trust anchors must be current for DNSSEC to work correctly.

# HISTORY

**unbound-host** is part of the Unbound project by NLnet Labs, providing command-line access to Unbound's validating resolver capabilities. It was designed as a DNSSEC-aware alternative to traditional host and dig commands.

# SEE ALSO

[unbound](/man/unbound)(8), [unbound-control](/man/unbound-control)(8), [dig](/man/dig)(1), [host](/man/host)(1), [drill](/man/drill)(1), [nslookup](/man/nslookup)(1)
