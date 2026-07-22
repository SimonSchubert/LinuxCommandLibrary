# TAGLINE

Upload container images to remote registries.

# TLDR

Push a container to the **Container Library**

```apptainer push [path/to/image.sif] library://[user/collection/container]:[tag]```

Push a container to an **OCI registry**

```apptainer push [path/to/image.sif] oras://[registry/namespace/image]:[tag]```

Push an **unsigned container** (skip the signature requirement)

```apptainer push -U [path/to/image.sif] library://[user/collection/container]:[tag]```

Push to an OCI registry using a **specific auth file**

```apptainer push --authfile [path/to/auth.json] [path/to/image.sif] oras://[registry/namespace/image]:[tag]```

Push a container with a **description** (library only)

```apptainer push -D "[description]" [path/to/image.sif] library://[user/collection/container]:[tag]```

# SYNOPSIS

**apptainer push** [_options_] _image_ _URI_

# DESCRIPTION

**apptainer push** uploads container images to remote registries including the Sylabs Container Library and OCI-compatible registries. This enables sharing containers with collaborators and deploying containers to production environments.

Authentication is required for most registries. Use **apptainer remote login** to configure credentials before pushing.

# PARAMETERS

**-U, --allow-unsigned**
> Allow pushing unsigned containers (by default a valid signature is required for library:// pushes).

**-D, --description** _text_
> Attach a description to the container (library:// only).

**--library** _url_
> Specify the Container Library URL to push to.

**--authfile** _path_
> Docker-style authentication file for OCI registry credentials (oras://).

**--no-https**
> Use HTTP instead of HTTPS for docker://, oras://, and library:// URIs.

# CAVEATS

Pushing to the Container Library requires a Sylabs account and API token. Large images may take considerable time to upload depending on network bandwidth. Unsigned containers may be rejected by some registries.

# INSTALL

```dnf: sudo dnf install apptainer```

```pacman: sudo pacman -S apptainer```

```apk: sudo apk add apptainer```

```zypper: sudo zypper install apptainer```

```brew: brew install apptainer```

```nix: nix profile install nixpkgs#apptainer```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-pull](/man/apptainer-pull)(1), [apptainer-sign](/man/apptainer-sign)(1), [apptainer-delete](/man/apptainer-delete)(1)

# RESOURCES

```[Source code](https://github.com/apptainer/apptainer)```

```[Homepage](https://apptainer.org)```

```[Documentation](https://apptainer.org/docs/)```

<!-- verified: 2026-06-11 -->
