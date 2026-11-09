# TAGLINE

modernize Go code using the fixers of the go toolchain

# TLDR

**Fix all packages in the current module**

```go fix ./...```

**Fix a specific package**

```go fix [package]```

**Preview changes as a unified diff without modifying files**

```go fix -diff ./...```

**Run only one fixer**

```go fix -[any] ./...```

**Run all fixers except one**

```go fix -[any]=false ./...```

**List the available fixers**

```go tool fix help```

**Output fixes as JSON instead of applying them**

```go fix -json [package]```

**Use a custom fix tool**

```go fix -fixtool=[prog] [package]```

# SYNOPSIS

**go fix** [_build flags_] [**-fixtool** _prog_] [_fix flags_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to fix. Use ./... for all packages in the current module.

**-diff**
> Print changes as a unified diff instead of applying them. Exits non-zero if the diff is not empty.

**-json**
> Emit diagnostics and fixes as JSON instead of applying them. Cannot be combined with **-diff**.

**-fixtool** _prog_
> Select a different analysis tool with alternative or additional fixers. The default is go tool fix.

**-**_analyzer_
> Enable only the named fixer, such as **-any** or **-forvar**. Negate with **-**_analyzer_**=false** to run all others.

**-C** _dir_
> Change to dir before running.

**-tags** _list_
> Comma-separated build tags to consider.

**-v**
> Verbose output.

**-n**
> Print the commands that would be executed but do not run them.

**-x**
> Print the commands as they are executed.

# DESCRIPTION

**go fix** runs the Go fix tool (cmd/fix) on the named packages and applies suggested fixes. Since Go 1.26 it is the home of Go's modernizers, which update code to the latest idioms and library APIs without changing behavior, for example replacing interface{} with any, using min/max builtins, or removing redundant loop variable copies. A source-level inliner also applies user API migrations marked with **//go:fix inline** directives.

It is built on the same analysis framework as **go vet**, and runs all analyzers by default. Fixes touching generated files are discarded. Use **go tool fix help** _name_ for details of a specific fixer.

# CAVEATS

Modifies files in place unless **-diff** or **-json** is used. Start from a clean version control state. Each run analyzes only one build configuration; run with different GOARCH/GOOS values for multi-platform projects. Go versions before 1.26 have a different go fix with a different flag set.

# HISTORY

**gofix** was introduced in **April 2011** to rewrite code for breaking API changes during the run-up to Go 1. The command was completely rewritten for **Go 1.26** (February 2026), removing all the historical fixers, which had become obsolete.

# INSTALL

```apt: sudo apt install golang-go```

```dnf: sudo dnf install golang```

```pacman: sudo pacman -S go```

```apk: sudo apk add go```

```zypper: sudo zypper install go```

```brew: brew install go```

```nix: nix profile install nixpkgs#go```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[go](/man/go)(1), [go-vet](/man/go-vet)(1), [go-fmt](/man/go-fmt)(1), [gofmt](/man/gofmt)(1)

# RESOURCES

```[Source code](https://github.com/golang/go)```

```[Homepage](https://go.dev/)```

```[Documentation](https://pkg.go.dev/cmd/fix)```

<!-- verified: 2026-11-09 -->
