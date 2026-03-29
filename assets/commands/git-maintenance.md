# TAGLINE

Automated repository optimization

# TLDR

**Start background maintenance** for the current repository

```git maintenance start```

**Run all enabled maintenance tasks** immediately

```git maintenance run```

**Run a specific task**

```git maintenance run --task=[prefetch]```

**Run tasks only if scheduled thresholds are met**

```git maintenance run --schedule```

**Stop background maintenance**

```git maintenance stop```

**Register repository** for background maintenance

```git maintenance register```

**Unregister repository** from background maintenance

```git maintenance unregister```

# SYNOPSIS

**git maintenance** _subcommand_ [_options_]

# PARAMETERS

**run**
> Run one or more maintenance tasks immediately.

**start**
> Enable background maintenance and schedule hourly runs via the system scheduler.

**stop**
> Disable background maintenance schedule.

**register**
> Add the repository to the global maintenance list and apply recommended task schedules.

**unregister**
> Remove the repository from the global maintenance list.

**is-needed**
> Exit 0 if maintenance tasks need to run, 1 otherwise.

**--task** _TASK_
> Specific task to run. May be repeated. Valid tasks: gc, prefetch, commit-graph, loose-objects, incremental-repack, pack-refs, reflog-expire, rerere-gc, worktree-prune.

**--schedule**
> Only run tasks whose scheduled time threshold has been met.

**--auto**
> Only run tasks if their auto thresholds are met (e.g. gc.auto loose object count).

**--quiet**
> Suppress progress output to stderr.

**--scheduler** _SCHEDULER_
> Background scheduler to use with start: auto, crontab, systemd-timer, launchctl, schtasks (default: auto).

**--force**
> Used with unregister; suppress error if the repository is not registered.

**--help**
> Display help information.

# DESCRIPTION

**git maintenance** manages repository maintenance tasks automatically. It handles garbage collection, commit graph updates, prefetch, and incremental repack either on-demand or through scheduled background jobs.

Background maintenance improves repository performance over time without manual intervention. The `start` subcommand registers the repository and sets up a system scheduler (crontab, systemd, launchctl, or schtasks depending on platform) to run tasks periodically. The `register` subcommand configures recommended task schedules and sets `maintenance.strategy = incremental` while disabling foreground auto-gc.

## Tasks

- **gc** — Full garbage collection; repacks all objects into a single pack-file. Expensive.
- **prefetch** — Fetches objects from all remotes into `refs/prefetch/` without updating remote-tracking branches.
- **commit-graph** — Incrementally updates commit-graph files for faster graph traversal.
- **loose-objects** — Packs loose objects into pack-files in batches (default batch: 50,000).
- **incremental-repack** — Repacks small pack-files using the multi-pack-index.
- **pack-refs** — Consolidates loose ref files into a single packed-refs file.
- **reflog-expire** — Deletes reflog entries older than the expiry threshold.
- **rerere-gc** — Cleans stale entries from the rerere cache.
- **worktree-prune** — Removes stale or broken worktree records.

# CONFIGURATION

**~/.gitconfig**
> Global maintenance configuration for registered repositories and scheduled tasks.

```
[maintenance]
    strategy = incremental
    auto = false
```

# CAVEATS

Background jobs require a working system scheduler. The `gc` task is expensive and disruptive for large repositories; prefer `loose-objects` and `incremental-repack` for background use. Configuration is stored in git config.

# HISTORY

git maintenance was added in **Git 2.29** to provide automated repository optimization, replacing manual gc invocation.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-commit-graph](/man/git-commit-graph)(1), [git-fetch](/man/git-fetch)(1)
