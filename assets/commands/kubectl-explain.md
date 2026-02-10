# TAGLINE

shows resource and field documentation

# TLDR

**Explain resource**

```kubectl explain [pod]```

**Explain field**

```kubectl explain [pod.spec]```

**Explain nested field**

```kubectl explain [pod.spec.containers]```

**Show recursive structure**

```kubectl explain [pod] --recursive```

**Explain specific API version**

```kubectl explain [deployment] --api-version=[apps/v1]```

# SYNOPSIS

**kubectl explain** [_options_] _resource_

# PARAMETERS

_RESOURCE_
> Resource type and optional field path.

**--recursive**
> Show all fields recursively.

**--api-version** _VERSION_
> Explain specific API version.

**--help**
> Display help information.

# DESCRIPTION

**kubectl explain** shows resource and field documentation. It displays the schema for Kubernetes objects.

The command helps write manifests correctly. It shows field types, defaults, and descriptions.

# CAVEATS

Subcommand of kubectl. Documentation from API server. Varies by Kubernetes version.

# HISTORY

kubectl explain provides built-in API documentation for **Kubernetes** resource authoring.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-api-resources](/man/kubectl-api-resources)(1)
