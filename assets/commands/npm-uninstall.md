# TAGLINE

removes packages from node_modules and optionally from package

# TLDR

**Uninstall package**

```npm uninstall [package-name]```

**Uninstall and remove from dependencies**

```npm uninstall --save [package-name]```

**Uninstall global package**

```npm uninstall -g [package-name]```

**Uninstall multiple packages**

```npm uninstall [pkg1] [pkg2]```

# SYNOPSIS

**npm** **uninstall** [_packages_...] [_options_]

# PARAMETERS

**-g**, **--global**
> Uninstall global package.

**--save**
> Remove from dependencies.

**--save-dev**
> Remove from devDependencies.

# DESCRIPTION

**npm uninstall** removes packages from node_modules and optionally from package.json. Also removes unused dependencies. Aliases: npm rm, npm remove, npm un.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1)

