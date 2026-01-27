# TLDR

**Look up a hostname**

```unbound-host [example.com]```

**Look up with DNSSEC validation status**

```unbound-host -v [example.com]```

**Query specific record type**

```unbound-host -t [MX] [example.com]```

**Use system resolvers from resolv.conf**

```unbound-host -r [example.com]```

**Use specific DNS server**

```unbound-host -f [8.8.8.8] [example.com]```

**Use custom config file**

```unbound-host -C [/etc/unbound/unbound.conf] [example.com]```

**Force IPv4 only**

```unbound-host -4 [example.com]```

# SYNOPSIS

**unbound-host** [_options_] _hostname_

# PARAMETERS

**-v**
> Verbose output with DNSSEC validation status.

**-t** _type_
> Query specific record type (A, AAAA, MX, TXT, etc.).

**-c** _class_
> Query specific class (IN, CH, HS).

**-r**
> Read /etc/resolv.conf for DNS servers.

**-f** _server_
> Use specified DNS server.

**-C** _file_
> Use unbound configuration file.

**-y** _key_
> Specify trust anchor for DNSSEC validation.

**-4**
> Use IPv4 only.

**-6**
> Use IPv6 only.

**-D**
> Enable DNSSEC validation.

**-h**
> Display help.

# DESCRIPTION

**unbound-host** performs DNS lookups using the Unbound resolver library. It provides DNSSEC validation capabilities, showing whether responses are secure, insecure, or bogus (failed validation).

By default, the tool queries root servers directly without reading system configuration. The -r option uses resolvers from /etc/resolv.conf, though this may break DNSSEC validation if those servers don't support it.

Validation status in verbose mode shows: secure (cryptographically validated), insecure (no DNSSEC for domain), or bogus (validation failed, possible tampering).

# CAVEATS

Direct root queries may be slow or blocked by firewalls. Using -r with non-DNSSEC servers breaks validation. Trust anchors must be current for DNSSEC to work correctly.

# HISTORY

**unbound-host** is part of the Unbound project by NLnet Labs, providing command-line access to Unbound's validating resolver capabilities. It was designed as a DNSSEC-aware alternative to traditional host and dig commands.

# SEE ALSO

[unbound](/man/unbound)(8), [dig](/man/dig)(1), [host](/man/host)(1), [drill](/man/drill)(1), [nslookup](/man/nslookup)(1)
