# TAGLINE

Manage Azure Kubernetes Service clusters

# TLDR

**Create a Kubernetes cluster**

```az aks create -g [resource-group] -n [cluster-name] --generate-ssh-keys```

**Get credentials** for kubectl

```az aks get-credentials -g [resource-group] -n [cluster-name]```

**List all clusters** in a resource group

```az aks list -g [resource-group] -o table```

**Show cluster details**

```az aks show -g [resource-group] -n [cluster-name]```

**Scale a node pool**

```az aks nodepool scale -g [resource-group] --cluster-name [cluster-name] --name [nodepool1] --node-count [5]```

**Upgrade a cluster** to a newer Kubernetes version

```az aks upgrade -g [resource-group] -n [cluster-name] --kubernetes-version [1.28.0]```

**Stop a running cluster**

```az aks stop -g [resource-group] -n [cluster-name]```

**Start a stopped cluster**

```az aks start -g [resource-group] -n [cluster-name]```

# SYNOPSIS

**az aks** _subcommand_ [_options_]

# DESCRIPTION

**az aks** manages Azure Kubernetes Service (AKS) clusters, providing a managed Kubernetes environment that reduces the complexity of cluster deployment and management.

AKS handles critical tasks like health monitoring, maintenance, and upgrades. Azure manages the Kubernetes control plane, while you manage and pay only for the agent nodes.

# SUBCOMMANDS

**Cluster Management**
> create, delete, show, list, update, start, stop, upgrade, rotate-certs

**Credentials**
> get-credentials, get-versions, get-upgrades, install-cli

**Node Pools**
> nodepool add, nodepool delete, nodepool scale, nodepool upgrade, nodepool list, nodepool show

**Networking**
> check-network, check-acr, approuting enable, approuting disable

**Addons**
> addon enable, addon disable, addon list, addon show, addon update

**Advanced**
> mesh enable, mesh disable, pod-identity add, bastion

# PARAMETERS

**-g, --resource-group** _value_
> Name of the resource group

**-n, --name** _value_
> Name of the managed cluster

**--kubernetes-version** _value_
> Kubernetes version for the cluster

**--node-count** _value_
> Number of nodes in the default node pool

**--generate-ssh-keys**
> Generate SSH key files if not present

**--admin**
> Get cluster admin credentials instead of user credentials

# CAVEATS

Stopping a cluster deallocates compute resources but retains cluster configuration; you are not charged for compute during this time. Upgrading Kubernetes version is a one-way operation. Get-credentials overwrites existing kubeconfig entries by default; use **--overwrite-existing** or **--file** to control this.

# HISTORY

Azure Kubernetes Service (AKS) reached general availability in **June 2018**. It evolved from Azure Container Service (ACS) which supported multiple orchestrators. AKS focuses exclusively on Kubernetes with deep Azure integration.

# SEE ALSO

[az](/man/az)(1), [az-acr](/man/az-acr)(1), [kubectl](/man/kubectl)(1)
