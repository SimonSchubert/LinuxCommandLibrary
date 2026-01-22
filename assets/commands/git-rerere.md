# TLDR

**Enable rerere**

```git config rerere.enabled true```

**Show recorded resolutions**

```git rerere status```

**Show diff of resolution**

```git rerere diff```

**Clear recorded resolutions**

```git rerere clear```

**Forget resolution**

```git rerere forget [file]```

# SYNOPSIS

**git rerere** [_command_]

# PARAMETERS

**status**
> Show paths with recorded resolutions.

**diff**
> Show diff for current resolutions.

**clear**
> Clear recorded resolutions.

**forget** _PATH_
> Forget resolution for path.

**gc**
> Prune old recordings.

**--help**
> Display help information.

# DESCRIPTION

**git rerere** (reuse recorded resolution) remembers how you resolved merge conflicts and automatically reapplies those resolutions. This is invaluable for repeated merges and rebases.

When enabled, git records conflict resolutions. On subsequent merges with identical conflicts, the previous resolution is applied automatically. This eliminates repetitive conflict resolution.

git rerere automates repeated conflict resolution.

# CAVEATS

Must be enabled in config. Records are local. May apply wrong resolution if contexts differ.

# HISTORY

git rerere was added to **Git** to address the pain of resolving the same merge conflicts repeatedly, particularly during long-running branches and rebases.

# SEE ALSO

[git-merge](/man/git-merge)(1), [git-rebase](/man/git-rebase)(1)
