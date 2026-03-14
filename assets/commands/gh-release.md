# TAGLINE

Manage GitHub releases and distribution assets

# TLDR

**List releases**

```gh release list```

**Create a release**

```gh release create [tag]```

**Create with title and notes**

```gh release create [tag] -t "[title]" -n "[notes]"```

**Create with assets**

```gh release create [tag] [file1] [file2]```

**Create draft release**

```gh release create [tag] --draft```

**Download release assets**

```gh release download [tag]```

**View a release**

```gh release view [tag]```

**Delete a release**

```gh release delete [tag]```

# SYNOPSIS

**gh** **release** _command_ [_options_]

# SUBCOMMANDS

**list**
> List releases.

**create**
> Create a release.

**view**
> View a release.

**download**
> Download assets.

**delete**
> Delete a release.

**upload**
> Upload assets.

**edit**
> Edit a release.

# PARAMETERS

**-t**, **--title** _title_
> Release title.

**-n**, **--notes** _notes_
> Release notes.

**-F**, **--notes-file** _file_
> Read notes from file.

**--draft**
> Create as draft.

**--prerelease**
> Mark as prerelease.

**--generate-notes**
> Auto-generate notes from commits and PRs.

**--target** _branch_
> Target branch or commit SHA for tag creation.

**--latest**
> Mark as latest release.

**--verify-tag**
> Abort if tag does not already exist.

**-R**, **--repo** _OWNER/REPO_
> Select a different repository.

**-p**, **--pattern** _pattern_
> Download only assets matching glob pattern.

**--archive** _format_
> Download source archive (zip or tar.gz).

**--clobber**
> Overwrite existing assets of the same name (upload).

# DESCRIPTION

**gh release** manages GitHub releases for versioned software distribution. Releases package git tags with release notes and downloadable binary assets, providing an official distribution mechanism.

The command supports creating releases from existing tags or creating tags automatically. Release notes can be written manually, loaded from files, or auto-generated from commit messages and merged pull requests using the --generate-notes flag. Assets like compiled binaries, packages, and archives can be uploaded during creation or added later.

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1)
