# TLDR

**Scan network for NetBIOS names**

```nbtscan [192.168.1.0/24]```

**Scan single host**

```nbtscan [192.168.1.10]```

**Verbose output**

```nbtscan -v [192.168.1.0/24]```

**Human readable output**

```nbtscan -h [192.168.1.0/24]```

**Show all names**

```nbtscan -f [192.168.1.0/24]```

**Set timeout**

```nbtscan -t [5] [192.168.1.0/24]```

# SYNOPSIS

**nbtscan** [_options_] _target_

# PARAMETERS

_TARGET_
> IP address or network range.

**-v**
> Verbose mode.

**-h**
> Human readable output.

**-f**
> Show full NBT resource records.

**-t** _SECS_
> Timeout in seconds.

**--help**
> Display help information.

# DESCRIPTION

**nbtscan** scans networks for NetBIOS name information. It queries Windows/Samba hosts.

The tool identifies Windows machines. Shows computer names and workgroups.

nbtscan scans NetBIOS names.

# CAVEATS

Network scanning tool. Windows/Samba networks. May trigger security alerts.

# HISTORY

nbtscan was created for **network reconnaissance** to identify Windows machines via NetBIOS queries.

# SEE ALSO

[nmblookup](/man/nmblookup)(1), [nmap](/man/nmap)(1), [smbclient](/man/smbclient)(1)

