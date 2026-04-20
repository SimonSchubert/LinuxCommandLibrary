# TAGLINE

Rewrite commit authorship history

# TLDR

**Change the email address** of matching commits

```git reauthor -o [old@email.com] -e [new@email.com]```

**Change both name and email**

```git reauthor -o [old@email.com] -n "[New Name]" -e [new@email.com]```

**Use values from `git config user.name` / `user.email`**

```git reauthor --use-config -o [old@email.com]```

**Rewrite all identities** (prompts interactively)

```git reauthor --all```

**Rewrite only the committer** (not author)

```git reauthor -o [old@email.com] -e [new@email.com] -t committer```

# SYNOPSIS

**git reauthor** [_options_]

# PARAMETERS

**-o**, **--old-email** _EMAIL_
> Email address to match on existing commits.

**-e**, **--correct-email** _EMAIL_
> Replacement email address.

**-n**, **--correct-name** _NAME_
> Replacement author/committer name.

**-c**, **--use-config**
> Take the replacement name/email from the current **git config** values.

**-a**, **--all**
> Rewrite all identities found in history (interactive).

**-t**, **--type** _TYPE_
> Which identity to rewrite: **author**, **committer**, or **both** (default).

**--help**
> Display help information.

# DESCRIPTION

**git reauthor** rewrites commit history to correct author (and/or committer) information. It updates names and email addresses across all local branches and tags for every commit whose identity matches the supplied old email.

The command is useful for fixing incorrect attribution, consolidating identities after email changes, or correcting authorship before publishing a repository. Because it rewrites history and changes every commit SHA in the rewritten range, it should only be used on branches that have not been shared.

# CAVEATS

Part of git-extras package. **Rewrites history.** Don't use on shared branches. All commit hashes change.

# HISTORY

git reauthor is part of **git-extras**, providing a convenient wrapper for the common task of fixing author information.

# SEE ALSO

[git-commit](/man/git-commit)(1), [git-rebase](/man/git-rebase)(1), [git-filter-repo](/man/git-filter-repo)(1)
