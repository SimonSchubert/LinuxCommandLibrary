# TAGLINE

List installed packages

# TLDR

**List installed packages**

```bun pm ls```

**List all packages** including nested dependencies

```bun pm ls --all```

# SYNOPSIS

**bun** **pm** **ls** [_options_]

# PARAMETERS

**--all**
> Show all dependencies including nested.

# DESCRIPTION

**bun pm ls** lists packages installed in the current project. By default it shows top-level dependencies. Use **--all** to display the full dependency tree including transitive dependencies.

This command is equivalent to **bun list**.

# INSTALL

```pacman: sudo pacman -S bun```

```brew: brew install bun```

```nix: nix profile install nixpkgs#bun```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bun](/man/bun)(1), [bun-pm](/man/bun-pm)(1), [bun-list](/man/bun-list)(1)

# RESOURCES

```[Source code](https://github.com/oven-sh/bun)```

```[Homepage](https://bun.sh)```

```[Documentation](https://bun.sh/docs)```

<!-- verified: 2026-06-22 -->
