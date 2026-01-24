# TLDR

**Copy image between registries**

```skopeo copy docker://[source-image] docker://[dest-image]```

**Inspect image**

```skopeo inspect docker://[image:tag]```

**List tags**

```skopeo list-tags docker://[registry/image]```

**Copy to local directory**

```skopeo copy docker://[image] dir:[local-dir]```

**Delete image**

```skopeo delete docker://[image:tag]```

**Sync repository**

```skopeo sync --src docker --dest docker [source] [dest]```

# SYNOPSIS

**skopeo** _command_ [_options_]

# DESCRIPTION

**skopeo** performs operations on container images and registries without requiring a container runtime. It can copy, inspect, delete, and sign images across registries.

The tool is useful for CI/CD pipelines, mirror management, and image inspection without pulling full images.

# PARAMETERS

**copy** _src_ _dest_
> Copy image.

**inspect** _image_
> Show image metadata.

**list-tags** _repo_
> List available tags.

**delete** _image_
> Delete image from registry.

**sync** _args_
> Synchronize repositories.

**--src-creds** _user:pass_
> Source credentials.

**--dest-creds** _user:pass_
> Destination credentials.

**--authfile** _file_
> Authentication file.

**--override-os** _os_
> Override OS.

**--override-arch** _arch_
> Override architecture.

# CAVEATS

Registry authentication may be needed. Some operations require write access. Large images take time. Delete may not reclaim space.

# HISTORY

**skopeo** was developed by **Red Hat** as part of the container tools project alongside podman and buildah. It enables daemonless container image operations, fitting the podman philosophy.

# SEE ALSO

[podman](/man/podman)(1), [docker](/man/docker)(1), [crane](/man/crane)(1), [buildah](/man/buildah)(1)
