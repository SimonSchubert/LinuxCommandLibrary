# TAGLINE

removes a tag from one or more builds

# TLDR

**Remove tag** from a build

```koji untag-build [tag] [nvr]```

Untag **all versions** of a package

```koji untag-build [tag] [package] --all```

Untag all except **latest version**

```koji untag-build [tag] [package] --non-latest```

**Test mode** (dry run)

```koji untag-build [tag] [nvr] --test```

Untag with **verbose** output

```koji untag-build [tag] [nvr] --verbose```

Display **help**

```koji untag-build --help```

# SYNOPSIS

**koji untag-build** [_options_] _tag_ _nvr_ [_nvr_...]

# DESCRIPTION

**koji untag-build** removes a tag from one or more builds. This is used to remove packages from repositories or clean up old builds.

# PARAMETERS

**tag**
> The tag to remove from builds

**nvr**
> Build specified by Name-Version-Release

**--all**
> Untag all versions of the package in this tag

**--non-latest**
> Untag all versions except the latest

**-n, --test**
> Test mode - show what would be done without doing it

**-v, --verbose**
> Print verbose output

**-h, --help**
> Display help information

# CAVEATS

Untagging builds may affect repository contents. Use `--test` to preview changes before applying them.

# SEE ALSO

[koji](/man/koji)(1), [koji-tag-build](/man/koji-tag-build)(1)
