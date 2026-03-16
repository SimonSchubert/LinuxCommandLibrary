# TAGLINE

Copy files preserving git history

# TLDR

**Copy a file keeping its history**

```git cp [source_file] [destination_file]```

**Copy a file to a different directory keeping its history**

```git cp [path/to/source] [path/to/destination]```

# SYNOPSIS

**git-cp** _current_filename_ _destination_filename_

# DESCRIPTION

**git cp** is a command from git-extras that copies a file while preserving its Git history. This allows merge conflict handling on the copied file.

Unlike a simple filesystem copy followed by git add (which creates a new file with no history), git cp leverages Git's ability to detect file copies through content similarity. When viewing the history of the copied file with git log --follow --find-copies, Git can trace back to the original file's commits.

This is particularly useful when creating new files based on templates or when splitting functionality from one file into multiple files while maintaining attribution and history.

# SEE ALSO

[git-mv](/man/git-mv)(1), [git-extras](/man/git-extras)(1)

