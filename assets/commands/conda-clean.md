# TAGLINE

remove unused packages and cached files

# TLDR

**Remove unused packages and caches**

```conda clean --all```

**Remove only package tarballs**

```conda clean --tarballs```

**Remove only unused packages**

```conda clean --packages```

**Remove index cache**

```conda clean --index-cache```

**Dry run** without removing

```conda clean --all --dry-run```

# SYNOPSIS

**conda** **clean** [_options_]

# PARAMETERS

**-a**, **--all**
> Remove all (index cache, lock files, tarballs, unused packages).

**-t**, **--tarballs**
> Remove cached package tarballs.

**-p**, **--packages**
> Remove unused packages.

**-i**, **--index-cache**
> Remove cached channel index files.

**--dry-run**
> Show what would be removed without removing.

# DESCRIPTION

**conda clean** reclaims disk space by removing various types of cached data that conda accumulates during package operations. Over time, conda's cache can grow to multiple gigabytes as it stores package tarballs, extracted packages, and index metadata for all downloaded packages.

The cache system exists to speed up package installation by reusing previously downloaded packages, but once packages are installed in environments, the cached copies are no longer strictly necessary. The --packages option removes extracted package files that aren't currently used by any environment, while --tarballs removes the compressed archives. The --index-cache option clears channel metadata that will be re-downloaded on the next conda operation.

Using --all is the most aggressive option, clearing all cache types and freeing the maximum amount of disk space. The --dry-run flag allows previewing what would be removed without actually deleting anything, which is useful for understanding how much space can be reclaimed. This command is safe to run as it never touches installed packages in actual environments, only the centralized package cache.

# SEE ALSO

[conda](/man/conda)(1), [conda-remove](/man/conda-remove)(1)
