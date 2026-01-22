# TLDR

**Clean build cache**

```go clean```

**Clean test cache**

```go clean -testcache```

**Clean module cache**

```go clean -modcache```

**Clean all caches**

```go clean -cache -testcache -modcache```

**Clean specific package**

```go clean [package]```

# SYNOPSIS

**go clean** [_options_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to clean.

**-cache**
> Clean build cache.

**-testcache**
> Clean test cache.

**-modcache**
> Clean module cache.

**-i**
> Remove installed archive.

**-n**
> Dry run.

**--help**
> Display help information.

# DESCRIPTION

**go clean** removes object files and cached data. It cleans build artifacts, test results, and downloaded modules to free disk space or force rebuilding.

The command can target specific caches or packages. Cleaning the module cache removes all downloaded dependencies, requiring re-download.

go clean maintains Go build environment cleanliness.

# CAVEATS

Module cache clean affects all projects. Test cache clean forces test reruns. May need re-download dependencies.

# HISTORY

go clean is part of the **Go** toolchain, providing cache and artifact management.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1), [go-mod](/man/go-mod)(1)
