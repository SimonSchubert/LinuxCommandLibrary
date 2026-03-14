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
> Display offending line with N lines of context.

**-v**
> Verbose output.

**-n**
> Print commands but do not run them.

**-x**
> Print the commands as they are executed.

**-vettool** _prog_
> Select a different analysis tool.

**-tags** _TAGS_
> Build tags.

# DESCRIPTION

**go vet** examines Go source code and reports suspicious constructs that the compiler does not catch. It finds bugs like incorrect printf format strings, unreachable code, and misuse of sync primitives.

The tool runs multiple analyzers that check for common mistakes. It is part of the standard quality assurance workflow alongside testing and formatting.

# CAVEATS

Not exhaustive; false positives are possible. Use alongside tests and code review. Run `go help vet` for full documentation. Additional analyzers (like shadow) require `-vettool`.

# HISTORY

go vet is part of the **Go** toolchain, providing static analysis for catching common programming errors.

# SEE ALSO

[go](/man/go)(1), [staticcheck](/man/staticcheck)(1), [golint](/man/golint)(1)
