# TAGLINE

Build an image with Docker Buildx and BuildKit

# TLDR

**Build** from the Dockerfile in the current directory

```docker buildx build .```

**Tag** the image

```docker buildx build -t [image:tag] .```

Use a **specific Dockerfile**

```docker buildx build -f [path/to/Dockerfile] -t [image:tag] .```

Pass **build-time variables**

```docker buildx build --build-arg [HTTP_PROXY=http://proxy.example.com] --build-arg [VERSION=1.0] .```

**Load** a single-platform result into **docker images**

```docker buildx build --load -t [image:tag] .```

Build for **multiple platforms** and **push** to a registry

```docker buildx build --platform [linux/amd64,linux/arm64] --push -t [registry.example.com/image:tag] .```

Build a **named stage** from a multi-stage Dockerfile

```docker buildx build --target [stage_name] -t [image:tag] .```

Build with a **secret** and **SSH** forwarding for private fetches

```docker buildx build --secret [id=aws,src=$HOME/.aws/credentials] --ssh default .```

# SYNOPSIS

**docker buildx build** [_options_] _PATH_ | _URL_ | **-**

# PARAMETERS

**-t**, **--tag** _name_[:_tag_]
> Image name and optional tag. Repeatable.

**-f**, **--file** _path_|_url_|**-**
> Dockerfile location. Default: **PATH/Dockerfile**. **-** reads the Dockerfile from stdin.

**--build-arg** _key_[=_value_]
> Build-time variable for **ARG**. If _value_ is omitted, the value is taken from the client environment.

**--platform** _platforms_
> Target platform(s), comma-separated (**linux/amd64**, **linux/arm64**, **linux/arm/v7**). Multiple values produce a manifest list (requires a driver other than **docker**).

**--load**
> Shorthand for **--output=type=docker**. Loads a single-platform image into the local image store.

**--push**
> Shorthand for **--output=type=registry**. Pushes the result to a registry.

**-o**, **--output** _dest_
> Export destination, for example **type=local,dest=**_path_, **type=tar,dest=-**, **type=oci**, **type=docker**, **type=image**, **type=registry**.

**--target** _stage_
> Build only up to the named stage in a multi-stage Dockerfile.

**--no-cache**
> Do not use cache when building.

**--no-cache-filter** _stages_
> Ignore cache for the named stages only (comma-separated).

**--pull**
> Always attempt to pull referenced images.

**--cache-from** _source_
> External cache source (**type=registry,ref=...**, **type=local,src=...**, **gha**, **s3**, **azblob**). Default type is registry.

**--cache-to** _dest_
> External cache destination (**registry**, **local**, **inline**, **gha**, **s3**, **azblob**).

**--secret** _id=..._
> Expose a secret to **RUN --mount=type=secret**. **type=file** (default if no matching env var) or **type=env**.

**--ssh** _default_|_id_[=_socket_|_key_]
> Expose an SSH agent socket or keys to **RUN --mount=type=ssh**.

**--build-context** _name_=_value_
> Additional named context (local path, Git/HTTP URL, **docker-image://**, or **oci-layout:///**).

**--attest** _type=sbom_|_type=provenance_
> Attach SBOM or SLSA provenance attestations. **--sbom** and **--provenance** are shorthands.

**--progress** _mode_
> Progress output: **auto** (default), **tty**, **plain**, **quiet**, **rawjson**, **none**. Also settable via **BUILDKIT_PROGRESS**.

**-q**, **--quiet**
> Suppress build output and print the image ID on success.

**--network** _mode_
> Network for **RUN**: **default**, **none**, or **host**.

**--allow** _entitlement_
> Extra privilege: **network.host**, **security.insecure**, **device**, **buildx.local.delete**. The BuildKit daemon must also allow insecure entitlements.

**--call** _method_
> Frontend method instead of a full build: **build** (default), **check**, **outline**, **targets**. **--check** is shorthand for **--call=check**.

**--metadata-file** _file_
> Write build metadata JSON (digests, provenance) to _file_.

**--iidfile** _file_
> Write the image ID to _file_.

**--label** _key=value_
> Image metadata label. Repeatable.

**--annotation** _key=value_
> OCI annotation on the index, manifest, or descriptor.

**--builder** _name_
> Builder instance to use (overrides the currently selected builder).

# DESCRIPTION

**docker buildx build** starts a build using BuildKit. It is the Buildx form of **docker build** (also aliased as **docker builder build** and **docker image build**).

The positional argument is the build context: a local directory, a Git or HTTP URL, or **-** for stdin. BuildKit executes the Dockerfile, caches layers, and exports the result according to **--output** / **--load** / **--push**.

The default **docker** driver builds on the engine's built-in builder and implies a local image load, but it cannot produce multi-platform images or export cache. Drivers such as **docker-container** (created with **docker buildx create**) support **--platform** lists, cache export, attestations, and registry pushes. **--load** is single-platform only; multi-platform results should be **--push**ed to a registry unless the engine uses the containerd image store.

# CAVEATS

The **docker** driver does not support multi-platform builds or **--cache-to**. **--load** fails for multi-platform output on the default image store. Attestations persist when pushing to a registry; they are dropped if you only load into the classic image store. **--allow security.insecure** and **network.host** also need **--allow-insecure-entitlement** on the BuildKit daemon. Large contexts slow the upload; use **.dockerignore**. Secrets must be mounted in the Dockerfile with **RUN --mount=type=secret**; passing **--secret** alone does not inject files.

# HISTORY

Docker's image builder dates to the **2013** Docker release. **BuildKit** landed in **2017** and became the default builder in Docker **23.0** (**2023**). **buildx** is the CLI plugin that drives BuildKit for multi-platform builds, cache backends, and attestations; **docker buildx build** is its primary command.

# INSTALL

```apt: sudo apt install docker-cli```

```dnf: sudo dnf install docker-cli```

```pacman: sudo pacman -S docker```

```apk: sudo apk add docker-cli```

```zypper: sudo zypper install docker```

```brew: brew install docker```

```nix: nix profile install nixpkgs#docker```

<!-- packages: 2026-09-15 -->

# SEE ALSO

[docker-build](/man/docker-build)(1), [docker-buildx-create](/man/docker-buildx-create)(1), [docker-buildx-ls](/man/docker-buildx-ls)(1), [docker-buildx-inspect](/man/docker-buildx-inspect)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/docker/buildx)```

```[Documentation](https://docs.docker.com/reference/cli/docker/buildx/build/)```

<!-- verified: 2026-09-15 -->
