# TAGLINE

updates fields of a resource using strategic merge patch, JSON merge

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

**kubectl patch** applies incremental updates to Kubernetes resource fields without requiring you to replace the entire resource specification. This makes it well suited for scripted and automated changes where only specific fields need modification, such as adjusting replica counts, updating image tags, or adding annotations.

The command supports three patch strategies: strategic merge patch (the default), which intelligently merges lists and maps according to Kubernetes schema knowledge; JSON merge patch, which performs a straightforward recursive merge; and JSON patch (RFC 6902), which uses explicit operations like add, remove, and replace on specific JSON paths. Patch content can be provided inline via the -p flag or read from a file with --patch-file.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-edit](/man/kubectl-edit)(1)

