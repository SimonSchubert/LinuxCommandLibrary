# TAGLINE

Kubernetes Cluster API management CLI

# TLDR

**Initialize management cluster**

```clusterctl init --infrastructure [aws]```

**Initialize with specific version**

```clusterctl init --infrastructure [aws:v2.0.0]```

**Generate cluster template**

```clusterctl generate cluster [mycluster] --kubernetes-version [v1.28.0]```

**Get workload cluster kubeconfig**

```clusterctl get kubeconfig [mycluster]```

**Upgrade providers**

```clusterctl upgrade apply --contract [v1beta1]```

**Move resources between clusters**

```clusterctl move --to-kubeconfig [target.kubeconfig]```

**Delete provider**

```clusterctl delete --infrastructure [aws]```

# SYNOPSIS

**clusterctl** _command_ [_options_]

# DESCRIPTION

**clusterctl** is the command-line tool for managing Kubernetes Cluster API (CAPI) management clusters. It handles the full lifecycle of cluster infrastructure providers, from initial installation through upgrades and deletion.

The tool can initialize a Kubernetes cluster as a CAPI management cluster by installing infrastructure providers (AWS, Azure, vSphere, etc.), bootstrap providers, and control plane providers. Once initialized, it generates cluster templates for creating workload clusters and retrieves their kubeconfigs.

clusterctl also supports moving Cluster API resources between management clusters, which is essential for upgrade scenarios and disaster recovery. The upgrade commands help keep providers in sync with the latest releases and API contract versions.

# COMMANDS

**init**
> Install Cluster API components

**generate cluster**
> Generate cluster template

**generate yaml**
> Process YAML templates

**get kubeconfig**
> Get workload cluster kubeconfig

**upgrade plan**
> Show upgrade recommendations

**upgrade apply**
> Apply provider upgrades

**move**
> Move resources between clusters

**delete**
> Delete providers

**describe cluster**
> Describe cluster resources

# INIT OPTIONS

**--infrastructure** _provider_
> Infrastructure provider (aws, azure, vsphere, etc.)

**--bootstrap** _provider_
> Bootstrap provider

**--control-plane** _provider_
> Control plane provider

**--target-namespace** _ns_
> Target namespace for providers

**--core** _provider_
> Core provider version

# CONFIGURATION

**~/.cluster-api/clusterctl.yaml**
> Main configuration file for providers, variables, and image overrides.

# CAVEATS

Set GITHUB_TOKEN to avoid API rate limiting. Requires kubectl configured for target cluster. Uses go proxy for version detection.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kind](/man/kind)(1), [kubeadm](/man/kubeadm)(1)
