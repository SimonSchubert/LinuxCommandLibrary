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

**gcloud container** manages Google Kubernetes Engine (GKE) resources. It creates and manages Kubernetes clusters, node pools, and integrates with Container Registry.

The command handles cluster lifecycle, scaling, upgrades, and authentication. get-credentials configures kubectl to access your GKE cluster.

gcloud container provides the primary CLI interface for GKE operations.

# CAVEATS

Clusters incur costs. Creation takes time. Kubectl configuration required for access.

# HISTORY

gcloud container is part of the **Google Cloud SDK** for managing GKE, Google's managed Kubernetes service for running containerized applications.

# SEE ALSO

[gcloud](/man/gcloud)(1), [kubectl](/man/kubectl)(1), [gcloud-compute](/man/gcloud-compute)(1)
