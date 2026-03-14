# TAGLINE

Export the current HEAD of the git repository to a zip archive

# TLDR

**Create archive of current branch**

```git archive-file```

# SYNOPSIS

**git** **archive-file**

# DESCRIPTION

**git archive-file** is a git-extras utility that exports the current HEAD of the repository into a zip archive with a descriptive filename. The generated filename includes the repository name and branch name (e.g., "project.main.zip"), or on a detached HEAD such as a tag, uses the tag name (e.g., "project.1.0.0.zip").

The command takes no arguments or options. It always archives the current HEAD and writes the zip file to the current directory.

As of git-extras 6.4, the assumed default branch name changed from master to main.

# SEE ALSO

[git-archive](/man/git-archive)(1), [git-extras](/man/git-extras)(1)
