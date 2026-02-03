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

# SYNOPSIS

**go** **list** [**-f** _format_] [**-json**] [**-m**] [_flags_] [_packages_]

# PARAMETERS

**-f** _format_
> Custom output format using Go template syntax.

**-json**
> Output in JSON format.

**-m**
> List modules instead of packages.

**-deps**
> Include all dependencies.

**-e**
> Include erroneous packages.

**-u**
> Show available updates (with -m).

# DESCRIPTION

**go list** displays information about Go packages and modules. It enumerates packages, their source directories, import paths, and dependencies. With **-m**, it lists modules instead of packages. The **-f** flag allows custom formatting using Go template syntax with access to package struct fields like ImportPath, Dir, Deps, and GoFiles.

# SEE ALSO

[go](/man/go)(1), [go-mod](/man/go-mod)(1)

