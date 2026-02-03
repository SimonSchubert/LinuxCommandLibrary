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

**kubectl label** adds or updates labels on Kubernetes resources. Labels are key-value pairs used for organizing and selecting resources. Labels are fundamental for service discovery and resource management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-annotate](/man/kubectl-annotate)(1)

