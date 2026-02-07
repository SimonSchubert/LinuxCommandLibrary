# TAGLINE

DNS lookup utility using the c-ares library

# TLDR

Display **A record** (default) from DNS for a hostname

```adig [example.com]```

Display extra **debugging** output

```adig -d [example.com]```

Connect to a **specific DNS server**

```adig -s [1.2.3.4] [example.com]```

Use a specific **TCP port** to connect to a DNS server

```adig -T [port] [example.com]```

Use a specific **UDP port** to connect to a DNS server

```adig -U [port] [example.com]```

# SYNOPSIS

**adig** [_-d_] [_-s server_] [_-T port_] [_-U port_] [_-t type_] _hostname_

# DESCRIPTION

**adig** prints information received from Domain Name System (DNS) servers. It performs DNS lookups and displays the results, similar to **dig** but built on the c-ares asynchronous resolver library.

The tool supports querying specific record types such as A, AAAA, MX, NS, CNAME, SOA, and others. It can direct queries to a particular DNS server and use custom TCP or UDP port numbers for the connection. Debug output is available for troubleshooting resolution issues.

# PARAMETERS

**-d**
> Display extra debugging output

**-s server**
> Connect to a specific DNS server IP address

**-T port**
> Use a specific TCP port to connect to the DNS server

**-U port**
> Use a specific UDP port to connect to the DNS server

**-t type**
> Query for a specific record type (A, AAAA, MX, NS, etc.)

# CAVEATS

Part of the c-ares library tools. May have different features compared to the more common **dig** command from BIND.

# HISTORY

Part of the **c-ares** asynchronous DNS resolver library, originally forked from the ares library and actively maintained.

# SEE ALSO

[ahost](/man/ahost)(1), [acountry](/man/acountry)(1), [dig](/man/dig)(1), [host](/man/host)(1)
