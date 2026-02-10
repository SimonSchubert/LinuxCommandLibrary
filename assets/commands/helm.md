# TAGLINE

package manager for Kubernetes

# TLDR

**Install chart**

```helm install [release-name] [chart]```

**Search for charts**

```helm search repo [keyword]```

**Add repository**

```helm repo add [name] [url]```

**List releases**

```helm list```

**Upgrade release**

```helm upgrade [release-name] [chart]```

**Uninstall release**

```helm uninstall [release-name]```

**Show chart values**

```helm show values [chart]```

# SYNOPSIS

**helm** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute.

**install**
> Install a chart.

**upgrade**
> Upgrade a release.

**uninstall**
> Uninstall a release.

**list**
> List releases.

**repo**
> Repository operations.

**search**
> Search for charts.

**--namespace** _NS_
> Kubernetes namespace.

**--help**
> Display help information.

# DESCRIPTION

**Helm** is the package manager for Kubernetes. It manages charts, which are packages of pre-configured Kubernetes resources.

Helm simplifies application deployment, versioning, and upgrades. It uses templating to customize deployments for different environments.

# CAVEATS

Requires kubectl configured. Chart versions matter. Tiller removed in Helm 3.

# HISTORY

Helm was created by **Deis** and is now a **CNCF** graduated project, becoming the standard for Kubernetes package management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kustomize](/man/kustomize)(1), [helmfile](/man/helmfile)(1)
