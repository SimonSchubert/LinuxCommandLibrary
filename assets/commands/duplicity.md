# TAGLINE

encrypted bandwidth-efficient backup tool

# TLDR

**Backup a directory** to remote location

```duplicity [/path/to/source] [sftp://user@host/backup]```

**Incremental backup**

```duplicity --full-if-older-than [30D] [/path/to/source] [file:///backup/destination]```

**Restore from backup**

```duplicity restore [sftp://user@host/backup] [/path/to/restore]```

**Restore specific file**

```duplicity restore --file-to-restore [relative/path/file] [backup_url] [/path/to/restore]```

**List files in backup**

```duplicity list-current-files [backup_url]```

**Verify backup** against source

```duplicity verify [backup_url] [/path/to/source]```

**Remove old backups**

```duplicity remove-older-than [60D] [backup_url]```

**Encrypt with GPG key**

```duplicity --encrypt-key [KEY_ID] [/source] [destination]```

# SYNOPSIS

**duplicity** [_options_] _source_ _destination_

# DESCRIPTION

**duplicity** is a backup tool that creates encrypted, bandwidth-efficient backups. It uses librsync to produce incremental archives that only contain changed parts of files, and GnuPG for encryption and signing.

Backups can be stored locally or on various remote backends including SFTP, S3, Google Cloud Storage, Azure, WebDAV, and many others. The combination of encryption and incremental transfers makes duplicity suitable for remote/cloud backups over untrusted networks.

A full backup is periodically created, with subsequent incremental backups storing only changes. This allows point-in-time recovery while minimizing storage and bandwidth usage.

# PARAMETERS

**full**
> Force a full backup.

**incremental**
> Force incremental backup.

**restore**
> Restore from backup.

**verify**
> Verify backup integrity.

**list-current-files**
> List files in current backup.

**remove-older-than** _time_
> Delete old backup sets.

**remove-all-but-n-full** _n_
> Keep only n full backups.

**--full-if-older-than** _time_
> Full backup if last one is older than time.

**--encrypt-key** _key_id_
> GPG key for encryption.

**--sign-key** _key_id_
> GPG key for signing.

**--no-encryption**
> Disable encryption.

**--include** _pattern_
> Include files matching pattern.

**--exclude** _pattern_
> Exclude files matching pattern.

**--file-to-restore** _path_
> Restore specific file.

**-t** _time_, **--restore-time** _time_
> Restore from specific time.

# CAVEATS

GPG passphrase required for encrypted backups (use PASSPHRASE env var for scripting). First backup is always full and may take time. Restoring individual files requires downloading multiple increments. Backend credentials may need configuration.

# HISTORY

**duplicity** was created by **Ben Escoto** in **2002** as an encrypted backup solution. It combined rsync's efficient delta-transfer algorithm with GnuPG encryption. The project has been maintained by various contributors and expanded to support numerous cloud storage backends. It remains a popular choice for secure, automated backups.

# SEE ALSO

[rdiff-backup](/man/rdiff-backup)(1), [rsync](/man/rsync)(1), [gpg](/man/gpg)(1), [restic](/man/restic)(1)
