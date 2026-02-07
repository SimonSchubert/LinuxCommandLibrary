# TAGLINE

load images from tar archives

# TLDR

**Load image from tar archive**

```docker image load -i [image.tar]```

**Load from stdin**

```cat [image.tar] | docker image load```

**Load with quiet output**

```docker image load -q -i [image.tar]```

# SYNOPSIS

**docker** **image** **load** [_options_]

# PARAMETERS

**-i**, **--input** _file_
> Read from tar archive file.

**-q**, **--quiet**
> Suppress load output.

# DESCRIPTION

**docker image load** loads a Docker image from a tar archive file created by **docker image save**, restoring the image layers and metadata to the local Docker daemon. This command is essential for transferring images between systems that lack direct registry access or network connectivity.

The tar archive contains all image layers, configuration, and manifest data needed to fully reconstruct the image. Loading an image preserves its repository tags and digests exactly as they were when saved. This makes **docker image load** ideal for air-gapped environments, backup/restore workflows, and distributing images via physical media or secure file transfer.

The command can read from a file specified with **-i** or from stdin, enabling flexible integration with compression tools and network transfers.

# SEE ALSO

[docker-load](/man/docker-load)(1), [docker-image-save](/man/docker-image-save)(1)
