# TLDR

**Get a blob** from an image

```crane blob [image]@[digest]```

**Save blob to file**

```crane blob [image]@[sha256:abc...] > [blob.tar.gz]```

# SYNOPSIS

**crane** **blob** [_options_] _image@digest_

# DESCRIPTION

**crane blob** retrieves a specific blob from a container image by its digest. Blobs are typically layers or configuration objects.

Output is written to stdout; redirect to save to a file.

# SEE ALSO

[crane](/man/crane)(1), [crane-manifest](/man/crane-manifest)(1)
