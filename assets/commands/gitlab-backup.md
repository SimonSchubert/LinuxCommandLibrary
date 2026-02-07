# TAGLINE

Create and restore GitLab instance backups

# TLDR

**Create GitLab backup**

```sudo gitlab-backup create```

**Create with specific components**

```sudo gitlab-backup create SKIP=db,uploads```

**Restore from backup**

```sudo gitlab-backup restore BACKUP=[timestamp]```

# SYNOPSIS

**gitlab-backup** _command_ [_options_]

# SUBCOMMANDS

**create**
> Create backup.

**restore**
> Restore from backup.

# PARAMETERS

**SKIP** _components_
> Skip backup components.

**BACKUP** _timestamp_
> Backup file timestamp.

# DESCRIPTION

**gitlab-backup** creates and restores GitLab instance backups. It backs up repositories, database, uploads, and other GitLab data into a single archive.

The tool is part of the Omnibus GitLab installation and should be run with root privileges. Backups are stored in the configured backup path.

# SEE ALSO

[gitlab-ctl](/man/gitlab-ctl)(8), [gitlab-rake](/man/gitlab-rake)(1)
