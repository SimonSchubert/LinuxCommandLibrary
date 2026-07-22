# TAGLINE

removes a package from registry

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
> Required to unpublish an entire package (all versions) instead of a single version.

**--dry-run**
> Show what would be removed without actually unpublishing.

**--workspace** _NAME_
> Run the command in the context of the specified workspace.

**--workspaces**
> Run the command across all configured workspaces.

**--help**
> Display help information.

# DESCRIPTION

**npm unpublish** removes a published package or version from the npm registry. Because removing a package can break consumers anywhere in the dependency graph, the registry restricts what may be removed and when.

Within **72 hours** of publication, you may freely unpublish a version or the entire package. After that, the registry only allows unpublishing if no other package depends on it and the package owner is the sole maintainer; otherwise contact npm support. After unpublishing an entire package, the same name cannot be republished for **24 hours**, and any unpublished _name@version_ pair can never be reused.

# CAVEATS

May break consumers that depend on the version being removed. Use **npm deprecate** instead when you only want to discourage use without deleting the artifact.

# HISTORY

npm unpublish provides **package removal** with restrictions to prevent ecosystem breakage.

# INSTALL

```pacman: sudo pacman -S npm```

```apk: sudo apk add npm```

```brew: brew install npm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[npm](/man/npm)(1), [npm-publish](/man/npm-publish)(1), [npm-deprecate](/man/npm-deprecate)(1)

