# TAGLINE

load images from tar archives

# TLDR

**Load an image from a tar archive**

```docker image load -i [image.tar]```

**Load an image from stdin**

```cat [image.tar] | docker image load```

**Load an image with quiet output**

```docker image load -q -i [image.tar]```

**Load only a specific platform variant**

```docker image load --platform [linux/amd64] -i [image.tar]```

# SYNOPSIS

**docker** **image** **load** [_options_]

# PARAMETERS

**-i**, **--input** _file_
> Read from tar archive file instead of STDIN.

**-q**, **--quiet**
> Suppress load output.

**--platform** _value_
> Load only the given platform variant(s), formatted as "os[/arch[/variant]]" (e.g., linux/amd64). Can be specified multiple times.

# DESCRIPTION

**docker image load** loads a Docker image from a tar archive (even if compressed with gzip, bzip2, xz, or zstd) created by **docker image save**, restoring the image layers and metadata to the local Docker daemon.

The tar archive contains all image layers, configuration, and manifest data needed to fully reconstruct the image. Loading an image preserves its repository tags and digests exactly as they were when saved. This makes **docker image load** ideal for air-gapped environments, backup/restore workflows, and distributing images via physical media or secure file transfer.

The command can read from a file specified with **-i** or from stdin, enabling flexible integration with compression tools and network transfers.

# CAVEATS

The tar archive must have been created with **docker image save** or a compatible tool. Loading an image does not pull missing layers from a registry. Images are loaded into the local Docker daemon only.

# HISTORY

**docker image load** is the modern syntax for the **docker load** command, introduced as part of Docker's CLI restructuring to group commands under management categories.

# SEE ALSO

[docker-load](/man/docker-load)(1), [docker-image-save](/man/docker-image-save)(1), [docker-image](/man/docker-image)(1), [docker](/man/docker)(1)
