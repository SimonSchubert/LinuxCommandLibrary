# TLDR

**Show why a package is installed**

```bun why [package]```

# SYNOPSIS

**bun** **why** _package_

# DESCRIPTION

**bun why** shows why a specific package is installed in your project. It displays the dependency chain that leads to the package, showing which packages depend on it directly or transitively.

This is useful for understanding why a package appears in your node_modules, especially for transitive dependencies.

# SEE ALSO

[bun](/man/bun)(1), [bun-list](/man/bun-list)(1), [npm-explain](/man/npm-explain)(1)
