# TLDR

**Save image to tar archive**

```docker image save -o [image.tar] [image]```

**Save to stdout**

```docker image save [image] > [image.tar]```

**Save multiple images**

```docker image save -o [images.tar] [image1] [image2]```

**Save with compression**

```docker image save [image] | gzip > [image.tar.gz]```

# SYNOPSIS

**docker** **image** **save** [_options_] _image_ [_image..._]

# PARAMETERS

**-o**, **--output** _file_
> Write to file instead of stdout.

# DESCRIPTION

**docker image save** saves one or more images to a tar archive. Used for transferring images between systems or backing up images. Use docker load to restore.

# SEE ALSO

[docker-save](/man/docker-save)(1), [docker-image-load](/man/docker-image-load)(1)

