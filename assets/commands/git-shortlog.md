# TAGLINE

Summarize git log output grouped by author

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

**git shortlog** summarizes `git log` output by grouping commits under each author. It is commonly used for generating release notes and contributor acknowledgments.

The command can show commit counts per author, sort by contribution size, and use the mailmap for identity normalization across different name/email variations.

# CONFIGURATION

**.mailmap**
> Maps author identities to canonical names and emails, used by git shortlog for deduplication.

# CAVEATS

Reads from stdin or revision range. Uses mailmap for identity consolidation. Different from git log --oneline.

# HISTORY

git shortlog is a core **Git** command for generating contributor summaries, commonly used for release notes and acknowledgments.

# SEE ALSO

[git-log](/man/git-log)(1), [git-authors](/man/git-authors)(1)
