# TAGLINE

shows package registry information

# TLDR

**View package info**

```npm view [package]```

**View specific field**

```npm view [package] [version]```

**View all versions**

```npm view [package] versions```

**View dependencies**

```npm view [package] dependencies```

**JSON output**

```npm view [package] --json```

**View dist-tags**

```npm view [package] dist-tags```

# SYNOPSIS

**npm** **view** [_package_] [_field_]

# PARAMETERS

_PACKAGE_
> Package name.

_FIELD_
> Field to display.

**versions**
> All versions.

**dependencies**
> Package deps.

**--json**
> JSON output.

**--help**
> Display help information.

# DESCRIPTION

**npm view** shows package registry information. Displays metadata from npm.

The command queries registry. Shows versions, dependencies, and more.

# CAVEATS

Alias: npm info, npm show. Network required. Registry data.

# HISTORY

npm view provides **registry inspection** for package metadata and versions.

# SEE ALSO

[npm](/man/npm)(1), [npm-search](/man/npm-search)(1), [npm-pack](/man/npm-pack)(1)

