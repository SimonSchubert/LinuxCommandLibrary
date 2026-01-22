# TLDR

**Create a new EKS cluster**

```aws eks create-cluster --name [my-cluster] --role-arn [arn:aws:iam::account:role/eks-role] --resources-vpc-config subnetIds=[subnet-1],[subnet-2],securityGroupIds=[sg-123]```

**List all EKS clusters** in the account

```aws eks list-clusters```

**Describe a cluster** and its status

```aws eks describe-cluster --name [my-cluster]```

**Update kubeconfig** to access a cluster with kubectl

```aws eks update-kubeconfig --name [my-cluster]```

**Create a managed node group**

```aws eks create-nodegroup --cluster-name [my-cluster] --nodegroup-name [my-nodes] --node-role [arn:aws:iam::account:role/node-role] --subnets [subnet-1] [subnet-2] --instance-types [t3.medium]```

**List add-ons** installed on a cluster

```aws eks list-addons --cluster-name [my-cluster]```

**Delete a cluster**

```aws eks delete-cluster --name [my-cluster]```

# SYNOPSIS

**aws eks** _command_ [_options_]

# DESCRIPTION

**aws eks** is the AWS CLI interface for Amazon Elastic Kubernetes Service (EKS), a managed Kubernetes service. EKS runs the Kubernetes control plane across multiple AWS availability zones, automatically detecting and replacing unhealthy control plane nodes.

EKS integrates with AWS services for networking (VPC), security (IAM), load balancing (ELB), and storage (EBS/EFS). It supports managed node groups, self-managed nodes, and AWS Fargate for serverless containers.

# COMMANDS

**create-cluster**
> Create a new EKS cluster

**delete-cluster**
> Delete an EKS cluster

**describe-cluster**
> Get cluster details and status

**list-clusters**
> List all clusters in the account

**update-kubeconfig**
> Configure kubectl for cluster access

**create-nodegroup**
> Create a managed node group

**delete-nodegroup**
> Delete a node group

**list-nodegroups**
> List node groups in a cluster

**create-addon**
> Install a cluster add-on

**create-fargate-profile**
> Create a Fargate profile for serverless pods

**update-cluster-version**
> Upgrade Kubernetes version

# CAVEATS

Cluster creation takes 10-15 minutes. The control plane and node groups must be upgraded separately and in order. IAM roles for service accounts (IRSA) requires OIDC provider configuration. Node groups cannot span multiple instance types in the same group.

# HISTORY

Amazon EKS launched in **June 2018** as a managed Kubernetes service. Fargate support was added in **December 2019**, managed node groups earlier that year. EKS Anywhere for on-premises deployments launched in **2021**, and Pod Identity simplified IAM access in **2023**.

# SEE ALSO

[aws](/man/aws)(1), [kubectl](/man/kubectl)(1), [aws-ecr](/man/aws-ecr)(1), [eksctl](/man/eksctl)(1)
