# TAGLINE

save images to tar archives

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

**docker image save** saves one or more Docker images to a tar archive, packaging all image layers, configuration, and metadata into a single file. This command is designed for transferring images between systems without using a registry, backing up important images, or distributing images via offline media.

The resulting tar archive contains the complete image structure, including all filesystem layers, image manifests, and configuration JSON. Multiple images can be saved to a single archive, which is useful for bundling related images together.

Output can be directed to a file with **-o** or to stdout, allowing for flexible integration with compression tools like gzip or transmission over network connections. Use **docker image load** to restore images from these archives.

# SEE ALSO

[docker-save](/man/docker-save)(1), [docker-image-load](/man/docker-image-load)(1)
