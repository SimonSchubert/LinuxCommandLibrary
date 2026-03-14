# TAGLINE

package manager for Kubernetes

# TLDR

**Install chart** as a named release

```helm install [release-name] [chart]```

**Install with custom values** file

```helm install [release-name] [chart] -f [values.yaml]```

**Add repository**

```helm repo add [name] [url]```

**Update** repository indexes

```helm repo update```

**List releases** in current namespace

```helm list```

**Upgrade release** to new chart version

```helm upgrade [release-name] [chart]```

**Uninstall release**

```helm uninstall [release-name]```

**Show configurable values** for a chart

```helm show values [chart]```

# SYNOPSIS

**helm** _command_ [_options_]

# PARAMETERS

**install** _release_ _chart_
> Install a chart as a named release.

**upgrade** _release_ _chart_
> Upgrade a release to a new chart version or values.

**uninstall** _release_
> Uninstall a release and its resources.

**list**
> List deployed releases.

**repo add** _name_ _url_
> Add a chart repository.

**repo update**
> Update chart repository indexes.

**search repo** _keyword_
> Search repositories for charts.

**show values** _chart_
> Show configurable values for a chart.

**template** _release_ _chart_
> Render chart templates locally without installing.

**rollback** _release_ _revision_
> Roll back a release to a previous revision.

**-n**, **--namespace** _NS_
> Kubernetes namespace for the operation.

**-f**, **--values** _FILE_
> Specify values file for chart configuration.

**--set** _key=value_
> Set individual values on the command line.

**--dry-run**
> Simulate an install/upgrade without applying changes.

**--wait**
> Wait until all resources are ready before marking release as successful.

# DESCRIPTION

**Helm** is the package manager for Kubernetes. It manages charts, which are packages of pre-configured Kubernetes resources. Charts define, install, and upgrade complex Kubernetes applications.

Helm simplifies application deployment, versioning, and upgrades. It uses Go templating to customize deployments for different environments. Values files and **--set** flags override chart defaults for environment-specific configuration.

# CAVEATS

Requires kubectl configured with cluster access. Chart versions should be pinned for reproducible deployments. Helm 3 removed the server-side Tiller component, operating entirely client-side.

# HISTORY

Helm was created by **Deis** and is now a **CNCF** graduated project, becoming the standard for Kubernetes package management.

# SEE ALSO

[kubectl](/man/kubectl)(1), [kustomize](/man/kustomize)(1)
