# TLDR

**Absorb staged changes** into matching commits

```git absorb```

**Absorb and automatically rebase**

```git absorb --and-rebase```

**Dry run** to see what would happen

```git absorb --dry-run```

**Specify base commit** for the absorb stack

```git absorb --base [HEAD~5]```

**Force absorb** skipping safety checks

```git absorb --force```

**Show verbose output**

```git absorb --verbose```

# SYNOPSIS

**git absorb** [_options_]

# PARAMETERS

**-r**, **--and-rebase**
> Run git rebase --autosquash automatically after creating fixup commits.

**-n**, **--dry-run**
> Show what would be done without making changes.

**-b**, **--base** _commit_
> Use specified commit as base of the absorb stack.

**-f**, **--force**
> Skip safety checks when creating fixup commits.

**-v**, **--verbose**
> Display extra information during execution.

**-w**, **--whole-file**
> Match changes to commits that last touched the file.

**-h**, **--help**
> Print help information.

**-V**, **--version**
> Print version information.

# DESCRIPTION

**git-absorb** automatically creates **fixup!** commits for staged changes, matching each hunk to the appropriate commit in your branch history. It's a port of Facebook's **hg absorb** tool for Mercurial.

The workflow is: stage changes with **git add**, run **git absorb** to create fixup commits, then either run **git rebase -i --autosquash** manually or use **--and-rebase** to do it automatically.

Git-absorb analyzes each staged hunk and finds the most recent commit that modified those lines. It then creates a **fixup!** commit targeting that commit. This is significantly faster than manually creating fixup commits and avoids errors.

By default, absorb searches within the last 10 commits. Increase this with **maxStack** in your **.gitconfig**:
```
[absorb]
    maxStack = 50
```

If something goes wrong, recover with **git reset --soft PRE_ABSORB_HEAD** or find the commit in **git reflog**.

# CAVEATS

Only considers staged changes (git index). Cannot absorb changes that span multiple original commits. New code (not modifying existing lines) cannot be absorbed. Safety checks may prevent absorption in some cases; use **--force** to override.

# HISTORY

Git-absorb was created by **Stephen Chung** as a Rust port of Facebook's **hg absorb** command for Mercurial. The tool was developed to bring the efficient fixup workflow from Mercurial to Git users. It became popular in stacked diff workflows where maintaining clean commit history is essential.

# SEE ALSO

[git-rebase](/man/git-rebase)(1), [git-commit](/man/git-commit)(1), [git-branchless](/man/git-branchless)(1)
