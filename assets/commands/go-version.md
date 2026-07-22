# TAGLINE

Print Go version and binary build info

# TLDR

**Show Go version**

```go version```

**Show binary's Go version**

```go version [binary]```

**Show version of all binaries**

```go version -m [binary]```

# SYNOPSIS

**go version** [_options_] [_files_]

# PARAMETERS

_FILES_
> Binary files to inspect.

**-m**
> Print each executable's embedded module version information (added in Go 1.13).

**-v**
> Report unrecognized files (otherwise non-Go files are silently skipped when scanning a directory).

**--help**
> Display help information.

# DESCRIPTION

**go version** prints the Go runtime version of the toolchain when invoked without arguments. When given file arguments — executables or directories of executables — it reports the Go version each binary was built with, and with **-m** also dumps the build-time module dependency graph (`go.mod`-equivalent info) embedded in the binary.

Directory arguments are walked recursively; non-Go executables are skipped silently unless **-v** is given.

# CAVEATS

Module info is only embedded for binaries built by Go 1.13+. Heavily stripped binaries (e.g., built with `-ldflags="-w -s"` and then run through external strippers that remove the Go build info section) may not report any version.

# HISTORY

go version is part of the **Go** toolchain, extended to report binary build information for debugging.

# INSTALL

```apt: sudo apt install gccgo-go```

```dnf: sudo dnf install gcc-go```

```pacman: sudo pacman -S gcc-go```

```apk: sudo apk add gcc-go```

```zypper: sudo zypper install gcc-go```

```brew: brew install go```

```nix: nix profile install nixpkgs#go```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[go](/man/go)(1), [go-build](/man/go-build)(1)
