# TAGLINE

upload tarball as container image

# TLDR

**Push tarball** as image

```crane push [image.tar] [registry/repo:tag]```

# SYNOPSIS

**crane** **push** [_options_] _tarball_ _image_

# DESCRIPTION

**crane push** uploads a tarball as a container image to a registry. The tarball should be in OCI or Docker image format (as produced by **crane pull** or **docker save**).

# SEE ALSO

[crane](/man/crane)(1), [crane-pull](/man/crane-pull)(1)
