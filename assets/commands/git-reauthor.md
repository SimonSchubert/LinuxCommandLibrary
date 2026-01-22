# TLDR

**Change author of commits**

```git reauthor --old-email [old@email.com] --correct-email [new@email.com]```

**Change name and email**

```git reauthor --old-email [old@email.com] --correct-name "[New Name]" --correct-email [new@email.com]```

**Reauthor specific range**

```git reauthor --old-email [old@email.com] --correct-email [new@email.com] [commit-range]```

# SYNOPSIS

**git reauthor** [_options_] [_range_]

# PARAMETERS

**--old-email** _EMAIL_
> Email to match.

**--correct-email** _EMAIL_
> New email address.

**--correct-name** _NAME_
> New author name.

_RANGE_
> Commit range to process.

**--help**
> Display help information.

# DESCRIPTION

**git reauthor** rewrites commit history to change author information. It updates author names and emails throughout the commit history for matching commits.

The command is useful for fixing incorrect attribution or consolidating identities. It rewrites history, so should only be used on unshared branches.

git reauthor fixes authorship across repository history.

# CAVEATS

Part of git-extras package. **Rewrites history.** Don't use on shared branches. All commit hashes change.

# HISTORY

git reauthor is part of **git-extras**, providing a convenient wrapper for the common task of fixing author information.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-filter-repo](/man/git-filter-repo)(1)
