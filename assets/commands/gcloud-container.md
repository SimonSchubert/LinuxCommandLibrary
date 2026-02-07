# TAGLINE

Google Kubernetes Engine cluster management

# TLDR

**Create GKE cluster**

```gcloud container clusters create [name] --zone=[zone]```

**List clusters**

```gcloud container clusters list```

**Get credentials**

```gcloud container clusters get-credentials [name] --zone=[zone]```

**Delete cluster**

```gcloud container clusters delete [name] --zone=[zone]```

**Resize node pool**

```gcloud container clusters resize [name] --node-pool=[pool] --num-nodes=[3]```

# SYNOPSIS

**gcloud container** _resource_ _command_ [_options_]

# PARAMETERS

_RESOURCE_
> Resource type: clusters, node-pools, images.

**clusters** _CMD_
> GKE cluster management.

**node-pools** _CMD_
> Node pool operations.

**images** _CMD_
> Container image operations.

**get-credentials** _CLUSTER_
> Configure kubectl for cluster.

**--zone** _ZONE_
> Cluster zone.

**--help**
> Display help information.

# DESCRIPTION

**gcloud container** provides comprehensive management for Google Kubernetes Engine (GKE), Google's managed Kubernetes service. It handles the complete lifecycle of Kubernetes clusters without requiring manual setup of master nodes or control plane components.

The clusters subcommand creates and manages GKE clusters with customizable node configurations, network settings, and Kubernetes versions. Node pools allow heterogeneous clusters with different machine types or configurations for different workload types. Scaling operations can adjust cluster capacity by modifying node pool sizes.

A critical feature is get-credentials, which configures kubectl by writing cluster authentication details to your kubeconfig file. This seamlessly connects the standard Kubernetes CLI tools to your GKE clusters. The command integrates with Google Container Registry for private image storage and supports advanced features like cluster autoscaling, node auto-repair, and automatic Kubernetes version upgrades.

# CAVEATS

Clusters incur costs. Creation takes time. Kubectl configuration required for access.

# HISTORY

gcloud container is part of the **Google Cloud SDK** for managing GKE, Google's managed Kubernetes service for running containerized applications.

# SEE ALSO

[gcloud](/man/gcloud)(1), [kubectl](/man/kubectl)(1), [gcloud-compute](/man/gcloud-compute)(1)
