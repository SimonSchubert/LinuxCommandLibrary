# TAGLINE

Compile and run Go programs

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

**go run** compiles and runs a Go program in one step. It compiles to a temporary location and executes immediately, making it useful for rapid development and testing without creating a persistent binary.

Any arguments after the package name are passed to the program. Standard build flags like `-race` and `-ldflags` are supported.

# CAVEATS

Slower than running compiled binary. Temporary binary not retained. Useful for development.

# HISTORY

go run is part of the **Go** toolchain, providing convenient rapid iteration during development.

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1)
