# TLDR

**Lookup NetBIOS name**

```nmblookup [hostname]```

**Lookup with broadcast**

```nmblookup -B [192.168.1.255] [hostname]```

**Query specific WINS server**

```nmblookup -U [wins_server] [hostname]```

**Lookup IP address** (reverse lookup)

```nmblookup -A [192.168.1.100]```

**Show master browser**

```nmblookup -M -- -```

**List workgroup members**

```nmblookup -S [WORKGROUP]```

**Recursive query**

```nmblookup -R [hostname]```

# SYNOPSIS

**nmblookup** [_-B broadcast_] [_-U unicast_] [_-A_] [_-M_] [_options_] _name_

# PARAMETERS

**-B** _ADDR_
> Broadcast address.

**-U** _ADDR_
> Unicast address (WINS server).

**-A**
> Node status query (reverse lookup).

**-M**
> Search for master browser.

**-R**
> Recursive query through WINS.

**-S**
> Return full node status.

**-d** _LEVEL_
> Debug level.

**-s** _FILE_
> Smb.conf file location.

**-r**
> Use /etc/hosts.

**-T**
> Translate to DNS names.

**--usage**
> Show usage.

# DESCRIPTION

**nmblookup** queries NetBIOS names and resolves them to IP addresses. It's the NetBIOS equivalent of nslookup for DNS.

NetBIOS name resolution predates DNS in Windows networks. Machines register names on the network, and nmblookup finds their IP addresses.

Broadcast mode sends queries to the local network segment. WINS (Windows Internet Name Service) provides network-wide resolution through a server.

Node status queries (-A) reveal all registered NetBIOS names for a host. This shows shared resources, workgroup membership, and service names.

Master browser queries find the computer managing browse lists for a workgroup. This is useful for diagnosing network browsing issues.

The tool integrates with Samba configuration, using smb.conf settings for defaults.

# CAVEATS

NetBIOS is legacy technology. Broadcast queries only reach local subnet. WINS servers are increasingly rare. Modern networks prefer DNS.

# HISTORY

**nmblookup** is part of the **Samba** suite, developed by **Andrew Tridgell** and the Samba Team since the **1990s**. It provides Unix/Linux tools for interoperating with Windows networks.

# SEE ALSO

[smbclient](/man/smbclient)(1), [net](/man/net)(8), [nbtscan](/man/nbtscan)(1), [nslookup](/man/nslookup)(1)
