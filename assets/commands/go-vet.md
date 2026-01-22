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

**go vet** examines Go source code and reports suspicious constructs. It finds bugs that the compiler doesn't catch, like incorrect printf format strings or unreachable code.

The tool runs multiple analyzers that check for common mistakes. It's part of the standard quality assurance workflow alongside testing and formatting.

go vet catches bugs before runtime.

# CAVEATS

Not exhaustive. False positives possible. Use with tests and code review.

# HISTORY

go vet is part of the **Go** toolchain, providing static analysis for catching common programming errors.

# SEE ALSO

[go](/man/go)(1), [staticcheck](/man/staticcheck)(1), [golint](/man/golint)(1)
