# TLDR

**Run command in each repo**

```git for-each-repo --config=[maintenance.repo] [command]```

# SYNOPSIS

**git** **for-each-repo** **--config**=_key_ _command_ [_args_]

# PARAMETERS

**--config** _key_
> Config key listing repos.

# DESCRIPTION

**git for-each-repo** runs a Git command in multiple repositories listed in a config key. Used by git-maintenance for scheduled tasks across repos.

# SEE ALSO

[git-maintenance](/man/git-maintenance)(1), [git-config](/man/git-config)(1)

