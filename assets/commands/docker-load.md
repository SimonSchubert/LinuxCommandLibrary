# TAGLINE

load Docker images from tar archives

# TLDR

**Load image from tar file**

```docker load -i [image.tar]```

**Load from stdin**

```cat [image.tar] | docker load```

**Load compressed archive**

```gunzip -c [image.tar.gz] | docker load```

**Load with quiet output**

```docker load -q -i [image.tar]```

# SYNOPSIS

**docker** **load** [_options_]

# PARAMETERS

**-i**, **--input** _file_
> Read from tar archive file.

**-q**, **--quiet**
> Suppress load output.

# DESCRIPTION

**docker load** loads an image from a tar archive or STDIN. Restores both images and tags saved by docker save. This command is the counterpart to docker save, enabling image transfer between systems without using a registry. Useful for air-gapped environments or offline distribution.

# SEE ALSO

[docker-image-load](/man/docker-image-load)(1), [docker-save](/man/docker-save)(1)

