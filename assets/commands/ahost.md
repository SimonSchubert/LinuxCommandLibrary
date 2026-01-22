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

**ahost** is a DNS lookup utility that displays the A or AAAA record linked with a hostname or IP address. It uses the c-ares asynchronous DNS library to perform lookups.

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
