# TLDR

**Generate configuration**

```talosctl gen config [cluster-name] [https://endpoint:6443]```

**Apply configuration**

```talosctl apply-config --nodes [192.168.1.10] --file [controlplane.yaml]```

**Bootstrap cluster**

```talosctl bootstrap --nodes [192.168.1.10]```

**Get cluster info**

```talosctl --nodes [192.168.1.10] dashboard```

**Show services**

```talosctl --nodes [192.168.1.10] services```

**View logs**

```talosctl --nodes [192.168.1.10] logs [kubelet]```

**Get kubeconfig**

```talosctl kubeconfig --nodes [192.168.1.10]```

# SYNOPSIS

**talosctl** [_--nodes nodes_] [_--endpoints endpoints_] _command_ [_options_]

# PARAMETERS

**--nodes** _NODES_
> Target nodes.

**--endpoints** _ENDPOINTS_
> API endpoints.

**-n** _NODE_
> Single node.

**--talosconfig** _FILE_
> Config file.

# COMMANDS

**gen config** - Generate configs
**apply-config** - Apply to node
**bootstrap** - Bootstrap etcd
**kubeconfig** - Get kubeconfig
**dashboard** - Node dashboard
**services** - List services
**logs** - View logs

# DESCRIPTION

**talosctl** manages Talos Linux Kubernetes nodes. Talos is an immutable OS for Kubernetes.

Configuration generation creates machine configs. Control plane and worker configs.

Bootstrap initializes the cluster. First control plane node starts etcd.

Dashboard shows node status. Resources, services, and health.

Kubeconfig retrieves cluster access. Connect with kubectl.

# CAVEATS

Talos-specific tool. Nodes must be Talos. API access required.

# HISTORY

**Talos** was created by **Sidero Labs** as a minimal, immutable Kubernetes OS. talosctl provides complete lifecycle management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [docker](/man/docker)(1)
