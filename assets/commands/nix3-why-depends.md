# TAGLINE

traces dependency relationships

# TLDR

**Show dependency path**

```nix why-depends nixpkgs#[package] nixpkgs#[dependency]```

**Show all paths**

```nix why-depends --all nixpkgs#[package] nixpkgs#[dependency]```

Show the **files** containing each reference

```nix why-depends --precise [.#package] nixpkgs#[dependency]```

Trace a **build-time** dependency

```nix why-depends --derivation nixpkgs#[package] nixpkgs#[dependency]```

# SYNOPSIS

**nix** **why-depends** [_options_] _package_ _dependency_

# PARAMETERS

_PACKAGE_
> Package (installable or store path) to analyze.

_DEPENDENCY_
> Dependency to trace.

**-a**, **--all**
> Show all paths instead of just a shortest one.

**--precise**
> Show the files in each parent that cause the dependency.

**--derivation**
> Work on store derivations to explain build-time dependencies.

**--help**
> Display help information.

# DESCRIPTION

**nix3-why-depends** is the manual page for **nix why-depends**, which shows why a package has another package in its closure. It prints a chain of store paths from package to dependency, each with a file fragment containing the reference.

The tool debugs package closures and helps find and remove unnecessary runtime dependencies.

# CAVEATS

There is no **nix3** executable: the new-CLI man pages are named nix3-_subcommand_. Use **man nix3-why-depends** or **nix why-depends --help**.

Requires the **nix-command** experimental feature (and **flakes** for flake references). Both paths are built or substituted first.

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

[nix](/man/nix)(1), [nix-why-depends](/man/nix-why-depends)(1), [nix-store](/man/nix-store)(1)

# RESOURCES

```[Source code](https://github.com/NixOS/nix)```

```[Documentation](https://nix.dev/manual/nix/latest/command-ref/new-cli/nix3-why-depends.html)```

<!-- verified: 2026-09-29 -->
