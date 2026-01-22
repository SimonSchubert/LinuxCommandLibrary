# TLDR

**Create cluster**

```kops create cluster --name=[cluster.example.com] --zones=[us-east-1a]```

**Update cluster**

```kops update cluster [cluster.example.com] --yes```

**Validate cluster**

```kops validate cluster [cluster.example.com]```

**Delete cluster**

```kops delete cluster [cluster.example.com] --yes```

**Edit cluster**

```kops edit cluster [cluster.example.com]```

**Export kubeconfig**

```kops export kubeconfig [cluster.example.com]```

# SYNOPSIS

**kops** _command_ [_options_]

# PARAMETERS

**create cluster**
> Create cluster configuration.

**update cluster**
> Apply cluster changes.

**validate cluster**
> Verify cluster health.

**delete cluster**
> Delete cluster.

**--name** _NAME_
> Cluster name.

**--zones** _ZONES_
> Availability zones.

**--yes**
> Confirm changes.

**--help**
> Display help information.

# DESCRIPTION

**kops** manages production Kubernetes clusters. It creates, updates, and destroys clusters on cloud providers.

The tool handles networking, node groups, and add-ons. It supports AWS, GCE, and other clouds.

kops manages production K8s clusters.

# CAVEATS

Cloud provider credentials needed. DNS configuration required. Production-focused tool.

# HISTORY

kops (Kubernetes Operations) was created to help manage production-grade Kubernetes clusters on cloud infrastructure.

# SEE ALSO

[kubectl](/man/kubectl)(1), [eksctl](/man/eksctl)(1), [kubeadm](/man/kubeadm)(1)
