# TAGLINE

Export Flux resources as YAML

# TLDR

**Export a Kustomization**

```flux export kustomization podinfo```

**Export every Kustomization** in the namespace to a file

```flux export kustomization --all > kustomizations.yaml```

**Export a GitRepository** including its credential Secret

```flux export source git my-private-repo --with-credentials```

**Export every GitRepository source**

```flux export source git --all```

**Export a HelmRelease**

```flux export helmrelease podinfo```

# SYNOPSIS

**flux** **export** _kind_ [_name_] [_options_]

# DESCRIPTION

**flux export** prints one or all Flux custom resources in a namespace as YAML on stdout. A name is required unless **--all** is set.

Use it to capture live objects for a Git repository, to move them between clusters, or to inspect the spec Flux is reconciling. Credential Secrets are omitted unless **--with-credentials** is passed on a source that stores them.

Short kind aliases such as `ks` for kustomization and `hr` for helmrelease are accepted.

# KINDS

**kustomization**
> Export a Kustomization.

**helmrelease**
> Export a HelmRelease.

**source git**, **source helm**, **source oci**, **source bucket**, **source chart**, **source external**
> Export a GitRepository, HelmRepository, OCIRepository, Bucket, HelmChart, or ExternalArtifact.

**image policy**, **image repository**, **image update**
> Export ImagePolicy, ImageRepository, or ImageUpdateAutomation objects.

**alert**, **alert-provider**, **receiver**
> Export notification Alerts, Providers, and Receivers.

**artifact**
> Export artifact objects, including artifact generators.

# PARAMETERS

**--all**
> Select every resource of the given kind in the namespace.

**--with-credentials**
> Include credential Secrets when exporting a source (SSH key pair or basic auth).

**-n**, **--namespace** _ns_
> Namespace scope for the CLI request (default `flux-system`).

**--timeout** _duration_
> Timeout for the operation (default `5m0s`).

**--kubeconfig** _file_
> Path to the kubeconfig file.

**--context** _name_
> Kubeconfig context to use.

# CAVEATS

**--with-credentials** writes private keys and passwords to stdout. Redirect that output only to a protected file. Exported YAML is the live object, which can differ from the manifest stored in Git. Cluster access via kubectl is required.

# INSTALL

```apk: sudo apk add flux```

```brew: brew install flux```

```nix: nix profile install nixpkgs#flux```

<!-- packages: 2026-10-24 -->

# SEE ALSO

[flux](/man/flux)(1), [flux-create](/man/flux-create)(1), [flux-get](/man/flux-get)(1), [flux-build](/man/flux-build)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_export/)```

<!-- verified: 2026-10-24 -->
