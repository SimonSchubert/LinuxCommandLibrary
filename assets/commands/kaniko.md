# TLDR

**Build and push image** to registry

```/kaniko/executor --dockerfile=[Dockerfile] --context=[dir://workspace] --destination=[gcr.io/project/image:tag]```

**Build without pushing**

```/kaniko/executor --dockerfile=[Dockerfile] --context=[.] --no-push```

**Build with caching** enabled

```/kaniko/executor --dockerfile=[Dockerfile] --destination=[registry/image] --cache=true```

**Save image as tarball**

```/kaniko/executor --dockerfile=[Dockerfile] --context=[.] --tar-path=[image.tar] --no-push```

**Build specific target** stage

```/kaniko/executor --dockerfile=[Dockerfile] --destination=[registry/image] --target=[build-stage]```

**Build with build arguments**

```/kaniko/executor --dockerfile=[Dockerfile] --destination=[registry/image] --build-arg=[VERSION=1.0]```

# SYNOPSIS

**/kaniko/executor** [_options_]

# PARAMETERS

**--dockerfile** _path_
> Path to Dockerfile. Default: Dockerfile.

**--context** _uri_
> Build context: dir://, git://, s3://, gs://, or local path.

**--destination** _registry/image:tag_
> Registry to push image. Required unless --no-push.

**--no-push**
> Build image but don't push to registry.

**--tar-path** _path_
> Save image as tarball instead of pushing.

**--cache**
> Enable layer caching.

**--cache-repo** _repository_
> Repository for storing cached layers.

**--cache-ttl** _duration_
> Cache expiration time.

**--target** _stage_
> Build up to specified Dockerfile stage.

**--build-arg** _KEY=value_
> Set build-time variable. Repeatable.

**--snapshot-mode** _mode_
> Snapshot mode: full or time (default).

**--single-snapshot**
> Take one snapshot at end instead of per layer.

**--reproducible**
> Strip timestamps for reproducible builds.

**--registry-mirror** _mirror_
> Use registry mirror as pull-through cache.

**--insecure**
> Push to insecure (HTTP) registry.

**--skip-tls-verify**
> Skip TLS certificate verification.

**--kaniko-dir** _path_
> Kaniko working directory.

**--verbosity** _level_
> Log level: panic, fatal, error, warn, info, debug, trace.

# DESCRIPTION

**kaniko** builds container images from Dockerfiles inside containers or Kubernetes clusters without requiring privileged access or a Docker daemon. It executes each Dockerfile command in userspace and snapshots the filesystem.

The executor runs as a container image (**gcr.io/kaniko-project/executor**), making it ideal for CI/CD pipelines in Kubernetes where Docker-in-Docker is unavailable or undesirable for security reasons.

Context sources include local directories (**dir://**), Git repositories (**git://**), Google Cloud Storage (**gs://**), Amazon S3 (**s3://**), and Azure Blob Storage. Authentication is handled via mounted credentials or environment variables.

Layer caching with **--cache** significantly speeds up builds by reusing unchanged layers. Cached layers are stored in the registry specified by **--cache-repo** or derived from **--destination**.

A debug image (**gcr.io/kaniko-project/executor:debug**) includes busybox for troubleshooting.

# CAVEATS

Kaniko runs inside containers and is not meant for direct host execution. Some Dockerfile features may behave differently than with Docker daemon. The **time** snapshot mode may miss metadata-only changes; use **full** mode if needed. Build arguments with spaces require special IFS handling.

# HISTORY

Kaniko was developed by **Google** and released in **2018** as part of Google Container Tools. It was created to enable secure container builds in Kubernetes environments where running Docker daemon is impractical or forbidden. The project is maintained by the open-source community and widely used in cloud-native CI/CD pipelines.

# SEE ALSO

[docker](/man/docker)(1), [buildah](/man/buildah)(1), [podman](/man/podman)(1)
