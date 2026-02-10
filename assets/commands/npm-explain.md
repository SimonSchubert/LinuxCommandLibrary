# TAGLINE

shows why a package is installed

# TLDR

**Explain why package installed**

```npm explain [package-name]```

**Explain with JSON output**

```npm explain [package-name] --json```

**Explain specific version**

```npm explain [package@version]```

# SYNOPSIS

**npm** **explain** [_package_]

# PARAMETERS

_PACKAGE_
> Package to explain.

**--json**
> JSON output format.

**--help**
> Display help information.

# DESCRIPTION

**npm explain** shows why a package is installed. Displays dependency chain.

The command traces dependency tree. Shows all paths to the package.

# CAVEATS

Alias: npm why. Shows all dependency paths. Requires installed package.

# HISTORY

npm explain was added to help understand **dependency relationships** in complex projects.

# SEE ALSO

[npm](/man/npm)(1), [npm-ls](/man/npm-ls)(1), [npm-why](/man/npm-why)(1)

