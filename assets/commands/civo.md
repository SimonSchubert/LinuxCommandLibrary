# TAGLINE

cloud platform CLI for Kubernetes and infrastructure

# TLDR

**Create Kubernetes cluster**

```civo kubernetes create [cluster-name]```

**Create cluster with options**

```civo kubernetes create [cluster-name] --nodes [3] --size [g4s.kube.medium]```

**List clusters**

```civo kubernetes list```

**Show cluster details**

```civo kubernetes show [cluster-name]```

**Save kubeconfig**

```civo kubernetes config [cluster-name] --save```

**Delete cluster**

```civo kubernetes delete [cluster-name]```

**Create instance**

```civo instance create [name]```

**List regions**

```civo region list```

# SYNOPSIS

**civo** [_options_] _command_ [_subcommand_] [_arguments_]

# DESCRIPTION

**civo** is the CLI for Civo cloud platform, enabling management of Kubernetes clusters, instances, networks, and other cloud resources through the Civo API.

# COMMANDS

**kubernetes**
> Manage Kubernetes clusters

**instance**
> Manage compute instances

**network**
> Manage networks

**firewall**
> Manage firewalls

**volume**
> Manage block storage

**loadbalancer**
> Manage load balancers

**database**
> Manage databases

**objectstore**
> Manage object storage

**region**
> Manage regions

**apikey**
> Manage API keys

# KUBERNETES OPTIONS

**-n**, **--nodes** _count_
> Number of nodes (default: 3)

**-s**, **--size** _size_
> Node size (default: g4s.kube.medium)

**-v**, **--version** _version_
> K3s version

**--switch**
> Switch kubectl context to new cluster

**-c**, **--create-firewall**
> Create firewall with all ports open

# GLOBAL OPTIONS

**-o**, **--output** _format_
> Output format: json, human, custom

**--region** _name_
> Target region

**-y**, **--yes**
> Auto-confirm prompts

**--config** _file_
> Config file path

# CONFIGURATION

**~/.civo.json**
> Stores API keys, default region, and CLI preferences.

# CAVEATS

Requires Civo API key configured. Kubeconfig merged to ~/.kube/config when saved. Open-source CLI available on GitHub.

# SEE ALSO

[kubectl](/man/kubectl)(1), [terraform](/man/terraform)(1)
