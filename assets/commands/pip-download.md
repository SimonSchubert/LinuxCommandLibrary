# TAGLINE

Download packages without installing them

# TLDR

**Download package**

```pip download [package]```

**Download to specific directory**

```pip download -d [directory] [package]```

**Download specific version**

```pip download [package]==[version]```

**Download for specific platform**

```pip download --platform [linux_x86_64] --only-binary=:all: [package]```

**Download from requirements file**

```pip download -r requirements.txt```

# SYNOPSIS

**pip** **download** [_options_] _packages_...

# PARAMETERS

**-d**, **--dest** _dir_
> Download directory.

**-r**, **--requirement** _file_
> Download from requirements file.

**--no-deps**
> Don't download dependencies.

**--only-binary** _format_
> Only download binary packages.

**--platform** _platform_
> Download for specific platform.

**--python-version** _version_
> Download for specific Python version.

# DESCRIPTION

**pip download** downloads packages without installing them. Downloads wheels or source distributions to a specified directory. Useful for offline installation or creating local package mirrors.

# SEE ALSO

[pip](/man/pip)(1), [pip-install](/man/pip-install)(1), [pip-wheel](/man/pip-wheel)(1)

