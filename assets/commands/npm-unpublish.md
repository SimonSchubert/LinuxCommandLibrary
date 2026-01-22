# TLDR

**Unpublish package version**

```npm unpublish [package]@[version]```

**Unpublish entire package**

```npm unpublish [package] --force```

**Dry run**

```npm unpublish [package]@[version] --dry-run```

# SYNOPSIS

**npm** **unpublish** [_package_] [_options_]

# PARAMETERS

_PACKAGE_
> Package name and optional version.

**--force**
> Force unpublish all versions.

**--dry-run**
> Preview without unpublishing.

**--help**
> Display help information.

# DESCRIPTION

**npm unpublish** removes a package from registry. Use with extreme caution.

The command deletes published packages. Limited by npm policies.

npm unpublish removes packages.

# CAVEATS

72-hour limit on new packages. Can break dependents. Use deprecate instead.

# HISTORY

npm unpublish provides **package removal** with restrictions to prevent ecosystem breakage.

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1), [npm-deprecate](/man/npm-deprecate)(1)

