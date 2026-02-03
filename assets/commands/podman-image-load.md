# TLDR

**Load image from archive**

```podman image load -i [image.tar]```

**Load from stdin**

```cat [image.tar] | podman image load```

**Load with quiet output**

```podman image load -q -i [image.tar]```

# SYNOPSIS

**podman** **image** **load** [_options_]

# PARAMETERS

**-i**, **--input** _file_
> Read from archive file.

**-q**, **--quiet**
> Suppress output.

# DESCRIPTION

**podman image load** loads images from tar archives created by podman save or docker save. Restores images including all layers and metadata. Useful for transferring images between systems.

# SEE ALSO

[podman](/man/podman)(1), [podman-save](/man/podman-save)(1)

