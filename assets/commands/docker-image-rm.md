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

**docker image rm** removes one or more images. An image cannot be removed if containers are using it unless forced.

# SEE ALSO

[docker-rmi](/man/docker-rmi)(1), [docker-image-prune](/man/docker-image-prune)(1)

