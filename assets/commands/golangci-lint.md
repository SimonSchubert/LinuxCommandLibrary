# TAGLINE

Fast Go linter aggregator

# TLDR

**Run all enabled linters** in the current project

```golangci-lint run```

**Run linters on specific packages**

```golangci-lint run ./cmd/... ./internal/...```

**Enable specific linters** in addition to defaults

```golangci-lint run --enable errcheck --enable gocritic```

**Run only specific linters** (disable all others)

```golangci-lint run --disable-all --enable gosimple --enable govet```

**Show all available linters** and their status

```golangci-lint linters```

**Run with a specific config** file

```golangci-lint run -c [.golangci.yml]```

**Fix issues** automatically where supported

```golangci-lint run --fix```

**Output results** in JSON format

```golangci-lint run --out-format json```

# SYNOPSIS

**golangci-lint** _command_ [_options_]

# PARAMETERS

**run**
> Run linters on the current project.

**linters**
> List available linters with enabled/disabled status.

**cache**
> Cache management commands (clean, status).

**version**
> Display version information.

**--enable** _LINTER_
> Enable a specific linter. Can be specified multiple times.

**--disable** _LINTER_
> Disable a specific linter. Can be specified multiple times.

**--disable-all**
> Disable all linters, then selectively enable with --enable.

**--fix**
> Automatically fix issues where the linter supports it.

**--out-format** _FORMAT_
> Output format: colored-line-number (default), json, tab, checkstyle, github-actions, etc.

**--timeout** _DURATION_
> Timeout for the total run. Default: **1m**.

**--new**
> Only show issues from new code (based on git).

**--new-from-rev** _REV_
> Show issues only from changes since the given git revision.

**-c** _FILE_, **--config** _FILE_
> Path to config file.

**--no-config**
> Do not read any config file.

**-j** _N_, **--concurrency** _N_
> Number of concurrent linter goroutines. Default: number of CPUs.

**--help**
> Display help information.

# DESCRIPTION

**golangci-lint** is a fast Go linter runner that aggregates dozens of linters into one tool. It provides parallel execution, result caching, and unified configuration for checking style, bugs, performance, and security issues.

Configuration via .golangci.yml enables project-specific rules and linter selection, replacing the need to run individual linters separately. Results are cached between runs for speed.

# CONFIGURATION

**.golangci.yml** / **.golangci.yaml**
> Project-level configuration file for linter selection, rules, severity, and exclusions.

# CAVEATS

First run may be slow while building the cache. The set of default-enabled linters changes between versions. Pin your version in CI for reproducible results. Some linters may conflict with each other.

# SEE ALSO

[go-vet](/man/go-vet)(1), [staticcheck](/man/staticcheck)(1), [gofmt](/man/gofmt)(1), [go](/man/go)(1)
