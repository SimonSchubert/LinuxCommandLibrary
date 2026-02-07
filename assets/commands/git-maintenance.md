# TAGLINE

Automated repository optimization

# TLDR

**Start background maintenance**

```git maintenance start```

**Run maintenance now**

```git maintenance run```

**Stop background maintenance**

```git maintenance stop```

**Register repository**

```git maintenance register```

**Run specific task**

```git maintenance run --task=[gc]```

# SYNOPSIS

**git maintenance** _command_ [_options_]

# PARAMETERS

**start**
> Enable background maintenance.

**stop**
> Disable background maintenance.

**run**
> Run maintenance tasks.

**register**
> Register repo for maintenance.

**unregister**
> Unregister repository.

**--task** _TASK_
> Specific task to run.

**--auto**
> Only run if needed.

**--help**
> Display help information.

# DESCRIPTION

**git maintenance** manages repository maintenance tasks automatically. It handles garbage collection, commit graph updates, prefetch, and incremental repack either on-demand or through scheduled background jobs.

Background maintenance improves repository performance over time without manual intervention. The `start` subcommand registers the repository and sets up a system scheduler to run tasks periodically. Configuration controls which tasks run and how frequently.

# CONFIGURATION

**~/.gitconfig**
> Global maintenance configuration for scheduled tasks.

```
[maintenance]
    auto = true
    strategy = incremental
```

# CAVEATS

Background jobs need system scheduler. Some tasks may be slow. Configuration in git config.

# HISTORY

git maintenance was added in **Git 2.29** to provide automated repository optimization, replacing manual gc invocation.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-commit-graph](/man/git-commit-graph)(1)
