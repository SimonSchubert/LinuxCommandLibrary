# TAGLINE

manages IBM Cloud Kubernetes Service clusters

# TLDR

**List** all clusters in the account

```ibmcloud ks cluster ls```

**Show** the details of a cluster

```ibmcloud ks cluster get --cluster [cluster-name]```

**Download** the kubeconfig so kubectl can reach the cluster

```ibmcloud ks cluster config --cluster [cluster-name]```

**List** the worker nodes of a cluster

```ibmcloud ks worker ls --cluster [cluster-name]```

**Create** a cluster on classic infrastructure

```ibmcloud ks cluster create classic --name [my-cluster] --zone [dal10] --flavor [b3c.4x16] --workers [3]```

**Create** a cluster on VPC infrastructure

```ibmcloud ks cluster create vpc-gen2 --name [my-cluster] --zone [us-south-1] --flavor [bx2.4x16] --vpc-id [VPC_ID] --subnet-id [SUBNET_ID]```

**Resize** a worker pool

```ibmcloud ks worker-pool resize --cluster [cluster-name] --worker-pool [pool] --size-per-zone [3]```

**List** the available Kubernetes and OpenShift versions

```ibmcloud ks versions```

**Delete** a cluster and its storage

```ibmcloud ks cluster rm --cluster [cluster-name] --delete-storage```

# SYNOPSIS

**ibmcloud** **ks** _command_ [_subcommand_] [_options_]

# PARAMETERS

**cluster ls** [**-l** _LOCATION_] [**--provider** _PROVIDER_] [**--output** _json_]
> List clusters, optionally filtered by location or infrastructure provider (`classic`, `vpc-classic`, `vpc-gen2`, `satellite`).

**cluster get --cluster** _CLUSTER_ [**--show-resources**] [**--output** _json_]
> Show the details of a cluster.

**cluster config --cluster** _CLUSTER_ [**--admin**] [**--endpoint** _ENDPOINT_] [**--network**] [**--skip-rbac**]
> Download the Kubernetes configuration and certificates for `kubectl`. **--admin** retrieves administrator certificates and keys.

**cluster create classic --name** _NAME_ **--zone** _ZONE_ **--flavor** _FLAVOR_
> Create a cluster on classic infrastructure. Common extras are **--workers**, **--version**, **--hardware**, **--private-vlan**, and **--public-service-endpoint**.

**cluster create vpc-gen2 --name** _NAME_ **--zone** _ZONE_ **--flavor** _FLAVOR_ **--vpc-id** _ID_ **--subnet-id** _ID_
> Create a cluster on VPC infrastructure.

**cluster rm --cluster** _CLUSTER_ [**--delete-storage**] [**-f**]
> Delete a cluster. Worker nodes, apps, and containers are removed permanently.

**worker ls --cluster** _CLUSTER_ [**--worker-pool** _POOL_] [**--output** _json_]
> List the worker nodes of a cluster.

**worker reload --worker** _WORKER_
> Reimage a worker node and reinstall Kubernetes at the latest patch version.

**worker-pool create**, **worker-pool ls**, **worker-pool rm**
> Manage worker pools, the groups that define flavor and size per zone.

**worker-pool resize --cluster** _CLUSTER_ **--worker-pool** _POOL_ **--size-per-zone** _SIZE_
> Change the number of workers per zone in a pool.

**zone add**, **zone ls**, **zone rm**
> Manage the zones a worker pool spans in a multizone cluster.

**versions**
> List the available Kubernetes and OpenShift versions.

**locations**, **flavor ls**, **vpc ls**, **vlan ls**
> List supported locations, worker node flavors, VPCs, and VLANs.

**ingress alb ls**, **nlb-dns ls**
> Manage Ingress ALBs and network load balancer DNS records.

**api-key reset**
> Reset the IAM API key that the cluster uses to access account infrastructure.

**-q**
> Suppress the message of the day and update reminders.

# DESCRIPTION

**ibmcloud ks** is the IBM Cloud Kubernetes Service plugin for the IBM Cloud CLI. It drives the full lifecycle of managed Kubernetes and Red Hat OpenShift clusters: creating them on classic, VPC, or Satellite infrastructure, adding and resizing worker pools, upgrading versions, and wiring up ingress, storage, and key management.

Install it with `ibmcloud plugin install ks`, then log in and target an account and resource group before use. The plugin manages infrastructure only; workloads inside a cluster are handled by `kubectl`, whose configuration is fetched with **ibmcloud ks cluster config**.

Most subcommands follow a `noun verb` shape (`cluster ls`, `worker get`, `worker-pool resize`) and accept **--output json** for scripting. Cluster-scoped commands take **-c**/**--cluster** with a cluster name or ID.

# CAVEATS

**cluster create** needs **--flavor**, **--name**, and **--zone** at minimum, plus **--vpc-id** and **--subnet-id** for VPC clusters. Run **ibmcloud ks locations**, **ibmcloud ks zone ls**, and **ibmcloud ks flavor ls --zone** _ZONE_ to find valid values.

Clusters bill for their worker nodes, load balancers, and attached storage for as long as they exist. **cluster rm** is irreversible and does not delete persistent volumes unless **--delete-storage** is given.

Older releases used flat command names such as `ibmcloud ks clusters` and `ibmcloud ks workers`. These aliases still resolve but the documented form is the `cluster ls` / `worker ls` style used above.

# HISTORY

**ibmcloud ks** started as the `container-service` plugin for the Bluemix CLI. It was renamed `ks` and reorganized into `noun verb` subcommands as IBM Cloud Kubernetes Service matured, and later gained Red Hat OpenShift support alongside the sibling `ibmcloud oc` alias.

# SEE ALSO

[ibmcloud](/man/ibmcloud)(1), [kubectl](/man/kubectl)(1), [oc](/man/oc)(1), [ibmcloud-cr](/man/ibmcloud-cr)(1), [ibmcloud-iam](/man/ibmcloud-iam)(1), [ibmcloud-target](/man/ibmcloud-target)(1)

# RESOURCES

```[Homepage](https://cloud.ibm.com/docs/cli)```

```[Documentation](https://cloud.ibm.com/docs/containers?topic=containers-kubernetes-service-cli)```

<!-- verified: 2026-08-30 -->
