# TLDR

**Validate an image**

```crane validate --remote [image:tag]```

**Validate local tarball**

```crane validate --tarball [image.tar]```

# SYNOPSIS

**crane** **validate** [_options_]

# PARAMETERS

**--remote** _image_
> Validate a remote image.

**--tarball** _file_
> Validate a local tarball.

# DESCRIPTION

**crane validate** checks that a container image is well-formed. It verifies manifest structure, layer digests, and configuration validity.

# SEE ALSO

[crane](/man/crane)(1), [crane-manifest](/man/crane-manifest)(1)
