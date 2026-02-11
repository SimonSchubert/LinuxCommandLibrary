# TAGLINE

Go static analysis tool

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

**go vet** performs static analysis on Go source code to find common programming mistakes that the compiler does not catch. It checks for issues such as incorrect printf format strings, unreachable code, suspicious function calls, and misuse of sync primitives.

The tool is part of the standard Go toolchain and runs without executing the code. It is typically used alongside tests and linters as part of a continuous integration workflow to catch bugs early in development.

# CAVEATS

Go-specific. Not all bugs found. Use with tests.

# HISTORY

**go vet** is part of the Go toolchain, providing static analysis to find common programming mistakes.

# SEE ALSO

[go](/man/go)(1), [golint](/man/golint)(1), [staticcheck](/man/staticcheck)(1)
