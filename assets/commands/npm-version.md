# TLDR

**Bump patch version**

```npm version patch```

**Bump minor version**

```npm version minor```

**Bump major version**

```npm version major```

**Set specific version**

```npm version [1.2.3]```

**Prerelease version**

```npm version prerelease```

**No git tag**

```npm version patch --no-git-tag-version```

# SYNOPSIS

**npm** **version** [_version_] [_options_]

# PARAMETERS

_VERSION_
> Version or increment type.

**patch**
> Increment patch (0.0.x).

**minor**
> Increment minor (0.x.0).

**major**
> Increment major (x.0.0).

**--no-git-tag-version**
> Don't create git tag.

**--help**
> Display help information.

# DESCRIPTION

**npm version** bumps package version. Updates package.json and creates git tag.

The command manages version numbers. Follows semver conventions.

npm version bumps versions.

# CAVEATS

Creates git commit/tag by default. Working directory must be clean.

# HISTORY

npm version provides **semver version management** with git integration.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1), [semver](/man/semver)(1)

