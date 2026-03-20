# TAGLINE

command-line tool for backing up and restoring Gmail

# TLDR

**Backup Gmail**

```gyb --email [user@gmail.com] --action backup```

**Restore emails**

```gyb --email [user@gmail.com] --action restore```

**Estimate backup size**

```gyb --email [user@gmail.com] --action estimate```

**Backup only recent messages**

```gyb --email [user@gmail.com] --action backup --search "newer_than:[7d]"```

**Count messages**

```gyb --email [user@gmail.com] --action count```

**Fast incremental backup** (skip refreshing labels for already-backed-up messages)

```gyb --email [user@gmail.com] --action backup --fast-incremental```

# SYNOPSIS

**gyb** [_options_]

# PARAMETERS

**--email** _ADDR_
> Gmail address.

**--action** _ACT_
> Action: backup, restore, restore-mbox, estimate, count, purge, print-labels, quota, reindex.

**--local-folder** _DIR_
> Local backup directory.

**--search** _QUERY_
> Gmail search query to filter messages.

**--fast-incremental**
> Skip refreshing labels/flags for already-backed-up messages.

**--label-restored** _LABEL_
> On restore, additionally apply this label to all messages.

**--strip-labels**
> Remove existing labels during restore.

**--spam-trash**
> Include Spam and Trash folders.

**--service-account**
> Use Google Service Account authentication.

**--help**
> Display help information.

# DESCRIPTION

**GYB** (Got Your Back) is a command-line tool for backing up and restoring Gmail using the Gmail API over HTTPS.

It supports incremental backups, search queries to filter specific messages, and can also restore from mbox exports (e.g., Google Takeout). Backups are stored locally with a SQLite index.

# CAVEATS

Requires OAuth authorization. Rate limited by Gmail API. Large mailboxes take time.

# HISTORY

GYB was created by **Jay Lee** as an open-source Gmail backup tool, widely used for Google Workspace migrations.

# SEE ALSO

[offlineimap](/man/offlineimap)(1), [mbsync](/man/mbsync)(1), [mutt](/man/mutt)(1)
