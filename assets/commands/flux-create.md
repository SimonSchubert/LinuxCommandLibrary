# TAGLINE

Create or update Flux custom resources from the command line

# TLDR

**Create a Git source**

```flux create source git my-repo --url https://github.com/org/repo --branch main```

**Create a Kustomization** to sync a path from a source

```flux create kustomization my-app --source my-repo --path ./k8s```

**Create a HelmRelease**

```flux create helmrelease my-release --chart mychart --source HelmRepository/myrepo```

**Export YAML** to stdout instead of applying to the cluster

```flux create source git my-repo --url https://github.com/org/repo --branch main --export```

**Create a Git authentication secret**

```flux create secret git my-git-secret --url https://github.com/org/repo --username user --password pass```

# SYNOPSIS

**flux** **create** _kind_ _name_ [_options_]

# DESCRIPTION

**flux create** generates Flux custom resources (GitRepository, Kustomization, HelmRelease, HelmRepository, Secret, etc.) without writing YAML by hand.

By default the resource is applied to the cluster. Pass **--export** to print the resource as YAML on stdout instead (for committing to Git or piping to other tools).

It supports the major Flux resource kinds and many common configuration options.

# COMMON KINDS

**source git**, **source helm**, **source oci**
> Create source repositories.

**kustomization**
> Define a Kustomize sync.

**helmrelease**
> Deploy a Helm chart.

**secret git**, **secret helm**
> Create credentials.

**image**, **receiver**, **alert**, **tenant**
> Image automation, notification receivers, alerts, and multi-tenancy helpers.

# PARAMETERS

**--export**
> Export the resource in YAML format to stdout instead of applying it to the cluster.

**--interval** _duration_
> Source sync interval (default `1m0s`).

**--label** _key=value_
> Set labels on the resource (repeatable / comma-separated).

**-n**, **--namespace** _ns_
> Namespace scope (default `flux-system`).

# INSTALL

```apk: sudo apk add flux```

```brew: brew install flux```

```nix: nix profile install nixpkgs#flux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[flux](/man/flux)(1), [flux-bootstrap](/man/flux-bootstrap)(1), [flux-build](/man/flux-build)(1), [flux-check](/man/flux-check)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_create/)```

<!-- verified: 2026-07-11 -->
