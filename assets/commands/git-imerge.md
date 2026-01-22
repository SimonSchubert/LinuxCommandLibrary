# TLDR

**Start incremental merge**

```git imerge start --name=[merge-name] [branch]```

**Continue merge**

```git imerge continue```

**Show merge status**

```git imerge diagram```

**Finish merge**

```git imerge finish```

**Abort merge**

```git imerge remove```

# SYNOPSIS

**git imerge** _command_ [_options_]

# PARAMETERS

**start**
> Begin incremental merge.

**continue**
> Continue resolving conflicts.

**finish**
> Complete merge.

**remove**
> Abort incremental merge.

**diagram**
> Show visual merge status.

**--name** _NAME_
> Merge branch name.

**--goal** _GOAL_
> Merge goal (merge, rebase, etc.).

**--help**
> Display help information.

# DESCRIPTION

**git imerge** performs incremental, bisect-style merges. Instead of one large merge, it merges commits one at a time, making conflict resolution more manageable.

The tool tracks merge progress visually and allows conflicts to be resolved independently. This approach helps identify exactly which commits cause conflicts.

git imerge makes complex merges tractable through incremental conflict resolution.

# CAVEATS

Separate installation required. More complex than simple merge. Best for difficult merges.

# HISTORY

git imerge was created by **Michael Haggerty** to address the pain of large, conflict-heavy merges by breaking them into smaller pieces.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-rebase](/man/git-rebase)(1)
