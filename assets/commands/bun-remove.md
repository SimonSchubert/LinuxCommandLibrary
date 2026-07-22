# TAGLINE

Remove packages from a project

# TLDR

**Remove a package**

```bun remove [package]```

**Remove multiple packages**

```bun remove [package1] [package2]```

**Remove a global package**

```bun remove -g [package]```

# SYNOPSIS

**bun** **remove** [_options_] _packages..._

# PARAMETERS

**-g**, **--global**
> Remove from global packages.

**-d**, **--dev**
> Remove from devDependencies.

# DESCRIPTION

**bun remove** uninstalls packages from the project and removes them from package.json. This is equivalent to **npm uninstall** or **yarn remove**.

# INSTALL

```pacman: sudo pacman -S bun```

```brew: brew install bun```

```nix: nix profile install nixpkgs#bun```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bun](/man/bun)(1), [bun-rm](/man/bun-rm)(1), [bun-install](/man/bun-install)(1)

# RESOURCES

```[Source code](https://github.com/oven-sh/bun)```

```[Homepage](https://bun.sh)```

```[Documentation](https://bun.sh/docs)```

<!-- verified: 2026-06-22 -->
