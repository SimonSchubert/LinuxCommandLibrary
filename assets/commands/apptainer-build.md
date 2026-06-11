# TAGLINE

Build Apptainer container images from definition files or remote sources.

# TLDR

Build a container from a **definition file**

```apptainer build [path/to/image.sif] [path/to/definition.def]```

Build a container from **Docker Hub**

```apptainer build [path/to/image.sif] docker://[image]:[tag]```

Build a container from the **Container Library**

```apptainer build [path/to/image.sif] library://[user/collection/container]:[tag]```

Build a **writable sandbox** directory instead of an image file

```apptainer build -s [path/to/directory] docker://[image]:[tag]```

Build a container **without using the cache**

```apptainer build --disable-cache [path/to/image.sif] docker://[image]:[tag]```

**Force overwrite** an existing image file

```apptainer build -F [path/to/image.sif] [path/to/definition.def]```

Build using **fakeroot** for unprivileged builds

```apptainer build -f [path/to/image.sif] [path/to/definition.def]```

# SYNOPSIS

**apptainer build** [_options_] _image_ _build-spec_

# DESCRIPTION

**apptainer build** creates Apptainer container images from various sources including definition files, Docker Hub, OCI registries, and the Sylabs Container Library. The resulting SIF (Singularity Image Format) file is a portable, immutable container image.

Definition files (**.def**) provide a reproducible way to specify base images, software installation steps, environment variables, and runscripts. The sandbox mode creates a writable directory structure useful for development and testing.

# PARAMETERS

**-s, --sandbox**
> Build a writable directory instead of an immutable SIF image

**-F, --force**
> Overwrite an existing image file without prompting

**-f, --fakeroot**
> Build using fakeroot, appearing to run as root (default for unprivileged definition builds).

**--disable-cache**
> Do not use or create cached images during the build process.

**--no-cleanup**
> Retain the temporary build directory after a failed build (for debugging).

**-u, --update**
> Run the definition over an existing sandbox container, rerunning sections such as %post.

**-T, --notest**
> Build the container without running the %test section.

**--section** _name_
> Run only the given definition sections instead of all of them (e.g. post, environment).

**-e, --encrypt**
> Build an image with an encrypted filesystem (set APPTAINER_ENCRYPTION_PASSPHRASE or APPTAINER_ENCRYPTION_PEM_PATH).

**--build-arg** _key=value_
> Replace {{ key }} placeholders in the definition file with the given value.

**--arch** _arch_
> Architecture to build for (default: amd64).

# CONFIGURATION

**/etc/apptainer/apptainer.conf**
> Main configuration file controlling build behavior, security settings, bind paths, and fakeroot mappings.

# CAVEATS

Building containers often requires elevated privileges or fakeroot configuration. Some base images may not be compatible with fakeroot builds. Large builds can consume significant disk space in the cache directory.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-pull](/man/apptainer-pull)(1), [apptainer-run](/man/apptainer-run)(1), [apptainer-exec](/man/apptainer-exec)(1), [apptainer-shell](/man/apptainer-shell)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/apptainer/apptainer)```

```[Homepage](https://apptainer.org)```

```[Documentation](https://apptainer.org/docs/)```

<!-- verified: 2026-06-11 -->
