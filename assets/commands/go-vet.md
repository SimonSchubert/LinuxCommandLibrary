# TAGLINE

Static analysis for Go source code

# TLDR

**Check current package**

```go vet```

**Check specific package**

```go vet [package]```

**Check all packages**

```go vet ./...```

**Run specific analyzer**

```go vet -[analyzer] [package]```

**List analyzers**

```go vet -help```

# SYNOPSIS

**go vet** [_options_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to check.

**-json**
> JSON output.

**-c** _N_
> Number of errors to show.

**--help**
> Display help information.

# DESCRIPTION

**go vet** examines Go source code and reports suspicious constructs that the compiler does not catch. It finds bugs like incorrect printf format strings, unreachable code, and misuse of sync primitives.

The tool runs multiple analyzers that check for common mistakes. It is part of the standard quality assurance workflow alongside testing and formatting.

# CAVEATS

Not exhaustive. False positives possible. Use with tests and code review.

# HISTORY

go vet is part of the **Go** toolchain, providing static analysis for catching common programming errors.

# SEE ALSO

[go](/man/go)(1), [staticcheck](/man/staticcheck)(1), [golint](/man/golint)(1)
