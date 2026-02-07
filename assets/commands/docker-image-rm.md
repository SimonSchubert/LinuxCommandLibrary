# TAGLINE

remove one or more images

# TLDR

**Remove an image**

```docker image rm [image]```

**Remove multiple images**

```docker image rm [image1] [image2]```

**Force remove**

```docker image rm -f [image]```

**Remove by image ID**

```docker image rm [image_id]```

# SYNOPSIS

**docker** **image** **rm** [_options_] _image_ [_image..._]

# PARAMETERS

**-f**, **--force**
> Force removal.

**--no-prune**
> Do not delete untagged parents.

# DESCRIPTION

**docker image rm** removes one or more images from the local Docker image cache, freeing disk space occupied by their layers. Images can be specified by repository:tag or by their unique image ID.

An image cannot be removed if any containers (running or stopped) depend on it, unless the **-f** force flag is used. Forcing removal of an image that containers depend on can lead to issues when those containers are restarted, as they will be unable to access their image layers.

When an image is removed, Docker also removes any untagged parent images that are no longer referenced by other images, unless **--no-prune** is specified. This automatic cleanup helps maintain a lean image cache.

# SEE ALSO

[docker-rmi](/man/docker-rmi)(1), [docker-image-prune](/man/docker-image-prune)(1)
