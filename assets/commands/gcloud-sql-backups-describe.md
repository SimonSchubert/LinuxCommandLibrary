# TAGLINE

displays backup information

# TLDR

**Describe a backup**

```gcloud sql backups describe [backup_id] --instance [instance_name]```

**Describe in JSON format**

```gcloud sql backups describe [backup_id] --instance [instance] --format json```

# SYNOPSIS

**gcloud** **sql** **backups** **describe** _backup_id_ **--instance**=_instance_ [_options_]

# PARAMETERS

**--instance** _name_
> Cloud SQL instance name.

**--format** _format_
> Output format.

# DESCRIPTION

**gcloud sql backups describe** displays detailed information about a specific Cloud SQL backup. It retrieves metadata including backup status, type (on-demand or automatic), creation timestamp, completion time, and backup size.

The command is useful for verifying backup completion, checking backup integrity before restoration, and auditing backup operations. Output can be formatted as JSON or YAML for programmatic processing or integration with automation scripts.

# SEE ALSO

[gcloud-sql-backups](/man/gcloud-sql-backups)(1), [gcloud-sql-backups-list](/man/gcloud-sql-backups-list)(1)

