# TAGLINE

Declarative Helm chart deployment for Kubernetes

# TLDR

**Apply** the desired state from **helmfile.yaml**

```helmfile apply```

**Sync** releases to match the spec (install missing, upgrade changed)

```helmfile sync```

**Diff** pending changes before applying

```helmfile diff```

**Destroy** all releases defined in the helmfile

```helmfile destroy```

**Lint** the helmfile and referenced charts

```helmfile lint```

**Generate** a new project scaffold

```helmfile create [my-project]```

# SYNOPSIS

**helmfile** [_global_options_] **apply** | **sync** | **diff** | **destroy** | **lint** | **template** | **build** | **list** | **status** | **delete** | **init** | **create** [_command_options_]

# PARAMETERS

**-f**, **--file** _path_
> Path to the helmfile (default: **helmfile.yaml**). Repeatable.

**-e**, **--environment** _name_
> Environment name for layered values (for example **staging**, **production**).

**--selector** _label=value_
> Limit operations to releases matching the label selector.

**-l**, **--selector** _label=value_
> Alias for **--selector**.

**-n**, **--namespace** _namespace_
> Kubernetes namespace override.

**--kube-context** _context_
> Kubernetes context to use.

**--debug**
> Enable verbose debug output.

**--quiet**
> Suppress non-essential output.

**--no-color**
> Disable ANSI colour codes.

# DESCRIPTION

**helmfile** is a declarative spec for deploying Helm charts to Kubernetes. You describe repositories, releases, values, and hooks in YAML (typically **helmfile.yaml**), version-control that file, and run **helmfile apply** or **helmfile sync** to converge the cluster to the declared state.

The executable delegates chart operations to **helm** and expects the **helm-diff** plugin for the **diff** subcommand. Run **helmfile init** once after installation to install required plugins.

Helmfile supports modular helmfiles (importing shared fragments from Git or S3), environment-specific value layers, JSON and strategic-merge patches on rendered manifests before install, and mixing Helm charts with raw Kubernetes manifests and Kustomize bases. Releases can declare dependencies so Helmfile installs them in the correct order.

Common workflows: **helmfile diff** to preview changes, **helmfile apply** to install and upgrade in one step, **helmfile template** or **helmfile build** to render manifests for GitOps tools such as Argo CD, and **helmfile destroy** to tear down every release managed by the file.

# CONFIGURATION

**helmfile.yaml**
> Main declarative spec. Defines **repositories**, **releases**, optional **environments**, **helmDefaults**, and **templates**.

**helmfile.d/**
> Directory of additional fragment YAML files merged into the main spec.

**.helmfile/**
> Optional local state and cache directory created during operation.

**helmfile init**
> Installs the **helm-diff** plugin and other dependencies expected by Helmfile.

# CAVEATS

Helmfile v1.x introduced breaking changes from v0.x; review the v1 migration guide before upgrading legacy projects. **helm** and **helm-diff** must be installed separately and kept compatible with the Helmfile version in use. The **diff** subcommand requires a working **helm-diff** plugin.

# SEE ALSO

[helm](/man/helm)(1), [helm-install](/man/helm-install)(1), [kubectl](/man/kubectl)(1)