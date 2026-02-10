# TAGLINE

builds a kustomization target from a directory containing kustomization

# TLDR

**Build kustomization from directory**

```kubectl kustomize [directory]```

**Build and output to file**

```kubectl kustomize [directory] > [output.yaml]```

**Apply kustomization**

```kubectl apply -k [directory]```

# SYNOPSIS

**kubectl** **kustomize** _directory_ [_options_]

# PARAMETERS

**--enable-helm**
> Enable Helm chart rendering.

**--load-restrictor** _value_
> Control resource loading restrictions.

**-o**, **--output** _format_
> Output format.

# DESCRIPTION

**kubectl kustomize** builds a kustomization target from a directory containing kustomization.yaml. Processes patches, overlays, and resource modifications without templates. Output can be piped to kubectl apply.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1)

