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

```dog [example.com] --tls @[1.1.1.1]```

**Print only the first result** (script-friendly)

```dog [example.com] --short```

# SYNOPSIS

**dog** [_options_] [_domain_] [_type_...] [@_server_]

Arguments are order-independent: dog recognises a record type by its name, a nameserver by the leading **@**, and treats anything else as the domain.

# PARAMETERS

**-q**, **--query**=_HOST_
> Host name or domain to query (may also be given positionally).

**-t**, **--type**=_TYPE_
> Record type to look up: A, AAAA, CAA, CNAME, HINFO, MX, NS, PTR, SOA, SRV, TXT. Repeatable.

**-n**, **--nameserver**=_ADDR_
> Address of the nameserver to send the query to (may also be given as @_ADDR_).

**--class**=_CLASS_
> Network class of the query: IN (default), CH, or HS.

**-U**, **--udp**
> Send the query over plain UDP (the default).

**-T**, **--tcp**
> Send the query over TCP.

**-S**, **--tls**
> Send the query using DNS-over-TLS.

**-H**, **--https**
> Send the query using DNS-over-HTTPS.

**--edns**=_SETTING_
> Control EDNS: **disable**, **hide**, or **show**.

**--txid**=_NUMBER_
> Use a specific transaction ID instead of a random one.

**-Z**=_TWEAKS_
> Uncommon protocol-level tweaks, such as **aa**, **ad**, **cd**, or **bufsize=**_N_.

**-1**, **--short**
> Display nothing but the first result.

**-J**, **--json**
> Print the response as JSON.

**--color**, **--colour**=_WHEN_
> When to colourise output: **always**, **automatic**, or **never**.

**--seconds**
> Print durations as seconds instead of human-readable time units.

**--time**
> Print the time the response took to arrive.

**--help**
> Display help information.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**dog** is a command-line DNS client with colorful output and modern features. It serves as an alternative to dig with a more user-friendly interface and support for encrypted DNS protocols.

The tool supports DNS over HTTPS (DoH) and DNS over TLS (DoT), enabling secure DNS queries. Output is colorized by default for readability, with JSON output available for scripting.

dog provides a simplified interface compared to dig while maintaining power-user features. Multiple record types can be queried simultaneously, and responses are clearly formatted.

# CAVEATS

Upstream development has been dormant since **2021** and the project's homepage (dns.lookup.dog) is offline, so distribution packages may lag behind the repository. Colours are disabled automatically when output is not a terminal, but pass **--color=never** to be sure in scripts. DoH and DoT require a resolver that speaks them. dog does not cover every corner of dig: there is no zone transfer (AXFR), no batch `-f` file mode, and no `+trace` equivalent.

# HISTORY

dog was created by **Benjamin Sago** (ogham), also known for the `exa` file lister, and first released in **2020**. Written in Rust, it was designed as a friendlier alternative to dig, with colourised output, order-independent arguments, and built-in support for encrypted DNS transports. It inspired **doggo**, a Go reimplementation of the same idea that is more actively maintained.

# SEE ALSO

[dig](/man/dig)(1), [doggo](/man/doggo)(1), [drill](/man/drill)(1), [nslookup](/man/nslookup)(1)

# RESOURCES

```[Source code](https://github.com/ogham/dog)```

<!-- verified: 2026-07-14 -->

