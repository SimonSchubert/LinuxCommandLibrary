# TAGLINE

save Docker images to tar archives

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

**docker save** saves one or more images to a tar archive, including all parent layers, tags, and versions. Use docker load to restore. This command is useful for offline distribution, backing up images, or transferring images between systems without a registry. The resulting archive preserves the complete image with all metadata and history.

# SEE ALSO

[docker-image-save](/man/docker-image-save)(1), [docker-load](/man/docker-load)(1)

