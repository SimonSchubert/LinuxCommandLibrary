# TAGLINE

Go static analysis tool

# TLDR

**Vet the current package**

```go vet```

**Vet all packages recursively**

```go vet ./...```

**Vet a specific package**

```go vet [package/path]```

**Output diagnostics as JSON**

```go vet -json ./...```

**Print commands without executing them**

```go vet -n ./...```

**Use a custom analysis tool**

```go vet -vettool=[path/to/analyzer] ./...```

# SYNOPSIS

**go vet** [_-n_] [_-x_] [_-json_] [_-vettool prog_] [_packages_]

# PARAMETERS

**-n**
> Print commands that would be executed, but do not run them.

**-x**
> Print commands as they are executed.

**-json**
> Output diagnostics in JSON format.

**-vettool** _prog_
> Select a different analysis tool with alternative or additional checks.

**-c** _int_
> Display offending line with this many lines of context.

**./...**
> Wildcard that matches all packages in the current module recursively.

# DESCRIPTION

**go vet** examines Go source code and reports suspicious constructs that the compiler does not catch, using heuristics that do not guarantee all reports are genuine problems. It checks for issues such as incorrect printf format strings, unreachable code, suspicious function calls, misuse of sync primitives, and incorrect struct tags.

The tool is part of the standard Go toolchain and runs without executing the code. It is typically used alongside tests and linters as part of a continuous integration workflow. Individual analyzers can be enabled or disabled (e.g., `-printf=false`). Run `go tool vet help` to see available analyzers and their flags.

# CAVEATS

Go-specific. Not all bugs found. Use with tests.

# HISTORY

**go vet** is part of the Go toolchain, providing static analysis to find common programming mistakes.

# SEE ALSO

[go](/man/go)(1), [go-vet](/man/go-vet)(1), [go-build](/man/go-build)(1), [golint](/man/golint)(1), [staticcheck](/man/staticcheck)(1)
