# TAGLINE

command-line DNS client with colorful output

# TLDR

**Query A records**

```dog [example.com]```

**Query specific record** type

```dog [example.com] [MX]```

**Use specific DNS** server

```dog [example.com] @[8.8.8.8]```

**Query multiple record** types

```dog [example.com] A AAAA MX```

**Output in JSON** format

```dog [example.com] --json```

**Use DNS over** HTTPS

```dog [example.com] --https @[https://cloudflare-dns.com/dns-query]```

**Use DNS over** TLS

```dog [example.com] --tls @[dns.google]```

# SYNOPSIS

**dog** [_options_] _domain_ [_type_...] [@_server_]

# PARAMETERS

_DOMAIN_
> Domain name to query.

_TYPE_
> Record type: A, AAAA, MX, NS, TXT, CNAME, etc.

@_SERVER_
> DNS server to query.

**--json**, **-J**
> Output as JSON.

**--short**
> Short output format.

**--https**
> Use DNS over HTTPS.

**--tls**
> Use DNS over TLS.

**--tcp**
> Use TCP instead of UDP.

**--help**
> Display help information.

# DESCRIPTION

**dog** is a command-line DNS client with colorful output and modern features. It serves as an alternative to dig with a more user-friendly interface and support for encrypted DNS protocols.

The tool supports DNS over HTTPS (DoH) and DNS over TLS (DoT), enabling secure DNS queries. Output is colorized by default for readability, with JSON output available for scripting.

dog provides a simplified interface compared to dig while maintaining power-user features. Multiple record types can be queried simultaneously, and responses are clearly formatted.

# CAVEATS

Colorized output may need disabling for scripts. DoH/DoT require compatible servers. Some advanced dig features not available. Written in Rust, may need compilation.

# HISTORY

dog was created by **Benjamin Sago** (ogham), also known for creating exa and other modern CLI tools. It was designed as a friendlier alternative to dig with support for modern encrypted DNS protocols.

# SEE ALSO

[dig](/man/dig)(1), [doggo](/man/doggo)(1), [drill](/man/drill)(1)
