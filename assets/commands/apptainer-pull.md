# TAGLINE

Download container images from remote registries.

# TLDR

Pull from a registry, letting apptainer **name the file**

```apptainer pull docker://[ubuntu]:[22.04]```

Pull and **choose the output filename**

```apptainer pull [path/to/image.sif] docker://[ubuntu]:[22.04]```

Download into a **particular directory**

```apptainer pull --dir [path/to/images] docker://[image]:[tag]```

Pull from the **Container Library**

```apptainer pull library://[user/collection/container]:[tag]```

Pull from an OCI registry over **ORAS**

```apptainer pull oras://[registry/namespace/image]:[tag]```

Pull a build for **another architecture**

```apptainer pull --arch [arm64] [path/to/image.sif] library://[image]:[tag]```

Pull straight into a **writable sandbox directory**

```apptainer pull --sandbox [path/to/sandbox] docker://[image]:[tag]```

**Overwrite** a file that is already there

```apptainer pull --force [path/to/image.sif] docker://[image]:[tag]```

**Log in interactively** for a private registry

```apptainer pull --docker-login docker://[private/image]:[tag]```

Use **stored registry credentials** instead

```apptainer pull --authfile [path/to/auth.json] docker://[private/image]:[tag]```

Skip the **cache** entirely

```apptainer pull --disable-cache [path/to/image.sif] docker://[image]:[tag]```

Make the result **reproducible** by reusing the source creation date

```apptainer pull --reproducible [path/to/image.sif] docker://[image]:[tag]```

# SYNOPSIS

**apptainer pull** [_options_] [_output_] _URI_

# DESCRIPTION

**apptainer pull** downloads container images from remote registries and converts them to the SIF (Singularity Image Format). Supported sources include Docker Hub (**docker://**), the Sylabs Container Library (**library://**), OCI registries (**oras://**), Shub (**shub://**), and HTTP/HTTPS URLs.

Downloaded images are cached locally to speed up subsequent operations. The resulting SIF file is portable and can be run on any system with Apptainer installed.

# PARAMETERS

**--arch** _architecture_
> Pull image for a specific CPU architecture.

**--arch-variant** _variant_
> Pull image for a specific architecture variant (e.g., 6 for armv6).

**-F**, **--force**
> Overwrite an existing local image file.

**--sandbox**
> Create a writable directory instead of a SIF file.

**--disable-cache**
> Do not use or update the image cache.

**--no-https**
> Use HTTP instead of HTTPS for downloads.

**--dir** _path_
> Download images to the specified directory.

# CONFIGURATION

**/etc/apptainer/apptainer.conf**
> Main configuration file controlling cache directories, registry defaults, and download behavior.

# CAVEATS

Large images may take significant time and bandwidth to download. Docker images are converted on-the-fly which can add overhead. Some Docker images may not convert perfectly due to differences in runtime expectations.

# INSTALL

```dnf: sudo dnf install apptainer```

```pacman: sudo pacman -S apptainer```

```apk: sudo apk add apptainer```

```zypper: sudo zypper install apptainer```

```brew: brew install apptainer```

```nix: nix profile install nixpkgs#apptainer```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-push](/man/apptainer-push)(1), [apptainer-build](/man/apptainer-build)(1)
