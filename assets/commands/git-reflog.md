# TLDR

**Show reflog**

```git reflog```

**Show reflog for branch**

```git reflog [branch]```

**Show with timestamps**

```git reflog --date=relative```

**Expire old entries**

```git reflog expire --expire=[90.days] --all```

**Delete specific entry**

```git reflog delete HEAD@{2}```

# SYNOPSIS

**git reflog** [_command_] [_options_]

# PARAMETERS

**show** _REF_
> Show reflog for ref (default).

**expire**
> Prune old reflog entries.

**delete**
> Delete specific entries.

**--all**
> Process all refs.

**--expire** _TIME_
> Expire older than time.

**--date** _FORMAT_
> Date format.

**-n** _NUM_
> Limit entries shown.

**--help**
> Display help information.

# DESCRIPTION

**git reflog** records when refs are updated. It tracks branch tip movements, providing a safety net for recovering lost commits after resets, rebases, or accidental deletions.

The reflog shows where HEAD and branches pointed over time. Entries can be used to recover commits that are no longer reachable from any branch.

git reflog is essential for recovering from mistakes.

# CAVEATS

Local only, not pushed. Entries expire (default 90 days). Won't help after gc removes objects.

# HISTORY

git reflog is a core **Git** safety feature, providing local history of ref movements to enable recovery from destructive operations.

# SEE ALSO

[git-log](/man/git-log)(1), [git-reset](/man/git-reset)(1), [git-gc](/man/git-gc)(1)
