# TAGLINE

symlinks packages for local development

# TLDR

**Link current package globally**

```npm link```

**Link to global package**

```npm link [package-name]```

**Link local dependency**

```npm link [../path/to/package]```

**Unlink package**

```npm unlink [package-name]```

# SYNOPSIS

**npm** **link** [_package_]

# PARAMETERS

_PACKAGE_
> Package name or path.

**--help**
> Display help information.

# DESCRIPTION

**npm link** symlinks packages for local development. Enables testing packages locally.

The command creates global symlink. Then link into projects for development.

# CAVEATS

Creates symlinks. Can cause issues with bundlers. Use carefully.

# HISTORY

npm link enables **local package development** by creating symlinks between packages.

# SEE ALSO

[npm](/man/npm)(1), [npm-install](/man/npm-install)(1), [npm-unlink](/man/npm-unlink)(1)

