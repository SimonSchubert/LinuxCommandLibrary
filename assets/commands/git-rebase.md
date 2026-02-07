# TAGLINE

Reapply commits on new base

# TLDR

**Rebase onto branch**

```git rebase [branch]```

**Interactive rebase**

```git rebase -i [commit]```

**Rebase last N commits**

```git rebase -i HEAD~[n]```

**Continue after conflict**

```git rebase --continue```

**Abort rebase**

```git rebase --abort```

**Skip current commit**

```git rebase --skip```

**Rebase onto specific base**

```git rebase --onto [newbase] [oldbase] [branch]```

# SYNOPSIS

**git** **rebase** [_options_] [_upstream_] [_branch_]

# PARAMETERS

**-i**, **--interactive**
> Interactive mode.

**--onto** _newbase_
> Rebase onto different base.

**--continue**
> Continue after resolving.

**--abort**
> Cancel rebase.

**--skip**
> Skip current patch.

**--autosquash**
> Auto-apply fixup/squash.

**--autostash**
> Auto-stash changes.

**-x** _cmd_
> Run command after each commit.

**-p**, **--preserve-merges**
> Preserve merge commits.

# DESCRIPTION

**git rebase** reapplies commits on top of another base tip, producing a linear project history. It finds the common ancestor of the current branch and the upstream, then replays each commit from the current branch onto the upstream tip.

Interactive mode (`-i`) allows reordering, squashing, editing, or dropping commits during the replay, making it a powerful tool for cleaning up commit history. The `--onto` option enables advanced workflows like moving a branch to an entirely new base. Autosquash automatically applies fixup! and squash! commits, supporting the iterative fixup workflow.

# CAVEATS

Rebasing rewrites history. Don't rebase commits that have been pushed to shared branches.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-cherry-pick](/man/git-cherry-pick)(1)
