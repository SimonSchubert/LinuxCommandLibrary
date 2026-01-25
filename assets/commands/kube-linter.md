# TLDR

**Lint Kubernetes manifests**

```kube-linter lint [path/to/manifests]```

**Lint Helm chart**

```kube-linter lint [path/to/chart]```

**List available checks**

```kube-linter checks list```

**Lint with specific checks**

```kube-linter lint --include [no-read-only-root-fs] [path]```

**Exclude checks**

```kube-linter lint --exclude [run-as-non-root] [path]```

**Output as JSON**

```kube-linter lint --format json [path]```

# SYNOPSIS

**kube-linter** _command_ [_options_]

# PARAMETERS

**lint** _path_
> Lint manifests or charts.

**checks list**
> List available checks.

**--include** _checks_
> Only run specified checks.

**--exclude** _checks_
> Skip specified checks.

**--config** _file_
> Configuration file.

**--format** _format_
> Output format: plain, json, sarif.

**--fail-on-invalid-resource**
> Fail on invalid YAML.

# DESCRIPTION

**kube-linter** analyzes Kubernetes YAML files and Helm charts for security and best practices. It catches misconfigurations like missing security contexts, resource limits, and privilege escalation risks.

The tool is designed for CI/CD integration, helping catch issues before deployment.

# CHECKS EXAMPLES

```
no-read-only-root-fs      Root filesystem not read-only
run-as-non-root           Container runs as root
unset-cpu-requirements    CPU limits not set
unset-memory-requirements Memory limits not set
latest-tag                Using 'latest' image tag
```

# CONFIGURATION

```yaml
# .kube-linter.yaml
checks:
  addAllBuiltIn: true
  exclude:
    - "latest-tag"
```

# CAVEATS

May produce false positives. Not all checks apply to all workloads. Custom checks require Go. Helm chart linting requires Helm.

# HISTORY

kube-linter was developed by **StackRox** (acquired by Red Hat) to improve Kubernetes security posture through static analysis.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kubeaudit](/man/kubeaudit)(1), [helm](/man/helm)(1)
