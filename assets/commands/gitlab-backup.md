# TAGLINE

Create and restore GitLab instance backups

# TLDR

**Create a full GitLab backup**

```sudo gitlab-backup create```

**Create a backup, skipping selected components**

```sudo gitlab-backup create SKIP=db,uploads,registry```

**Create an incremental backup**

```sudo gitlab-backup create INCREMENTAL=yes PREVIOUS_BACKUP=[backup_id]```

**Restore from a backup file**

```sudo gitlab-backup restore BACKUP=[timestamp_version]```

**Restore selected components only**

```sudo gitlab-backup restore BACKUP=[timestamp] SKIP=registry,uploads```

# SYNOPSIS

**gitlab-backup** _command_ [_VAR_=_value_ ...]

# SUBCOMMANDS

**create**
> Create a backup archive of the GitLab instance.

**restore**
> Restore a GitLab instance from a previously created backup.

# PARAMETERS

**SKIP** _components_
> Comma-separated list of components to omit. Valid values: **db**, **repositories**, **uploads**, **builds**, **artifacts**, **lfs**, **registry**, **pages**, **terraform_state**, **packages**, **ci_secure_files**.

**BACKUP** _id_
> Identifier (timestamp_version) of the backup to restore. Required for **restore**.

**STRATEGY** _value_
> Use **copy** to copy data to a tmp dir before tarring (safer for active sites); default streams directly.

**INCREMENTAL** _yes_
> Create an incremental backup (requires existing PREVIOUS_BACKUP).

**PREVIOUS_BACKUP** _id_
> Backup ID to base the incremental backup on.

**GITLAB_BACKUP_MAX_CONCURRENCY** _N_
> Maximum number of concurrent processes for repository backups.

**GZIP_RSYNCABLE** _yes_
> Use gzip's --rsyncable mode so backups deduplicate efficiently with rsync.

# DESCRIPTION

**gitlab-backup** creates and restores backups of a GitLab Omnibus or source installation. A backup bundles the database, Git repositories, uploads, CI artifacts, container registry, Pages content, and other components into a single tar archive named **TIMESTAMP_VERSION_gitlab_backup.tar**.

Backups are written to the directory configured by **gitlab_rails['backup_path']** (default **/var/opt/gitlab/backups**). The configuration files (gitlab.rb, secrets.json) are **not** included and must be backed up separately.

# CAVEATS

Run as root (typically via **sudo**). Restore requires the same GitLab major.minor version as the backup. Stop **puma** and **sidekiq** before a restore (**gitlab-ctl stop puma sidekiq**). Configuration files (**/etc/gitlab/gitlab.rb**, **/etc/gitlab/gitlab-secrets.json**) are **not** included in the backup tarball — back them up separately or restore will fail to decrypt secrets.

# HISTORY

**gitlab-backup** is a wrapper around the **gitlab:backup:create** and **gitlab:backup:restore** Rake tasks, introduced in **GitLab 12.2** (August 2019) as the recommended interface for Omnibus installations.

# INSTALL

```pacman: sudo pacman -S gitlab```

```apk: sudo apk add py3-gitlab```

```nix: nix profile install nixpkgs#gitlab```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gitlab-ctl](/man/gitlab-ctl)(8), [gitlab](/man/gitlab)(1)
