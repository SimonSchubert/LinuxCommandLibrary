# TAGLINE

compile Go packages and dependencies

# TLDR

**Build current package**

```go build```

**Build specific file**

```go build [main.go]```

**Set output name**

```go build -o [binary-name]```

**Cross-compile**

```GOOS=[linux] GOARCH=[amd64] go build```

**Build with race detector**

```go build -race```

# SYNOPSIS

**go build** [_options_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to build.

**-o** _FILE_
> Output file name.

**-v**
> Verbose output.

**-race**
> Enable race detector.

**-ldflags** _FLAGS_
> Linker flags.

**-tags** _TAGS_
> Build tags.

**--help**
> Display help information.

# DESCRIPTION

**go build** compiles Go packages and dependencies. It produces an executable binary from the main package or checks compilation for library packages.

The command handles dependency resolution, compilation, and linking. Cross-compilation is built-in via GOOS and GOARCH environment variables, requiring no additional toolchains.

# CAVEATS

Main package produces executable. Libraries just check compilation. CGO requires C compiler.

# HISTORY

go build is a core command of the **Go** toolchain, providing fast incremental compilation since Go's release.

# SEE ALSO

[go](/man/go)(1), [go-run](/man/go-run)(1), [go-install](/man/go-install)(1)
