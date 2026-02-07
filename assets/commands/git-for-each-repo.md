# TAGLINE

Execute Git commands across multiple repositories

# TLDR

**Run command in each repo**

```git for-each-repo --config=[maintenance.repo] [command]```

# SYNOPSIS

**git** **for-each-repo** **--config**=_key_ _command_ [_args_]

# PARAMETERS

**--config** _key_
> Config key listing repos.

# DESCRIPTION

**git for-each-repo** executes a specified Git command across multiple repositories defined in a Git configuration value. The command reads a multi-valued configuration key where each value is an absolute path to a Git repository, then runs the provided command in each one.

The primary use case is git-maintenance, which uses for-each-repo to run maintenance tasks like gc, fetch, or repack across all registered repositories on a schedule. Error handling continues execution across all repositories even if individual commands fail, ensuring that one failing repository does not prevent maintenance of others.

# CONFIGURATION

**~/.gitconfig**
> Contains multi-valued configuration keys listing repository paths for batch operations.

# SEE ALSO

[git-maintenance](/man/git-maintenance)(1), [git-config](/man/git-config)(1)
