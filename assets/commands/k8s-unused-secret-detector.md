# TAGLINE

identifies Kubernetes secrets that are not referenced by any pods

# TLDR

**Detect unused secrets in cluster**

```k8s-unused-secret-detector```

**Check specific namespace**

```k8s-unused-secret-detector -n [namespace]```

**Detect and delete unused secrets in a namespace**

```k8s-unused-secret-detector -n [namespace] | kubectl delete secret -n [namespace]```

# SYNOPSIS

**k8s-unused-secret-detector** [_options_]

# PARAMETERS

**-n** _namespace_
> Check specific namespace.

**--context** _context_
> Specify the kubectl context to use.

# DESCRIPTION

**k8s-unused-secret-detector** detects unused Kubernetes Secrets that are no longer referenced by any resources. Outputs secret names to stdout, which can be piped to kubectl for deletion. Note: this project is archived and no longer maintained; consider [kubectl-reap](https://github.com/micnncim/kubectl-reap) as an alternative.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1)

