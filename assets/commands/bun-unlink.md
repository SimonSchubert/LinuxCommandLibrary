# TAGLINE

Remove symbolic package links created by bun link

# TLDR

**Unregister the current package** from the global link registry

```bun unlink```

**Unlink a specific package** from the current project

```bun unlink [package-name]```

# SYNOPSIS

**bun** **unlink** [_package-name_]

# DESCRIPTION

**bun unlink** removes symbolic links created by **bun link**. When run without arguments in a package directory, it unregisters the package from the global link registry. When run with a package name, it removes the symlink from the current project's node_modules.

This is the reverse of the `bun link` workflow used during local package development.

# SEE ALSO

[bun](/man/bun)(1), [bun-link](/man/bun-link)(1), [bun-install](/man/bun-install)(1)
