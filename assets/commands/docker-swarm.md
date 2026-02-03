# TLDR

**Initialize a swarm**

```docker swarm init```

**Initialize with advertised address**

```docker swarm init --advertise-addr [ip:port]```

**Join swarm as worker**

```docker swarm join --token [token] [manager:port]```

**Get join token**

```docker swarm join-token [worker|manager]```

**Leave the swarm**

```docker swarm leave```

**Force leave as manager**

```docker swarm leave --force```

**Update swarm configuration**

```docker swarm update --autolock=[true]```

# SYNOPSIS

**docker** **swarm** _command_ [_options_]

# SUBCOMMANDS

**init**
> Initialize a swarm.

**join**
> Join a swarm as node.

**join-token**
> Manage join tokens.

**leave**
> Leave the swarm.

**update**
> Update swarm configuration.

**ca**
> Manage swarm CA.

**unlock**
> Unlock swarm.

**unlock-key**
> Manage unlock key.

# DESCRIPTION

**docker swarm** manages a Docker Swarm cluster. Swarm mode enables native clustering, service orchestration, load balancing, and secure communication between nodes.

# SEE ALSO

[docker-node](/man/docker-node)(1), [docker-service](/man/docker-service)(1)

