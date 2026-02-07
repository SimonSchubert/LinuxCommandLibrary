# TAGLINE

copies container images between registries

# TLDR

**Copy image between registries**

```gcrane copy [source_image] [dest_image]```

**Copy with all tags**

```gcrane copy -a [source] [dest]```

**Copy with platform filter**

```gcrane copy --platform linux/amd64 [source] [dest]```

# SYNOPSIS

**gcrane** **copy** [_options_] _src_ _dst_

# PARAMETERS

**-a**, **--all-tags**
> Copy all tags.

**--platform** _platform_
> Platform to copy.

**--jobs** _num_
> Parallel jobs.

# DESCRIPTION

**gcrane copy** copies container images between registries, supporting both single images and repository-wide operations. It handles multi-architecture images and maintains all image metadata during transfer.

The command can copy individual tagged images or use the **-a** flag to copy all tags from a repository. Platform filtering allows selective copying for specific architectures. Parallel job execution speeds up bulk copy operations. gcrane copy is commonly used for backup, migration between regions or projects, and promoting images from staging to production registries.

# SEE ALSO

[gcrane](/man/gcrane)(1), [crane-copy](/man/crane-copy)(1)

