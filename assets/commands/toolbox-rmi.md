# TAGLINE

Remove Toolbx container images

# TLDR

**Remove** images

```toolbox rmi [image_name1] [image_name2]```

Remove **all** images

```toolbox rmi -a```

**Force** remove image in use

```toolbox rmi -f [image_name]```

# SYNOPSIS

**toolbox rmi** [_OPTIONS_] [_IMAGE_...]

# PARAMETERS

**-a, --all**
> Remove all Toolbx images

**-f, --force**
> Force removal of images in use by containers

# DESCRIPTION

**toolbox rmi** removes one or more Toolbx container images. Images that are currently being used by containers cannot be removed unless the force flag is used.

When using --force on an image that has containers, those containers will also be removed along with the image.

# CAVEATS

Images in use by containers cannot be removed without --force. Force removal will delete associated containers. Removing base images requires re-downloading them later.

# SEE ALSO

[toolbox](/man/toolbox)(1), [toolbox-rm](/man/toolbox-rm)(1), [toolbox-list](/man/toolbox-list)(1)
