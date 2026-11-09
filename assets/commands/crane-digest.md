# TAGLINE

retrieve image content digest

# TLDR

**Get the digest** of an image

```crane digest [image:tag]```

**Get digest for specific platform**

```crane digest --platform [linux/amd64] [image:tag]```

**Print the full image reference** by digest

```crane digest --full-ref [image:tag]```

**Get the digest** of an image in a tarball

```crane digest --tarball [path/to/image.tar]```

# SYNOPSIS

**crane** **digest** _image_ [_options_]

# PARAMETERS

**--platform** _platform_
> Platform in the form os/arch[/variant][:osversion], for example linux/amd64.

**--full-ref**
> Print the full image reference by digest. Cannot be combined with **--tarball**.

**--tarball** _path_
> Path to tarball containing the image.

**--insecure**
> Allow image references to be fetched without TLS.

**-v**, **--verbose**
> Enable debug logs.

# DESCRIPTION

**crane digest** retrieves the content-addressable digest (SHA256) of a container image. The digest uniquely identifies the image content regardless of tag.

# SEE ALSO

[crane](/man/crane)(1), [crane-manifest](/man/crane-manifest)(1)

# RESOURCES

```[Source code](https://github.com/google/go-containerregistry)```

```[Documentation](https://github.com/google/go-containerregistry/blob/main/cmd/crane/README.md)```

<!-- verified: 2026-11-09 -->
