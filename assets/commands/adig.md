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

Modern c-ares (1.34 and later):

**adig** [_@server_] [_-c class_] [_-p port_] [_-q name_] [_-t type_] [_-x addr_] _name_ [_type_] [_class_]

# DESCRIPTION

**adig** prints information received from Domain Name System (DNS) servers. It performs DNS lookups and displays the results, similar to **dig** but built on the c-ares asynchronous resolver library.

The tool supports querying specific record types such as A, AAAA, MX, NS, CNAME, SOA, and others. It can direct queries to a particular DNS server and use custom port numbers for the connection. Debug output is available for troubleshooting resolution issues.

As of c-ares 1.34, the command-line interface was reworked to closely mimic **dig** from BIND, so the server is given as **@server** and the legacy **-d**, **-T**, and **-U** flags shown below apply to older releases.

# PARAMETERS

**-d**
> Display extra debugging output (legacy interface)

**-s server**
> Connect to a specific DNS server IP address. In c-ares 1.34 and later prefer the **@server** syntax

**-T port**
> Use a specific TCP port to connect to the DNS server (legacy interface)

**-U port**
> Use a specific UDP port to connect to the DNS server (legacy interface)

**-p port**
> Send the query to a port other than 53 (c-ares 1.34 and later)

**-t type**
> Query for a specific record type (A, AAAA, MX, NS, etc.)

**-c class**
> Set the query class; defaults to IN, may also be HS or CH (c-ares 1.34 and later)

**-x addr**
> Perform a simplified reverse lookup: set the type to PTR and build the in-addr.arpa query string (c-ares 1.34 and later)

# CAVEATS

Part of the c-ares library tools. May have different features compared to the more common **dig** command from BIND. The flag set differs between releases: c-ares 1.34 reworked the interface to match **dig**, replacing the older **-d**, **-T**, and **-U** options.

# HISTORY

Part of the **c-ares** asynchronous DNS resolver library, originally forked from the ares library and actively maintained. In release 1.34.0 the **adig** command-line arguments were reworked to mimic **dig** from BIND, and the tool gained support for reading default arguments from an **~/.adigrc** file.

# INSTALL

```apk: sudo apk add c-ares-utils```

```zypper: sudo zypper install c-ares-utils```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[ahost](/man/ahost)(1), [acountry](/man/acountry)(1), [dig](/man/dig)(1), [host](/man/host)(1), [nslookup](/man/nslookup)(1)

# RESOURCES

```[Source code](https://github.com/c-ares/c-ares)```

```[Homepage](https://c-ares.org/)```

<!-- verified: 2026-06-11 -->
