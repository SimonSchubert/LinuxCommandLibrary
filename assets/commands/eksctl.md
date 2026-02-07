# TAGLINE

AWS EKS cluster management CLI

# TLDR

**Create EKS cluster**

```eksctl create cluster --name [cluster_name]```

**Create with node** configuration

```eksctl create cluster --name [name] --nodes [3] --node-type [t3.medium]```

**List clusters**

```eksctl get clusters```

**Delete cluster**

```eksctl delete cluster --name [cluster_name]```

**Create nodegroup**

```eksctl create nodegroup --cluster [name] --name [ng-name]```

**Scale nodegroup**

```eksctl scale nodegroup --cluster [name] --name [ng-name] --nodes [5]```

**Update kubeconfig**

```eksctl utils write-kubeconfig --cluster [name]```

# SYNOPSIS

**eksctl** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: create, get, delete, scale, upgrade, etc.

**create cluster** **--name** _NAME_
> Create new EKS cluster.

**--nodes** _N_
> Number of worker nodes.

**--node-type** _TYPE_
> EC2 instance type for nodes.

**--region** _REGION_
> AWS region.

**delete cluster** **--name** _NAME_
> Delete cluster.

**get clusters**
> List clusters.

**--help**
> Display help information.

# DESCRIPTION

**eksctl** is the official CLI for Amazon EKS (Elastic Kubernetes Service). It simplifies creating, managing, and deleting EKS clusters and their associated resources.

The tool handles the complex AWS infrastructure setup including VPCs, subnets, security groups, and IAM roles. Clusters can be defined declaratively with YAML configurations.

eksctl supports advanced features like managed node groups, Fargate profiles, and cluster upgrades.

# CAVEATS

AWS credentials required. Cluster creation takes time. Incurs AWS charges. Some operations require specific IAM permissions.

# HISTORY

eksctl was created by **Weaveworks** in partnership with AWS, released in **2018** to simplify EKS cluster management. It became the official CLI tool for EKS.

# SEE ALSO

[kubectl](/man/kubectl)(1), [aws](/man/aws)(1), [helm](/man/helm)(1)
