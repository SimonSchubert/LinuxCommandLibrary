# TAGLINE

shows why a package depends on another

# TLDR

**Show** a dependency path from one package to another

```nix why-depends nixpkgs#[hello] nixpkgs#[glibc]```

Show **all** paths, not just the shortest

```nix why-depends --all nixpkgs#[package] nixpkgs#[dependency]```

Show the **files** that cause each reference

```nix why-depends --precise nixpkgs#[package] nixpkgs#[dependency]```

Explain a **build-time** dependency

```nix why-depends --derivation nixpkgs#[package] nixpkgs#[dependency]```

Use **store paths** directly

```nix why-depends [/nix/store/...-package] [/nix/store/...-dependency]```

Find why the **current NixOS system** pulls in a package

```nix why-depends /run/current-system nixpkgs#[package]```

# SYNOPSIS

**nix** **why-depends** [_options_] _package_ _dependency_

# PARAMETERS

_PACKAGE_
> Installable or store path whose closure is inspected.

_DEPENDENCY_
> Installable or store path to find in that closure.

**-a**, **--all**
> Show all edges in the dependency graph leading from package to dependency, rather than just a shortest path.

**--precise**
> For each edge, show the files in the parent that cause the dependency.

**--derivation**
> Operate on the store derivations (build-time dependencies) rather than their outputs.

**--help**
> Display help information.

# DESCRIPTION

**nix why-depends** explains why store path _package_ has _dependency_ in its closure. Nix detects runtime references by scanning outputs for the hash parts of store paths, so an unexpected reference (for example a compiler path left in a binary) bloats the closure.

The command prints a shortest chain of references from package to dependency, and for each step a file fragment containing the reference to the next store path. With **--derivation** it traces build-time dependencies between .drv files instead.

# CAVEATS

Part of the experimental new Nix CLI: requires the **nix-command** experimental feature (and **flakes** for flake references). Both paths must be built or substituted, which may trigger downloads or builds. If there is no dependency, it only reports that package does not depend on dependency.

# HISTORY

**nix why-depends** was added with the new **nix** command in **Nix 2.0** (2018).

# INSTALL

```apt: sudo apt install nix-bin```

```dnf: sudo dnf install nix```

```pacman: sudo pacman -S nix```

```apk: sudo apk add nix```

```zypper: sudo zypper install nix```

```nix: nix profile install nixpkgs#nix```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[nix](/man/nix)(1), [nix-store](/man/nix-store)(1), [nix-build](/man/nix-build)(1), [nix3-why-depends](/man/nix3-why-depends)(1)

# RESOURCES

```[Source code](https://github.com/NixOS/nix)```

```[Documentation](https://nix.dev/manual/nix/latest/command-ref/new-cli/nix3-why-depends.html)```

<!-- verified: 2026-09-29 -->
