# TAGLINE

Trigger reconciliation of Flux sources and resources

# TLDR

**Reconcile a GitRepository** outside its interval

```flux reconcile source git podinfo```

**Reconcile a Kustomization**

```flux reconcile kustomization podinfo```

**Sync the Kustomization source** and then apply it

```flux reconcile kustomization podinfo --with-source```

**Reconcile a HelmRelease**

```flux reconcile helmrelease podinfo```

**Reconcile a HelmRelease and its source**

```flux reconcile helmrelease podinfo --with-source```

**Force a one-off Helm upgrade**

```flux reconcile helmrelease podinfo --force```

# SYNOPSIS

**flux** **reconcile** _kind_ _name_ [_options_]

# DESCRIPTION

**flux reconcile** asks a Flux controller to reconcile one object immediately and waits until that reconciliation finishes or the timeout expires. It does not change the object's interval.

**--with-source** on a Kustomization or HelmRelease reconciles the source first, then applies the result. On a HelmRelease, **--force** requests a one-off install or upgrade, and **--reset** clears the failure count.

Short kind aliases such as `ks` for kustomization and `hr` for helmrelease are accepted.

# KINDS

**kustomization**
> Reconcile a Kustomization. **--with-source** also reconciles its source.

**helmrelease**
> Reconcile a HelmRelease. Accepts **--with-source**, **--force**, and **--reset**.

**source git**, **source helm**, **source oci**, **source bucket**, **source chart**
> Reconcile a GitRepository, HelmRepository, OCIRepository, Bucket, or HelmChart.

**image policy**, **image repository**, **image update**
> Reconcile ImagePolicy, ImageRepository, or ImageUpdateAutomation objects.

**receiver**
> Reconcile a Receiver.

# PARAMETERS

**--with-source**
> Reconcile the source of a Kustomization or HelmRelease before applying it.

**--force**
> On a HelmRelease, force a one-off install or upgrade.

**--reset**
> On a HelmRelease, reset the failure count.

**-n**, **--namespace** _ns_
> Namespace scope for the CLI request (default `flux-system`).

**--timeout** _duration_
> Timeout for the operation (default `5m0s`).

**--kubeconfig** _file_
> Path to the kubeconfig file.

**--context** _name_
> Kubeconfig context to use.

# CAVEATS

The command blocks until the object is ready or the timeout elapses. A suspended object is not reconciled until it is resumed. **--force** on a HelmRelease can upgrade a release outside the chart change the controller would otherwise wait for. Cluster access via kubectl is required.

# INSTALL

```apk: sudo apk add flux```

```brew: brew install flux```

```nix: nix profile install nixpkgs#flux```

<!-- packages: 2026-10-24 -->

# SEE ALSO

[flux](/man/flux)(1), [flux-get](/man/flux-get)(1), [flux-suspend](/man/flux-suspend)(1), [flux-resume](/man/flux-resume)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_reconcile/)```

<!-- verified: 2026-10-24 -->
