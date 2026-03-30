# TAGLINE

remove Go build artifacts and cached data

# TLDR

**Clean build cache**

```go clean```

**Clean test cache**

```go clean -testcache```

**Clean module cache**

```go clean -modcache```

**Clean all caches**

```go clean -cache -testcache -modcache```

**Clean fuzz test cache**

```go clean -fuzzcache```

**Dry run showing what would be removed**

```go clean -n [package]```

**Clean verbosely showing remove commands**

```go clean -x -cache```

# SYNOPSIS

**go clean** [_options_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to clean.

**-cache**
> Remove the entire build cache.

**-testcache**
> Expire all test results in the build cache.

**-modcache**
> Remove the entire module download cache.

**-fuzzcache**
> Remove files stored in the build cache for fuzz testing.

**-i**
> Remove the corresponding installed archive or binary.

**-r**
> Apply recursively to all dependencies of the named packages.

**-n**
> Print the remove commands that would be executed, but do not run them.

**-x**
> Print remove commands as they are executed.

# DESCRIPTION

**go clean** removes object files and cached data. It cleans build artifacts, test results, and downloaded modules to free disk space or force rebuilding.

The command can target specific caches or packages. Cleaning the module cache removes all downloaded dependencies, requiring re-download on next build.

# CAVEATS

Module cache clean affects all projects. Test cache clean forces test reruns. May need re-download dependencies.

# HISTORY

go clean is part of the **Go** toolchain, providing cache and artifact management.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1), [go-mod](/man/go-mod)(1), [go-test](/man/go-test)(1)
