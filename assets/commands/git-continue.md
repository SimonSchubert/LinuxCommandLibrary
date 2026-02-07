# TAGLINE

Resume interrupted git operations

# TLDR

**Continue interrupted operation**

```git continue```

# SYNOPSIS

**git continue**

# DESCRIPTION

**git continue** resumes an interrupted git operation. It's a convenience command from git-extras that detects the pending operation (rebase, merge, cherry-pick, revert) and runs the appropriate continue command.

Instead of remembering **git rebase --continue**, **git cherry-pick --continue**, or **git merge --continue**, a single **git continue** handles any interrupted operation.

The command detects which operation is currently paused and executes the appropriate continue command, reducing cognitive overhead during complex conflict resolution workflows.

# CAVEATS

Part of git-extras package. Requires pending operation. Conflicts must be resolved first.

# HISTORY

git continue was added to **git-extras** by **TJ Holowaychuk** to simplify the common workflow of continuing interrupted git operations.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-merge](/man/git-merge)(1), [git-cherry-pick](/man/git-cherry-pick)(1)
