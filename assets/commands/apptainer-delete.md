# TAGLINE

Delete container images from a remote library.

# TLDR

Remove an image from the **Container Library**

```apptainer delete library://[user/collection/container]:[tag]```

Remove only the build for **one architecture**

```apptainer delete --arch [arm64] library://[user/collection/container]:[tag]```

Skip the **confirmation prompt**, which scripts need

```apptainer delete --force library://[user/collection/container]:[tag]```

Target a **self-hosted library server**

```apptainer delete --library [https://library.example.com] library://[user/collection/container]:[tag]```

Talk to a server over **plain HTTP**

```apptainer delete --no-https library://[hostname/user/collection/container]:[tag]```

# SYNOPSIS

**apptainer delete** [_options_] _library://path_

# DESCRIPTION

**apptainer delete** removes container images from a remote Container Library. This is a destructive operation that permanently removes the specified image or image tag from the remote registry.

The command requires authentication with the target library and appropriate permissions to delete images.

# PARAMETERS

**-A, --arch** _architecture_
> Delete the image for a specific CPU architecture (default: amd64).

**-F, --force**
> Force delete without confirmation prompt.

**--library** _url_
> Specify the Container Library URL to delete from.

**--no-https**
> Use HTTP instead of HTTPS for the library connection.

# CAVEATS

This operation is irreversible. Deleted images cannot be recovered. Ensure you have backups of important container images before deletion. Only the image owner or library administrators can delete images.

# INSTALL

```dnf: sudo dnf install apptainer```

```pacman: sudo pacman -S apptainer```

```apk: sudo apk add apptainer```

```zypper: sudo zypper install apptainer```

```brew: brew install apptainer```

```nix: nix profile install nixpkgs#apptainer```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-push](/man/apptainer-push)(1), [apptainer-pull](/man/apptainer-pull)(1), [apptainer-search](/man/apptainer-search)(1)

# RESOURCES

```[Source code](https://github.com/apptainer/apptainer)```

```[Homepage](https://apptainer.org)```

```[Documentation](https://apptainer.org/docs/)```

<!-- verified: 2026-06-11 -->
