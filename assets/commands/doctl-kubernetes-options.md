# TAGLINE

enumerate available Kubernetes configuration values

# TLDR

**List Kubernetes versions**

```doctl kubernetes options versions```

**List available regions**

```doctl kubernetes options regions```

**List node sizes**

```doctl kubernetes options sizes```

**List versions in a specific output format**

```doctl kubernetes options versions --format [slug]```

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
> List machine sizes available for node pools.

**--format** _columns_
> Columns for output in a comma-separated list.

**--no-header**
> Return raw data with no headers.

**--help**
> Display help information.

# DESCRIPTION

**doctl kubernetes options** enumerates valid values for use with DigitalOcean Kubernetes (DOKS) cluster commands. It helps users determine valid values for cluster creation and modification, such as supported Kubernetes versions, regions where DOKS is available, and machine sizes suitable for worker nodes.

Using these options ensures cluster configurations are valid and helps identify available resources in different regions.

# CAVEATS

Options may change as DigitalOcean updates offerings. Not all sizes available in all regions. Kubernetes versions have support lifecycles.

# HISTORY

doctl kubernetes options is part of the Kubernetes management commands added to **doctl** when DigitalOcean launched their managed Kubernetes service (DOKS) in **2018**.

# SEE ALSO

[doctl](/man/doctl)(1), [kubectl](/man/kubectl)(1), [doctl-kubernetes-cluster](/man/doctl-kubernetes-cluster)(1)
