# TLDR

Trace DNS **resolution path**

```dnstracer [www.example.com]```

Start with **specific DNS server**

```dnstracer -s [dns.example.org] [www.example.com]```

Query **IPv4 servers only**

```dnstracer -4 [www.example.com]```

**Retry** failed requests 5 times

```dnstracer -r [5] [www.example.com]```

Display **all steps**

```dnstracer -v [www.example.com]```

Display **overview** of answers

```dnstracer -o [www.example.com]```

# SYNOPSIS

**dnstracer** [_options_] _name_

# DESCRIPTION

**dnstracer** determines where a DNS server gets its information from by tracing the DNS resolution path from root servers down to the authoritative nameserver.

Useful for debugging DNS issues and understanding DNS delegation.

# PARAMETERS

**-s** _server_
> Start with specified DNS server

**-4**
> Only query IPv4 servers

**-6**
> Only query IPv6 servers

**-r** _count_
> Number of retries on failure

**-v**
> Verbose output

**-o**
> Overview of all received answers

# CAVEATS

Requires network access to DNS servers. Tracing may take time for complex delegations. Some DNS servers may block tracing queries.

# SEE ALSO

[dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [host](/man/host)(1)
