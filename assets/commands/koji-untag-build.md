# TAGLINE

Remove a tag from one or more Koji builds

# TLDR

**Remove tag** from a build

```koji untag-build [tag] [name-version-release]```

**Remove tag** from multiple builds

```koji untag-build [tag] [nvr1] [nvr2]```

Untag **all versions** of a package

```koji untag-build [tag] [package] --all```

Untag all except **latest version**

```koji untag-build [tag] [package] --non-latest```

**Dry run** to preview changes

```koji untag-build [tag] [nvr] --test```

Untag all but the latest build of **every package** in a tag

```koji untag-build [tag] --non-latest --force```

Untag with **verbose** output

```koji untag-build [tag] [nvr] --verbose```

# SYNOPSIS

**koji untag-build** [_options_] _tag_ _pkg_ [_pkg_...]

# DESCRIPTION

**koji untag-build** removes a tag from one or more builds in the Koji build system. Builds can be specified by name-version-release (NVR) or by package name when combined with `--all` or `--non-latest`. This is used to remove packages from repositories or clean up old builds.

# PARAMETERS

**--all**
> Untag all versions of the package in this tag.

**--non-latest**
> Untag all versions except the latest.

**-n**, **--test**
> Test mode -- show what would be done without actually doing it.

**-v**, **--verbose**
> Print verbose output.

**--force**
> Force the operation. With **--non-latest**, allows omitting the package names to act on the whole tag.

**-h**, **--help**
> Display help information.

# CAVEATS

Untagging builds may affect repository contents and downstream consumers. Use `--test` to preview changes before applying them. Requires appropriate Koji permissions.

# SEE ALSO

[koji](/man/koji)(1), [koji-tag-build](/man/koji-tag-build)(1), [koji-build](/man/koji-build)(1)

# RESOURCES

```[Source code](https://forge.fedoraproject.org/koji/koji)```

```[Homepage](https://koji.build/)```

```[Documentation](https://docs.pagure.org/koji/)```

<!-- verified: 2026-11-09 -->
