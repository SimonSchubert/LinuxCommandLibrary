# TLDR

**Rebase an image** onto a new base

```crane rebase [image:tag] --old_base [old:base] --new_base [new:base] -t [rebased:tag]```

# SYNOPSIS

**crane** **rebase** [_options_] _image_

# PARAMETERS

**--old_base** _image_
> Original base image.

**--new_base** _image_
> New base image.

**-t**, **--tag** _tag_
> Tag for the rebased image.

# DESCRIPTION

**crane rebase** replaces the base layers of an image with layers from a different base image. This is useful for updating base images without rebuilding.

# CAVEATS

Requires that the old base layers exactly match layers in the image. May not work if the image was built with modifications to base layers.

# SEE ALSO

[crane](/man/crane)(1), [crane-mutate](/man/crane-mutate)(1)
