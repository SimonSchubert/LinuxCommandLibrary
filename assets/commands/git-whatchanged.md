# TLDR

**Show commit logs with diffs**

```git whatchanged```

**Show for specific file**

```git whatchanged [file]```

**Show with stat**

```git whatchanged --stat```

**Limit output**

```git whatchanged -n [10]```

**Show since date**

```git whatchanged --since="[2 weeks ago]"```

# SYNOPSIS

**git** **whatchanged** [_options_] [_paths_...]

# PARAMETERS

**-n** _num_
> Limit number of commits.

**--stat**
> Show diffstat.

**--since** _date_
> Commits since date.

**--until** _date_
> Commits until date.

**-p**
> Show patch.

# DESCRIPTION

**git whatchanged** shows logs with difference each commit introduces. Similar to git log but with different default output format.

# SEE ALSO

[git-log](/man/git-log)(1), [git-diff](/man/git-diff)(1)

