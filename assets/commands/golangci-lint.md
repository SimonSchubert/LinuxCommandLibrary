# TAGLINE

Fast Go linter aggregator

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

**golangci-lint** is a fast Go linter runner that aggregates dozens of linters into one tool. It provides parallel execution, result caching, and unified configuration for checking style, bugs, performance, and security issues.

Configuration via .golangci.yml enables project-specific rules and linter selection, replacing the need to run individual linters separately.

# CONFIGURATION

**.golangci.yml**
> Project-level configuration file for linter selection, rules, severity, and exclusions.

**.golangci.yaml**
> Alternative YAML configuration file name.

# CAVEATS

Many linters available. Configuration recommended. Can be slow on first run.

# HISTORY

golangci-lint was created to provide a fast, unified interface for running multiple Go linters efficiently.

# SEE ALSO

[go-vet](/man/go-vet)(1), [staticcheck](/man/staticcheck)(1)
