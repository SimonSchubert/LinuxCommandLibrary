# TAGLINE

Show locked files

# TLDR

**Show locked files**

```git locked```

# SYNOPSIS

**git locked**

# DESCRIPTION

**git locked** displays files currently marked as locked. It reads the `.gitlock` file and lists all files that have been locked using `git lock`, providing visibility into which files are currently claimed by team members.

This helps avoid conflicts on binary or other non-mergeable files where simultaneous edits would be problematic.

# CAVEATS

Part of git-extras package. Shows advisory locks only. Locks are repository-specific.

# HISTORY

git locked is part of **git-extras**, complementing git lock to provide advisory file locking.

# SEE ALSO

[git-lock](/man/git-lock)(1), [git-unlock](/man/git-unlock)(1)
