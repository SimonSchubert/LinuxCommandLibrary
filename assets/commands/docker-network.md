# TLDR

**List networks**

```docker network ls```

**Create a network**

```docker network create [name]```

**Create bridge network with subnet**

```docker network create --driver bridge --subnet [192.168.1.0/24] [name]```

**Connect container to network**

```docker network connect [network] [container]```

**Disconnect container**

```docker network disconnect [network] [container]```

**Inspect network**

```docker network inspect [network]```

**Remove network**

```docker network rm [network]```

# SYNOPSIS

**docker** **network** _command_ [_options_]

# SUBCOMMANDS

**ls**
> List networks.

**create**
> Create a network.

**rm**
> Remove networks.

**inspect**
> Display detailed information.

**connect**
> Connect container to network.

**disconnect**
> Disconnect container from network.

**prune**
> Remove unused networks.

# DESCRIPTION

**docker network** manages Docker networks. Networks enable communication between containers. Supports bridge, host, overlay, and macvlan drivers.

# SEE ALSO

[docker-run](/man/docker-run)(1), [docker-compose](/man/docker-compose)(1)

