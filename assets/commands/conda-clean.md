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

**conda clean** removes unused packages and cached files to free disk space. Conda caches downloaded packages and metadata which can accumulate over time.

# SEE ALSO

[conda](/man/conda)(1), [conda-remove](/man/conda-remove)(1)
