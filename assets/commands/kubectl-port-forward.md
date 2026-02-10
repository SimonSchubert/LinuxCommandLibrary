# TAGLINE

forwards local ports to a pod, service, or deployment

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

**kubectl port-forward** creates a network tunnel between a local port on your machine and a port on a pod, service, or deployment running inside a Kubernetes cluster. Traffic sent to the local port is forwarded through the Kubernetes API server to the target resource, allowing you to access cluster-internal services without exposing them via a LoadBalancer or NodePort.

This is particularly useful for debugging, accessing dashboards, connecting to databases, or testing services that are not publicly exposed. By default it listens on localhost, but you can use the --address flag to bind to additional interfaces such as 0.0.0.0 for sharing access across a local network. The port mapping is specified as local:remote, and the tunnel remains active until the command is terminated.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-proxy](/man/kubectl-proxy)(1)

