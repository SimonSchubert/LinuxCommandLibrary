# TAGLINE

Build Flux manifests locally for inspection or piping to kubectl

# TLDR

**Build a Kustomization** and print the resulting manifests

```flux build kustomization my-app --path ./path/to/local/manifests```

**Build using a local Flux Kustomization file** without applying cluster state

```flux build kustomization my-app --path ./path/to/local/manifests --kustomization-file ./my-app.yaml --dry-run```

**Build and apply directly**

```flux build kustomization my-app --path ./kustomize | kubectl apply -f -```

**Package manifests into an artifact** tarball

```flux build artifact --path ./path/to/local/manifests --output ./artifact.tgz```

# SYNOPSIS

**flux** **build** **kustomization** _name_ **--path** _path_ [_options_]

**flux** **build** **artifact** **--path** _path_ [_options_]

# DESCRIPTION

**flux build** renders Flux resources locally using controller-compatible logic, without applying them to the cluster. Supported subcommands are **kustomization** and **artifact**.

**flux build kustomization** fetches (or loads) a Flux Kustomization, applies its transformations against the local manifests at `--path`, and writes the resulting multi-doc YAML to stdout. Useful for previewing deploys, debugging overlays, or piping to `kubectl`.

**flux build artifact** packs a directory or single manifest file into a `.tgz` artifact suitable for source/OCI workflows.

# PARAMETERS

**kustomization** _name_
> Build the named Flux Kustomization against local manifests.

**artifact**
> Build a tarball from local Kubernetes manifests.

**-n**, **--namespace** _ns_
> Namespace scope (default `flux-system`).

**--timeout** _duration_
> Timeout for the operation (default `5m0s`).

**--path** _path_ (kustomization and artifact)
> Path to local manifests / kustomization directory, or a single file for artifact builds.

**--kustomization-file** _file_
> Path to a local Flux Kustomization YAML instead of fetching it from the cluster.

**--dry-run**
> Dry-run mode without connecting to the cluster. Variable substitutions from Secrets and ConfigMaps are skipped.

**--recursive**, **-r**
> Recursively build encountered Kustomizations.

**--local-sources** _Kind/namespace/name=path,..._
> Map remote sources to local paths for recursive builds (e.g. `GitRepository/flux-system/my-repo=./path/to/local/git`).

**--ignore-paths** _patterns_
> Comma-separated `.gitignore`-style paths to exclude.

**--strict-substitute**
> Fail post-build substitution when a declared variable has no default and is missing from input vars.

**--in-memory-build**
> Use an in-memory filesystem during the build (kustomization).

**-o**, **--output** _file_
> Output path for the artifact tarball (default `artifact.tgz`).

**--resolve-symlinks**
> Resolve symlinks by copying their targets into the artifact.

# SEE ALSO

[flux](/man/flux)(1), [flux-create](/man/flux-create)(1), [kustomize](/man/kustomize)(1)

# RESOURCES

```[Source code](https://github.com/fluxcd/flux2)```

```[Documentation](https://fluxcd.io/flux/cmd/flux_build/)```

<!-- verified: 2026-07-11 -->
