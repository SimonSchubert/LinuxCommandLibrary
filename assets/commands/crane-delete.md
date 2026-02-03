# TLDR

**Delete an image tag**

```crane delete [image:tag]```

**Delete by digest**

```crane delete [image]@[sha256:abc...]```

# SYNOPSIS

**crane** **delete** [_options_] _image_

# DESCRIPTION

**crane delete** removes an image from a container registry. This deletes the manifest for the specified tag or digest.

Use with caution as deletion may be permanent depending on registry configuration.

# CAVEATS

Some registries don't support deletion or require special permissions. Deleting a tag doesn't necessarily free storage until garbage collection runs.

# SEE ALSO

[crane](/man/crane)(1), [crane-tag](/man/crane-tag)(1)
