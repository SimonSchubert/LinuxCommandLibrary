# TLDR

**Remove file from entire history**

```git obliterate [filename]```

# SYNOPSIS

**git** **obliterate** _filename_

# DESCRIPTION

**git obliterate** completely removes a file from the entire Git history. Part of git-extras. Rewrites history to remove all traces of the file.

# CAVEATS

This rewrites history and changes all commit hashes. Coordinate with collaborators before using on shared branches.

# SEE ALSO

[git-filter-branch](/man/git-filter-branch)(1), [git-extras](/man/git-extras)(1)

