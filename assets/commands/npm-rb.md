# TAGLINE

Rebuild packages with native addons

# TLDR

**Rebuild all packages**

```npm rb```

**Rebuild specific package**

```npm rb [package-name]```

**Rebuild global packages**

```npm rb -g```

**Rebuild multiple specific packages**

```npm rb [package1] [package2]```

# SYNOPSIS

**npm** **rb** [_packages_]

# PARAMETERS

_PACKAGES_
> Packages to rebuild.

**-g**
> Rebuild global packages.

**--help**
> Display help information.

# DESCRIPTION

**npm rb** is an alias for **npm rebuild**. It recompiles native addon modules (C/C++ bindings) using node-gyp.

Commonly needed after upgrading Node.js versions, as native addons are compiled against a specific Node.js ABI. Also useful after manually modifying a package's source code in node_modules.

# CAVEATS

Alias for npm rebuild. Requires build tools (make, gcc/g++ or equivalent) to be installed. Only affects packages with native addons; pure JavaScript packages are unaffected.

# SEE ALSO

[npm](/man/npm)(1), [npm-rebuild](/man/npm-rebuild)(1), [npm-install](/man/npm-install)(1), [node-gyp](/man/node-gyp)(1)

