# TAGLINE

Name Service Switch database query tool

# TLDR

Get list of all **groups**

```getent group```

See the **members** of a group

```getent group [group_name]```

Get list of all **services**

```getent services```

Find a **username by UID**

```getent passwd 1000```

Perform a **reverse DNS lookup**

```getent hosts [host]```

# SYNOPSIS

**getent** _database_ [_key_...]

# PARAMETERS

**passwd**
> User account database (/etc/passwd and NSS sources)

**group**
> Group database (/etc/group and NSS sources)

**hosts**
> Hostname/IP resolution (like /etc/hosts, DNS)

**services**
> Network services (/etc/services)

**protocols**
> Network protocols (/etc/protocols)

**networks**
> Network names and addresses

**shadow**
> Shadow password entries (requires root)

**aliases**
> Mail aliases

# CONFIGURATION

**/etc/nsswitch.conf**
> Name Service Switch configuration determining which sources to query for each database type.

# DESCRIPTION

**getent** queries entries from administrative databases configured in the Name Service Switch (NSS), including local files, LDAP, NIS, and other sources. It provides a unified interface to look up users, groups, hosts, and other system information regardless of where the data is stored.

Unlike directly reading files like /etc/passwd, getent returns results from all configured NSS sources, making it essential for systems using centralized authentication (LDAP, Active Directory, etc.).

Without a key, getent lists all entries in the database. With a key, it returns only matching entries.

# CAVEATS

The shadow database requires root privileges. Some databases may not support enumeration (listing all entries). Results depend on NSS configuration in /etc/nsswitch.conf.

# HISTORY

getent has been part of the GNU C Library (glibc) since the implementation of the Name Service Switch in the early 1990s, providing a standard way to query system databases that may come from multiple sources.

# SEE ALSO

[id](/man/id)(1), [groups](/man/groups)(1), [host](/man/host)(1), [nsswitch.conf](/man/nsswitch.conf)(5)
