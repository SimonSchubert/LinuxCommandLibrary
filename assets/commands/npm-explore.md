# TAGLINE

opens a subshell in a package directory

# TLDR

**Explore package directory**

```npm explore [package-name]```

**Run command in package**

```npm explore [package-name] -- [ls]```

**Explore and run script**

```npm explore [package-name] -- npm run build```

# SYNOPSIS

**npm** **explore** _package_ [-- _command_]

# PARAMETERS

_PACKAGE_
> Package to explore.

_COMMAND_
> Command to run in package dir.

**--help**
> Display help information.

# DESCRIPTION

**npm explore** opens a subshell in a package directory. Allows inspection of installed packages.

The command changes to node_modules/package. Can run commands within package.

# CAVEATS

Opens subshell. Exit to return. Use carefully with commands.

# HISTORY

npm explore provides **direct access** to installed package directories for debugging.

# SEE ALSO

[npm](/man/npm)(1), [npm-ls](/man/npm-ls)(1), [npm-edit](/man/npm-edit)(1)

