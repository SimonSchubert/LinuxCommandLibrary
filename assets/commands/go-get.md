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
> Download only, don't install.

**-t**
> Include test dependencies.

**@** _VERSION_
> Specify version.

**--help**
> Display help information.

# DESCRIPTION

**go get** downloads and installs packages and dependencies. In module mode, it updates go.mod and go.sum files. For binaries, use go install instead.

The command resolves versions from module proxies, supporting semantic versioning. It can target specific versions, branches, or commits.

go get manages Go package dependencies.

# CAVEATS

Behavior differs in module mode vs GOPATH. Use go install for binaries. Updates modify go.mod.

# HISTORY

go get is part of the **Go** toolchain, evolving with Go modules to provide modern dependency management.

# SEE ALSO

[go](/man/go)(1), [go-mod](/man/go-mod)(1), [go-install](/man/go-install)(1)
