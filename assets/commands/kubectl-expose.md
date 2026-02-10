# TAGLINE

creates a service for a resource

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

**kubectl expose** creates a Kubernetes Service that provides stable network access to a set of pods managed by a deployment, replica set, pod, or other resource. It automatically generates the service configuration by inspecting the target resource's labels and port definitions, creating a selector-based service without requiring a manual manifest.

The command supports four service types: ClusterIP (default) for internal cluster access, NodePort for exposing the service on each node's IP at a static port, LoadBalancer for provisioning an external load balancer through the cloud provider, and ExternalName for mapping to a DNS name. The `--port` flag sets the service's listening port while `--target-port` specifies the container port to forward traffic to.

This approach is convenient for quick service creation during development or prototyping. For production environments, defining services declaratively in manifest files alongside the workload definitions provides better reproducibility and version control.

# CAVEATS

Subcommand of kubectl. Service type affects accessibility. Consider using manifests.

# HISTORY

kubectl expose provides quick service creation for **Kubernetes** workload networking.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-create](/man/kubectl-create)(1), [kubectl-run](/man/kubectl-run)(1)
