# TAGLINE

Scan Kubernetes clusters for issues

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

**popeye** scans a live Kubernetes cluster and reports potential issues, misconfigurations, and resource problems. It checks pods, services, deployments, and other resources against best practices and common pitfalls.

Results are color-coded by severity (OK, info, warning, error). Use **-n** to scan a specific namespace, **-o** for machine-readable output formats (JSON, YAML, HTML), and **--save** to write reports to disk. All operations are read-only.

# CAVEATS

Requires cluster access. Read-only operations.

# HISTORY

Popeye was created as a **Kubernetes cluster sanitizer** and linter.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kube-linter](/man/kube-linter)(1)

