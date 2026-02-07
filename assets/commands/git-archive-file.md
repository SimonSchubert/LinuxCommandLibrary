# TAGLINE

Create uniquely named archives with branch and commit information

# TLDR

**Create archive with branch name**

```git archive-file```

**Create archive from specific branch**

```git archive-file --branch [main]```

# SYNOPSIS

**git** **archive-file** [_options_]

# PARAMETERS

**--branch** _name_
> Branch to archive.

# DESCRIPTION

**git archive-file** is a git-extras utility that automates the creation of archive files with descriptive filenames. It generates zip archives whose names include the branch name and current commit hash, ensuring each archive is uniquely identifiable.

This command simplifies the workflow of creating release snapshots and distribution packages by eliminating the need to manually construct meaningful archive names. The generated filename format typically follows patterns like "project-branch-commithash.zip", making it easy to track which code version an archive contains.

The tool is particularly valuable in continuous integration pipelines and release processes where automated, uniquely-named artifact generation is required.

# SEE ALSO

[git-archive](/man/git-archive)(1), [git-extras](/man/git-extras)(1)

