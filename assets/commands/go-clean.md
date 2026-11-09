# TAGLINE

remove Go build artifacts and cached data

# TLDR

**Remove object files** from the current package directory

```go clean```

**Clean build cache**

```go clean -cache```

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

**go clean** [**-i**] [**-r**] [**-cache**] [**-testcache**] [**-modcache**] [**-fuzzcache**] [_build flags_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages whose source directories are cleaned of object files.

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

_build flags_
> Accepts the flags shared by go build. See **go help build**.

# DESCRIPTION

**go clean** removes object files from package source directories and, with the cache flags, cached data. Without flags it only removes files left by other tools or manual **go build** runs, such as binaries in the package directory. The cache flags clear build artifacts, test results, and downloaded modules to free disk space or force rebuilding.

The command can target specific caches or packages. Cleaning the module cache removes all downloaded dependencies, requiring re-download on next build.

# CAVEATS

Module cache clean affects all projects. Plain **go clean** does not touch any cache. Test cache clean forces test reruns. May need re-download dependencies.

# HISTORY

go clean is part of the **Go** toolchain, providing cache and artifact management.

# INSTALL

```apt: sudo apt install golang-go```

```dnf: sudo dnf install golang```

```pacman: sudo pacman -S go```

```apk: sudo apk add go```

```zypper: sudo zypper install go```

```brew: brew install go```

```nix: nix profile install nixpkgs#go```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1), [go-mod](/man/go-mod)(1), [go-test](/man/go-test)(1)

# RESOURCES

```[Source code](https://github.com/golang/go)```

```[Homepage](https://go.dev/)```

```[Documentation](https://pkg.go.dev/cmd/go)```

<!-- verified: 2026-11-09 -->
