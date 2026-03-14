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

**Build with trimmed paths** (for reproducible builds)

```go build -trimpath -o [binary-name]```

**Build with profile-guided optimization**

```go build -pgo=[profile.pprof] -o [binary-name]```

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

**-trimpath**
> Remove all file system paths from the resulting executable.

**-gcflags** _'[pattern=]arg list'_
> Arguments passed to the Go compiler.

**-mod** _MODE_
> Module download mode: readonly, vendor, or mod.

**-pgo** _FILE_
> Profile-guided optimization file (default: auto).

**-cover**
> Enable code coverage instrumentation.

**-a**
> Force rebuilding of packages already up-to-date.

**-n**
> Print commands but do not run them.

**-x**
> Print the commands as they are executed.

**-buildmode** _MODE_
> Build mode (default, archive, c-archive, c-shared, shared, exe, pie, plugin).

# DESCRIPTION

**go build** compiles Go packages and dependencies. It produces an executable binary from the main package or checks compilation for library packages.

The command handles dependency resolution, compilation, and linking. Cross-compilation is built-in via GOOS and GOARCH environment variables, requiring no additional toolchains.

# CAVEATS

Main package produces an executable; library packages only check compilation. CGO requires a C compiler. Use `go help build` for full documentation.

# HISTORY

go build is a core command of the **Go** toolchain, providing fast incremental compilation since Go's release.

# SEE ALSO

[go](/man/go)(1), [go-run](/man/go-run)(1), [go-install](/man/go-install)(1)
