# TLDR

**Show dependency path**

```nix3 why-depends nixpkgs#[package] nixpkgs#[dep]```

**Show all paths**

```nix3 why-depends --all [pkg] [dep]```

# SYNOPSIS

**nix3** **why-depends** [_options_] _package_ _dependency_

# PARAMETERS

_PACKAGE_
> Package to analyze.

_DEPENDENCY_
> Dependency to trace.

**--all**
> Show all paths.

**--help**
> Display help information.

# DESCRIPTION

**nix3 why-depends** traces dependency relationships. Shows why packages depend on others.

The tool debugs package closures. Helps reduce unnecessary dependencies.

nix3 why-depends traces deps.

# CAVEATS

Alias for nix why-depends. Closure analysis. Evaluation required.

# HISTORY

nix3 why-depends is part of **Nix 3.x** for debugging dependency graphs.

# SEE ALSO

[nix](/man/nix)(1), [nix-why-depends](/man/nix-why-depends)(1), [nix-store](/man/nix-store)(1)

