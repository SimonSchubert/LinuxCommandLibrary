# TLDR

**Build for all platforms**

```gox```

**Build for specific platforms**

```gox -osarch="linux/amd64 darwin/amd64"```

**Build specific package**

```gox [./cmd/app]```

**Set output path**

```gox -output="dist/{{.Dir}}_{{.OS}}_{{.Arch}}"```

**Parallel builds**

```gox -parallel=[4]```

# SYNOPSIS

**gox** [_options_] [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to build.

**-osarch** _TARGETS_
> OS/arch combinations.

**-os** _OS_
> Target operating systems.

**-arch** _ARCH_
> Target architectures.

**-output** _PATTERN_
> Output path pattern.

**-parallel** _N_
> Parallel builds.

**--help**
> Display help information.

# DESCRIPTION

**gox** is a simple Go cross-compilation tool. It builds Go binaries for multiple platforms in parallel, simplifying release builds.

The tool wraps go build with convenient cross-compilation options. Output paths can be templated with OS and architecture variables.

gox provides easy Go cross-compilation.

# CAVEATS

CGO may complicate cross-compile. Large number of targets is slow. Consider goreleaser for releases.

# HISTORY

gox was created by **Mitchell Hashimoto** (HashiCorp) to simplify building Go binaries for multiple platforms.

# SEE ALSO

[go-build](/man/go-build)(1), [goreleaser](/man/goreleaser)(1)
