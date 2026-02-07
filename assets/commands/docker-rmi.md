# TAGLINE

remove Docker images from local storage

# TLDR

**Remove an image**

```docker rmi [image]```

**Remove multiple images**

```docker rmi [image1] [image2]```

**Force remove**

```docker rmi -f [image]```

**Remove all dangling images**

```docker rmi $(docker images -f dangling=true -q)```

**Remove by image ID**

```docker rmi [image_id]```

# SYNOPSIS

**docker** **rmi** [_options_] _image_ [_image..._]

# PARAMETERS

**-f**, **--force**
> Force removal.

**--no-prune**
> Do not delete untagged parent images.

# DESCRIPTION

**docker rmi** removes one or more images. Images in use by containers cannot be removed unless forced. Shorthand for docker image rm. Removing an image deletes all its layers unless they're shared with other images. Dangling images are untagged images that are no longer referenced by any tagged image.

# SEE ALSO

[docker-image-rm](/man/docker-image-rm)(1), [docker-rm](/man/docker-rm)(1)

