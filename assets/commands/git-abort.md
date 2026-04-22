# TAGLINE

abort any in-progress git operation (rebase, merge, cherry-pick, revert, am)

# TLDR

**Abort whatever is in progress**

```git abort```

# SYNOPSIS

**git abort**

# DESCRIPTION

**git abort** is a convenience command from the **git-extras** suite. It detects which git operation is in progress by inspecting the `.git` directory and runs the matching abort:

- Rebase in progress (`rebase-merge/` or `rebase-apply/`) → `git rebase --abort`
- Merge in progress (`MERGE_HEAD`) → `git merge --abort`
- Cherry-pick in progress (`CHERRY_PICK_HEAD`) → `git cherry-pick --abort`
- Revert in progress (`REVERT_HEAD`) → `git revert --abort`
- `git am` in progress (`rebase-apply/applying`) → `git am --abort`

If nothing is in progress, it prints a message and exits non-zero.

# CAVEATS

Provided by **git-extras**, not a built-in git command. Install via your package manager (`apt install git-extras`, `brew install git-extras`, etc.) or from source. All aborts are destructive with respect to the operation that was running — uncommitted merge resolutions or rebase edits are discarded. Your working tree is reset to the state before the operation began.

# HISTORY

**git-extras** is a long-running project by **TJ Holowaychuk** that bundles dozens of git subcommands for everyday workflows. `git abort` was added to consolidate the operation-specific `--abort` flags under one memorable command.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-merge](/man/git-merge)(1), [git-cherry-pick](/man/git-cherry-pick)(1), [git-am](/man/git-am)(1), [git-extras](/man/git-extras)(1)
