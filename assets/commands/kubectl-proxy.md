# TAGLINE

runs a proxy to the Kubernetes API server

# TLDR

**Start API proxy**

```kubectl proxy```

**Proxy on specific port**

```kubectl proxy --port=[8001]```

**Allow external access**

```kubectl proxy --address=[0.0.0.0] --accept-hosts='.*'```

**Proxy specific API paths**

```kubectl proxy --api-prefix=/api/```

# SYNOPSIS

**kubectl** **proxy** [_options_]

# PARAMETERS

**--port** _port_
> Port to run proxy on.

**--address** _address_
> Address to bind to.

**--accept-hosts** _regex_
> Hosts to accept requests from.

**--api-prefix** _prefix_
> API prefix for proxy.

# DESCRIPTION

**kubectl proxy** runs a proxy to the Kubernetes API server. Handles authentication and allows accessing the API and services without exposing them directly. Default port is 8001.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-port-forward](/man/kubectl-port-forward)(1)

