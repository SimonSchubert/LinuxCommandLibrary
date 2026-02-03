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

**gcloud sql backups describe** displays information about a Cloud SQL backup including status, type, timestamps, and size.

# SEE ALSO

[gcloud-sql-backups](/man/gcloud-sql-backups)(1), [gcloud-sql-backups-list](/man/gcloud-sql-backups-list)(1)

