# TAGLINE

shows why a package depends on another

# TLDR

**Show dependency path**

```nix why-depends nixpkgs#[hello] nixpkgs#[glibc]```

**Show all paths**

```nix why-depends --all nixpkgs#[package] nixpkgs#[dep]```

**From derivation files**

```nix why-depends [/nix/store/...package] [/nix/store/...dep]```

# SYNOPSIS

**nix** **why-depends** [_options_] _package_ _dependency_

# PARAMETERS

_PACKAGE_
> Package to analyze.

_DEPENDENCY_
> Dependency to find.

**--all**
> Show all dependency paths.

**--help**
> Display help information.

# DESCRIPTION

**nix why-depends** shows why a package depends on another. Traces dependency paths.

The tool debugs closures. Helps understand and reduce dependencies.

# CAVEATS

Part of Nix CLI. Requires evaluation. Closure analysis.

# HISTORY

nix why-depends is part of the **new Nix CLI** for debugging dependency relationships.

# SEE ALSO

[nix](/man/nix)(1), [nix-store](/man/nix-store)(1), [nix-build](/man/nix-build)(1)

