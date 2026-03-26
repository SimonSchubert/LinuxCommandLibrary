# TAGLINE

forwards local ports to a pod, service, or deployment

# TLDR

**Forward local port to pod**

```kubectl port-forward [pod-name] [8080]:[80]```

**Forward to service**

```kubectl port-forward svc/[service-name] [8080]:[80]```

**Forward to deployment**

```kubectl port-forward deployment/[name] [8080]:[80]```

**Forward using a random local port**

```kubectl port-forward [pod-name] :[80]```

**Listen on all interfaces**

```kubectl port-forward --address [0.0.0.0] [pod-name] [8080]:[80]```

**Forward multiple ports** simultaneously

```kubectl port-forward [pod-name] [5000]:[5000] [8080]:[80]```

**Forward in a specific namespace**

```kubectl port-forward -n [namespace] svc/[service-name] [8080]:[80]```

# SYNOPSIS

**kubectl** **port-forward** _type_/_name_ [_options_] [_LOCAL_PORT_:]_REMOTE_PORT_ [...]

# PARAMETERS

**--address** _addresses_
> Addresses to listen on, comma separated (default: localhost). Only accepts IP addresses or localhost.

**--pod-running-timeout** _duration_
> Time to wait until at least one pod is running (default: 1m0s)

**-n**, **--namespace** _name_
> Kubernetes namespace scope for the request.

# DESCRIPTION

**kubectl port-forward** creates a network tunnel between a local port on your machine and a port on a pod, service, or deployment running inside a Kubernetes cluster. Traffic sent to the local port is forwarded through the Kubernetes API server to the target resource, allowing you to access cluster-internal services without exposing them via a LoadBalancer or NodePort.

This is particularly useful for debugging, accessing dashboards, connecting to databases, or testing services that are not publicly exposed. By default it listens on localhost, but you can use the --address flag to bind to additional interfaces such as 0.0.0.0 for sharing access across a local network. The port mapping is specified as LOCAL_PORT:REMOTE_PORT. If LOCAL_PORT is omitted, a random free port is allocated. The tunnel remains active until the command is terminated.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-proxy](/man/kubectl-proxy)(1), [kubectl-expose](/man/kubectl-expose)(1), [kubectl-exec](/man/kubectl-exec)(1)

