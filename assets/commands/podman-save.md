# TLDR

**Save image to tar**

```podman save -o [image.tar] [image:tag]```

**Save to stdout**

```podman save [image:tag] > [image.tar]```

**Save compressed**

```podman save [image:tag] | gzip > [image.tar.gz]```

**Save multiple images**

```podman save -o [images.tar] [image1:tag] [image2:tag]```

# SYNOPSIS

**podman save** [_options_] _image_...

# PARAMETERS

**-o**, **--output** _file_
> Output file path.

**--compress**
> Compress layers.

**--format** _format_
> Output format (oci-archive, docker-archive).

**-q**, **--quiet**
> Suppress output.

# DESCRIPTION

**podman save** saves one or more images to a tar archive. The archive preserves all image layers and metadata, suitable for transfer between systems.

Use podman load to restore saved images.

# EXAMPLES

```bash
# Save to file
podman save -o nginx.tar nginx:latest

# Save with compression
podman save myimage:v1 | gzip > myimage.tar.gz

# Save in OCI format
podman save --format oci-archive -o image.tar myimage

# Save multiple images
podman save -o all-images.tar image1:v1 image2:v2

# Transfer to another host
podman save myimage | ssh user@host podman load
```

# FORMATS

```
docker-archive - Docker compatible (default)
oci-archive    - OCI format
oci-dir        - OCI directory layout
```

# CAVEATS

Archives can be large. Use podman export for filesystem-only export.

# HISTORY

podman save is part of **Podman** by **Red Hat**, providing Docker-compatible image archival functionality.

# SEE ALSO

[podman-load](/man/podman-load)(1), [podman-export](/man/podman-export)(1), [podman-push](/man/podman-push)(1)
