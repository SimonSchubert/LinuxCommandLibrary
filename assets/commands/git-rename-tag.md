# TAGLINE

Rename a Git tag locally and on the remote

# TLDR

**Rename a tag**

```git rename-tag [old_name] [new_name]```

# SYNOPSIS

**git** **rename-tag** _old_name_ _new_name_

# DESCRIPTION

**git rename-tag** renames a tag both locally and on the remote. Part of git-extras, it creates the new tag pointing at the old tag's commit, deletes the old tag locally, then pushes the new tag and the old tag's deletion to `origin`.

# CAVEATS

Always pushes to the remote named `origin`; it does not accept a different remote as an argument.

# SEE ALSO

[git-tag](/man/git-tag)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-rename-tag)```

<!-- verified: 2026-07-17 -->
