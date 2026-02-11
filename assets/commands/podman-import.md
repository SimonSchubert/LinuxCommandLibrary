# TAGLINE

Create container image from filesystem tarball

# TLDR

**Import tarball as image**

```podman import [file.tar] [image:tag]```

**Import from URL**

```podman import [https://example.com/rootfs.tar] [image]```

**Import with changes**

```podman import --change "CMD [/bin/bash]" [file.tar] [image]```

# SYNOPSIS

**podman import** [_options_] _path_ [_reference_]

# PARAMETERS

_PATH_
> Tarball path or URL.

_REFERENCE_
> Image name and tag.

**--change** _INSTRUCTION_
> Apply Dockerfile instruction.

**-m**, **--message** _MSG_
> Commit message.

# DESCRIPTION

**podman import** creates a new container image from a filesystem tarball (or URL). Unlike podman load, which restores a previously saved image with all its layers and metadata, import creates a flat single-layer image from a root filesystem archive.

The **--change** option allows applying Dockerfile instructions (like CMD, ENTRYPOINT, ENV) to the imported image. This is typically used with archives created by podman export or other tools that produce root filesystem tarballs.

# CAVEATS

Creates single layer image. No build history.

# HISTORY

podman import provides **tarball to image** conversion functionality.

# SEE ALSO

[podman](/man/podman)(1), [podman-export](/man/podman-export)(1), [podman-load](/man/podman-load)(1)

