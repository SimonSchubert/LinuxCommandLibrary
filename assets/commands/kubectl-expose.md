# TLDR

**Expose deployment**

```kubectl expose deployment [name] --port=[80]```

**Expose with type**

```kubectl expose deployment [name] --port=[80] --type=[LoadBalancer]```

**Expose pod**

```kubectl expose pod [pod-name] --port=[8080] --target-port=[80]```

**Expose with name**

```kubectl expose deployment [name] --port=[80] --name=[service-name]```

**Expose NodePort**

```kubectl expose deployment [name] --port=[80] --type=[NodePort]```

# SYNOPSIS

**kubectl expose** [_options_] _resource_ _name_

# PARAMETERS

_RESOURCE_
> Resource type to expose.

_NAME_
> Resource name.

**--port** _PORT_
> Service port.

**--target-port** _PORT_
> Container port.

**--type** _TYPE_
> Service type (ClusterIP, NodePort, LoadBalancer).

**--name** _NAME_
> Service name.

**--help**
> Display help information.

# DESCRIPTION

**kubectl expose** creates a service for a resource. It makes pods accessible through a stable endpoint.

The command generates service configurations automatically. It supports various service types.

kubectl expose creates services.

# CAVEATS

Subcommand of kubectl. Service type affects accessibility. Consider using manifests.

# HISTORY

kubectl expose provides quick service creation for **Kubernetes** workload networking.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-create](/man/kubectl-create)(1), [kubectl-run](/man/kubectl-run)(1)
