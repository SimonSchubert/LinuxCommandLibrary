# TLDR

**Initialize new module**

```go mod init [module-name]```

**Download dependencies**

```go mod download```

**Tidy dependencies**

```go mod tidy```

**Vendor dependencies**

```go mod vendor```

**Verify checksums**

```go mod verify```

# SYNOPSIS

**go mod** _command_ [_arguments_]

# PARAMETERS

**init** _NAME_
> Initialize new module.

**download**
> Download modules to cache.

**tidy**
> Add missing, remove unused.

**vendor**
> Create vendor directory.

**verify**
> Verify dependencies.

**graph**
> Print dependency graph.

**why** _PACKAGE_
> Explain why needed.

**--help**
> Display help information.

# DESCRIPTION

**go mod** manages Go modules. Modules are collections of packages with versioned dependencies defined in go.mod files.

The command initializes modules, manages dependencies, and maintains reproducible builds. It integrates with module proxies and checksum databases.

go mod provides Go's dependency management system.

# CAVEATS

Requires Go 1.11+. go.sum should be committed. Vendor mode for offline builds.

# HISTORY

Go modules were introduced in **Go 1.11** as the official dependency management solution, replacing GOPATH-based workflows.

# SEE ALSO

[go](/man/go)(1), [go-get](/man/go-get)(1)
