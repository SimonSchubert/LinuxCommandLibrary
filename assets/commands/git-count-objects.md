# TAGLINE

Report repository object counts and sizes

# TLDR

**Count objects**

```git count-objects```

**Verbose count**

```git count-objects -v```

**Human readable sizes**

```git count-objects -vH```

# SYNOPSIS

**git count-objects** [_options_]

# PARAMETERS

**-v**, **--verbose**
> Show detailed breakdown.

**-H**, **--human-readable**
> Human-readable sizes.

**--help**
> Display help information.

# DESCRIPTION

**git count-objects** reports the number of unpacked objects and their disk consumption. It helps understand repository size and identify when garbage collection might be beneficial.

The verbose mode (**-v**) shows packed objects, prunable objects, and size breakdowns including pack file count and total size. This information helps diagnose repository bloat and determine when **git gc** should be run.

The **-H** flag presents sizes in human-readable format (KB, MB, GB), making it easier to assess storage at a glance without manual unit conversion.

# CAVEATS

Core git command. Unpacked objects indicate recent activity. Large counts may indicate need for gc.

# HISTORY

git count-objects is a core **Git** command for repository maintenance, helping administrators understand storage usage.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-prune](/man/git-prune)(1), [git-fsck](/man/git-fsck)(1)
