# TAGLINE

Go cross-compilation tool

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
> Output path template — supports `{{.Dir}}`, `{{.OS}}`, `{{.Arch}}`.

**-parallel** _N_
> Number of concurrent build workers (default: number of CPUs).

**-osarch-list-json** _FILE_
> Override the list of supported OS/arch combinations.

**-cgo**
> Enable cgo (most cross-builds require an appropriate cross-compiler installed).

**-rebuild**
> Rebuild the standard library for each target.

**-ldflags** _FLAGS_
> Linker flags passed through to `go build`.

**-tags** _TAGS_
> Build tags passed through to `go build`.

**-mod** _MODE_
> Module download mode passed to `go build`.

**--help**
> Display help information.

# DESCRIPTION

**gox** is a simple Go cross-compilation tool that builds Go binaries for multiple platforms in parallel. It wraps `go build` with convenient cross-compilation options and templated output paths using OS and architecture variables.

The tool simplifies creating release builds for multiple target platforms from a single command.

# CAVEATS

CGO may complicate cross-compile. Large number of targets is slow. Consider goreleaser for releases.

# HISTORY

gox was created by **Mitchell Hashimoto** (HashiCorp) to simplify building Go binaries for multiple platforms.

# INSTALL

```apt: sudo apt install gox```

```pacman: sudo pacman -S gox```

```nix: nix profile install nixpkgs#gox```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[go-build](/man/go-build)(1), [goreload](/man/goreload)(1)
