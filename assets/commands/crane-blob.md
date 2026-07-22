# TAGLINE

retrieve blobs from container images

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

# INSTALL

```pacman: sudo pacman -S crane```

```apk: sudo apk add crane```

```zypper: sudo zypper install crane```

```brew: brew install crane```

```nix: nix profile install nixpkgs#crane```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[crane](/man/crane)(1), [crane-manifest](/man/crane-manifest)(1)

# RESOURCES

```[Source code](https://github.com/google/go-containerregistry)```

```[Documentation](https://github.com/google/go-containerregistry/blob/main/cmd/crane/doc/crane_blob.md)```

<!-- verified: 2026-06-26 -->
