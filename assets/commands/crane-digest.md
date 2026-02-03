# TLDR

**Get the digest** of an image

```crane digest [image:tag]```

**Get digest for specific platform**

```crane digest --platform [linux/amd64] [image:tag]```

# SYNOPSIS

**crane** **digest** [_options_] _image_

# PARAMETERS

**--platform** _platform_
> Get digest for specific platform.

**--full-ref**
> Print the full image reference with digest.

# DESCRIPTION

**crane digest** retrieves the content-addressable digest (SHA256) of a container image. The digest uniquely identifies the image content regardless of tag.

# SEE ALSO

[crane](/man/crane)(1), [crane-manifest](/man/crane-manifest)(1)
