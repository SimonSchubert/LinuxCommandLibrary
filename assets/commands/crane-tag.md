# TAGLINE

add tag alias to existing image

# TLDR

**Add tag** to an image

```crane tag [image:existing] [new_tag]```

**Tag by digest**

```crane tag [image]@[sha256:abc...] [tag_name]```

# SYNOPSIS

**crane** **tag** [_options_] _image_ _tag_

# DESCRIPTION

**crane tag** adds a new tag to an existing image. This creates an alias without copying image data.

# SEE ALSO

[crane](/man/crane)(1), [crane-copy](/man/crane-copy)(1)

# RESOURCES

```[Source code](https://github.com/google/go-containerregistry)```

```[Documentation](https://github.com/google/go-containerregistry/blob/main/cmd/crane/doc/crane_tag.md)```

<!-- verified: 2026-06-26 -->
