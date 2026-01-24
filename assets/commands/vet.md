# TLDR

**Check package**

```go vet```

**Check specific file**

```go vet [file.go]```

**Check all packages**

```go vet ./...```

**Specific check**

```go vet -printf [file.go]```

**JSON output**

```go vet -json [file.go]```

# SYNOPSIS

**go vet** [_-n_] [_-x_] [_-json_] [_packages_]

# PARAMETERS

**-n**
> Print commands.

**-x**
> Print commands as run.

**-json**
> JSON output.

**-all**
> Run all analyzers.

**./...**
> All packages.

# DESCRIPTION

**go vet** checks Go code. It finds bugs and issues.

Static analysis. No execution.

Common mistakes. Printf args, etc.

Build tag checking. Correct constraints.

Part of Go tools. Standard tool.

# CAVEATS

Go-specific. Not all bugs found. Use with tests.

# HISTORY

**go vet** is part of the Go toolchain, providing static analysis to find common programming mistakes.

# SEE ALSO

[go](/man/go)(1), [golint](/man/golint)(1), [staticcheck](/man/staticcheck)(1)
