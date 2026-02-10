# TAGLINE

bootstraps Kubernetes clusters

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

**kubeadm** is the official Kubernetes cluster bootstrapping tool that automates the setup of a production-grade control plane. It handles the complex initialization process including generating TLS certificates for cluster components, configuring the kubelet, deploying the kube-apiserver, kube-controller-manager, and kube-scheduler as static pods, and installing cluster-essential add-ons like CoreDNS and kube-proxy.

The workflow centers on two primary commands: `kubeadm init` to create a new control plane on the first node, and `kubeadm join` to add worker nodes or additional control plane nodes to an existing cluster using bootstrap tokens. The tool also manages cluster lifecycle operations such as upgrading Kubernetes versions across the cluster, rotating certificates, and resetting nodes back to a clean state.

kubeadm follows Kubernetes best practices and conformance standards, but intentionally does not provision the underlying infrastructure or install a CNI network plugin, keeping it focused on cluster bootstrapping while remaining composable with other tools for complete cluster management.

# CAVEATS

Requires root. Container runtime needed. Network plugin not included.

# HISTORY

kubeadm was created as the official cluster bootstrapping tool for **Kubernetes**, simplifying cluster setup.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubelet](/man/kubelet)(8), [kops](/man/kops)(1)
