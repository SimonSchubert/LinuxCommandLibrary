# TAGLINE

list the IP routing tables in a column-formatted view

# TLDR

**List all routes** in the default (main) table

```routel```

**List a specific routing table** by name or id

```routel [main]```

**Show only IPv4 routes**

```routel -4```

**Show only IPv6 routes**

```routel -6```

**Filter to a specific destination** (extra ip route args pass through)

```routel main [10.0.0.0/8]```

**Show the local table**

```routel [local]```

# SYNOPSIS

**routel** [_options_] [_tablenr_ [_ip-route-options_...]]

# PARAMETERS

**-4**
> Shorthand for `--family inet` — IPv4 only.

**-6**
> Shorthand for `--family inet6` — IPv6 only.

**-f**, **--family** _inet_|_inet6_
> Restrict to the given address family.

**-h**, **--help**
> Show help.

_tablenr_
> Routing table name (e.g. `main`, `local`, `default`) or numeric id.

_ip-route-options_
> Any additional arguments are passed to `ip route list` verbatim (destination, via, dev, etc.).

# OUTPUT

The script prints columns:

```
target            gateway           source            proto     scope     dev    tbl
```

Columns with no value are shown as `-`.

# DESCRIPTION

**routel** is a small shell script shipped with **iproute2** that wraps `ip route list` and reformats the output into fixed columns that some users find easier to read than raw `ip` output. Any extra arguments are forwarded to `ip route list`, so any filter that works there also works here.

A sibling script, `routef`, flushes routes. Both are thin helpers; anything they do is also achievable with `ip route`.

# CAVEATS

Pure wrapper — no new features beyond what `ip route list` provides. Some distributions package it in a separate `iproute2-extras` or similar package. Columnar alignment can look awkward in very narrow terminals.

# HISTORY

**routel** was originally written by **Stephen R. van den Berg** and rewritten/maintained by **Stephen Hemminger** as part of the **iproute2** package.

# SEE ALSO

[ip-route](/man/ip-route)(8), [ip](/man/ip)(8), [route](/man/route)(8), [netstat](/man/netstat)(8), [ss](/man/ss)(8)
