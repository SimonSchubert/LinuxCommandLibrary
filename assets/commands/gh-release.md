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
> Auto-generate notes.

# DESCRIPTION

**gh release** manages GitHub releases. Create releases, upload assets, and manage release notes for versioned software distribution.

# SEE ALSO

[gh](/man/gh)(1), [gh-repo](/man/gh-repo)(1)

