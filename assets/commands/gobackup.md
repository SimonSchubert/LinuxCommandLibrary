# TAGLINE

Backup tool for databases and files

# TLDR

**Backup** a database

```gobackup perform```

**Backup** with specific config

```gobackup -c [/path/to/config.yml] perform```

**List** available backups

```gobackup list```

**Restore** from backup

```gobackup restore [backup-id]```

# SYNOPSIS

**gobackup** [_options_] _command_

# PARAMETERS

**perform**
> Run backup task

**list**
> List all backups

**restore** _ID_
> Restore from backup

**-c, --config** _FILE_
> Configuration file (default: ~/.gobackup/gobackup.yml)

**--model** _MODEL_
> Specify backup model to run

**-v, --version**
> Display version and exit

**-h, --help**
> Display help and exit

# DESCRIPTION

**gobackup** is a backup tool that supports databases (MySQL, PostgreSQL, Redis, MongoDB) and files. It can compress, encrypt, and upload backups to various storage services.

The tool is configured via YAML files and supports multiple backup models, scheduling, and retention policies.

# CONFIGURATION

Configuration file example:

```yaml
models:
  my_backup:
    compress_with:
      type: tgz
    store_with:
      type: s3
      bucket: my-bucket
    databases:
      my_db:
        type: mysql
        host: localhost
        database: myapp
```

# CAVEATS

Requires proper configuration. Database credentials must be secured. Storage service credentials needed for remote backups.

# HISTORY

**gobackup** was created as a flexible backup solution supporting multiple databases and storage backends.

# SEE ALSO

[restic](https://restic.net/), [borg](https://borgbackup.readthedocs.io/), [duplicity](http://duplicity.nongnu.org/)