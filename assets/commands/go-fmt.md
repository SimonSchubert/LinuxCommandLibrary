# TAGLINE

format Go source code to standard style

# TLDR

**Format a Go file**

```go fmt [file.go]```

**Format all files in current package**

```go fmt```

**Format all packages recursively**

```go fmt ./...```

**Show files that would be changed**

```gofmt -l [file.go]```

**Show diff of changes**

```gofmt -d [file.go]```

**Simplify code**

```gofmt -s [file.go]```

# SYNOPSIS

**go** **fmt** [**-n**] [**-x**] [_packages_]

**gofmt** [_flags_] [_path_ ...]

# PARAMETERS

**-n**
> Print commands that would be executed.

**-x**
> Print commands as they are executed.

**-l**
> List files whose formatting differs (gofmt).

**-w**
> Write result to source file (gofmt).

**-d**
> Display diffs instead of rewriting (gofmt).

**-s**
> Simplify code (gofmt).

**-r** _rule_
> Apply rewrite rule before formatting (gofmt).

# DESCRIPTION

**go fmt** formats Go source code according to standard Go style conventions. It is an alias for **gofmt -l -w** on the packages named by the import paths. The **gofmt** tool can also simplify code with **-s** and apply rewrite rules with **-r** for refactoring.

# CAVEATS

**go fmt** and **gofmt** accept different parameters. Use **gofmt** directly for **-s**, **-d**, **-l**, and **-r** options.

# SEE ALSO

[go](/man/go)(1), [goimports](/man/goimports)(1)
