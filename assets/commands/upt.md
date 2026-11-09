# TAGLINE

Unified command interface for native package managers

# TLDR

**Install a package**

```upt install [package]```

**Remove a package**

```upt remove [package]```

**Upgrade one package**

```upt upgrade [package]```

**Upgrade all packages**

```upt upgrade```

**Update the package index**

```upt update```

**Search for a package**

```upt search [query]```

**List installed packages**

```upt list```

**Show package information**

```upt info [package]```

**Force a specific package manager**

```UPT_TOOL=[brew] upt install [package]```

# SYNOPSIS

**upt** _command_ [_options_] [_package_]

# PARAMETERS

**install**
> Install a package.

**remove**, **uninstall**
> Remove a package.

**upgrade** [_PACKAGE_]
> Upgrade one package, or all packages when none is given.

**update**
> Update the package index.

**search**
> Find packages.

**list**
> Show installed packages.

**info**, **show**
> Show package details.

# DESCRIPTION

**upt** (Universal Package-management Tool) provides a single command-line interface that wraps the native package manager on each system. It identifies the operating system and runs the appropriate tool, such as apt, dnf, pacman, apk, zypper, brew or winget.

Because it delegates all work to the native package manager, upt behaves like an adaptive alias. It can also act as another tool: copied or renamed to **brew**, **pacman** or **emerge**, it accepts that tool's syntax.

Set **UPT_TOOL** to choose the package manager explicitly, and **UPT_DRY_RUN** to 1 or true to print the resulting command without running it.

# CAVEATS

The underlying package manager must be installed, and root privileges may be required depending on it. Not every operation exists for every tool.

# HISTORY

**upt** is written in Rust by sigoden and distributed through crates.io and GitHub releases.

# SEE ALSO

[apt](/man/apt)(1), [pacman](/man/pacman)(1), [brew](/man/brew)(1)

# RESOURCES

```[Source code](https://github.com/sigoden/upt)```

<!-- verified: 2026-11-09 -->
