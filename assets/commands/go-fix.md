# TAGLINE

update Go code for newer API versions

# TLDR

**Fix all packages in the current module**

```go fix ./...```

**Fix a specific package**

```go fix [package]```

**Preview changes as a unified diff without modifying files**

```go fix -diff [package]```

**Output fixes as JSON instead of applying them**

```go fix -json [package]```

**Use a custom fix tool**

```go fix -fixtool=[prog] [package]```

# SYNOPSIS

**go fix** [_-diff_] [_-json_] [_-fixtool=prog_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to fix. Use ./... for all packages in the current module.

**-diff**
> Print changes as a unified diff instead of applying them. Useful for CI pipelines.

**-json**
> Emit fixes as JSON output instead of applying them.

**-fixtool** _prog_
> Select a different analysis tool with alternative or additional fixers. The default is go tool fix.

**-v**
> Verbose output.

**-n**
> Print the commands that would be executed but do not run them.

**-x**
> Print the commands as they are executed.

# DESCRIPTION

**go fix** updates Go code for newer Go versions. It applies transformations for API changes and deprecated patterns, helping maintain code across Go releases.

The tool runs specific fixers (analyzers) that handle known changes between Go versions. As of Go 1.24, go fix uses the same analysis framework as go vet and supports selecting specific analyzers by name.

Available analyzers include fixes for: replacing interface{} with any, using min/max builtins, modernizing string operations, updating fmt.Appendf patterns, range-over-int, and more.

Files are modified in place by default, so version control is recommended before running.

# CAVEATS

Modifies files in place unless -diff is used. Use version control. May need manual review. Limited to known fixes. Each run analyzes only one build configuration; run with different GOARCH/GOOS values for multi-platform projects.

# HISTORY

go fix is part of the **Go** toolchain. Originally introduced for handling breaking API changes during Go 1.x development, it was significantly enhanced in **Go 1.24** to use the analysis framework, gaining support for custom analyzers and modernization fixes.

# SEE ALSO

[go](/man/go)(1), [go-vet](/man/go-vet)(1), [go-fmt](/man/go-fmt)(1)
