# TLDR

**Lint current package**

```golint .```

**Lint specific file**

```golint [file.go]```

**Lint package recursively**

```golint ./...```

**Set minimum confidence**

```golint -min_confidence [0.8] ./...```

# SYNOPSIS

**golint** [_options_] [_packages_]

# PARAMETERS

**-min_confidence** _n_
> Minimum confidence for issues (0.0-1.0).

**-set_exit_status**
> Exit with non-zero status on issues.

_packages_
> Package paths to lint.

# DESCRIPTION

**golint** checks Go source code for style issues. It enforces the style guidelines from Effective Go and the Go Code Review Comments, focusing on naming conventions, comments, and code structure.

Unlike go vet which finds bugs, golint focuses on style and readability. Issues are suggestions, not errors.

# COMMON ISSUES

```
- Exported functions should have comments
- Package comments should be of the form "Package x..."
- Receiver names should be consistent
- Don't use underscores in Go names
- Error strings should not be capitalized
```

# CAVEATS

Deprecated in favor of staticcheck or golangci-lint. Suggestions are stylistic, not bugs. High false-positive rate for some projects. Not actively maintained.

# HISTORY

golint was created by the **Go team** at Google as a style checker. It was deprecated in **2021** in favor of more comprehensive linters like staticcheck. The project recommends using golangci-lint which includes multiple linters.

# SEE ALSO

[go](/man/go)(1), [gofmt](/man/gofmt)(1), [staticcheck](/man/staticcheck)(1), [golangci-lint](/man/golangci-lint)(1)
