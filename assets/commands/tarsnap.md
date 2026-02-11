# TAGLINE

Encrypted deduplicated online backup

# TLDR

**Create backup**

```tarsnap -c -f [backup-name] [/path/to/backup]```

**List archives**

```tarsnap --list-archives```

**List contents of archive**

```tarsnap -t -f [backup-name]```

**Extract archive**

```tarsnap -x -f [backup-name]```

**Delete archive**

```tarsnap -d -f [backup-name]```

**Show statistics**

```tarsnap --print-stats```

**Dry run** (show what would be backed up)

```tarsnap -c --dry-run -f [test] [/path/to/backup]```

# SYNOPSIS

**tarsnap** [_-c_] [_-x_] [_-t_] [_-d_] [_-f archive_] [_options_] [_paths_]

# PARAMETERS

**-c**
> Create archive.

**-x**
> Extract archive.

**-t**
> List archive contents.

**-d**
> Delete archive.

**-f** _ARCHIVE_
> Archive name.

**--list-archives**
> List all archives.

**--print-stats**
> Show usage statistics.

**--dry-run**
> Simulation mode.

**-v**
> Verbose.

**--keyfile** _FILE_
> Key file location.

**--cachedir** _DIR_
> Cache directory.

**-C** _DIR_
> Change to directory.

**--include** _PATTERN_
> Include files matching.

**--exclude** _PATTERN_
> Exclude files matching.

# DESCRIPTION

**tarsnap** provides secure, deduplicated online backup. Data is encrypted before leaving your computer and stored in the cloud.

Deduplication stores identical blocks only once. Incremental backups are efficient, transferring only new or changed data.

Client-side encryption ensures only you can read your data. Keys are generated locally and never shared with the server.

Archive names are arbitrary strings. Common patterns include hostnames, dates, or descriptive names.

Statistics show storage usage and deduplication efficiency. Billing is based on stored and transferred bytes.

The tool is command-line only, designed for scripting and automation. Cron jobs commonly run scheduled backups.

# CAVEATS

Requires paid account. Key loss means data loss - no recovery possible. Initial backup can take time. Priced per byte.

# HISTORY

**Tarsnap** was created by **Colin Percival** around **2008**. A former FreeBSD security officer, Percival designed Tarsnap with security as the primary goal. The service emphasizes cryptographic correctness.

# SEE ALSO

[tar](/man/tar)(1), [restic](/man/restic)(1), [borg](/man/borg)(1), [duplicity](/man/duplicity)(1)
