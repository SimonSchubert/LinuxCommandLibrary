# TLDR

**List all refs**

```git for-each-ref```

**List branches**

```git for-each-ref refs/heads```

**List tags**

```git for-each-ref refs/tags```

**Custom format**

```git for-each-ref --format='%(refname:short) %(objectname:short)' refs/heads```

**Sort by date**

```git for-each-ref --sort=-committerdate refs/heads```

**Show latest N refs**

```git for-each-ref --count=[10] --sort=-committerdate refs/heads```

# SYNOPSIS

**git** **for-each-ref** [_options_] [_patterns_...]

# PARAMETERS

**--format** _format_
> Output format string.

**--sort** _key_
> Sort by key.

**--count** _n_
> Limit output count.

**--points-at** _object_
> Show refs pointing to object.

**--merged** _commit_
> Show refs merged into commit.

**--no-merged** _commit_
> Show refs not merged.

# DESCRIPTION

**git for-each-ref** outputs information on each ref. Highly customizable with format strings. Used for scripting and custom ref listings.

# SEE ALSO

[git-branch](/man/git-branch)(1), [git-tag](/man/git-tag)(1)

