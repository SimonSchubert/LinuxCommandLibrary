# TAGLINE

Show repository summary with contribution statistics

# TLDR

**Show repository summary**

```git summary```

**Show with specific depth**

```git summary --line```

**Dedup by email**

```git summary --dedup-by-email```

# SYNOPSIS

**git** **summary** [_options_]

# PARAMETERS

**--line**
> Show line statistics.

**--dedup-by-email**
> Deduplicate by email.

# DESCRIPTION

**git summary** outputs a repository overview including project age, number of active days, total commits, and per-author contribution statistics. Part of git-extras, it provides a quick snapshot of project activity.

# SEE ALSO

[git-log](/man/git-log)(1), [git-shortlog](/man/git-shortlog)(1), [git-extras](/man/git-extras)(1)
