# TLDR

**Start Loft**

```loft start```

**Login to Loft**

```loft login [https://loft.example.com]```

**Create virtual cluster**

```loft create vcluster [name]```

**List virtual clusters**

```loft list vclusters```

**Connect to space**

```loft use space [name]```

**Create space**

```loft create space [name]```

# SYNOPSIS

**loft** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Loft operation.

**start**
> Start Loft server.

**login** _URL_
> Login to Loft instance.

**create** _TYPE_ _NAME_
> Create resource.

**list** _TYPE_
> List resources.

**use** _TYPE_ _NAME_
> Switch context.

**--help**
> Display help information.

# DESCRIPTION

**loft** manages virtual Kubernetes clusters and namespaces. It provides self-service Kubernetes for teams.

The tool enables multi-tenancy on shared clusters. It creates isolated virtual clusters quickly.

loft manages virtual Kubernetes.

# CAVEATS

Requires Kubernetes cluster. Loft platform needed. Commercial product.

# HISTORY

Loft was created by **Loft Labs** to provide virtual cluster technology and self-service Kubernetes for developers.

# SEE ALSO

[kubectl](/man/kubectl)(1), [vcluster](/man/vcluster)(1), [helm](/man/helm)(1)

