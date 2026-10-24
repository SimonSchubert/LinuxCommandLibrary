# TAGLINE

Delete Flux sources and resources from the cluster

# TLDR

**Delete a Kustomization**

```flux delete kustomization podinfo```

**Delete a Kustomization** without asking for confirmation

```flux delete kustomization podinfo --silent```

**Delete a HelmRelease**

```flux delete helmrelease podinfo```

**Delete a GitRepository source**

```flux delete source git my-repo```

**Delete a HelmRepository source**

```flux delete source helm my-repo```

# SYNOPSIS

**flux** **delete** _kind_ _name_ [_options_]

# DESCRIPTION

**flux delete** removes a Flux custom resource from the cluster. The named object is deleted after a confirmation prompt unless **--silent** is set.

Deleting a Kustomization that has pruning enabled also deletes the Kubernetes resources that Kustomization created. A Git source that still defines the object will recreate it on the next reconciliation.

Short kind aliases such as `ks` for kustomization and `hr` for helmrelease are accepted.

# KINDS

**kustomization**
> Delete a Kustomization.

**helmrelease**
> Delete a HelmRelease.

**source git**, **source helm**, **source oci**, **source bucket**, **source chart**
> Delete a GitRepository, HelmRepository, OCIRepository, Bucket, or HelmChart.

**image policy**, **image repository**, **image update**
> Delete ImagePolicy, ImageRepository, or ImageUpdateAutomation objects.

**alert**, **alert-provider**, **receiver**
> Delete notification Alerts, Providers, and Receivers.

# PARAMETERS

**-s**, **--silent**
> Delete the resource without asking for confirmation.

**-n**, **--namespace** _ns_
> Namespace scope for the CLI request (default `flux-system`).

**--timeout** _duration_
> Timeout for the operation (default `5m0s`).

**--kubeconfig** _file_
> Path to the kubeconfig file.

**--context** _name_
> Kubeconfig context to use.

# CAVEATS

This removes the live object. If a Git, OCI, or Bucket source still contains the manifest, Flux will recreate it. Deleting a Kustomization with prune enabled can remove the workloads it applied. Cluster access via kubectl is required.

# INSTALL

```apk: sudo apk add flux```

```brew: brew install flux```

```nix: nix profile install nixpkgs#flux```

<!-- packages: 2026-10-24 -->

# SEE ALSO

[flux](/man/flux)(1), [flux-create](/man/flux-create)(1), [flux-export](/man/flux-export)(1), [flux-suspend](/man/flux-suspend)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_delete/)```

<!-- verified: 2026-10-24 -->
