# TAGLINE

adds or updates annotations on Kubernetes resources

# TLDR

**Add annotation to resource**

```kubectl annotate [pod/mypod] [key]=[value]```

**Remove annotation**

```kubectl annotate [pod/mypod] [key]-```

**Overwrite existing annotation**

```kubectl annotate --overwrite [pod/mypod] [key]=[newvalue]```

**Annotate all pods in namespace**

```kubectl annotate pods --all [key]=[value]```

# SYNOPSIS

**kubectl** **annotate** [_type_/_name_] _key_=_value_ [_options_]

# PARAMETERS

**--overwrite**
> Allow overwriting existing annotations.

**--all**
> Select all resources of specified type.

**--selector** _selector_
> Label selector for filtering.

**-n**, **--namespace** _name_
> Kubernetes namespace.

# DESCRIPTION

**kubectl annotate** adds or updates annotations on Kubernetes resources. Annotations are key-value pairs for storing metadata. Unlike labels, annotations are not used for selection but for tools and libraries.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-label](/man/kubectl-label)(1)

