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

**podman load** loads images from OCI archives. Restores saved images.

The tool imports image archives. Preserves layers and metadata.

podman load restores images.

# CAVEATS

Use with podman save archives. OCI format compatible.

# HISTORY

podman load provides **image archive** loading functionality.

# SEE ALSO

[podman](/man/podman)(1), [podman-save](/man/podman-save)(1), [podman-import](/man/podman-import)(1)

