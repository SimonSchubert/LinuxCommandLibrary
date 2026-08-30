# TAGLINE

Build Apptainer container images from definition files or remote sources.

# TLDR

Build an image from a **definition file**

```apptainer build [path/to/image.sif] [path/to/definition.def]```

Convert a **registry image** straight into a SIF

```apptainer build [path/to/image.sif] docker://[ubuntu]:[22.04]```

Build into a **writable sandbox directory**, which is easier to iterate on

```apptainer build --sandbox [path/to/sandbox] docker://[ubuntu]:[22.04]```

Turn a finished sandbox **back into a SIF**

```apptainer build [path/to/image.sif] [path/to/sandbox]```

Build **without root**, using user namespaces

```apptainer build --fakeroot [path/to/image.sif] [path/to/definition.def]```

**Overwrite** an image that already exists

```apptainer build --force [path/to/image.sif] [path/to/definition.def]```

Skip the definition's **%test section**

```apptainer build --notest [path/to/image.sif] [path/to/definition.def]```

Run **only some sections** of the definition

```apptainer build --section [post] [path/to/image.sif] [path/to/definition.def]```

Pass a **build argument** into the definition

```apptainer build --build-arg [VERSION]=[1.2] [path/to/image.sif] [path/to/definition.def]```

Ignore the **local cache**

```apptainer build --disable-cache [path/to/image.sif] docker://[image]:[tag]```

Build for a **different architecture**

```apptainer build --arch [arm64] [path/to/image.sif] [path/to/definition.def]```

Produce an **encrypted** image

```apptainer build --encrypt --pem-path [path/to/key.pem] [path/to/image.sif] [path/to/definition.def]```

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

# INSTALL

```dnf: sudo dnf install apptainer```

```pacman: sudo pacman -S apptainer```

```apk: sudo apk add apptainer```

```zypper: sudo zypper install apptainer```

```brew: brew install apptainer```

```nix: nix profile install nixpkgs#apptainer```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-pull](/man/apptainer-pull)(1), [apptainer-run](/man/apptainer-run)(1), [apptainer-exec](/man/apptainer-exec)(1), [apptainer-shell](/man/apptainer-shell)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/apptainer/apptainer)```

```[Homepage](https://apptainer.org)```

```[Documentation](https://apptainer.org/docs/)```

<!-- verified: 2026-06-11 -->
