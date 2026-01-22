# TLDR

**Run Go file**

```go run [main.go]```

**Run package**

```go run .```

**Run with arguments**

```go run [main.go] [arg1] [arg2]```

**Run multiple files**

```go run [main.go] [helper.go]```

# SYNOPSIS

**go run** [_options_] _package_ [_arguments_]

# PARAMETERS

_PACKAGE_
> Go files or package to run.

_ARGUMENTS_
> Arguments passed to program.

**-race**
> Enable race detector.

**-exec** _CMD_
> Execution wrapper.

**--help**
> Display help information.

# DESCRIPTION

**go run** compiles and runs a Go program in one step. It's useful for development and testing, combining build and execute without creating a binary.

The command compiles to a temporary location and executes. Any arguments after the package name are passed to the program. Build flags are supported.

go run provides rapid compile-and-run development.

# CAVEATS

Slower than running compiled binary. Temporary binary not retained. Useful for development.

# HISTORY

go run is part of the **Go** toolchain, providing convenient rapid iteration during development.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1)
