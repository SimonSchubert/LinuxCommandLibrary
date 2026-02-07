# TAGLINE

Look up DNS address records

# TLDR

Print an **A or AAAA record** associated with a hostname

```ahost [example.com]```

Display extra **debugging** output

```ahost -d [example.com]```

Display the record with a **specified type**

```ahost -t [a|aaaa|u] [example.com]```

# SYNOPSIS

**ahost** [_-d_] [_-t type_] _hostname_

# DESCRIPTION

**ahost** is a DNS lookup utility that displays the A (IPv4) or AAAA (IPv6) records associated with a hostname or IP address. It uses the c-ares asynchronous DNS library to perform lookups, making it non-blocking and efficient.

Unlike the more common **host** or **dig** commands, ahost is specifically designed as a lightweight demonstration and utility tool from the c-ares library. It supports reverse lookups and can query for specific record types.

# PARAMETERS

**-d**
> Display extra debugging output

**-t type**
> Display the record with a specified type (a = IPv4, aaaa = IPv6, u = both)

# CAVEATS

Part of the c-ares library tools. May have different features compared to the more common **host** command.

# HISTORY

Part of the **c-ares** asynchronous DNS resolver library, originally forked from the ares library.

# SEE ALSO

[adig](/man/adig)(1), [acountry](/man/acountry)(1), [host](/man/host)(1), [dig](/man/dig)(1)
