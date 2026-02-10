# TAGLINE

runs K3s Kubernetes clusters in Docker

# TLDR

**Create cluster**

```k3d cluster create [name]```

**Create with multiple nodes**

```k3d cluster create [name] --agents [3]```

**List clusters**

```k3d cluster list```

**Delete cluster**

```k3d cluster delete [name]```

**Start stopped cluster**

```k3d cluster start [name]```

**Create with port mapping**

```k3d cluster create [name] -p "[8080:80@loadbalancer]"```

# SYNOPSIS

**k3d** _command_ [_options_]

# PARAMETERS

**cluster create** _NAME_
> Create new cluster.

**cluster delete** _NAME_
> Delete cluster.

**cluster list**
> List clusters.

**cluster start** _NAME_
> Start cluster.

**--agents** _N_
> Number of agent nodes.

**-p** _MAPPING_
> Port mapping.

**--help**
> Display help information.

# DESCRIPTION

**k3d** runs K3s Kubernetes clusters in Docker. It provides fast local Kubernetes environments for development.

The tool manages multiple clusters easily. It maps ports and volumes from containers to host.

# CAVEATS

Requires Docker. Development focused. Not for production.

# HISTORY

k3d was created by **Rancher** to simplify running K3s in Docker containers for local Kubernetes development.

# SEE ALSO

[k3s](/man/k3s)(1), [kubectl](/man/kubectl)(1), [kind](/man/kind)(1), [docker](/man/docker)(1)
