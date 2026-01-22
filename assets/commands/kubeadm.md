# TLDR

**Initialize control plane**

```sudo kubeadm init```

**Join worker node**

```sudo kubeadm join [control-plane:6443] --token [token] --discovery-token-ca-cert-hash [hash]```

**Create join token**

```kubeadm token create --print-join-command```

**Reset node**

```sudo kubeadm reset```

**Upgrade cluster**

```sudo kubeadm upgrade apply [v1.28.0]```

**Generate default config**

```kubeadm config print init-defaults```

# SYNOPSIS

**kubeadm** _command_ [_options_]

# PARAMETERS

**init**
> Initialize control plane.

**join** _ENDPOINT_
> Join cluster as node.

**reset**
> Reset node to pre-init state.

**upgrade**
> Upgrade cluster components.

**token** _CMD_
> Manage join tokens.

**config** _CMD_
> Manage configuration.

**--help**
> Display help information.

# DESCRIPTION

**kubeadm** bootstraps Kubernetes clusters. It initializes control planes and joins worker nodes.

The tool handles certificates, kubelet config, and add-ons. It follows best practices for cluster setup.

kubeadm bootstraps Kubernetes clusters.

# CAVEATS

Requires root. Container runtime needed. Network plugin not included.

# HISTORY

kubeadm was created as the official cluster bootstrapping tool for **Kubernetes**, simplifying cluster setup.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubelet](/man/kubelet)(8), [kops](/man/kops)(1)
