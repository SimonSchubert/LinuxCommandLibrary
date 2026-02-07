# TAGLINE

display available Kubernetes configuration options

# TLDR

**List Kubernetes versions**

```doctl kubernetes options versions```

**List available regions**

```doctl kubernetes options regions```

**List node sizes**

```doctl kubernetes options sizes```

# SYNOPSIS

**doctl kubernetes options** _command_

# PARAMETERS

_COMMAND_
> Option type: versions, regions, sizes.

**versions**
> List available Kubernetes versions.

**regions**
> List regions supporting Kubernetes.

**sizes**
> List node pool sizes.

**--help**
> Display help information.

# DESCRIPTION

**doctl kubernetes options** displays available configuration options for DigitalOcean Kubernetes (DOKS) clusters. It helps users determine valid values for cluster creation and modification.

The command shows supported Kubernetes versions, regions where DOKS is available, and node sizes suitable for worker nodes. This information is essential for planning cluster deployments.

Using these options ensures cluster configurations are valid and helps identify available resources in different regions.

# CAVEATS

Options may change as DigitalOcean updates offerings. Not all sizes available in all regions. Kubernetes versions have support lifecycles.

# HISTORY

doctl kubernetes options is part of the Kubernetes management commands added to **doctl** when DigitalOcean launched their managed Kubernetes service (DOKS) in **2018**.

# SEE ALSO

[doctl](/man/doctl)(1), [kubectl](/man/kubectl)(1), [doctl-kubernetes-cluster](/man/doctl-kubernetes-cluster)(1)
