# TAGLINE

Copy files preserving git history

# TLDR

**Copy file with history**

```git cp [source] [dest]```

# SYNOPSIS

**git** **cp** _source_ _dest_

# DESCRIPTION

**git cp** is a convenience command from git-extras that copies a file while attempting to preserve its Git history. It works by copying the file and then using Git's rename detection to maintain a link to the original file's history.

Unlike a simple filesystem copy followed by git add (which creates a new file with no history), git cp leverages Git's ability to detect file copies through content similarity. When viewing the history of the copied file with git log --follow --find-copies, Git can trace back to the original file's commits.

This is particularly useful when creating new files based on templates or when splitting functionality from one file into multiple files while maintaining attribution and history. The command essentially performs a cp followed by git add, but the resulting commit structure helps Git's copy detection algorithms work effectively.

# SEE ALSO

[git-mv](/man/git-mv)(1), [git-extras](/man/git-extras)(1)

