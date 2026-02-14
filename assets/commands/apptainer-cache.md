# TAGLINE

Manage the local Apptainer container cache

# TLDR

**List all cached images**

```apptainer cache list```

**List cached images with details**

```apptainer cache list -v```

**List only OCI cached images**

```apptainer cache list -T oci```

**Clean all cached images**

```apptainer cache clean```

**Clean cache without confirmation**

```apptainer cache clean -f```

**Clean cache entries older than 30 days**

```apptainer cache clean -D 30```

**Dry run to see what would be cleaned**

```apptainer cache clean -n```

# SYNOPSIS

**apptainer cache** [_subcommand_] [_options_]

# DESCRIPTION

**apptainer cache** manages the local Apptainer container image cache. When pulling or building containers, Apptainer stores intermediate images and layers locally to speed up subsequent operations. This command allows listing cache contents and cleaning up disk space.

The cache is stored at **$HOME/.apptainer/cache** by default, or at the path specified by the **APPTAINER_CACHEDIR** environment variable.

# SUBCOMMANDS

**list**
> Display the contents of the local cache, showing size and type of cached images

**clean**
> Remove items from the local cache to reclaim disk space

# PARAMETERS

**-T, --type** _strings_
> Limit operation to specific cache types: **library**, **oci**, **shub**, **blob**, **net**, **oras**, **all** (default: all)

**-v, --verbose**
> Display detailed information about cached images (list only)

**-D, --days** _int_
> Remove cache entries older than the specified number of days (clean only)

**-n, --dry-run**
> Show what would be deleted without actually removing anything (clean only)

**-f, --force**
> Suppress confirmation prompts and clean immediately (clean only)

# CAVEATS

Large builds and frequent pulls can consume significant disk space in the cache directory. The cache is per-user and does not affect other users on the system. Cleaning the cache forces re-download of images on next use.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-build](/man/apptainer-build)(1), [apptainer-pull](/man/apptainer-pull)(1)
