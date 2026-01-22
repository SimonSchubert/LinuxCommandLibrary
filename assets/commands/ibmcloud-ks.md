# TLDR

**List clusters**

```ibmcloud ks clusters```

**Create cluster**

```ibmcloud ks cluster create classic --name [my-cluster]```

**Get cluster config**

```ibmcloud ks cluster config --cluster [cluster-name]```

**List worker nodes**

```ibmcloud ks workers --cluster [cluster-name]```

**Show cluster info**

```ibmcloud ks cluster get --cluster [cluster-name]```

# SYNOPSIS

**ibmcloud ks** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Kubernetes Service command.

**clusters**
> List clusters.

**cluster create**
> Create cluster.

**cluster config**
> Get kubeconfig.

**workers**
> List worker nodes.

**cluster get**
> Show cluster info.

**--help**
> Display help information.

# DESCRIPTION

**ibmcloud ks** manages IBM Cloud Kubernetes Service. It creates and manages Kubernetes clusters on IBM Cloud infrastructure.

The tool handles cluster lifecycle, worker pools, and configuration. It integrates with kubectl for cluster access.

ibmcloud ks manages Kubernetes clusters.

# CAVEATS

IKS plugin required. Cluster costs apply. Regional deployment options.

# HISTORY

ibmcloud ks is the Kubernetes Service plugin for **IBM Cloud** CLI.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [kubectl](/man/kubectl)(1), [ibmcloud-cr](/man/ibmcloud-cr)(1)
