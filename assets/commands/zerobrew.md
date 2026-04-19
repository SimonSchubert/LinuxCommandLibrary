# TAGLINE

Faster experimental Homebrew alternative written in Rust

# TLDR

**Install one or more packages**

```zb install [ripgrep] [jq]```

**Uninstall a package**

```zb uninstall [ripgrep]```

**Install packages from a Brewfile**

```zb bundle```

**Dump installed packages to a Brewfile**

```zb bundle dump```

**Run a package without linking it**

```zbx [jq] --version```

**Garbage collect unreferenced store entries**

```zb gc```

**Uninstall all packages (reset)**

```zb reset```

# SYNOPSIS

**zb** _command_ [_options_]

**zbx** _package_ [_arguments_...]

# PARAMETERS

**install** _PACKAGE_...
> Install one or more packages.

**uninstall** _PACKAGE_...
> Remove packages.

**bundle**
> Install packages listed in a Brewfile.

**bundle dump**
> Export installed packages to a Brewfile.

**gc**
> Garbage collect unused store entries.

**reset**
> Uninstall all packages.

**zbx**
> Run a package without creating system links.

# DESCRIPTION

**zerobrew** (`zb`) is a high-performance reimplementation of Homebrew that uses content-addressable storage and APFS clonefiles for zero-overhead copying, giving 5-20x faster installs than Homebrew on macOS. It leverages Homebrew's formula definitions and pre-built bottles, bringing a uv-style architecture to Homebrew packages.

# CAVEATS

Experimental software; recommended to run alongside Homebrew rather than as a full replacement. Works primarily with bottles (pre-built binaries), not source builds. Best performance on macOS with APFS via clonefiles.

# HISTORY

**zerobrew** was created by **Lucas Gelfond** (lucasgelfond) and is written in **Rust**.

# SEE ALSO

[brew](/man/brew)(1), [nix](/man/nix)(1)
