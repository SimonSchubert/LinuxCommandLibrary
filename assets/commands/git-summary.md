# TAGLINE

Show repository summary with contribution statistics

# TLDR

**Show repository summary** with commit statistics per author

```git summary```

**Show line-based statistics** instead of commits

```git summary --line```

**Show line statistics for a specific path**

```git summary --line [path/to/dir]```

**Dedup authors by email**

```git summary --dedup-by-email```

**Exclude merge commits**

```git summary --no-merges```

**Show output in tabular format**

```git summary --output-style tabular```

# SYNOPSIS

**git** **summary** [_options_] [_path_]

# PARAMETERS

**--line**
> Show line statistics instead of commits. Can take an optional path to filter.

**--dedup-by-email**
> Deduplicate authors by email address.

**--no-merges**
> Exclude merge commits from the summary.

**--output-style** _style_
> Output format: tabular or oneline.

# DESCRIPTION

**git summary** outputs a repository overview including project age, number of active days, total commits, and per-author contribution statistics. Part of git-extras, it provides a quick snapshot of project activity.

# SEE ALSO

[git-log](/man/git-log)(1), [git-shortlog](/man/git-shortlog)(1), [git-extras](/man/git-extras)(1)
