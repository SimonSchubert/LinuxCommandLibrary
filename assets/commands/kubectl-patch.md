# TLDR

**Patch deployment with JSON**

```kubectl patch deployment [name] -p '{"spec":{"replicas":3}}'```

**Patch with strategic merge**

```kubectl patch deployment [name] --type=merge -p '[patch]'```

**Patch with JSON patch**

```kubectl patch deployment [name] --type=json -p '[{"op":"replace","path":"/spec/replicas","value":3}]'```

**Patch from file**

```kubectl patch deployment [name] --patch-file=[patch.yaml]```

# SYNOPSIS

**kubectl** **patch** _type_ _name_ [_options_]

# PARAMETERS

**-p**, **--patch** _patch_
> Patch content as JSON or YAML.

**--patch-file** _file_
> File containing patch.

**--type** _type_
> Patch type (strategic, merge, json).

**-n**, **--namespace** _name_
> Kubernetes namespace.

# DESCRIPTION

**kubectl patch** updates fields of a resource using strategic merge patch, JSON merge patch, or JSON patch. More targeted than edit for scripted updates. Supports partial updates without replacing the entire resource.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-edit](/man/kubectl-edit)(1)

