# TAGLINE

replace base layers of an image

# TLDR

**Rebase an image onto a new base**

```crane rebase [image:tag] --old_base [old:base] --new_base [new:base] -t [rebased:tag]```

**Rebase for a specific platform**

```crane rebase [image:tag] --old_base [old:base] --new_base [new:base] --platform [linux/amd64]```

# SYNOPSIS

**crane** **rebase** [_options_] _image_

# PARAMETERS

**--old_base** _image_
> Old base image to remove.

**--new_base** _image_
> New base image to insert.

**-t**, **--tag** _tag_
> Tag to apply to the rebased image.

**--platform** _platform_
> Platform in the form `os/arch[/variant][:osversion]` (e.g., `linux/amd64`). Default is all.

**--allow-nondistributable-artifacts**
> Allow pushing non-distributable (foreign) layers.

**--insecure**
> Allow image references to be fetched without TLS.

# DESCRIPTION

**crane rebase** replaces the base layers of an image with layers from a different base image. This is useful for updating base images without rebuilding, such as when a vulnerability is found in a base layer and many images need patching quickly.

Rebasing should only be done at a point in the layer stack between "base" layers and "app" layers that adhere to a contract about what base layers produce.

# CAVEATS

Requires that the old base layers exactly match layers in the image. May not work if the image was built with modifications to base layers. It is recommended to tag rebased images to a different tag first, perform confidence checks, then retag.

# SEE ALSO

[crane](/man/crane)(1), [crane-mutate](/man/crane-mutate)(1), [crane-cp](/man/crane-cp)(1)
