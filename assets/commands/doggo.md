# TAGLINE

modern DNS client with encrypted protocol support

# TLDR

Query **A records** with the system resolver

```doggo [example.com]```

Query a **specific record type** against a chosen resolver

```doggo [example.com] [MX] @[9.9.9.9]```

Use **DNS over HTTPS**

```doggo [example.com] @https://[cloudflare-dns.com/dns-query]```

Use **DNS over TLS**

```doggo [example.com] @tls://[1.1.1.1]```

Query **every common record type** at once

```doggo [example.com] --any```

Output **JSON** for scripting

```doggo [example.com] --json```

**Reverse lookup** an IP address, short form

```doggo --reverse [8.8.8.8] --short```

Run the query **from another country** via the Globalping network

```doggo [example.com] --gp-from [Germany] --gp-limit [2]```

# SYNOPSIS

**doggo** [_query options_] [_arguments_...]

Arguments may be given free-form: doggo recognises a hostname, a record type, a class, and an **@**_resolver_ in any order.

# PARAMETERS

**-q**, **--query**=_HOSTNAME_
> Hostname to query the DNS records for.

**-t**, **--type**=_TYPE_
> Type of the DNS record (A, AAAA, MX, NS, TXT, ...).

**-n**, **--nameserver**=_ADDR_
> Address of a specific nameserver to send queries to.

**-c**, **--class**=_CLASS_
> Network class of the DNS record (IN, CH, HS).

**-x**, **--reverse**
> Reverse lookup of an IPv4 or IPv6 address; sets type PTR and class IN.

**--any**
> Query all supported record types (A, AAAA, CNAME, MX, NS, PTR, SOA, SRV, TXT, CAA).

**-A**, **--authoritative**
> Find the domain's zone via its SOA and query the delegated authoritative nameservers.

**--strategy**=_STRATEGY_
> How to pick among nameservers: **all**, **random**, **first**, or **internal**.

**--ndots**=_INT_
> ndots value; taken from `/etc/resolv.conf` for the system nameserver, otherwise 1.

**--search**
> Use the search list from `resolv.conf` (default true; **--search=false** disables it).

**--timeout**=_DURATION_
> Resolver timeout, e.g. `5s`, `400ms`, `1m`.

**-4**, **--ipv4** / **-6**, **--ipv6**
> Restrict queries to IPv4 or IPv6 only.

**--tls-hostname**=_HOSTNAME_
> Hostname used for certificate verification when the DoT nameserver is given as an IP.

**--skip-hostname-verification**
> Skip TLS hostname verification for DoT lookups.

**--aa**, **--ad**, **--cd**, **--rd**, **--do**, **--z**
> Set the Authoritative Answer, Authenticated Data, Checking Disabled, Recursion Desired (on by default), DNSSEC OK, and Z header flags.

**--nsid**, **--cookie**, **--padding**, **--ede**
> EDNS options: request the Name Server Identifier, a DNS Cookie, EDNS padding, or Extended DNS Errors.

**--ecs**=_SUBNET_
> Send an EDNS Client Subnet such as `192.0.2.0/24`, for geo-aware responses.

**--bufsize**=_BYTES_
> EDNS UDP buffer size (512-65535); setting it enables EDNS. Defaults to 1232 when EDNS is on.

**-J**, **--json**
> Format the output as JSON.

**--short**
> Short output: response section only.

**--color**
> Colourised output (default true; **--color=false** disables it).

**--time**
> Show how long the server took to respond.

**--debug**
> Enable debug logging.

**--gp-from**=_LOCATION_, **--gp-limit**=_INT_
> Run the query from Globalping probes in a given location, limiting the number of probes.

**completions** [_bash_|_zsh_|_fish_]
> Print the shell completion script for the given shell.

# TRANSPORT

The resolver is selected with a URL-style scheme after **@**. Plain UDP is used when no scheme is given.

**@udp://1.1.1.1**
> UDP query to port 53 (the default).

**@tcp://1.1.1.1**
> TCP query to port 53.

**@tls://1.1.1.1**
> DNS over TLS (DoT) to port 853.

**@https://cloudflare-dns.com/dns-query**
> DNS over HTTPS (DoH).

**@quic://**
> DNS over QUIC (DoQ).

**@sdns://**
> DNSCrypt or DoH via a DNS stamp.

# DESCRIPTION

**doggo** is a command-line DNS client written in Go, positioned as a friendlier `dig`. It prints a tabular, colourised answer by default and can emit JSON for scripting.

Beyond plain UDP and TCP it speaks the modern encrypted transports: DNS over HTTPS, DNS over TLS, DNS over QUIC, and DNSCrypt. The resolver is chosen by prefixing it with a URL scheme, which keeps one flagless syntax for every protocol.

doggo reads `/etc/resolv.conf` for the system nameserver, ndots value, and search list, so bare hostnames resolve the way they would for any other program. Header flags, EDNS options, and DNSSEC can all be toggled from the command line, and **--gp-from** runs the same query from Globalping probes around the world to compare answers between regions.

# CAVEATS

Encrypted transports only work against resolvers that support them. **--short** hides the question, authority, and additional sections, which is convenient but drops information you often need when debugging. Colour is on by default, so pass **--color=false** when parsing output with anything other than **--json**. Globalping queries are executed by a third-party service rather than from your own machine.

# HISTORY

doggo was created by **Karan Sharma** and first released in **2020**. It was inspired by **dog**, the Rust DNS client, but written in Go so that it ships as a single static binary. It has since grown well past its inspiration with DNSCrypt, DNS over QUIC, Globalping integration, and a web frontend, and unlike dog it remains actively maintained.

# SEE ALSO

[dig](/man/dig)(1), [dog](/man/dog)(1), [drill](/man/drill)(1), [nslookup](/man/nslookup)(1), [host](/man/host)(1)

# RESOURCES

```[Source code](https://github.com/mr-karan/doggo)```

```[Homepage](https://doggo.mrkaran.dev)```

```[Documentation](https://doggo.mrkaran.dev/docs/)```

<!-- verified: 2026-07-14 -->
