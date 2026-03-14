# TAGLINE

Execute Git commands across multiple repositories

# TLDR

**Run a git command in each repo listed in a config key**

```git for-each-repo --config=[maintenance.repo] [fetch]```

**Run maintenance on all registered repos**

```git for-each-repo --config=[maintenance.repo] maintenance run```

**Continue on failure**

```git for-each-repo --config=[maintenance.repo] --keep-going [gc]```

# SYNOPSIS

**git** **for-each-repo** **--config**=_key_ [**--keep-going**] [--] _command_ [_args_]

# PARAMETERS

**--config** _key_
> Multi-valued config key listing absolute paths to repositories.

**--keep-going**
> Continue with remaining repositories if the command fails on one. The exit code still indicates failure.

# DESCRIPTION

**git for-each-repo** executes a specified Git command across multiple repositories defined in a Git configuration value. The command reads a multi-valued configuration key where each value is an absolute path to a Git repository, then runs the provided command in each one.

The primary use case is git-maintenance, which uses for-each-repo to run maintenance tasks like gc, fetch, or repack across all registered repositories on a schedule. Config values are loaded from system, global, and local Git config. If run outside a Git repository, only system and global config is used.

# CONFIGURATION

**~/.gitconfig**
> Contains multi-valued configuration keys listing repository paths for batch operations.

# SEE ALSO

[git-maintenance](/man/git-maintenance)(1), [git-config](/man/git-config)(1)
