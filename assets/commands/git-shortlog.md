# TLDR

**Summarize commits by author**

```git shortlog```

**Show commit counts**

```git shortlog -sn```

**Show email addresses**

```git shortlog -sne```

**Shortlog for range**

```git shortlog [v1.0..v2.0]```

**Group by committer**

```git shortlog -c```

# SYNOPSIS

**git shortlog** [_options_] [_revision-range_]

# PARAMETERS

_REVISION-RANGE_
> Commits to summarize.

**-s**, **--summary**
> Show counts only.

**-n**, **--numbered**
> Sort by count.

**-e**, **--email**
> Show email addresses.

**-c**, **--committer**
> Group by committer.

**--group** _FIELD_
> Group by field.

**--help**
> Display help information.

# DESCRIPTION

**git shortlog** summarizes git log output, grouping commits by author. It's commonly used for release notes and contributor acknowledgments.

The command can show commit counts, sort by contribution size, and handle the mailmap for identity normalization. It provides quick contribution statistics.

git shortlog generates commit summaries by contributor.

# CAVEATS

Reads from stdin or revision range. Uses mailmap for identity consolidation. Different from git log --oneline.

# HISTORY

git shortlog is a core **Git** command for generating contributor summaries, commonly used for release notes and acknowledgments.

# SEE ALSO

[git-log](/man/git-log)(1), [git-authors](/man/git-authors)(1)
