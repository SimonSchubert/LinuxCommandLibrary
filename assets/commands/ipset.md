# TLDR

**Create** an empty IP set

```ipset create [set_name] hash:ip```

**Add** an IP address to a set

```ipset add [set_name] [192.168.1.25]```

**Delete** an IP address from a set

```ipset del [set_name] [192.168.1.25]```

**Destroy** an IP set

```ipset destroy [set_name]```

**Save** an IP set to file

```ipset save [set_name] > [path/to/ip_set]```

**List** all IP sets

```ipset list```

# SYNOPSIS

**ipset** _command_ [_options_]

# PARAMETERS

**create** _NAME_ _TYPE_
> Create a new IP set (types: hash:ip, hash:net, hash:ip,port, etc.)

**add** _NAME_ _ENTRY_
> Add entry to a set

**del** _NAME_ _ENTRY_
> Remove entry from a set

**destroy** _NAME_
> Delete a set

**list** [_NAME_]
> List set contents

**save** [_NAME_]
> Output sets in restorable format

**restore**
> Restore sets from saved output

**flush** [_NAME_]
> Clear all entries from a set

# DESCRIPTION

**ipset** creates and manages IP sets, which are framework for storing IP addresses, networks, ports, and combinations thereof. Sets can be referenced in iptables/nftables rules for efficient matching against large lists.

Different set types support different entry formats: hash:ip for individual addresses, hash:net for CIDR ranges, hash:ip,port for address-port combinations. Sets use hash tables for O(1) lookup performance.

# CAVEATS

Requires root privileges. Sets must be created before they can be referenced in firewall rules. Set contents are not persistent across reboots without explicit save/restore.

# HISTORY

ipset was developed by Jozsef Kadlecsik to provide efficient set-based matching for the Linux firewall. It became part of the standard Linux networking toolkit and is widely used for implementing blocklists and allowlists.

# SEE ALSO

[iptables](/man/iptables)(8), [nft](/man/nft)(8), [firewalld](/man/firewalld)(1)
