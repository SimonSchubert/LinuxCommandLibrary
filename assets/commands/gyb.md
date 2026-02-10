# TAGLINE

command-line tool for backing up and restoring Gmail

# TLDR

**Backup Gmail**

```gyb --email [user@gmail.com] --action backup```

**Restore emails**

```gyb --email [user@gmail.com] --action restore```

**Estimate backup size**

```gyb --email [user@gmail.com] --action estimate```

**Backup specific label**

```gyb --email [user@gmail.com] --action backup --label-group [label]```

**Count messages**

```gyb --email [user@gmail.com] --action count```

# SYNOPSIS

**gyb** [_options_]

# PARAMETERS

**--email** _ADDR_
> Gmail address.

**--action** _ACT_
> Action: backup, restore, estimate, count.

**--local-folder** _DIR_
> Local backup directory.

**--label-group** _LABEL_
> Specific label to backup.

**--search** _QUERY_
> Gmail search query.

**--service-account**
> Use service account.

**--help**
> Display help information.

# DESCRIPTION

**GYB** (Got Your Back) is a command-line tool for backing up and restoring Gmail. It downloads emails as standard mbox format.

The tool uses Gmail API for reliable access. It supports incremental backups, label filtering, and search queries to select specific messages.

# CAVEATS

Requires OAuth authorization. Rate limited by Gmail API. Large mailboxes take time.

# HISTORY

GYB was created by **Jay Lee** as an open-source Gmail backup tool, widely used for Google Workspace migrations.

# SEE ALSO

[offlineimap](/man/offlineimap)(1), [mbsync](/man/mbsync)(1), [mutt](/man/mutt)(1)
