# TAGLINE

Incremental bisect-style merging

# TLDR

**Start an incremental merge** of a branch

```git imerge start --name=[merge-name] [branch]```

**Start an incremental rebase** onto current branch

```git imerge rebase [branch]```

**Continue resolving** after fixing a conflict

```git imerge continue```

**Show visual merge** progress diagram

```git imerge diagram```

**Finish the merge** when all conflicts are resolved

```git imerge finish```

**List all in-progress** incremental merges

```git imerge list```

**Abort and remove** the incremental merge

```git imerge remove```

# SYNOPSIS

**git imerge** _command_ [_options_]

# PARAMETERS

**start**
> Begin incremental merge.

**merge**
> Start an incremental merge (shorthand for start --goal merge).

**rebase**
> Start an incremental rebase (shorthand for start --goal rebase).

**continue**
> Continue resolving conflicts.

**finish**
> Complete the incremental merge.

**remove**
> Abort and remove incremental merge state.

**diagram**
> Show visual merge status grid.

**list**
> List all in-progress incremental merges.

**autofill**
> Attempt to fill in all merge blocks automatically.

**simplify**
> Simplify the merge history after finishing.

**init**
> Initialize an imerge from existing merge state.

**record**
> Record the result of a merge done manually.

**drop**
> Drop a commit from the merge.

**revert**
> Revert a commit in the merge.

**--name** _NAME_
> Name for the incremental merge.

**--goal** _GOAL_
> Merge goal: merge, rebase, rebase-with-history, border, border-with-history.

**--first-parent**
> Handle first-parent history only.

**--force**
> Force start even if one is already in progress.

**--help**
> Display help information.

# DESCRIPTION

**git imerge** performs incremental, bisect-style merges. Instead of one large merge with many conflicts, it merges commits one at a time, making conflict resolution more manageable and helping identify exactly which commits cause conflicts.

The tool tracks merge progress visually via the diagram command and allows conflicts to be resolved independently. This approach is particularly valuable for difficult merges between long-diverged branches.

# CAVEATS

Separate installation required. More complex than simple merge. Best for difficult merges.

# HISTORY

git imerge was created by **Michael Haggerty** to address the pain of large, conflict-heavy merges by breaking them into smaller pieces.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-rebase](/man/git-rebase)(1)
