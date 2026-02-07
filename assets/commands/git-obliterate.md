# TAGLINE

Remove file from entire history

# TLDR

**Remove file from entire history**

```git obliterate [filename]```

# SYNOPSIS

**git** **obliterate** _filename_

# DESCRIPTION

**git obliterate** completely removes a file from the entire Git history. This git-extras command rewrites every commit to erase all traces of the specified file, as if it had never been added to the repository.

The operation is useful for removing accidentally committed secrets, sensitive data, or large files that should never have been tracked. It is a convenience wrapper around `git filter-branch` or `git filter-repo`, handling the complexity of full history rewriting. After obliteration, the repository is repacked to reclaim disk space.

# CAVEATS

This rewrites history and changes all commit hashes. Coordinate with collaborators before using on shared branches.

# SEE ALSO

[git-filter-branch](/man/git-filter-branch)(1), [git-extras](/man/git-extras)(1)
