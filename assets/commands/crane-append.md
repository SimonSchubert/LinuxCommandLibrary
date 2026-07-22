# TAGLINE

add layers to container images

# TLDR

**Append a layer** to an existing image

```crane append -b [base_image] -f [layer.tar.gz] -t [new_image:tag]```

**Append from file**

```crane append --base [gcr.io/project/image] --new_layer [layer.tar] --new_tag [gcr.io/project/image:v2]```

# SYNOPSIS

**crane** **append** [_options_]

# PARAMETERS

**-b**, **--base** _image_
> Base image to append to.

**-f**, **--new_layer** _file_
> Layer tarball to append.

**-t**, **--new_tag** _image_
> Tag for the resulting image.

# DESCRIPTION

**crane append** adds a new layer to an existing container image without pulling the entire image. This is useful for adding files or configuration to existing images efficiently.

Part of the crane CLI tool for container registry operations.

# INSTALL

```pacman: sudo pacman -S crane```

```apk: sudo apk add crane```

```zypper: sudo zypper install crane```

```brew: brew install crane```

```nix: nix profile install nixpkgs#crane```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[crane](/man/crane)(1), [crane-mutate](/man/crane-mutate)(1)

# RESOURCES

```[Source code](https://github.com/google/go-containerregistry)```

```[Documentation](https://github.com/google/go-containerregistry/blob/main/cmd/crane/doc/crane.md)```

<!-- verified: 2026-06-23 -->
