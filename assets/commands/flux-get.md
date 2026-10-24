# TAGLINE

Print the status of Flux resources

# TLDR

**List every Flux resource** in all namespaces

```flux get all --all-namespaces```

**List Kustomizations** and their status

```flux get kustomizations```

**Show which source** each Kustomization uses

```flux get kustomizations --show-source```

**List HelmReleases**

```flux get helmreleases```

**List GitRepository sources**

```flux get sources git```

**Watch Kustomizations** for changes

```flux get kustomizations --watch```

# SYNOPSIS

**flux** **get** _kind_ [_name_ ...] [_options_]

# DESCRIPTION

**flux get** prints a table of Flux custom resources and their reconciliation status. Most kinds are plural (`kustomizations`, `helmreleases`, `alerts`). A name limits the table to that object.

The default namespace is `flux-system`. **--all-namespaces** lists the kind in every namespace. **--watch** keeps the table open and refreshes it as objects change.

Short aliases are accepted. `kustomizations` also accepts `ks` and `kustomization`.

# KINDS

**all**
> List every Flux resource and its status.

**kustomizations**
> Kustomization status. **--show-source** adds the source reference.

**helmreleases**
> HelmRelease status.

**sources git**, **sources helm**, **sources oci**, **sources bucket**, **sources chart**, **sources external**, **sources all**
> Status of GitRepository, HelmRepository, OCIRepository, Bucket, HelmChart, ExternalArtifact, or every source.

**images policy**, **images repository**, **images update**, **images all**
> Status of ImagePolicy, ImageRepository, ImageUpdateAutomation, or every image-automation object.

**alerts**, **alert-providers**, **receivers**
> Status of notification Alerts, Providers, and Receivers.

**artifacts**
> Artifact object status, including generators.

# PARAMETERS

**-A**, **--all-namespaces**
> List the requested objects across all namespaces.

**-w**, **--watch**
> After listing, watch for changes.

**-l**, **--label-selector** _selector_
> Filter objects by label selector.

**--status-selector** _condition=state_
> Filter by a status condition, for example `ready=false` or `ready!=true`.

**--show-source**
> On `kustomizations`, print the source reference for each object.

**--no-header**
> Skip the table header.

**-n**, **--namespace** _ns_
> Namespace scope for the CLI request (default `flux-system`).

**--timeout** _duration_
> Timeout for the operation (default `5m0s`).

**--kubeconfig** _file_
> Path to the kubeconfig file.

**--context** _name_
> Kubeconfig context to use.

# CAVEATS

The table is a status summary, not the full object. Use `flux export` or `kubectl get` for the spec. Cluster access via kubectl is required. **--watch** runs until interrupted.

# INSTALL

```apk: sudo apk add flux```

```brew: brew install flux```

```nix: nix profile install nixpkgs#flux```

<!-- packages: 2026-10-24 -->

# SEE ALSO

[flux](/man/flux)(1), [flux-reconcile](/man/flux-reconcile)(1), [flux-export](/man/flux-export)(1), [flux-check](/man/flux-check)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_get/)```

<!-- verified: 2026-10-24 -->
