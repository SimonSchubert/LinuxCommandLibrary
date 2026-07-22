# TAGLINE

compile and install Go packages and binaries

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

**go install** compiles and installs packages and their dependencies. Executables are installed to the directory named by the GOBIN environment variable, defaulting to $GOPATH/bin or $HOME/go/bin. When used with an @version suffix, it installs in module-aware mode regardless of the current directory, ignoring any go.mod present.

# CAVEATS

Use **@latest** or **@version** to install tools independent of current module. Without a version suffix, go install uses dependencies from the current module's go.mod.

# HISTORY

Since **Go 1.16**, **go install** is the recommended way to build and install commands at a specific version, taking over that role from **go get**, which was fully restricted from doing so as of **Go 1.18**.

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

[go](/man/go)(1), [go-build](/man/go-build)(1), [go-get](/man/go-get)(1)

# RESOURCES

```[Documentation](https://go.dev/ref/mod#go-install)```

<!-- verified: 2026-07-17 -->
