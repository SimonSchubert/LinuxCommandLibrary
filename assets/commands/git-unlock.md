# TAGLINE

Resume tracking changes to a locked file

# TLDR

**Unlock a file**

```git unlock [file]```

# SYNOPSIS

**git** **unlock** _file_

# DESCRIPTION

**git unlock** runs `git update-index --no-skip-worktree` on a file, clearing the **skip-worktree** bit so Git resumes tracking local changes to it. This reverses `git lock`, which sets `--skip-worktree` to make Git ignore modifications to a file (typically one holding local config or secrets that shouldn't be committed).

Part of the **git-extras** package.

# CAVEATS

Uses the `skip-worktree` bit, not `assume-unchanged`; the two are similar but intended for different purposes, and tools that check one won't necessarily see the other.

# SEE ALSO

[git-lock](/man/git-lock)(1), [git-update-index](/man/git-update-index)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-unlock)```

<!-- verified: 2026-07-17 -->
