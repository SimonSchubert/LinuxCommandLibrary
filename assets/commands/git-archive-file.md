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

**git archive-file** creates a zip archive with a filename including the branch name and commit hash. Part of git-extras. Useful for creating uniquely named release archives.

# SEE ALSO

[git-archive](/man/git-archive)(1), [git-extras](/man/git-extras)(1)

