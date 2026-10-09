# TAGLINE

Uninstall Flux components and custom resource definitions from a cluster

# TLDR

**Uninstall Flux** from the default `flux-system` namespace

```flux uninstall```

**Uninstall without a confirmation prompt**

```flux uninstall --silent```

**Uninstall from a specific namespace**

```flux uninstall --namespace infra```

**Uninstall Flux but keep the namespace**

```flux uninstall --keep-namespace```

**Print objects that would be deleted** without changing the cluster

```flux uninstall --dry-run```

# SYNOPSIS

**flux** **uninstall** [_options_]

# DESCRIPTION

**flux uninstall** removes Flux from a Kubernetes cluster. It deletes the Flux components in the target namespace, strips `toolkit.fluxcd.io` finalizers cluster-wide, deletes the Flux custom resource definitions, and (unless **--keep-namespace** is set) deletes the namespace.

The command takes no positional arguments. The namespace defaults to `flux-system`. Unless **--silent** or **--dry-run** is set, it asks for confirmation. If Flux was installed by another manager, the prompt names that manager before proceeding.

# PARAMETERS

**-s**, **--silent**
> Delete components without asking for confirmation.

**--keep-namespace**
> Skip namespace deletion.

**--dry-run**
> Print the objects that would be deleted without applying changes.

**-n**, **--namespace** _ns_
> Namespace that holds the Flux components (default `flux-system`).

**--timeout** _duration_
> Timeout for the operation (default `5m0s`).

**--kubeconfig** _file_
> Path to the kubeconfig file.

**--context** _name_
> Kubeconfig context to use.

# CAVEATS

This is a destructive cluster operation. Custom resources of Flux kinds are removed with the CRDs. Workloads Flux previously applied are left in place unless those objects are also Flux CRDs. Cluster-admin access is typically required. Git still contains the bootstrap manifests unless they are deleted separately.

# INSTALL

```apk: sudo apk add flux```

```brew: brew install flux```

```nix: nix profile install nixpkgs#flux```

<!-- packages: 2026-10-09 -->

# SEE ALSO

[flux](/man/flux)(1), [flux-bootstrap](/man/flux-bootstrap)(1), [flux-check](/man/flux-check)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_uninstall/)```

<!-- verified: 2026-10-09 -->
