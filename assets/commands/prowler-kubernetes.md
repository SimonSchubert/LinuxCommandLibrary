# TAGLINE

Kubernetes cluster security assessment

# TLDR

**Run Kubernetes security assessment**

```prowler kubernetes```

**Run with specific context**

```prowler kubernetes --context [my-cluster]```

**Run specific checks**

```prowler kubernetes --checks [pod_security_policy]```

**Output to JSON**

```prowler kubernetes -M json -o [results/]```

# SYNOPSIS

**prowler kubernetes** [_options_]

# PARAMETERS

**--checks** _checks_
> Specific checks to run.

**--context** _name_
> Kubernetes context.

**--namespace** _name_
> Target namespace.

**--compliance** _framework_
> Compliance framework.

**-M**, **--output-modes** _format_
> Output format.

**-o**, **--output-directory** _dir_
> Output directory.

# DESCRIPTION

**prowler kubernetes** performs security assessment of Kubernetes clusters. It checks for misconfigurations, RBAC issues, pod security violations, and compliance against security best practices including the CIS Kubernetes Benchmark.

The tool connects to the cluster using the current kubeconfig context and evaluates resources across namespaces. Results can be filtered by specific checks, namespaces, or compliance frameworks.

# CAVEATS

Requires appropriate RBAC permissions to read cluster resources. Some checks need cluster-admin access. Results reflect the current state at scan time. The `--context` flag must match an existing kubeconfig context.

# SEE ALSO

[prowler](/man/prowler)(1), [kubectl](/man/kubectl)(1)

