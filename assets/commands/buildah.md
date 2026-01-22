# TLDR

**Build** container from Dockerfile

```buildah bud -t [myimage] [.]```

**Create** working container

```buildah from [fedora]```

**Run** command in container

```buildah run [container-id] [dnf install -y httpd]```

**Commit** container to image

```buildah commit [container-id] [myimage]```

**Push** image

```buildah push [myimage] [docker://registry/image]```

# SYNOPSIS

**buildah** _command_ [_options_]

# DESCRIPTION

**buildah** is a tool for building OCI and Docker container images without requiring a daemon. It provides fine-grained control over image layers and can build from Dockerfiles or through direct manipulation of containers.

The tool is part of the Podman ecosystem and emphasizes security and scriptability.

# PARAMETERS

**bud**
> Build using Dockerfile

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

**rm** _container_
> Remove container

**rmi** _image_
> Remove image

# BUILDING IMAGES

**From Dockerfile:**
```bash
buildah bud -t myapp:latest .
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

# CAVEATS

Different from Docker (learning curve). Some Docker features not supported. Rootless mode has limitations. Storage configuration important. Not as widely adopted as Docker.

# HISTORY

**buildah** was created by Red Hat around **2017** as a component of their container tooling suite, focusing on building without daemons.

# SEE ALSO

[podman](/man/podman)(1), [docker](/man/docker)(1), [skopeo](/man/skopeo)(1)
