# TAGLINE

Manage GitLab project releases

# TLDR

**List releases**

```glab release list```

**Create release**

```glab release create [tag]```

**Create with notes**

```glab release create [tag] -N "[notes]"```

**Create with assets**

```glab release create [tag] [file1] [file2]```

**Create from a specific ref**

```glab release create [tag] --ref [commit-sha]```

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
> Create a new release.

**view**
> View release details.

**delete**
> Delete a release.

**upload**
> Upload assets to an existing release.

**download**
> Download release assets.

# PARAMETERS (create)

**-n**, **--name** _text_
> Release title/name.

**-N**, **--notes** _text_
> Release notes (Markdown supported).

**-F**, **--notes-file** _file_
> Read release notes from a file, or `-` for stdin.

**-r**, **--ref** _ref_
> Commit, tag, or branch to create the release from.

**-m**, **--milestone** _milestone_
> Associate a milestone; repeatable for multiple milestones.

**-T**, **--tag-message** _text_
> Message used when creating an annotated tag, if the tag doesn't already exist.

**-D**, **--released-at** _datetime_
> ISO 8601 date/time to record as the release date.

**-a**, **--assets-links** _json_
> JSON array of extra asset links to attach to the release.

**--no-close-milestone**
> Don't close the associated milestone(s) after creating the release.

**--no-update**
> Fail instead of updating if a release for the tag already exists.

**--use-package-registry**
> Upload the given assets to the generic package registry instead of as release links.

**--package-name** _name_
> Package name to use with **--use-package-registry**.

**-R**, **--repo** _OWNER/REPO_
> Select another repository.

# DESCRIPTION

**glab release** manages GitLab project releases from the command line. It provides subcommands for creating releases, uploading binary assets, writing release notes, and managing existing releases.

# SEE ALSO

[glab](/man/glab)(1), [git-tag](/man/git-tag)(1)

# RESOURCES

```[Documentation](https://docs.gitlab.com/cli/release/)```

```[Source code](https://gitlab.com/gitlab-org/cli)```

<!-- verified: 2026-07-17 -->
