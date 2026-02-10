# TAGLINE

shows why a package is installed

# TLDR

**Explain why package installed**

```npm why [package-name]```

**JSON output**

```npm why [package-name] --json```

# SYNOPSIS

**npm** **why** [_package_]

# PARAMETERS

_PACKAGE_
> Package to explain.

**--json**
> JSON output.

**--help**
> Display help information.

# DESCRIPTION

**npm why** shows why a package is installed. Alias for npm explain.

The command traces dependency paths. Shows all routes to package.

# CAVEATS

Alias for npm explain. Shows all dependency paths. Requires installed package.

# HISTORY

npm why provides **dependency tracing** to understand package relationships.

# SEE ALSO

[npm](/man/npm)(1), [npm-explain](/man/npm-explain)(1), [npm-ls](/man/npm-ls)(1)

