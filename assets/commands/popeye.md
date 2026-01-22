# TLDR

**Scan Kubernetes cluster**

```popeye```

**Scan specific namespace**

```popeye -n [namespace]```

**Scan with specific context**

```popeye --context [context]```

**Output as JSON**

```popeye -o json```

**Save report to file**

```popeye --save --out [dir]```

# SYNOPSIS

**popeye** [_options_]

# PARAMETERS

**-n**, **--namespace** _NS_
> Scan specific namespace.

**--context** _CTX_
> Kubernetes context.

**-o**, **--out** _FORMAT_
> Output format (json, yaml, html).

**--save**
> Save report to file.

**-A**, **--all-namespaces**
> Scan all namespaces.

# DESCRIPTION

**popeye** scans Kubernetes clusters for issues. Reports misconfigurations.

The tool identifies problems. Checks resource health and best practices.

popeye sanitizes clusters.

# CAVEATS

Requires cluster access. Read-only operations.

# HISTORY

Popeye was created as a **Kubernetes cluster sanitizer** and linter.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kube-linter](/man/kube-linter)(1)

