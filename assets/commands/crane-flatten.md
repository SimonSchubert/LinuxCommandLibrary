# TAGLINE

squash container layers into one

# TLDR

**Flatten an image and push it under a new tag**

```crane flatten [image] -t [flattened:tag]```

**Flatten by digest** (pushes the result back to the source repo by digest, not tag)

```crane flatten [image@sha256:...]```

**Flatten a specific platform** of a multi-arch index

```crane flatten [image] --platform linux/amd64 -t [flattened:tag]```

# SYNOPSIS

**crane** **flatten** [_options_] _image_

# PARAMETERS

**-t**, **--tag** _tag_
> Tag to apply to the flattened image. If omitted, the result is pushed by digest to the same repository and the original tag is **not** overwritten.

**--platform** _os/arch_
> Select a single platform when flattening a multi-arch image (e.g. **linux/amd64**).

**--insecure**
> Allow connections to registries without valid TLS certificates.

**-v**, **--verbose**
> Enable verbose logging.

# DESCRIPTION

**crane flatten** squashes all layers of a container image into a single layer. This can reduce image size and improve pull times by eliminating layer overhead. The command reads the source image from the registry, builds a new manifest whose filesystem is the merged result of all layers, and pushes the new manifest back.

# CAVEATS

Flattening removes layer history and may affect build-cache reuse. The resulting image cannot benefit from shared base layers in the registry. Without **-t**, **crane flatten** does not overwrite the source tag; it only creates a new manifest referenced by digest.

# SEE ALSO

[crane](/man/crane)(1), [crane-append](/man/crane-append)(1), [crane-mutate](/man/crane-mutate)(1), [crane-push](/man/crane-push)(1)

# SEE ALSO

[crane](/man/crane)(1), [crane-append](/man/crane-append)(1)
