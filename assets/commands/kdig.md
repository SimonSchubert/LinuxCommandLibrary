# TLDR

**Query A record**

```kdig [example.com] A```

**Query specific server**

```kdig [example.com] @[8.8.8.8]```

**Query using TCP**

```kdig +tcp [example.com]```

**Query using TLS (DoT)**

```kdig +tls [example.com] @[1.1.1.1]```

**Perform zone transfer**

```kdig [example.com] AXFR @[ns1.example.com]```

**Query with DNSSEC validation**

```kdig +dnssec [example.com]```

**Reverse DNS lookup**

```kdig -x [192.0.2.1]```

# SYNOPSIS

**kdig** [_common-settings_] [_query_...]

# PARAMETERS

**@**_server_
> Nameserver to query.

**-t** _type_
> Query type (A, AAAA, MX, NS, etc.).

**-x** _address_
> Reverse lookup for IP address.

**+tcp**
> Use TCP instead of UDP.

**+tls**
> Use TLS (DNS over TLS).

**+https**
> Use HTTPS (DNS over HTTPS).

**+dnssec**
> Request DNSSEC records.

**+short**
> Display short output.

# DESCRIPTION

**kdig** is an advanced DNS lookup utility from the Knot DNS project. It supports modern DNS protocols including DNS over TLS (DoT) and DNS over HTTPS (DoH). Provides more features than traditional dig for DNS troubleshooting and testing.

# SEE ALSO

[dig](/man/dig)(1), [host](/man/host)(1), [nslookup](/man/nslookup)(1)

