# TLDR

**Analyze image size**

```container-diff analyze [image:tag]```

**Diff two images for apt packages**

```container-diff diff [image1] [image2] --type=apt```

**Diff pip packages**

```container-diff diff [image1] [image2] --type=pip```

**Diff filesystem changes**

```container-diff diff [image1] [image2] --type=file```

**Compare multiple analyzers**

```container-diff diff [image1] [image2] --type=apt --type=pip --type=node```

**Output as JSON**

```container-diff diff [image1] [image2] --type=apt -j```

**Compare local and remote**

```container-diff diff daemon://[local:tag] remote://[repo/image:tag]```

# SYNOPSIS

**container-diff** _command_ [_options_] _image_...

# DESCRIPTION

**container-diff** analyzes and compares container images. Shows semantic differences in packages, files, and metadata. Supports Docker daemon, remote registries, and tarballs. From Google Container Tools.

# COMMANDS

**analyze**
> Analyze single image

**diff**
> Compare two images

# PARAMETERS

**--type** _analyzer_
> Analyzer type: apt, pip, node, file, size, history

**-j**, **--json**
> Output as JSON

**-c**, **--cache** _dir_
> Cache directory

**--filename** _path_
> Compare specific file

# IMAGE SOURCES

**daemon://image**: Local Docker daemon

**remote://image**: Remote registry

**path/to/image.tar**: Local tarball

# ANALYZERS

**apt**: Debian/Ubuntu packages

**pip**: Python packages

**node**: npm packages

**file**: Filesystem differences

**size**: Image size

**history**: Layer history

# CAVEATS

Project in maintenance mode. Does not support Docker IDs directly (tag first). Use docker-credential-helpers for registry auth.

# SEE ALSO

[docker](/man/docker)(1), [skopeo](/man/skopeo)(1), [dive](/man/dive)(1)
