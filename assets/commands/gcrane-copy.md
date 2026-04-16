# TAGLINE

copies container images between registries

# TLDR

**Copy image between registries**

```gcrane copy [source_image] [dest_image]```

**Recursively copy a repository**

```gcrane copy -r [source_repo] [dest_repo]```

**Copy with platform filter**

```gcrane copy --platform linux/amd64 [source] [dest]```

**Copy with parallel jobs**

```gcrane copy --jobs [4] [source] [dest]```

# SYNOPSIS

**gcrane** **copy** [_options_] _src_ _dst_

# PARAMETERS

**-r**, **--recursive**
> Recursively copy repositories (copy all tags and sub-repositories).

**--platform** _platform_
> Platform to copy (e.g., linux/amd64). Use `all` to copy all platforms.

**--jobs** _num_
> Number of parallel copy jobs.

**--allow-nondistributable-artifacts**
> Allow pushing non-distributable (foreign) layers.

**--insecure**
> Allow image references to be fetched without TLS.

# DESCRIPTION

**gcrane copy** copies container images between registries, supporting both single images and repository-wide operations. It handles multi-architecture images and maintains all image metadata during transfer.

The command can copy individual tagged images or use the **-r** flag to recursively copy all tags and sub-repositories. Platform filtering allows selective copying for specific architectures. Parallel job execution speeds up bulk copy operations. gcrane copy is commonly used for backup, geo-replication between regions or projects, and promoting images from staging to production registries.

**gcrane** extends **crane** with Google Container Registry and Artifact Registry specific features such as recursive repository copy.

# SEE ALSO

[gcrane](/man/gcrane)(1), [crane-copy](/man/crane-copy)(1)

