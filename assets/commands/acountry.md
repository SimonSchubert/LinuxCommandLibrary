# TAGLINE

IP address country lookup via DNS (obsolete, removed from c-ares)

# TLDR

Print the **country** where an IPv4 address or host is located

```acountry [example.com]```

Look up **several** hosts or addresses

```acountry [example.com] [192.0.2.1]```

Print extra **debugging** output

```acountry -d [example.com]```

Print more **verbose** information

```acountry -v [example.com]```

# SYNOPSIS

**acountry** [_-?hdv_] _host_|_addr_ ...

# DESCRIPTION

**acountry** printed the country where an IPv4 address or hostname is located. It resolved hostnames with the **c-ares** asynchronous DNS library, then queried the third-party **countries.nerd.dk** DNS zone with the reversed address and derived the country code from the answer. The tool was one of the small utilities shipped with c-ares.

Because it relied only on DNS, it needed no local GeoIP database and was limited to country-level granularity.

# PARAMETERS

**-d**
> Print extra debugging output

**-v**
> Print more verbose information

**-h**, **-?**
> Display help

# CAVEATS

The **countries.nerd.dk** service has been decommissioned, so acountry can no longer return results even where an old binary is still installed. No comparable DNS service exists. Use a GeoIP database or web service instead.

# HISTORY

Part of the **c-ares** asynchronous DNS resolver library tools since 2007. It stopped being built in **c-ares 1.20.0** (2023) after nerd.dk went offline, and the source and manual page were removed in **c-ares 1.28.0** (2024).

# SEE ALSO

[ahost](/man/ahost)(1), [adig](/man/adig)(1), [host](/man/host)(1), [dig](/man/dig)(1), [nslookup](/man/nslookup)(1)

# RESOURCES

```[Source code](https://github.com/c-ares/c-ares)```

```[Homepage](https://c-ares.org)```

<!-- verified: 2026-11-09 -->
