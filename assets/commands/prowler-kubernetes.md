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

**prowler kubernetes** performs security assessment of Kubernetes clusters. Checks for misconfigurations, RBAC issues, and security best practices. Supports CIS Kubernetes Benchmark.

# SEE ALSO

[prowler](/man/prowler)(1), [kubectl](/man/kubectl)(1)

