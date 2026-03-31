# TAGLINE

Build OCI and Docker container images without a daemon

# TLDR

**Build** container from Containerfile/Dockerfile

```buildah build -t [myimage] [.]```

**Create** working container

```buildah from [fedora]```

**Run** command in container

```buildah run [container-id] -- [dnf install -y httpd]```

**Copy** files into container

```buildah copy [container-id] [local/path] [/container/path]```

**Commit** container to image

```buildah commit [container-id] [myimage]```

**List** local images

```buildah images```

**Push** image to a registry

```buildah push [myimage] [docker://registry.example.com/myimage:tag]```

# SYNOPSIS

**buildah** _command_ [_options_]

# DESCRIPTION

**buildah** is a tool for building OCI and Docker container images without requiring a daemon. It provides fine-grained control over image layers and can build from Dockerfiles or through direct manipulation of containers.

Unlike Docker, buildah does not require a background daemon process, making it well-suited for CI/CD pipelines and restricted environments. It supports rootless builds, where the entire build process runs without elevated privileges. As part of the Podman ecosystem, it shares storage and image formats with podman and skopeo, allowing seamless interoperation between the tools.

# PARAMETERS

**build** (formerly **bud**)
> Build image using Containerfile/Dockerfile

**from** _image_
> Create working container

**run** _container_ _cmd_
> Run command in container

**commit** _container_ _image_
> Save container as image

**push** _image_ _destination_
> Push image to registry

**pull** _image_
> Pull image from registry

**images**
> List images

**containers**
> List working containers

**copy** _container_ _src_ _dest_
> Copy files into container

**config** [_options_] _container_
> Set image configuration (cmd, entrypoint, env, labels, etc.)

**rm** _container_
> Remove container

**rmi** _image_
> Remove image

**inspect** _container|image_
> Display detailed information

**mount** _container_
> Mount container filesystem

**umount** _container_
> Unmount container filesystem

# BUILDING IMAGES

**From Containerfile/Dockerfile:**
```bash
buildah build -t myapp:latest .
```

**Script-based:**
```bash
# Create container
ctr=$(buildah from fedora)

# Install packages
buildah run $ctr dnf install -y nginx

# Copy files
buildah copy $ctr ./app /app

# Set config
buildah config --cmd "/app/start.sh" $ctr

# Commit
buildah commit $ctr myapp:latest
```

# FEATURES

- Daemonless operation
- Rootless builds
- Dockerfile compatibility
- Fine-grained layer control
- OCI image format
- Multiple storage backends
- Script-friendly

# CONFIGURATION

**/etc/containers/registries.conf**
> Registry configuration including mirrors, insecure registries, and search order.

**/etc/containers/storage.conf**
> Storage driver and location settings for images and containers.

**/etc/containers/policy.json**
> Image signature verification policy.

# CAVEATS

Different from Docker workflow (learning curve). Some Docker features not supported. Rootless mode has kernel and filesystem limitations. Storage configuration important. The **bud** subcommand is deprecated in favor of **build**.

# HISTORY

**buildah** was created by Red Hat around **2017** as a component of their container tooling suite, focusing on building without daemons.

# SEE ALSO

[podman](/man/podman)(1), [docker](/man/docker)(1), [skopeo](/man/skopeo)(1)
