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

# SEE ALSO

[bun](/man/bun)(1), [bun-rm](/man/bun-rm)(1), [bun-install](/man/bun-install)(1)
