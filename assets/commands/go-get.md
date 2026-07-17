# TAGLINE

download and manage Go package dependencies

# TLDR

**Download package**

```go get [github.com/pkg/errors]```

**Download specific version**

```go get [github.com/pkg/errors@v0.9.1]```

**Update package**

```go get -u [package]```

**Download all dependencies**

```go get ./...```

**Install binary**

```go install [github.com/user/tool@latest]```

# SYNOPSIS

**go get** [_options_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to download.

**-u**
> Update to latest version.

**-d**
> Download only, don't install (default behavior since Go 1.16; the flag is now a deprecated no-op).

**-t**
> Include test dependencies.

**@** _VERSION_
> Specify version.

**--help**
> Display help information.

# DESCRIPTION

**go get** downloads and installs packages and dependencies. In module mode, it updates go.mod and go.sum files to track dependencies. For installing tool binaries, use **go install** instead.

The command resolves versions from module proxies, supporting semantic versioning. It can target specific versions, branches, or commits.

# CAVEATS

Since **Go 1.18**, **go get** no longer builds or installs packages; it only edits go.mod/go.sum and populates the module cache. Running it outside a module, or to install a command, fails with an error pointing to **go install**. Updates modify go.mod and go.sum, which should be committed.

# HISTORY

go get is part of the **Go** toolchain. Its build/install functionality was split off into **go install** in **Go 1.17-1.18** as part of the modules transition, leaving go get focused solely on dependency resolution.

# SEE ALSO

[go](/man/go)(1), [go-mod](/man/go-mod)(1), [go-install](/man/go-install)(1)

# RESOURCES

```[Documentation](https://go.dev/ref/mod#go-get)```

<!-- verified: 2026-07-17 -->
