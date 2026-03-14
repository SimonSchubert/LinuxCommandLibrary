# TAGLINE

Build a kustomization target from a directory or URL

# TLDR

**Build kustomization from current directory**

```kubectl kustomize```

**Build kustomization from directory**

```kubectl kustomize [directory]```

**Build and output to file**

```kubectl kustomize [directory] -o [output.yaml]```

**Build with Helm chart support**

```kubectl kustomize --enable-helm [directory]```

**Build from a remote URL**

```kubectl kustomize [https://github.com/user/repo/config]```

**Apply kustomization directly**

```kubectl apply -k [directory]```

# SYNOPSIS

**kubectl** **kustomize** [_directory_] [_options_]

# PARAMETERS

**--enable-helm**
> Enable Helm chart rendering.

**--helm-command** _STRING_
> Helm command path (default: "helm").

**--load-restrictor** _STRING_
> Control resource loading restrictions (default: LoadRestrictionsRootOnly). Set to LoadRestrictionsNone to allow loading from outside root.

**--reorder** _STRING_
> Reorder resources before output: "legacy" or "none" (default: "legacy").

**-o**, **--output** _STRING_
> Write output to this file path.

**--enable-alpha-plugins**
> Enable kustomize plugins.

# DESCRIPTION

**kubectl kustomize** builds a set of KRM (Kubernetes Resource Model) resources from a directory containing a kustomization.yaml file, or from a git repository URL with a path suffix. If the directory argument is omitted, the current directory is assumed. Processes patches, overlays, and resource modifications without templates. Output can be piped to kubectl apply.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubectl-apply](/man/kubectl-apply)(1)

