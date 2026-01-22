# TLDR

Push a container to the **Container Library**

```apptainer push [path/to/image.sif] library://[user/collection/container]:[tag]```

Push a container to an **OCI registry**

```apptainer push [path/to/image.sif] oras://[registry/namespace/image]:[tag]```

Push an **unsigned container** (skip signature verification)

```apptainer push -U [path/to/image.sif] library://[user/collection/container]:[tag]```

Push a container with a **description** (library only)

```apptainer push -D "[description]" [path/to/image.sif] library://[user/collection/container]:[tag]```

# SYNOPSIS

**apptainer push** [_options_] _image_ _URI_

# DESCRIPTION

**apptainer push** uploads container images to remote registries including the Sylabs Container Library and OCI-compatible registries. This enables sharing containers with collaborators and deploying containers to production environments.

Authentication is required for most registries. Use **apptainer remote login** to configure credentials before pushing.

# PARAMETERS

**-U, --allow-unsigned**
> Allow pushing unsigned containers to the library

**-D, --description** _text_
> Attach a description to the container (library only)

**--library** _url_
> Specify an alternate Container Library URL

# CAVEATS

Pushing to the Container Library requires a Sylabs account and API token. Large images may take considerable time to upload depending on network bandwidth. Unsigned containers may be rejected by some registries.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-pull](/man/apptainer-pull)(1), [apptainer-sign](/man/apptainer-sign)(1)
