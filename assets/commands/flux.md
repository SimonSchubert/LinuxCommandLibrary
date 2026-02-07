# TAGLINE

GitOps continuous delivery tool for Kubernetes

# TLDR

**Bootstrap Flux** on a Kubernetes cluster with GitHub

```flux bootstrap github --owner=[username] --repository=[repo] --path=[clusters/my-cluster]```

**Check prerequisites** for Flux installation

```flux check --pre```

**Check Flux components** status

```flux check```

**Get all Flux resources** status

```flux get all```

**Reconcile a Kustomization** immediately

```flux reconcile kustomization [name]```

**Suspend updates** for a Kustomization

```flux suspend kustomization [name]```

**Resume updates** for a Kustomization

```flux resume kustomization [name]```

**Export Flux resources** to YAML

```flux export source git --all```

# SYNOPSIS

**flux** [_COMMAND_] [_FLAGS_]

# COMMANDS

**bootstrap** _PROVIDER_
> Deploy Flux on a cluster the GitOps way (github, gitlab, bitbucket).

**check**
> Check prerequisites and component status.

**install**
> Install Flux components without GitOps bootstrap.

**uninstall**
> Uninstall Flux components from cluster.

**get** _RESOURCE_
> Get status of Flux resources (sources, kustomizations, helmreleases).

**reconcile** _RESOURCE_ _NAME_
> Trigger reconciliation of a resource.

**suspend** _RESOURCE_ _NAME_
> Suspend reconciliation of a resource.

**resume** _RESOURCE_ _NAME_
> Resume reconciliation of a resource.

**export** _RESOURCE_
> Export resources to YAML manifests.

**create** _RESOURCE_
> Create Flux resources.

**delete** _RESOURCE_
> Delete Flux resources.

**logs**
> Display logs from Flux controllers.

# PARAMETERS

**--kubeconfig** _FILE_
> Path to kubeconfig file.

**-n**, **--namespace** _NAMESPACE_
> Namespace for CLI operations (default: flux-system).

**--context** _CONTEXT_
> Kubernetes context to use.

**--timeout** _DURATION_
> Timeout for operations.

**-v**, **--verbose**
> Enable verbose output.

**-h**, **--help**
> Display help for command.

# DESCRIPTION

**Flux** is a GitOps continuous delivery tool for Kubernetes. It automatically synchronizes cluster state with configuration stored in Git repositories, ensuring that the live cluster matches the desired state defined in version control.

Flux monitors Git repositories, Helm repositories, and OCI registries for changes. When updates are detected, it applies them to the cluster automatically. This enables declarative, auditable infrastructure management following GitOps principles.

The flux CLI bootstraps Flux components into a cluster and provides management commands for sources, kustomizations, and Helm releases. Flux uses Kubernetes custom resources to define what to sync and how.

# CAVEATS

Requires kubectl configured with cluster access. Bootstrap creates resources in the flux-system namespace by default. Git repository access requires appropriate credentials or SSH keys. Flux components run as controllers in the cluster and require sufficient RBAC permissions.

# HISTORY

Flux was originally created by Weaveworks in **2016** as one of the first GitOps tools for Kubernetes. **Flux v2** was released in **2020** as a complete rewrite using the GitOps Toolkit, providing a more modular and extensible architecture. Flux became a **CNCF Graduated project** in **2022**, reflecting its maturity and wide adoption in the cloud-native ecosystem.

# SEE ALSO

[kubectl](/man/kubectl)(1), [helm](/man/helm)(1), [kustomize](/man/kustomize)(1), [argocd](/man/argocd)(1)
