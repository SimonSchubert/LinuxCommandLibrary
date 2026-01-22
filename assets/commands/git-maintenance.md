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

**git maintenance** manages repository maintenance tasks. It handles garbage collection, commit graph updates, and other optimizations either on-demand or through scheduled background jobs.

Background maintenance improves performance by running tasks automatically. Tasks include gc, commit-graph, prefetch, and incremental-repack. Configuration controls which tasks run.

git maintenance keeps repositories optimized automatically.

# CAVEATS

Background jobs need system scheduler. Some tasks may be slow. Configuration in git config.

# HISTORY

git maintenance was added in **Git 2.29** to provide automated repository optimization, replacing manual gc invocation.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-commit-graph](/man/git-commit-graph)(1)
