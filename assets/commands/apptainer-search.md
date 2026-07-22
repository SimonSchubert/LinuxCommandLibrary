# TAGLINE

Search a container library for available images.

# TLDR

**Search** for container images matching a query

```apptainer search [query]```

Search for container images for a **specific architecture**

```apptainer search --arch [amd64|arm64|386|ppc64le|s390x] [query]```

Search for only **signed** container images

```apptainer search --signed [query]```

Search in a **specific Container Library**

```apptainer search --library [library_url] [query]```

# SYNOPSIS

**apptainer search** [_options_] _query_

# DESCRIPTION

**apptainer search** queries a Container Library for available container images matching the specified search terms. Results include image names, descriptions, and available tags.

By default, searches are performed against the Sylabs Container Library. Alternative libraries can be specified using the **--library** option.

# PARAMETERS

**--arch** _architecture_
> Filter results by CPU architecture (default: amd64).

**--signed**
> Only show containers with cryptographic signatures.

**--library** _url_
> Specify an alternate Container Library URI to search.

# INSTALL

```dnf: sudo dnf install apptainer```

```pacman: sudo pacman -S apptainer```

```apk: sudo apk add apptainer```

```zypper: sudo zypper install apptainer```

```brew: brew install apptainer```

```nix: nix profile install nixpkgs#apptainer```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-pull](/man/apptainer-pull)(1), [apptainer-push](/man/apptainer-push)(1), [apptainer-delete](/man/apptainer-delete)(1)

# RESOURCES

```[Source code](https://github.com/apptainer/apptainer)```

```[Homepage](https://apptainer.org)```

```[Documentation](https://apptainer.org/docs/)```

<!-- verified: 2026-06-11 -->
