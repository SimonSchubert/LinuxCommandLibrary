# TAGLINE

Create a new Docker Buildx builder instance

# TLDR

**Create** a builder using the current Docker context

```docker buildx create```

**Create** a named builder and switch to it

```docker buildx create --name [mybuilder] --use```

**Create** a multi-platform builder in a container

```docker buildx create --name [multiarch] --driver docker-container --platform linux/amd64,linux/arm64 --use```

**Append** a node to an existing builder

```docker buildx create --name [mybuilder] --append [context_name]```

**Create** a builder with a custom BuildKit config

```docker buildx create --buildkitd-config [path/to/buildkitd.toml]```

# SYNOPSIS

**docker buildx create** [_options_] [_context_|_endpoint_]

# PARAMETERS

**--append**
> Append a node to an existing builder instead of creating a new one. Requires **--name**.

**--bootstrap**
> Boot the builder after creation.

**--buildkitd-config** _file_
> BuildKit daemon configuration file.

**--buildkitd-flags** _flags_
> Extra flags passed to the BuildKit daemon; override values in **--buildkitd-config**.

**--driver** _driver_
> Builder driver: **docker** (default), **docker-container**, **kubernetes**, or **remote**.

**--driver-opt** _options_
> Driver-specific options (for example **network=host** for **docker-container**).

**--leave**
> Remove a node from a builder instead of creating one. Requires **--name** and **--node**.

**--name** _name_
> Builder instance name. Auto-generated if omitted.

**--node** _node_
> Node name to create or modify. Defaults to the builder name with a numeric suffix.

**--platform** _platforms_
> Comma-separated platforms for the node (for example **linux/amd64,linux/arm64**).

**--timeout** _duration_
> Timeout for loading builder status (default: **20s**).

**--use**
> Switch the current builder to the newly created instance.

# DESCRIPTION

**docker buildx create** provisions a new Buildx builder instance that points at a Docker context or endpoint. A builder is an isolated environment where **docker buildx build** runs; each Docker context also receives a default builder.

The optional _context_ argument is the name from **docker context ls**. An _endpoint_ can be a Docker socket address (the value of **DOCKER_HOST**). When neither is given, the active Docker configuration determines the target.

Drivers control where builds execute. The **docker** driver uses the daemon's built-in builder and implies **--load** on builds, but cannot build multi-platform images or export cache. **docker-container** spawns a dedicated BuildKit container and supports multi-platform builds and cache export; images are not loaded into **docker images** unless **--load** is used. **kubernetes** runs BuildKit in pods. **remote** connects to an externally managed BuildKit daemon.

Use **--append** to add another node (context/endpoint) to an existing named builder so Buildx can route builds to the node that supports the requested platform. Use **--leave** with **--name** and **--node** to detach a node.

# CAVEATS

The **docker** driver does not support multi-platform image builds or cache export. **docker-container**, **kubernetes**, and **remote** drivers require **docker buildx build --load** to make images appear in **docker images**. Remote and Kubernetes builders may show as inactive if their endpoint is unreachable within **--timeout**.

# SEE ALSO

[docker-buildx-ls](/man/docker-buildx-ls)(1), [docker-buildx-rm](/man/docker-buildx-rm)(1), [docker-build](/man/docker-build)(1), [docker](/man/docker)(1)