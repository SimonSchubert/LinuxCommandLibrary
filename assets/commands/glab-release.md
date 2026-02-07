# TAGLINE

Manage GitLab project releases

# TLDR

**List releases**

```glab release list```

**Create release**

```glab release create [tag]```

**Create with notes**

```glab release create [tag] -n "[notes]"```

**Create with assets**

```glab release create [tag] [file1] [file2]```

**View release**

```glab release view [tag]```

**Delete release**

```glab release delete [tag]```

# SYNOPSIS

**glab** **release** _command_ [_options_]

# SUBCOMMANDS

**list**
> List releases.

**create**
> Create release.

**view**
> View release.

**delete**
> Delete release.

**upload**
> Upload assets.

**download**
> Download assets.

# PARAMETERS

**-n**, **--notes** _text_
> Release notes.

**-N**, **--notes-file** _file_
> Read notes from file.

**--ref** _ref_
> Git ref for release.

# DESCRIPTION

**glab release** manages GitLab project releases from the command line. It provides subcommands for creating releases, uploading binary assets, writing release notes, and managing existing releases.

# SEE ALSO

[glab](/man/glab)(1), [git-tag](/man/git-tag)(1)
