# TAGLINE

Create or update Flux custom resources from the command line

# TLDR

**Create a Git source**

```flux create source git my-repo --url https://github.com/org/repo --branch main```

**Create a Kustomization** to sync a path from a source

```flux create kustomization my-app --source my-repo --path ./k8s```

**Create a HelmRelease**

```flux create helmrelease my-release --chart mychart --source HelmRepository/myrepo```

**Create a Git authentication secret**

```flux create secret git my-git-secret --url https://github.com/org/repo --username user --password pass```

# SYNOPSIS

**flux** **create** _kind_ _name_ [_options_]

# DESCRIPTION

**flux create** provides a convenient way to generate Flux CRDs (GitRepository, Kustomization, HelmRelease, HelmRepository, Secret, etc.) without writing YAML by hand.

The created objects are printed to stdout (or applied when using `--export=false` behavior in context) and are usually piped to `kubectl apply` or committed to the Git repository that Flux watches.

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

# SEE ALSO

flux, flux-bootstrap, flux-get

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_create/)```

<!-- verified: 2026-07-09 -->
