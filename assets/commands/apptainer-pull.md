# TLDR

Pull a container from **Docker Hub**

```apptainer pull [path/to/image.sif] docker://[image]:[tag]```

Pull a container from the **Container Library**

```apptainer pull [path/to/image.sif] library://[user/collection/container]:[tag]```

Pull a container from an **OCI registry**

```apptainer pull [path/to/image.sif] oras://[registry/namespace/image]:[tag]```

Pull a container for a **specific architecture**

```apptainer pull --arch [amd64|arm64|ppc64le] [path/to/image.sif] library://[image]:[tag]```

**Force overwrite** an existing image file

```apptainer pull -F [path/to/image.sif] docker://[image]:[tag]```

Pull a container as a **writable sandbox** directory

```apptainer pull --sandbox [path/to/directory] docker://[image]:[tag]```

Pull a container **without using the cache**

```apptainer pull --disable-cache [path/to/image.sif] docker://[image]:[tag]```

# SYNOPSIS

**apptainer pull** [_options_] _image_ _URI_

# DESCRIPTION

**apptainer pull** downloads container images from remote registries and converts them to the SIF (Singularity Image Format). Supported sources include Docker Hub (**docker://**), the Sylabs Container Library (**library://**), OCI registries (**oras://**), and Shub (**shub://**).

Downloaded images are cached locally to speed up subsequent operations. The resulting SIF file is portable and can be run on any system with Apptainer installed.

# PARAMETERS

**--arch** _architecture_
> Pull image for a specific CPU architecture

**-F, --force**
> Overwrite an existing local image file

**--sandbox**
> Create a writable directory instead of a SIF file

**--disable-cache**
> Do not use or update the image cache

**--no-https**
> Use HTTP instead of HTTPS for downloads

# CAVEATS

Large images may take significant time and bandwidth to download. Docker images are converted on-the-fly which can add overhead. Some Docker images may not convert perfectly due to differences in runtime expectations.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-push](/man/apptainer-push)(1), [apptainer-build](/man/apptainer-build)(1)
