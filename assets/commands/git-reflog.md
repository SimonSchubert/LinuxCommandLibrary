# TAGLINE

Record and recover reference movements

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

**git reflog** records when refs (like HEAD and branch tips) are updated, providing a safety net for recovering lost commits. After accidental resets, rebases, or branch deletions, the reflog shows where refs previously pointed, allowing recovery of otherwise unreachable commits.

Entries expire after a configurable period: reachable entries after 90 days (`gc.reflogExpire`), unreachable ones after 30 days (`gc.reflogExpireUnreachable`). The reflog is local only and is not shared between repositories.

# CAVEATS

Local only, not pushed. Entries expire (90 days reachable, 30 days unreachable, by default). Won't help after gc removes the underlying objects.

# HISTORY

git reflog is a core **Git** safety feature, providing local history of ref movements to enable recovery from destructive operations.

# SEE ALSO

[git-log](/man/git-log)(1), [git-reset](/man/git-reset)(1), [git-gc](/man/git-gc)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-reflog)```

<!-- verified: 2026-07-17 -->
