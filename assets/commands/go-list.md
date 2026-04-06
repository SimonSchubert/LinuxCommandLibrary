# TAGLINE

list Go packages and module information

# TLDR

**List current package**

```go list```

**List all packages**

```go list ./...```

**List as JSON**

```go list -json [package]```

**List with dependencies**

```go list -deps [package]```

**List modules instead of packages**

```go list -m all```

**Check for module updates**

```go list -m -u all```

**Custom format output**

```go list -f '{{.ImportPath}}: {{.Dir}}'```

**List available versions of a module**

```go list -m -versions [module]```

# SYNOPSIS

**go** **list** [**-f** _format_] [**-json**] [**-m**] [_flags_] [_packages_]

# PARAMETERS

**-f** _format_
> Custom output format using Go template syntax. Default is **{{.ImportPath}}**.

**-json**
> Output in JSON format. Optionally accepts comma-separated field names to limit output.

**-m**
> List modules instead of packages.

**-deps**
> Include all dependencies in depth-first post-order traversal.

**-e**
> Include erroneous packages without printing errors to standard error.

**-u**
> Show available updates (with **-m**). Also shows deprecation and retraction info.

**-find**
> Identify packages without resolving dependencies. Imports and Deps lists will be empty.

**-compiled**
> Set CompiledGoFiles to the Go source files presented to the compiler, including generated code from CgoFiles and SwigFiles.

**-export**
> Set the Export field to a file containing up-to-date export information and the BuildID field.

**-test**
> Report test binaries and their recompiled dependencies for the named packages.

**-versions**
> Set the Module's Versions field to all known versions (with **-m**).

**-retracted**
> Report information about retracted module versions (with **-m**).

# DESCRIPTION

**go list** displays information about Go packages and modules. It enumerates packages, their source directories, import paths, and dependencies. With **-m**, it lists modules instead of packages. The **-f** flag allows custom formatting using Go template syntax with access to package struct fields like ImportPath, Dir, Deps, and GoFiles.

# SEE ALSO

[go](/man/go)(1), [go-mod](/man/go-mod)(1), [go-build](/man/go-build)(1), [go-get](/man/go-get)(1)
