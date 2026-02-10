# TAGLINE

deploys a Helm chart to a Kubernetes cluster, creating a new release

# TLDR

**Install a chart**

```helm install [release-name] [chart]```

**Install from repository**

```helm install [my-nginx] bitnami/nginx```

**Install with custom values file**

```helm install [release] [chart] -f [values.yaml]```

**Install with inline value**

```helm install [release] [chart] --set [key]=[value]```

**Install in specific namespace**

```helm install [release] [chart] -n [namespace]```

**Install and wait for pods**

```helm install [release] [chart] --wait```

**Dry run without installing**

```helm install [release] [chart] --dry-run```

# SYNOPSIS

**helm** **install** [_name_] _chart_ [_options_]

# PARAMETERS

**-f**, **--values** _file_
> Custom values YAML file.

**--set** _key_=_value_
> Override values inline.

**-n**, **--namespace** _namespace_
> Target namespace.

**--wait**
> Wait for pods to be ready.

**--timeout** _duration_
> Timeout for commands (default 5m0s).

**--dry-run**
> Simulate without installing.

**--create-namespace**
> Create namespace if missing.

# DESCRIPTION

**helm install** deploys a Helm chart to a Kubernetes cluster, creating a new release. A chart contains all resource definitions needed to run an application. Helm tracks releases for easy upgrades with **helm upgrade** and rollbacks with **helm rollback**. Use **--wait** to wait for all pods to be ready before completing.

# SEE ALSO

[helm](/man/helm)(1), [helm-upgrade](/man/helm-upgrade)(1), [kubectl](/man/kubectl)(1)

