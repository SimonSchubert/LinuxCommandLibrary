# TAGLINE

Deprecated CLI for the Loft (vCluster Platform) Kubernetes multi-tenancy platform

# TLDR

**Start Loft** in the current kube context

```loft start```

**Login to Loft**

```loft login [https://loft.example.com]```

**Create virtual cluster**

```loft create vcluster [name]```

**List virtual clusters**

```loft list vclusters```

**Switch kube context** to a virtual cluster

```loft use vcluster [name]```

**Create space**

```loft create space [name]```

**Connect to space**

```loft use space [name]```

Put a space to **sleep** or wake it up

```loft sleep space [name]```

**Modern equivalent**: create a virtual cluster through the platform

```vcluster create [name] --driver platform```

# SYNOPSIS

**loft** _command_ [_type_] [_name_] [_options_]

# PARAMETERS

**start**
> Install and start the Loft platform in the current Kubernetes cluster.

**login** _URL_
> Log in to a Loft instance.

**create vcluster** | **space** _NAME_
> Create a virtual cluster or a space (namespace).

**delete vcluster** | **space** _NAME_
> Delete a virtual cluster or space.

**list vclusters** | **spaces** | **clusters** | **teams** | **secrets**
> List resources.

**use vcluster** | **space** | **cluster** | **management** _NAME_
> Switch the kube context to the resource.

**sleep** / **wakeup** **vcluster** | **space** _NAME_
> Put a resource to sleep (scale workloads to zero) or wake it up.

**share vcluster** | **space** _NAME_
> Give a user or team access.

**connect cluster** _NAME_
> Connect a host Kubernetes cluster to Loft.

**import vcluster** _NAME_
> Import an existing virtual cluster.

**token**
> Print an access token.

**reset password**
> Reset a user's password.

**--help**
> Display help information.

# DESCRIPTION

**loft** is the command-line client for Loft, a self-service platform for Kubernetes multi-tenancy by Loft Labs. It manages **spaces** (namespaces with access control and quotas), **virtual clusters** (vcluster instances running inside a host namespace), connected host clusters, sleep mode to save costs, users, teams and secrets.

# CAVEATS

The loft CLI is **deprecated**: the platform was renamed **vCluster Platform** with version 4, and all commands moved into the **vcluster** CLI (for example **loft start** is now **vcluster platform start**, **loft create space** is **vcluster platform create namespace**, **loft use vcluster** is **vcluster connect --driver platform**). Configuration moved from ~/.loft/config.json to ~/.vcluster/config.json. The platform requires a Kubernetes cluster and a LoftLabs license for most features.

# HISTORY

Loft was created by **Loft Labs**, the company behind **vcluster** and **DevSpace**. In **2024** the product was rebranded as vCluster Platform and the standalone loft CLI was replaced by **vcluster platform** commands.

# SEE ALSO

[vcluster](/man/vcluster)(1), [kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [devpod](/man/devpod)(1), [devspace](/man/devspace)(1)

# RESOURCES

```[Source code](https://github.com/loft-sh/loft)```

```[Homepage](https://www.vcluster.com/)```

```[Documentation](https://www.vcluster.com/docs/vcluster/reference/migrations/loft-cli-vcluster-cli-migration)```

<!-- verified: 2026-09-29 -->
