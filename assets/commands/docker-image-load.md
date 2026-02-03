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

**docker image load** loads an image from a tar archive created by docker save. Used for transferring images between systems without a registry.

# SEE ALSO

[docker-load](/man/docker-load)(1), [docker-image-save](/man/docker-image-save)(1)

