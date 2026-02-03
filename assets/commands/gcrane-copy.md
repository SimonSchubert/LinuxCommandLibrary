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

**gcrane copy** copies container images between registries. gcrane is a variant of crane optimized for Google Container Registry and Artifact Registry.

# SEE ALSO

[gcrane](/man/gcrane)(1), [crane-copy](/man/crane-copy)(1)

