# TAGLINE

Load container images from archives

# TLDR

**Load image from archive**

```podman load -i [image.tar]```

**Load from stdin**

```cat [image.tar] | podman load```

**Load with new name**

```podman load -i [archive.tar]```

# SYNOPSIS

**podman load** [_options_]

# PARAMETERS

**-i**, **--input** _FILE_
> Input archive file.

**-q**, **--quiet**
> Suppress output.

# DESCRIPTION

**podman load** restores container images from tar archives previously created by podman save or docker save. Unlike podman import, it preserves all image layers, metadata, tags, and build history.

The archive can be read from a file with **-i** or piped from stdin. This is the standard way to transfer complete images between systems without using a registry.

# CAVEATS

Use with podman save archives. OCI format compatible.

# HISTORY

podman load provides **image archive** loading functionality.

# SEE ALSO

[podman](/man/podman)(1), [podman-save](/man/podman-save)(1), [podman-import](/man/podman-import)(1)

