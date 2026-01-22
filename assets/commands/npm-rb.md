# TLDR

**Rebuild all packages**

```npm rb```

**Rebuild specific package**

```npm rb [package-name]```

**Rebuild global packages**

```npm rb -g```

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

**npm rb** rebuilds packages with native addons. Alias for npm rebuild.

The command recompiles binaries. Useful after Node.js version change.

npm rb rebuilds native modules.

# CAVEATS

Alias for npm rebuild. Affects native addons. May require build tools.

# HISTORY

npm rb provides **native module rebuilding** when Node.js version or system changes.

# SEE ALSO

[npm](/man/npm)(1), [npm-rebuild](/man/npm-rebuild)(1), [node-gyp](/man/node-gyp)(1)

