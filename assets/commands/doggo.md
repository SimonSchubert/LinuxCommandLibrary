# TAGLINE

modern DNS client with encrypted protocol support

# TLDR

**Query A records**

```doggo [example.com]```

**Query specific record** type

```doggo [example.com] [MX]```

**Use specific resolver**

```doggo [example.com] @[8.8.8.8]```

**Use DNS over** HTTPS

```doggo [example.com] @https://[cloudflare-dns.com/dns-query]```

**Use DNS over** TLS

```doggo [example.com] @tls://[dns.google]```

**Output as JSON**

```doggo [example.com] --json```

**Reverse DNS lookup**

```doggo --reverse [8.8.8.8]```

# SYNOPSIS

**doggo** [_options_] _domain_ [_type_] [@_resolver_]

# PARAMETERS

_DOMAIN_
> Domain to query.

_TYPE_
> Record type: A, AAAA, MX, CNAME, TXT, etc.

@_RESOLVER_
> DNS resolver with optional protocol prefix.

**--json**, **-J**
> JSON output format.

**--short**
> Short output.

**--reverse**, **-x**
> Reverse DNS lookup.

**--time**
> Show query time.

**--color**
> Colorize output (auto/always/never).

**--help**
> Display help information.

# DESCRIPTION

**doggo** is a modern DNS client written in Go with support for encrypted DNS protocols. It provides a user-friendly interface with colorized output and multiple output formats.

The tool supports standard DNS, DNS over HTTPS (DoH), DNS over TLS (DoT), DNS over QUIC (DoQ), and DNSCrypt. This flexibility allows secure DNS queries to privacy-focused resolvers.

doggo features human-readable output by default, with JSON output for scripting. It can query multiple record types and resolvers in a single command.

# CAVEATS

Some transport protocols require compatible servers. May not have all features of dig. Color output may interfere with parsing.

# HISTORY

doggo was created by **Karan Sharma** as a modern, human-friendly DNS client. Inspired by dog but written in Go for easier installation, it focuses on ease of use and support for encrypted DNS protocols.

# SEE ALSO

[dig](/man/dig)(1), [dog](/man/dog)(1), [drill](/man/drill)(1), [nslookup](/man/nslookup)(1)
