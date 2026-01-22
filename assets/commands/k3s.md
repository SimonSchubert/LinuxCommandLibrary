# TLDR

**Start server**

```sudo k3s server```

**Join as agent**

```sudo k3s agent --server [https://server:6443] --token [token]```

**Get kubeconfig**

```sudo k3s kubectl config view```

**Run kubectl command**

```k3s kubectl get pods```

**Start with disabled components**

```sudo k3s server --disable traefik```

**Check token**

```sudo cat /var/lib/rancher/k3s/server/node-token```

# SYNOPSIS

**k3s** _command_ [_options_]

# PARAMETERS

**server**
> Start control plane.

**agent**
> Start worker node.

**kubectl**
> Run kubectl commands.

**--server** _URL_
> Server URL for agent.

**--token** _TOKEN_
> Join token.

**--disable** _COMPONENT_
> Disable component.

**--help**
> Display help information.

# DESCRIPTION

**K3s** is a lightweight Kubernetes distribution. It runs a full Kubernetes cluster with minimal resources.

The tool packages Kubernetes, containerd, and Flannel in a single binary. It's designed for edge, IoT, and development.

K3s is lightweight Kubernetes.

# CAVEATS

Simplified Kubernetes. Single binary. Uses sqlite3 by default.

# HISTORY

K3s was created by **Rancher Labs** in 2019 as a lightweight, certified Kubernetes distribution.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k3d](/man/k3d)(1), [crictl](/man/crictl)(1)
