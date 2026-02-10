# TAGLINE

audits Kubernetes clusters and manifests for security vulnerabilities

# TLDR

**Audit running cluster**

```kubeaudit all```

**Audit manifest files**

```kubeaudit all -f [deployment.yaml]```

**Run specific auditor**

```kubeaudit [privileged] -f [manifest.yaml]```

**Audit in cluster**

```kubeaudit all -c [cluster]```

**Output as JSON**

```kubeaudit all -f [manifest.yaml] -p json```

**List auditors**

```kubeaudit --help```

# SYNOPSIS

**kubeaudit** [_auditor_] [_options_]

# PARAMETERS

**all**
> Run all auditors.

**-f** _file_
> Audit manifest file.

**-d** _dir_
> Audit directory of manifests.

**-c**, **--context** _name_
> Kubernetes context.

**-n**, **--namespace** _name_
> Target namespace.

**-p**, **--format** _format_
> Output format: logrus, json, sarif.

**--minSeverity** _level_
> Minimum severity to report.

# AUDITORS

```
privileged       Privileged containers
capabilities     Added capabilities
rootfs           Read-only root filesystem
runAsNonRoot     Running as root user
limits           Resource limits
hostns           Host namespace usage
seccomp          Seccomp profile
apparmor         AppArmor profile
```

# DESCRIPTION

**kubeaudit** audits Kubernetes clusters and manifests for security vulnerabilities. It checks configurations against security best practices.

The tool can audit running clusters, local manifests, or both, providing actionable findings for improving cluster security.

# CAVEATS

Some findings may be intentional configurations. Cluster audit requires permissions. False positives possible for specialized workloads.

# HISTORY

kubeaudit was created by **Shopify** to identify security risks in Kubernetes deployments before they reach production.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kube-linter](/man/kube-linter)(1), [trivy](/man/trivy)(1)
