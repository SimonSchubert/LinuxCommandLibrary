# TAGLINE

adds or updates labels on Kubernetes resources

# TLDR

**Add label to resource**

```kubectl label [pod/name] [key]=[value]```

**Remove label**

```kubectl label [pod/name] [key]-```

**Overwrite existing label**

```kubectl label --overwrite [pod/name] [key]=[newvalue]```

**Label all pods with selector**

```kubectl label pods -l [app=myapp] [env]=[production]```

# SYNOPSIS

**kubectl** **label** _type_/_name_ _key_=_value_ [_options_]

# PARAMETERS

**--overwrite**
> Allow overwriting existing labels.

**--all**
> Select all resources of type.

**-l**, **--selector** _selector_
> Label selector for filtering.

**-n**, **--namespace** _name_
> Kubernetes namespace.

# DESCRIPTION

**kubectl label** adds, updates, or removes labels on Kubernetes resources such as pods, nodes, services, and deployments. Labels are key-value metadata pairs that serve as the primary mechanism for organizing, grouping, and selecting resources throughout the Kubernetes ecosystem. They are used extensively by selectors in services, deployments, and network policies to determine which resources to target.

To add a label, specify a key=value pair; to remove one, append a minus sign to the key name (e.g., `key-`). By default, overwriting an existing label requires the --overwrite flag to prevent accidental changes. The command can operate on individual resources, on all resources of a given type with --all, or on a filtered set matched by a label selector.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-annotate](/man/kubectl-annotate)(1)

