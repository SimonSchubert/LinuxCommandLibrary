# TAGLINE

Symlink local packages for development

# TLDR

**Register the current package** as a globally linked package

```bun link```

**Link a globally registered package** into the current project

```bun link [package-name]```

# SYNOPSIS

**bun** **link** [_package-name_]

# DESCRIPTION

**bun link** creates symbolic links for local package development. The workflow has two steps:

1. In the package directory, run **bun link** (without arguments) to register it as a globally available linked package.
2. In the consuming project, run **bun link [package-name]** to create a symlink from node_modules to the registered package.

This is useful for developing and testing local packages without publishing them to a registry. Changes to the source package are immediately reflected in any project that links to it.

# CAVEATS

Linked packages must be built before linking if they require a build step. Changes to the linked package are immediately reflected in projects using it. Links are specific to the Bun package manager and are not shared with npm or yarn link registrations.

# SEE ALSO

[bun](/man/bun)(1), [bun-unlink](/man/bun-unlink)(1), [bun-install](/man/bun-install)(1), [npm-link](/man/npm-link)(1)
