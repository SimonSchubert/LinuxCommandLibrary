# TLDR

**Run all linters**

```golangci-lint run```

**Run specific linters**

```golangci-lint run --enable=[errcheck,govet]```

**Run on specific path**

```golangci-lint run [./...]```

**Show available linters**

```golangci-lint linters```

**Generate config**

```golangci-lint config```

# SYNOPSIS

**golangci-lint** _command_ [_options_]

# PARAMETERS

**run**
> Run linters.

**linters**
> List available linters.

**config**
> Config management.

**--enable** _LINTERS_
> Enable specific linters.

**--disable** _LINTERS_
> Disable specific linters.

**-c** _FILE_, **--config** _FILE_
> Config file.

**--help**
> Display help information.

# DESCRIPTION

**golangci-lint** is a fast Go linter runner. It aggregates many linters into one tool with parallel execution, caching, and unified configuration.

The tool includes dozens of linters for style, bugs, performance, and security. Configuration via .golangci.yml enables project-specific rules.

golangci-lint provides comprehensive Go code analysis.

# CAVEATS

Many linters available. Configuration recommended. Can be slow on first run.

# HISTORY

golangci-lint was created to provide a fast, unified interface for running multiple Go linters efficiently.

# SEE ALSO

[go-vet](/man/go-vet)(1), [staticcheck](/man/staticcheck)(1)
