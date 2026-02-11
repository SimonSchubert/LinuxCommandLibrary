# TAGLINE

Export container filesystem as tar archive

# TLDR

**Export container filesystem**

```podman export [container] -o [container.tar]```

**Export to stdout**

```podman export [container] > [container.tar]```

**Export and compress**

```podman export [container] | gzip > [container.tar.gz]```

# SYNOPSIS

**podman export** [_options_] _container_

# PARAMETERS

**-o**, **--output** _file_
> Output file path.

# DESCRIPTION

**podman export** exports a container's filesystem as a tar archive. Unlike podman save, it exports the running container state, not the image layers.

The result can be imported with podman import to create a new image.

# EXAMPLES

```bash
# Export to file
podman export mycontainer -o backup.tar

# Export running container
podman export $(podman ps -lq) > latest.tar

# Compress while exporting
podman export webserver | gzip > webserver.tar.gz

# Export and import as new image
podman export mycontainer | podman import - myimage:latest
```

# EXPORT VS SAVE

```
podman export - Container filesystem (flat)
podman save  - Image layers (preserves history)
```

# CAVEATS

Loses image metadata and history. Only exports filesystem. Use podman save for image preservation.

# HISTORY

podman export is part of **Podman**, providing Docker-compatible container export functionality in a daemonless architecture.

# SEE ALSO

[podman-import](/man/podman-import)(1), [podman-save](/man/podman-save)(1), [podman-commit](/man/podman-commit)(1)
