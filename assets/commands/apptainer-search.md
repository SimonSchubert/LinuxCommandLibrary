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
> Filter results by CPU architecture

**--signed**
> Only show containers with cryptographic signatures

**--library** _url_
> Search in a specific Container Library

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-pull](/man/apptainer-pull)(1)
