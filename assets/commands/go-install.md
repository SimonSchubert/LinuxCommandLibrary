# TLDR

**Install a package from current module**

```go install```

**Install specific package**

```go install [package]```

**Install latest version of a tool**

```go install [example.com/tool]@latest```

**Install specific version**

```go install [example.com/tool]@v1.2.3```

**Install with verbose output**

```go install -v [package]```

# SYNOPSIS

**go** **install** [_build flags_] [_packages_]

# PARAMETERS

**-v**
> Print package names as compiled.

**-n**
> Print commands without executing.

**-x**
> Print commands as executed.

**@version**
> Install specific version (latest, v1.2.3, etc.).

# DESCRIPTION

**go install** compiles and installs packages and their dependencies. Executables are installed to the directory named by GOBIN environment variable, defaulting to $GOPATH/bin or $HOME/go/bin. When used with @version suffix, it installs in module-aware mode regardless of current directory, ignoring any go.mod in the current directory.

# CAVEATS

Use **@latest** or **@version** to install tools independent of current module. Without a version suffix, go install uses dependencies from the current module's go.mod.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1), [go-get](/man/go-get)(1)

