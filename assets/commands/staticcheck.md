# TLDR

**Analyze all packages** in current module

```staticcheck ./...```

**Analyze specific packages**

```staticcheck [package1] [package2]```

**Run specific checks only**

```staticcheck -checks "SA*,ST1000" ./...```

**Ignore specific checks**

```staticcheck -checks "all,-ST1003" ./...```

**Output in different format**

```staticcheck -f [stylish] ./...```

**Show explanation for a check**

```staticcheck -explain [SA1019]```

**Display version**

```staticcheck -version```

# SYNOPSIS

**staticcheck** [_flags_] [_packages_]

# PARAMETERS

**-checks** _checks_
> Comma-separated list of checks to run. Supports wildcards and negation.

**-f** _format_
> Output format: text (default), stylish, json, sarif, or null.

**-fail** _checks_
> Comma-separated list of checks that cause non-zero exit on findings.

**-explain** _check_
> Display detailed explanation of a specific check.

**-show-ignored**
> Include findings that have been explicitly ignored via directives.

**-go** _version_
> Target Go version for compatibility checks.

**-debug.cpuprofile** _file_
> Write CPU profile to file.

**-debug.memprofile** _file_
> Write memory profile to file.

**-debug.version**
> Print detailed version information.

**-version**
> Display version information.

# DESCRIPTION

**staticcheck** is a state-of-the-art static analysis linter for Go. It finds bugs, performance issues, and code quality problems using sophisticated analysis techniques that go beyond what the standard **go vet** tool provides.

The tool includes over 150 checks organized into categories: SA (staticcheck - bugs and correctness), S (simple - code simplifications), ST (stylecheck - style issues), QF (quickfix - suggested improvements), and U (unused - dead code detection).

Staticcheck integrates seamlessly with Go's tooling conventions, accepting packages in the same format as **go build**. It supports configuration via **staticcheck.conf** files for project-wide settings and inline directives like **//lint:ignore** for suppressing specific warnings.

The linter is used as the default in VS Code's Go extension and is included as a component of golangci-lint. It provides machine-readable output formats for CI/CD integration.

# CAVEATS

Check categories are disabled by default in some contexts. ST checks (style) include some controversial rules that are off by default. Configuration files use a different syntax than command-line flags. Some checks require analyzing dependencies which increases runtime. The tool is developed by Dominik Honnef with sponsorship from Google.

# HISTORY

**Staticcheck** was created by Dominik Honnef, starting development while at Google. It evolved from earlier tools like **go vet** and **golint** to provide more comprehensive static analysis. The tool gained widespread adoption in the Go community and became the default linter for VS Code's Go extension. It is now sponsored by both Google and the Go team.

# SEE ALSO

[go](/man/go)(1), [golangci-lint](/man/golangci-lint)(1), [gofmt](/man/gofmt)(1), [revive](/man/revive)(1)
