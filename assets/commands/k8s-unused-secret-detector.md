# TAGLINE

identifies Kubernetes secrets that are not referenced by any pods

# TLDR

**Detect unused secrets in the default namespace**

```k8s-unused-secret-detector```

**Check specific namespace**

```k8s-unused-secret-detector -n [namespace]```

**Detect and delete unused secrets in a namespace**

```k8s-unused-secret-detector -n [namespace] | xargs kubectl delete secret -n [namespace]```

# SYNOPSIS

**k8s-unused-secret-detector** [_options_]

# PARAMETERS

**-n**, **--namespace** _namespace_
> Check specific namespace (default: default).

**--context** _context_
> Specify the kubectl context to use.

# DESCRIPTION

**k8s-unused-secret-detector** detects unused Kubernetes Secrets by comparing the Secrets in a namespace against its Pods. Outputs secret names to stdout, which can be passed to kubectl for deletion.

# CAVEATS

The project is archived and no longer maintained; its README points to the similar project kubectl-reap. Only one namespace is checked per run.

# SEE ALSO

[kubectl](/man/kubectl)(1), [k9s](/man/k9s)(1)

# RESOURCES

```[Source code](https://github.com/dtan4/k8s-unused-secret-detector)```

<!-- verified: 2026-11-09 -->
