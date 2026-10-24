# TAGLINE

Resume reconciliation of suspended Flux resources

# TLDR

**Resume a Kustomization**

```flux resume kustomization podinfo```

**Resume several Kustomizations**

```flux resume kustomization podinfo-1 podinfo-2```

**Resume every Kustomization** in the namespace

```flux resume kustomization --all```

**Resume a HelmRelease**

```flux resume helmrelease podinfo```

**Resume a GitRepository source**

```flux resume source git my-repo```

**Resume an ImageUpdateAutomation**

```flux resume image update my-automation```

# SYNOPSIS

**flux** **resume** _kind_ [_name_ ...] [_options_]

# DESCRIPTION

**flux resume** clears suspension on a Flux custom resource so its controller reconciles it again. The command waits for that reconciliation to finish.

The resource name is required unless **--all** is set, which resumes every matching object in the namespace (default `flux-system`). Multiple names may be given in one invocation. **--wait** resumes them one at a time, waiting for each to reconcile before the next.

Short kind aliases such as `ks` for kustomization and `hr` for helmrelease are accepted.

# KINDS

**kustomization**
> Resume a Kustomization.

**helmrelease**
> Resume a HelmRelease.

**source git**, **source helm**, **source oci**, **source bucket**, **source chart**
> Resume a GitRepository, HelmRepository, OCIRepository, Bucket, or HelmChart.

**image policy**, **image repository**, **image update**
> Resume ImagePolicy, ImageRepository, or ImageUpdateAutomation objects.

**alert**, **alert-provider**, **receiver**
> Resume notification Alerts, Providers, and Receivers.

# PARAMETERS

**--all**
> Resume all resources of the given kind in the namespace.

**--wait**
> Wait for one resource to reconcile before moving to the next.

**-n**, **--namespace** _ns_
> Namespace scope for the CLI request (default `flux-system`).

**--timeout** _duration_
> Timeout for the operation (default `5m0s`).

**--kubeconfig** _file_
> Path to the kubeconfig file.

**--context** _name_
> Kubeconfig context to use.

# CAVEATS

Resume clears `spec.suspend` on the live object and then waits for a reconcile. A Git source that still sets suspension will suspend the object again on the next sync. Cluster access via kubectl is required.

# INSTALL

```apk: sudo apk add flux```

```brew: brew install flux```

```nix: nix profile install nixpkgs#flux```

<!-- packages: 2026-10-24 -->

# SEE ALSO

[flux](/man/flux)(1), [flux-suspend](/man/flux-suspend)(1), [flux-reconcile](/man/flux-reconcile)(1), [flux-get](/man/flux-get)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_resume/)```

<!-- verified: 2026-10-24 -->
