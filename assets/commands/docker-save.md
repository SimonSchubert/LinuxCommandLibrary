# TLDR

**Save image to tar file**

```docker save -o [image.tar] [image]```

**Save to stdout**

```docker save [image] > [image.tar]```

**Save with compression**

```docker save [image] | gzip > [image.tar.gz]```

**Save multiple images**

```docker save -o [images.tar] [image1] [image2]```

**Save specific tag**

```docker save -o [image.tar] [image]:[tag]```

# SYNOPSIS

**docker** **save** [_options_] _image_ [_image..._]

# PARAMETERS

**-o**, **--output** _file_
> Write to file instead of stdout.

# DESCRIPTION

**docker save** saves one or more images to a tar archive, including all parent layers, tags, and versions. Use docker load to restore.

# SEE ALSO

[docker-image-save](/man/docker-image-save)(1), [docker-load](/man/docker-load)(1)

