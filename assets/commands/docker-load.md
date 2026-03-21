# TAGLINE

load Docker images from tar archives

# TLDR

**Load image from tar file**

```docker load -i [image.tar]```

**Load from stdin**

```cat [image.tar] | docker load```

**Load a gzip-compressed archive**

```docker load -i [image.tar.gz]```

**Load with quiet output**

```docker load -q -i [image.tar]```

**Load from a remote URL via curl**

```curl -sSL [https://example.com/image.tar.gz] | docker load```

# SYNOPSIS

**docker** **load** [_options_]

# PARAMETERS

**-i**, **--input** _file_
> Read from a tar archive file instead of STDIN. The tarball may be compressed with gzip, bzip2, or xz.

**-q**, **--quiet**
> Suppress the load output and progress bar.

**--platform** _string_
> Load only the specified platform image from a multi-platform archive (e.g., linux/amd64).

# DESCRIPTION

**docker load** loads an image from a tar archive or STDIN. Restores both images and tags saved by **docker save**. This command is the counterpart to docker save, enabling image transfer between systems without using a registry. Useful for air-gapped environments or offline distribution.

# SEE ALSO

[docker-image-load](/man/docker-image-load)(1), [docker-save](/man/docker-save)(1), [docker-images](/man/docker-images)(1), [docker-pull](/man/docker-pull)(1), [docker](/man/docker)(1)

