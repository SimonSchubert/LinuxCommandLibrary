# TAGLINE

View npm registry information for a package

# TLDR

**View package info**

```npm view [package]```

**View a specific field**

```npm view [package] version```

**View all published versions**

```npm view [package] versions```

**View package dependencies**

```npm view [package] dependencies```

**View a nested field**

```npm view [package] repository.url```

**Output as JSON**

```npm view [package] --json```

**View dist-tags** (latest, next, etc.)

```npm view [package] dist-tags```

**View a specific version's info**

```npm view [package]@[2.0.0]```

**View info from a custom registry**

```npm view [package] --registry [https://registry.example.com]```

# SYNOPSIS

**npm** **view** [_package_[@_version_]] [_field_[._subfield_]...]

# PARAMETERS

_PACKAGE_
> Package name, optionally with @version or @tag.

_FIELD_
> Top-level field to display (version, dependencies, license, repository, etc.).

_FIELD.SUBFIELD_
> Nested field access (e.g., repository.url, dist.tarball).

**versions**
> List all published versions.

**dependencies**
> Show production dependencies.

**dist-tags**
> Show distribution tags.

**--json**
> Output in JSON format.

**--registry** _url_
> Query a custom registry URL.

# DESCRIPTION

**npm view** fetches and displays metadata about a package from the npm registry. It shows the full package manifest by default, or specific fields when requested.

The command supports nested field access with dot notation (e.g., `repository.url`). When a field contains an array, each element is printed on a separate line. Multiple fields can be specified to show several values at once.

Aliases: **npm info**, **npm show**.

# CAVEATS

Requires network access to query the registry. When viewing scoped packages, the scope must be included (e.g., @scope/package). Output format varies between single values and arrays. Private packages require authentication.

# HISTORY

**npm view** has been available since early versions of npm, providing command-line access to the package registry metadata that powers npm's dependency resolution.

# SEE ALSO

[npm](/man/npm)(1), [npm-search](/man/npm-search)(1), [npm-pack](/man/npm-pack)(1), [npm-install](/man/npm-install)(1), [npm-publish](/man/npm-publish)(1), [npm-ls](/man/npm-ls)(1), [npm-outdated](/man/npm-outdated)(1)

