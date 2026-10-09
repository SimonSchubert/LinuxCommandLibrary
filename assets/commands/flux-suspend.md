# TAGLINE

Suspend reconciliation of Flux resources

# TLDR

**Suspend a Kustomization**

```flux suspend kustomization podinfo```

**Suspend all Kustomizations** in the current namespace

```flux suspend kustomization --all```

**Suspend a HelmRelease**

```flux suspend helmrelease podinfo```

**Suspend a GitRepository source**

```flux suspend source git my-repo```

**Suspend an ImageUpdateAutomation**

```flux suspend image update my-automation```

# SYNOPSIS

**flux** **suspend** _kind_ [_name_ ...] [_options_]

# DESCRIPTION

**flux suspend** disables reconciliation of a Flux custom resource. Controllers stop applying Git, Helm, OCI, or image-automation changes for that object until it is resumed with `flux resume`.

The resource name is required unless **--all** is set, which suspends every matching object in the namespace (default `flux-system`). Multiple names may be given in one invocation.

Short kind aliases such as `ks` for kustomization and `hr` for helmrelease are accepted.

# KINDS

**kustomization**
> Suspend a Kustomization.

**helmrelease**
> Suspend a HelmRelease.

**source git**, **source helm**, **source oci**, **source bucket**, **source chart**
> Suspend a GitRepository, HelmRepository, OCIRepository, Bucket, or HelmChart.

**image policy**, **image repository**, **image update**
> Suspend ImagePolicy, ImageRepository, or ImageUpdateAutomation objects.

**alert**, **alert-provider**, **receiver**
> Suspend notification Alerts, Providers, and Receivers.

# PARAMETERS

**--all**
> Suspend all resources of the given kind in the namespace.

**-n**, **--namespace** _ns_
> Namespace scope for the CLI request (default `flux-system`).

**--timeout** _duration_
> Timeout for the operation (default `5m0s`).

**--kubeconfig** _file_
> Path to the kubeconfig file.

**--context** _name_
> Kubeconfig context to use.

# CAVEATS

Suspension is stored on the live cluster object. GitOps will restore the previous spec if a source still defines `spec.suspend: false` (or omits it) and a controller reconciles that source. Cluster access via kubectl is required.

# INSTALL

```apk: sudo apk add flux```

```brew: brew install flux```

```nix: nix profile install nixpkgs#flux```

<!-- packages: 2026-10-09 -->

# SEE ALSO

[flux](/man/flux)(1), [flux-check](/man/flux-check)(1), [flux-create](/man/flux-create)(1), [flux-bootstrap](/man/flux-bootstrap)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_suspend/)```

<!-- verified: 2026-10-09 -->
