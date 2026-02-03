# TLDR

**Unlink the current package** from global registry

```bun unlink```

**Unlink a package** from the current project

```bun unlink [package-name]```

# SYNOPSIS

**bun** **unlink** [_package-name_]

# DESCRIPTION

**bun unlink** removes symbolic links created by **bun link**. When run without arguments in a package directory, it unregisters the package from the global link registry. When run with a package name, it removes the link from the current project's node_modules.

# SEE ALSO

[bun](/man/bun)(1), [bun-link](/man/bun-link)(1)
