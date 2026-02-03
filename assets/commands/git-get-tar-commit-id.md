# TLDR

**Extract commit ID from archive**

```git get-tar-commit-id < [archive.tar]```

# SYNOPSIS

**git** **get-tar-commit-id** < _archive_

# DESCRIPTION

**git get-tar-commit-id** extracts the commit ID from a tar archive created by git archive. The commit ID is stored in the archive's pax extended header.

# SEE ALSO

[git-archive](/man/git-archive)(1)

