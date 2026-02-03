# TLDR

**Forward local port to pod**

```kubectl port-forward [pod-name] [8080]:[80]```

**Forward to service**

```kubectl port-forward svc/[service-name] [8080]:[80]```

**Forward to deployment**

```kubectl port-forward deployment/[name] [8080]:[80]```

**Listen on all interfaces**

```kubectl port-forward --address [0.0.0.0] [pod-name] [8080]:[80]```

# SYNOPSIS

**kubectl** **port-forward** _type_/_name_ _local:remote_ [_options_]

# PARAMETERS

**--address** _address_
> Addresses to listen on.

**-n**, **--namespace** _name_
> Kubernetes namespace.

# DESCRIPTION

**kubectl port-forward** forwards local ports to a pod, service, or deployment. Creates a tunnel for accessing cluster resources from your local machine. Useful for debugging and accessing internal services.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-proxy](/man/kubectl-proxy)(1)

