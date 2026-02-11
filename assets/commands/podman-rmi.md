# TAGLINE

Remove container images from local storage

# TLDR

**Remove an image**

```podman rmi [image]```

**Remove multiple images**

```podman rmi [image1] [image2]```

**Force remove**

```podman rmi -f [image]```

**Remove all unused images**

```podman rmi -a```

# SYNOPSIS

**podman rmi** [_options_] _image_ [_image..._]

# PARAMETERS

_IMAGE_
> Image to remove.

**-f**, **--force**
> Force removal.

**-a**, **--all**
> Remove all images.

**--ignore**
> Ignore missing images.

# DESCRIPTION

**podman rmi** removes one or more container images from local storage, freeing disk space. By default, images that are currently in use by a container cannot be removed.

Use **-f** (force) to remove images even if containers reference them. The **-a** flag removes all images. The **--ignore** flag silently skips images that don't exist instead of returning an error.

# CAVEATS

Cannot remove images in use. Use force carefully.

# HISTORY

podman rmi provides **image removal** functionality.

# SEE ALSO

[podman](/man/podman)(1), [podman-images](/man/podman-images)(1), [podman-rm](/man/podman-rm)(1)

