# TAGLINE

Create orphan branch with no commit history

# TLDR

**Create orphan branch**

```git fresh-branch [branch_name]```

# SYNOPSIS

**git** **fresh-branch** _name_

# PARAMETERS

_NAME_
> Name of the new branch to create.

# DESCRIPTION

**git fresh-branch** creates a new orphan branch with no parent commits or history connection to the existing repository. It repoints HEAD at the new (as yet nonexistent) branch ref, clears the index, and runs **git clean -fdx** on the working tree, leaving a completely clean slate within the same repository.

The primary use case is gh-pages branches for GitHub Pages hosting, where documentation or website content lives in the same repository but shares no history with the codebase. Other uses include documentation branches, experimental branches, or vendor branches for third-party code.

If the working tree has untracked changes, the command prompts for confirmation before proceeding, since **git clean -fdx** deletes them irrecoverably.

# CAVEATS

Part of git-extras package. Destroys untracked files and the index without a real backup; commit or stash anything you want to keep before running it. Equivalent in effect to **git checkout --orphan** _name_ followed by clearing the index and working tree.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-clean](/man/git-clean)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/man/git-fresh-branch.md)```

<!-- verified: 2026-07-17 -->
