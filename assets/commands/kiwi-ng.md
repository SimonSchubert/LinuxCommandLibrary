# TAGLINE

command-line tool for building Linux operating system images

# TLDR

**Build image from description**

```sudo kiwi-ng system build --description [path] --target-dir [output]```

**Create image with custom repo**

```sudo kiwi-ng system build --description [path] --set-repo [repo-url] --target-dir [output]```

**List available image types**

```kiwi-ng image list```

**Prepare image root**

```sudo kiwi-ng system prepare --description [path] --root [rootdir]```

# SYNOPSIS

**kiwi-ng** [_options_] _command_ [_args_...]

# PARAMETERS

**system build**
> Build complete image from description.

**system prepare**
> Prepare image root filesystem.

**--description** _path_
> Path to image description.

**--target-dir** _path_
> Output directory for images.

**--set-repo** _url_
> Set repository URL.

**--profile** _name_
> Build specific profile.

# DESCRIPTION

**kiwi-ng** is a command-line tool for building Linux operating system images. Supports various output formats including ISOs, virtual machine images, containers, and cloud images. Uses XML-based descriptions to define image configuration.

# SEE ALSO

[mkisofs](/man/mkisofs)(1), [docker](/man/docker)(1)

