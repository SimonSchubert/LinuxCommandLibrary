# TAGLINE

Manage Talos Linux Kubernetes nodes

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

**talosctl** is the command-line tool for managing Talos Linux, a minimal and immutable operating system purpose-built for running Kubernetes. It provides complete lifecycle management for Talos nodes, from initial configuration generation through ongoing cluster operations.

The **gen config** command creates machine configuration files for control plane and worker nodes, including certificates and secrets needed for secure cluster communication. The **apply-config** command pushes these configurations to nodes, and **bootstrap** initializes the etcd cluster on the first control plane node to start the Kubernetes cluster.

For day-to-day operations, talosctl provides a **dashboard** for monitoring node health and resource usage, **services** for inspecting running system services, and **logs** for viewing service output. The **kubeconfig** command retrieves cluster credentials for use with kubectl. All communication with nodes uses mutual TLS authentication configured through the talosconfig file.

# CONFIGURATION

**~/.talos/config**
> Default talosconfig file containing cluster endpoints, node addresses, and TLS credentials for authenticating with Talos nodes

**--talosconfig** _FILE_
> Override the default config file location via command-line flag

**TALOSCONFIG**
> Environment variable to specify an alternative talosconfig file path

# CAVEATS

Talos-specific tool. Nodes must be Talos. API access required.

# HISTORY

**Talos** was created by **Sidero Labs** as a minimal, immutable Kubernetes OS. talosctl provides complete lifecycle management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [docker](/man/docker)(1)
