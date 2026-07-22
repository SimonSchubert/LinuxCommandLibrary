# TAGLINE

Build and deploy Go container images without a Dockerfile

# TLDR

**Build and publish** a container image from a Go import path to _$KO_DOCKER_REPO_

```ko build [./cmd/app]```

**Build into the local Docker daemon** instead of pushing

```ko build --local [./cmd/app]```

**Build a multi-platform image**

```ko build --platform=linux/amd64,linux/arm64 [./cmd/app]```

**Resolve Kubernetes manifests**, replacing _ko://_ image refs with built digests

```ko resolve -f [path/to/manifest.yaml]```

**Build, push, and apply** a manifest to the current cluster

```ko apply -f [path/to/manifest.yaml]```

**Run** a Go package as an ephemeral pod in the cluster

```ko run [./cmd/app]```

**Log in** to a container registry

```ko login [registry.example.com] -u [username] -p [password]```

**Print the version**

```ko version```

# SYNOPSIS

**ko**  _command_  [_flags_]  [_import-path_]

# COMMANDS

**ko build** [_import-path_ ...]
> Build OCI images for one or more Go _main_ packages and push them to **$KO_DOCKER_REPO**. Aliases: **publish**.

**ko resolve** **-f** _file_
> Read Kubernetes YAML, build every **ko://** image reference, push it, and print the manifest with each reference rewritten to its image digest.

**ko apply** **-f** _file_
> Like **resolve**, then pipe the rewritten manifest into **kubectl apply**.

**ko create** **-f** _file_
> Like **resolve**, then pipe into **kubectl create**.

**ko delete** **-f** _file_
> Delete resources defined in the manifest from the cluster.

**ko run** _import-path_
> Build the binary, push the image, and run it as a Pod in the cluster.

**ko login** _registry_
> Authenticate to a container registry; credentials are stored in the standard Docker config file.

**ko deps** _import-path_
> Print the Go module dependency tree that would be baked into the image.

**ko version**
> Print client version.

# PARAMETERS

**-B**, **--base-import-paths**
> Tag images with only the final path component (e.g. _app_).

**-P**, **--preserve-import-paths**
> Tag images with the full import path.

**--bare**
> Use _$KO_DOCKER_REPO_ as the image name verbatim, with no suffix.

**--platform** _list_
> Comma-separated platforms (e.g. _linux/amd64,linux/arm64,linux/arm/v7_). Use _all_ for every platform the base image supports.

**-t**, **--tags** _list_
> Comma-separated tags applied to the published image (default: _latest_).

**-L**, **--local**
> Load the built image into the local Docker daemon instead of pushing.

**--image-refs** _file_
> Write the published image references to _file_, one per line.

**--sbom** _format_
> SBOM format to embed: _spdx_ (default), _cyclonedx_, _go.version-m_, or _none_.

**--push** _bool_
> When _false_, build without pushing. Useful with **--tarball**.

**--tarball** _file_
> Write the image to a tarball loadable by **docker load**.

**--kubeconfig** _file_
> Path to a kubeconfig used by **apply**, **create**, **run**, **delete**.

**--selector** _label=value_
> Apply only to resources matching the label selector.

# CONFIGURATION

**ko** reads a per-project **.ko.yaml** at the repository root. Common keys:

**defaultBaseImage**: _registry/image:tag_
> Distroless image used as the base layer (default: _cgr.dev/chainguard/static_).

**baseImageOverrides**: _map_
> Per-import-path base images.

**builds**: _list_
> Per-import-path build settings (env, flags, ldflags, main, dir).

**defaultPlatforms**: _list_
> Default value for **--platform**.

**ko** also honors these environment variables:

**KO_DOCKER_REPO**
> Target registry/repo. Set to _ko.local_ to write to the local Docker daemon, or _kind.local_ to load into a Kind cluster.

**KO_DEFAULTBASEIMAGE**
> Overrides _defaultBaseImage_ from **.ko.yaml**.

**KOCACHE**
> Directory used to cache built layers; speeds up incremental builds.

**KO_CONFIG_PATH**
> Path to **.ko.yaml** when it is not at the repo root.

# DESCRIPTION

**ko** is a container image builder dedicated to Go. It compiles a Go _main_ package with the local **go** toolchain, lays the resulting static binary on top of a small distroless base image, and produces an OCI image, all without spawning **docker** or executing a Dockerfile. Because the build is just **go build**, cross-compilation, reproducible builds, and Go module caching all work as they do outside of containers.

A typical workflow stores a fragment of YAML such as _image: ko://github.com/me/app/cmd/server_ in a Kubernetes manifest. **ko resolve** reads the manifest, runs **ko build** for every such reference, pushes the resulting images to **$KO_DOCKER_REPO**, and emits a new manifest where each **ko://** reference has been rewritten to an immutable digest. **ko apply** does the same and pipes the output to **kubectl apply**, giving GitOps-style deployment in a single command.

Images include an SBOM by default (SPDX) and are reproducible across machines because the Go binary, base image digest, and entrypoint are the only inputs. Multi-platform images are built in parallel and assembled into an OCI image index.

# CAVEATS

**ko** only ships Go binaries; cgo, system packages, and arbitrary RUN steps are not supported. Projects that need glibc, system tools, or a custom base layer must pick an alternate distroless or **cgr.dev/chainguard/\*** base via _defaultBaseImage_, or use a different builder.

The **--local** flag requires a running Docker daemon; without it, **ko** talks directly to the registry and never touches Docker.

# HISTORY

**ko** was created at **Google** in **2018** by **Jason Hall**, **Matt Moore**, and others on the **Knative** team to publish their Go services without writing Dockerfiles. It was donated to the **ko-build** GitHub organization in **2021** and accepted into the **CNCF Sandbox** in **2022**.

# INSTALL

```pacman: sudo pacman -S ko```

```brew: brew install ko```

```nix: nix profile install nixpkgs#ko```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[docker](/man/docker)(1), [buildah](/man/buildah)(1), [crane](/man/crane)(1), [kubectl](/man/kubectl)(1), [skaffold](/man/skaffold)(1)
