# TAGLINE

manages the routing policy database, which controls how routing table lookups

# TLDR

Display the **routing policy** database

```ip rule```

**Add** a rule to lookup a specific table

```sudo ip rule add from all lookup [100]```

Add rule based on **source** address

```sudo ip rule add from [192.168.1.0/24]```

Add rule based on **destination** address

```sudo ip rule add to [10.0.0.0/8]```

**Delete** a rule

```sudo ip rule delete from [192.168.1.0/24]```

**Flush** all rules

```sudo ip rule flush```

**Save** rules to a file

```ip rule save > [path/to/rules.dat]```

**Restore** rules from a file

```sudo ip rule restore < [path/to/rules.dat]```

# SYNOPSIS

**ip rule** [_command_] [_options_]

# PARAMETERS

**add** [_selector_] [_action_]
> Add a new rule

**delete** [_selector_]
> Remove a rule

**flush**
> Delete all rules

**save**
> Output rules to stdout (for backup)

**restore**
> Restore rules from stdin

**from** _PREFIX_
> Match source address

**to** _PREFIX_
> Match destination address

**lookup** _TABLE_
> Route table to use (number or name)

**priority** _NUM_
> Rule priority (lower = higher priority)

# DESCRIPTION

**ip rule** manages the routing policy database (RPDB), which controls how routing table lookups are performed. Rules define selectors (conditions) and actions (which table to consult) enabling policy-based routing.

Multiple routing tables can exist, each with different routes. Rules determine which table is consulted based on source address, destination, interface, firewall mark, and other criteria. This enables complex routing scenarios like multi-homing.

# CAVEATS

Modifying rules requires root privileges. Rule changes are not persistent across reboots without additional configuration. Incorrect rules can break network connectivity.

# HISTORY

Policy routing was introduced in Linux 2.2 as part of the advanced routing capabilities. The ip rule command in iproute2 provides management of these features.

# SEE ALSO

[ip](/man/ip)(8), [ip-route](/man/ip-route)(8), [ip-route-add](/man/ip-route-add)(8)
