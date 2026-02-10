# TAGLINE

identifies Kubernetes secrets that are not referenced by any pods

# TLDR

**Detect unused secrets in cluster**

```k8s-unused-secret-detector```

**Check specific namespace**

```k8s-unused-secret-detector -n [namespace]```

**Output in JSON format**

```k8s-unused-secret-detector --output json```

# SYNOPSIS

**k8s-unused-secret-detector** [_options_]

# PARAMETERS

**-n**, **--namespace** _name_
> Check specific namespace.

**-A**, **--all-namespaces**
> Check all namespaces.

**--output** _format_
> Output format (text, json).

**--kubeconfig** _path_
> Path to kubeconfig file.

# DESCRIPTION

**k8s-unused-secret-detector** identifies Kubernetes secrets that are not referenced by any pods, services, or other resources. Helps clean up unused secrets and improve cluster security by identifying potentially orphaned sensitive data.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1)

