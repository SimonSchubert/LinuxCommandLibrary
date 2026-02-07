# TAGLINE

container image analysis and comparison

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

**container-diff** is a tool for analyzing and comparing container images at a semantic level. Rather than just showing raw filesystem differences, it understands package managers and can report changes in terms of actual packages (apt, pip, npm), making it easier to understand what changed between image versions.

The tool supports multiple image sources including local Docker daemon images, remote registry images, and tarball archives. It can analyze a single image or compare two images, with output available in human-readable or JSON formats for integration with CI/CD pipelines.

Developed by Google as part of their Container Tools suite, container-diff helps with debugging image bloat, understanding layer contents, and validating that builds produce expected changes. It's particularly useful for security auditing and optimizing Docker images.

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
