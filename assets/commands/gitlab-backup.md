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

**gitlab-backup** creates and restores GitLab instance backups. Backs up repositories, database, uploads, and other GitLab data.

# SEE ALSO

[gitlab-ctl](/man/gitlab-ctl)(8), [gitlab-rake](/man/gitlab-rake)(1)

