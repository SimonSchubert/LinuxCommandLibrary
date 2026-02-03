# TLDR

**Flatten image layers**

```crane flatten [image] -t [flattened:tag]```

# SYNOPSIS

**crane** **flatten** [_options_] _image_

# PARAMETERS

**-t**, **--tag** _tag_
> Tag for the flattened image.

# DESCRIPTION

**crane flatten** squashes all layers of a container image into a single layer. This can reduce image size and improve pull times by eliminating layer overhead.

# CAVEATS

Flattening removes layer history and may affect caching. The resulting image cannot benefit from shared base layers.

# SEE ALSO

[crane](/man/crane)(1), [crane-append](/man/crane-append)(1)
