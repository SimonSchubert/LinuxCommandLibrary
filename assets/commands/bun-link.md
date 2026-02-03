# TLDR

**Link the current package** globally

```bun link```

**Link a globally linked package** to the current project

```bun link [package-name]```

# SYNOPSIS

**bun** **link** [_package-name_]

# DESCRIPTION

**bun link** creates symbolic links for package development. When run without arguments in a package directory, it registers the package globally. When run with a package name, it links that globally registered package into the current project's node_modules.

This is useful for developing and testing local packages without publishing them.

# CAVEATS

Linked packages must be built before linking if they require a build step. Changes to the linked package are immediately reflected in projects using it.

# SEE ALSO

[bun](/man/bun)(1), [bun-unlink](/man/bun-unlink)(1), [npm-link](/man/npm-link)(1)
