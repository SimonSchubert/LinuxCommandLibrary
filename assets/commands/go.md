# TLDR

**Run a program**

```go run [main.go]```

**Build an executable**

```go build```

**Run tests**

```go test```

**Download dependencies**

```go mod download```

**Format code**

```go fmt ./...```

# SYNOPSIS

**go** _command_ [_arguments_]

# PARAMETERS

**build**
> Compile packages and dependencies.

**run**
> Compile and run program.

**test**
> Run tests.

**mod**
> Module maintenance.

**get**
> Download and install packages.

**fmt**
> Format source code.

**vet**
> Report likely mistakes.

**doc**
> Show documentation.

**--help**
> Display help information.

# DESCRIPTION

**go** is the tool for managing Go source code. It provides commands for building, testing, running, and managing Go programs and modules.

The tool handles compilation, dependency management, testing, and code quality. Go modules provide versioned dependency management. The toolchain is self-contained.

go is the complete development toolchain for the Go language.

# CAVEATS

Requires GOPATH or modules. Cross-compilation built-in. CGO may need additional setup.

# HISTORY

Go was created at **Google** by **Robert Griesemer, Rob Pike, and Ken Thompson** in **2007**, released publicly in **2009**.

# SEE ALSO

[go-build](/man/go-build)(1), [go-run](/man/go-run)(1), [go-mod](/man/go-mod)(1)
