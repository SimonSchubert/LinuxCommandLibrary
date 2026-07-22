# TAGLINE

Explain why a package is installed

# TLDR

**Explain** why a package is installed

```yarn why [package]```

**Trace** a specific version of a package (Yarn Berry)

```yarn why [package@version]```

**Show full recursive reasoning** (Yarn Berry)

```yarn why [package] -R```

**JSON output** for scripting (Yarn Berry)

```yarn why [package] --json```

# SYNOPSIS

**yarn why** _package_ [_options_]

# DESCRIPTION

**yarn why** explains why a given package is installed in the current project. It walks the dependency tree and prints the chain of packages that ultimately require the target, plus a hash/checksum and a disk-size estimate.

It is useful for diagnosing why an unwanted transitive dependency exists, for spotting version conflicts (the same package pinned through different paths), and for auditing **node_modules** before publishing.

# PARAMETERS

_package_
> Package name (or **name@version** in Yarn Berry) to investigate.

**--json**
> Yarn Berry only: emit machine-readable JSON.

**-R**, **--recursive**
> Yarn Berry only: print the full transitive dependency tree, not just the first reason.

# CAVEATS

Output format and accepted flags differ between **Yarn Classic (1.x)** and **Yarn Berry (2+)**. The recursive and JSON options are Berry extensions not present in 1.x. The command needs an installed project (it reads **node_modules** / **.pnp.cjs**), not just **package.json**.

# INSTALL

```pacman: sudo pacman -S yarn```

```apk: sudo apk add yarn```

```zypper: sudo zypper install yarn```

```brew: brew install yarn```

```nix: nix profile install nixpkgs#yarn```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[yarn](/man/yarn)(1), [npm-explain](/man/npm-explain)(1)
