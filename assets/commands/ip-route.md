# TLDR

Show **routing** table

```ip route```

Add **default** gateway

```sudo ip route add default via gateway_ip```

Add default via **interface**

```sudo ip route add default dev eth0```

Add **static** route

```sudo ip route add destination_ip via gateway_ip dev eth0```

**Delete** route

```sudo ip route delete destination_ip dev eth0```

**Change** route

```sudo ip route change destination_ip via gateway_ip dev eth0```

**Get** route to destination

```ip route get destination_ip```

Show specific **table**

```ip route list table 100```

# SYNOPSIS

**ip route** [_command_] [_OPTIONS_]

# DESCRIPTION

**ip route** manages the kernel routing table. It can add, delete, and modify routes, as well as query which route the kernel will use for a specific destination.

# PARAMETERS

**list** (or no command)
> Display the routing table

**add**
> Add a new route

**delete**
> Remove a route

**change**
> Modify an existing route

**replace**
> Change or add if not exists

**get** _address_
> Show route for a specific destination

**default**
> Default gateway route

**via** _gateway_
> Specify next-hop gateway

**dev** _interface_
> Specify output interface

**table** _id_
> Work with a specific routing table

# CAVEATS

Routes added are not persistent; use network configuration files for persistence. Multiple routing tables can be used with policy routing. The default table is "main".

# HISTORY

**ip route** is part of **iproute2**, replacing the deprecated route command.

# SEE ALSO

[ip](/man/ip)(8), [ip-address](/man/ip-address)(8), [routel](/man/routel)(8)
