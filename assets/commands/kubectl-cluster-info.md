# TLDR

**Display cluster info**

```kubectl cluster-info```

**Show detailed cluster info**

```kubectl cluster-info dump```

**Dump cluster info to directory**

```kubectl cluster-info dump --output-directory=[path]```

**Dump specific namespaces**

```kubectl cluster-info dump --namespaces=[default],[kube-system]```

# SYNOPSIS

**kubectl** **cluster-info** [_subcommand_] [_options_]

# PARAMETERS

**dump**
> Dump cluster state for debugging.

**--output-directory** _path_
> Directory to dump files.

**--namespaces** _list_
> Namespaces to include in dump.

**--all-namespaces**
> Include all namespaces.

# DESCRIPTION

**kubectl cluster-info** displays the addresses of the control plane and cluster services. The dump subcommand collects cluster state information for debugging, including logs from all pods and cluster metadata.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-get](/man/kubectl-get)(1)

