# TLDR

**Resolve** a hostname to an IP address

```resolveip [example.org]```

**Resolve** an IP address to a hostname

```resolveip [1.1.1.1]```

Resolve with **less output**

```resolveip -s [example.org]```

# SYNOPSIS

**resolveip** [_options_] _hostname_or_ip_...

# PARAMETERS

**-s**, **--silent**
> Silent mode; print only IP addresses or hostnames

**-h**, **--help**
> Display help message

**-v**, **--version**
> Display version information

# DESCRIPTION

**resolveip** resolves hostnames to IP addresses and performs reverse lookups of IP addresses to hostnames. It is a utility included with MariaDB/MySQL for basic DNS resolution, often used in database configuration scripts.

The command accepts multiple arguments and resolves each in turn. For hostnames, it returns all associated IP addresses; for IP addresses, it returns the hostname from reverse DNS.

# CAVEATS

Depends on system DNS configuration (/etc/resolv.conf). May return different results than web browsers due to local DNS caching or hosts file entries. For more comprehensive DNS queries, consider using **dig** or **host** commands.

# HISTORY

Included with **MariaDB** and **MySQL** as a simple utility for resolving hostnames in database administration contexts. While basic compared to tools like dig, it provides straightforward output suitable for scripts.

# SEE ALSO

[host](/man/host)(1), [dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [getent](/man/getent)(1)
