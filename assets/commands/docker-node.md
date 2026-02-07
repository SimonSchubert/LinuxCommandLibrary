# TAGLINE

manage Docker Swarm cluster nodes

# TLDR

**List swarm nodes**

```docker node ls```

**Inspect a node**

```docker node inspect [node]```

**Promote node to manager**

```docker node promote [node]```

**Demote manager to worker**

```docker node demote [node]```

**Update node availability**

```docker node update --availability [drain] [node]```

**Add label to node**

```docker node update --label-add [key=value] [node]```

**Remove a node**

```docker node rm [node]```

# SYNOPSIS

**docker** **node** _command_ [_options_]

# SUBCOMMANDS

**ls**
> List nodes in the swarm.

**inspect**
> Display detailed node information.

**update**
> Update a node.

**promote**
> Promote nodes to manager.

**demote**
> Demote managers to workers.

**rm**
> Remove nodes from swarm.

**ps**
> List tasks running on nodes.

# DESCRIPTION

**docker node** manages Swarm nodes. Nodes are Docker hosts participating in a swarm cluster. Only works when the Docker daemon is running in swarm mode. Managers coordinate cluster operations while workers execute tasks. Node management includes controlling availability, labels for task placement constraints, and role assignments.

# SEE ALSO

[docker-swarm](/man/docker-swarm)(1), [docker-service](/man/docker-service)(1)

