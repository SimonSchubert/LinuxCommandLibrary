# TAGLINE

Build Flux manifests locally for inspection or piping to kubectl

# TLDR

**Build a Kustomization** and print the resulting manifests

```flux build kustomization my-app --path ./path/to/kustomization```

**Build and apply directly**

```flux build kustomization my-app --path ./kustomize | kubectl apply -f -```

**Build and save to file**

```flux build kustomization my-app --path ./kustomize > manifests.yaml```

# SYNOPSIS

**flux** **build** _kind_ _name_ --path _path_ [_options_]

# DESCRIPTION

**flux build** renders Flux resources (primarily Kustomizations) locally using the same logic the controllers use, without applying them to the cluster. This is useful for previewing what will be deployed, debugging kustomize overlays, or feeding manifests into other tools via pipe.

It currently supports building `kustomization` resources.

# PARAMETERS

**kustomization** _name_
> Name of the Kustomization resource to build.

**--path** _path_
> Filesystem path to the kustomization directory or file.

Other flags control output, namespace, etc.

# SEE ALSO

flux, flux-create, kustomize

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_build/)```

<!-- verified: 2026-07-09 -->
