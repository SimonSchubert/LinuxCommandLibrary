# TAGLINE

PHP Backup Utility

# TLDR

**Run the backups** defined in phpbu.xml, phpbu.xml.dist or phpbu.json in the current directory

```phpbu```

**Use a specific config** file

```phpbu --configuration=[path/to/phpbu.xml]```

**Simulate** a backup without making changes

```phpbu --simulate```

Run only **selected backups** by name

```phpbu --limit=[backup1,backup2]```

Print a **restore guide** for the configured backups

```phpbu --restore```

**Generate** a new configuration skeleton interactively

```phpbu --generate-configuration```

**Verbose** output with colors

```phpbu -v --colors```

# SYNOPSIS

**phpbu** [_options_]

# PARAMETERS

**--configuration=**_FILE_
> Path to a phpbu XML or JSON configuration file. If omitted, phpbu.xml, phpbu.xml.dist and phpbu.json are searched in the current directory.

**--bootstrap=**_FILE_
> Bootstrap PHP file included before running the backup.

**--simulate**
> Perform a trial run without making any changes.

**--limit=**_SUBSET_
> Limit backup execution to a comma-separated list of backup names.

**--restore**
> Print a restore guide for the configured backups.

**--generate-configuration**
> Create a new configuration skeleton interactively.

**--colors**
> Enable colored output.

**--debug**
> Display debugging information during backup generation.

**-v**, **--verbose**
> Output more verbose information.

**-V**, **--version**
> Output version information and exit.

**-h**, **--help**
> Display usage information.

**--version-check**, **--self-update**
> PHAR only. Self-update was removed; these now just recommend updating via phive.

# DESCRIPTION

**phpbu** (PHP Backup Utility) creates, compresses, encrypts, validates and syncs backups, and cleans up old ones, all driven by an XML or JSON configuration file.

Sources include MySQL, PostgreSQL, MongoDB, Redis, Elasticsearch, InfluxDB, ArangoDB, LDAP, Percona XtraBackup and plain directories. Backups can be compressed (gzip, bzip2, xz, zip), encrypted (openssl, mcrypt), checked against a minimum size or previous backups, and synced to Amazon S3, Azure Blob, Dropbox, Google Drive, Google Cloud Storage, OpenStack, FTP, SFTP or rsync targets. Results can be reported via mail, webhooks or log files.

# CAVEATS

Requires a configuration file; without one phpbu exits with an error. Each source and sync type relies on the matching external tool or PHP library (e.g. **mysqldump**, **pg_dump**, cloud SDKs). Current releases require PHP 8.1 or later; older PHP versions need older phpbu releases.

# HISTORY

**phpbu** is written by **Sebastian Feldmann** and distributed as a Composer package and PHAR.

# SEE ALSO

[mysqldump](/man/mysqldump)(1), [pg_dump](/man/pg_dump)(1), [rsync](/man/rsync)(1)

# RESOURCES

```[Source code](https://github.com/sebastianfeldmann/phpbu)```

```[Homepage](https://www.phpbu.de)```

```[Documentation](https://www.phpbu.de/manual/current/en/)```

<!-- verified: 2026-11-23 -->
