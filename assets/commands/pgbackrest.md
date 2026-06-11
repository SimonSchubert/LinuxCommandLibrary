# TAGLINE

Reliable PostgreSQL backup and restore tool

# TLDR

**Initialize a new stanza** for a PostgreSQL cluster

```pgbackrest --stanza=[name] stanza-create```

**Verify** that database and archive configuration is correct

```pgbackrest --stanza=[name] check```

**Create a full backup**

```pgbackrest --stanza=[name] --type=full backup```

**Create an incremental backup**

```pgbackrest --stanza=[name] --type=incr backup```

**Restore the latest backup** to PGDATA

```pgbackrest --stanza=[name] restore```

**Restore to a specific point in time**

```pgbackrest --stanza=[name] --type=time --target="[2026-04-27 12:00:00]" restore```

**Show information** about backups in the repository

```pgbackrest --stanza=[name] info```

**Expire** old backups and archived WAL according to retention policy

```pgbackrest --stanza=[name] expire```

# SYNOPSIS

**pgbackrest** [_options_] _command_

# PARAMETERS

**backup**
> Create a full, differential, or incremental backup of a PostgreSQL cluster.

**restore**
> Restore a backup, optionally to a specific time, name, xid, LSN, or named recovery target.

**archive-push**
> Push a WAL segment to the repository (called from PostgreSQL **archive_command**).

**archive-get**
> Retrieve a WAL segment from the repository during recovery (called from **restore_command**).

**stanza-create**
> Initialize a new stanza, creating the repository layout for a cluster.

**stanza-upgrade**
> Update stanza metadata after a major PostgreSQL upgrade.

**stanza-delete**
> Remove a stanza and all its backups and WAL.

**check**
> Verify configuration, archive command, and repository accessibility.

**info**
> Display backup and archive information for one or all stanzas.

**verify**
> Verify integrity of backups and WAL in the repository.

**expire**
> Apply retention policies, removing old backups and archived WAL.

**repo-ls**, **repo-get**
> List or fetch files directly from the repository.

**server**, **server-ping**, **start**, **stop**
> Manage the pgBackRest server (used with TLS-based remote repositories).

**annotate**
> Add, modify, or remove free-form annotations on a backup.

**--stanza** _name_
> Stanza (PostgreSQL cluster) to operate on.

**--type** _full|diff|incr|time|name|xid|lsn|immediate|default|standby_
> Backup type (full/diff/incr) or restore recovery target type.

**--target** _value_
> Target for **--type=time/name/xid/lsn** restores.

**--config** _file_
> Path to alternative pgbackrest.conf.

**--config-path** _dir_
> Base directory for configuration files.

**--repo** _N_
> Select a specific repository when multiple are configured.

**--process-max** _N_
> Maximum parallel processes for compression and transfer.

**--compress-type** _none|gz|lz4|zst|bz2_
> Compression algorithm for backups and WAL.

**--log-level-console** _off|error|warn|info|detail|debug|trace_
> Verbosity of console logging.

**--delta**
> Restore only files that differ from the backup (faster repeated restores).

# DESCRIPTION

**pgBackRest** is a backup and restore solution for PostgreSQL designed for reliability at scale. It supports full, differential, and incremental backups, parallel processing, hardware-accelerated compression (gz, lz4, zstd), local and remote repositories, and storage backends including filesystem, S3, Azure Blob, and Google Cloud Storage. Backups can be verified end-to-end and restored to a point in time using PostgreSQL's recovery facilities.

Operation is organized around a **stanza**, which represents a single PostgreSQL cluster and its backup repository. After **stanza-create**, the **archive_command** in **postgresql.conf** is set to **pgbackrest --stanza=name archive-push %p** so that every WAL segment is shipped to the repository. **backup** then captures the data directory and pairs it with the archived WAL to enable point-in-time recovery via **restore**.

pgBackRest is implemented in C with a small Perl helper layer historically; modern versions are pure C. It is widely deployed in PostgreSQL operator stacks (Crunchy Data, CloudNativePG, Zalando) and in production database environments where pg_basebackup is insufficient.

# CAVEATS

The **stanza** name must match the value used in **archive_command** and on every host that touches the repository. Forgetting to run **stanza-upgrade** after a major PostgreSQL upgrade leaves the stanza misaligned with the new cluster. Restore is destructive: by default it overwrites **PGDATA**, so use **--delta** or restore to an empty directory when in doubt. Repository encryption keys, if used, must be backed up out of band — losing them makes the backups unreadable.

# CONFIGURATION

**/etc/pgbackrest/pgbackrest.conf** (or **/etc/pgbackrest.conf**)
> Default configuration file. Defines stanzas, repository locations, retention, encryption, compression, and PostgreSQL connection details.

**[global]** section
> Process-wide defaults: **repo1-path**, **repo1-cipher-type**, **process-max**, **log-level-***, **compress-type**.

**[stanza-name]** section
> Per-stanza settings: **pg1-path**, **pg1-host**, **pg1-port**, **pg1-user**, plus retention overrides such as **repo1-retention-full**.

# HISTORY

**pgBackRest** was created by **David Steele** at **Crunchy Data** and first released in **2013** as a more scalable alternative to **pg_basebackup**-based backup workflows. Originally written in Perl, it was progressively rewritten in **C** for performance, with the migration substantially complete by version **2.0**. It has become a de-facto standard for production PostgreSQL backups and is bundled with the major PostgreSQL Kubernetes operators.

# SEE ALSO

[pg_basebackup](/man/pg_basebackup)(1), [pg_dump](/man/pg_dump)(1), [postgres](/man/postgres)(1)
