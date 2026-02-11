# TAGLINE

Kubernetes cluster backup and restore

# TLDR

**Create backup**

```velero backup create [backup-name]```

**List backups**

```velero backup get```

**Restore from backup**

```velero restore create --from-backup [backup-name]```

**Schedule backup**

```velero schedule create [daily] --schedule="0 1 * * *"```

**Describe backup**

```velero backup describe [backup-name]```

**Delete backup**

```velero backup delete [backup-name]```

**List restores**

```velero restore get```

**Install Velero**

```velero install --provider [aws] --bucket [bucket-name]```

# SYNOPSIS

**velero** _command_ [_options_]

# PARAMETERS

**backup create** _NAME_
> Create backup.

**backup get**
> List backups.

**restore create**
> Restore from backup.

**schedule create** _NAME_
> Create schedule.

**--from-backup** _NAME_
> Source backup.

**--schedule** _CRON_
> Cron schedule.

**--include-namespaces** _NS_
> Limit namespaces.

**--provider** _PROVIDER_
> Storage provider.

# DESCRIPTION

**velero** provides backup and restore capabilities for Kubernetes clusters. It captures cluster resource definitions and persistent volume snapshots, storing them in cloud object storage such as S3, GCS, or Azure Blob Storage.

Backups can be created on demand or automated with cron-based schedules. Restores recreate resources from backups, supporting both full cluster recovery and selective restoration by namespace or resource type. The tool is commonly used for disaster recovery, cluster migration, and pre-upgrade snapshots.

# CAVEATS

Requires object storage. Volume snapshots depend on provider. Some resources excluded by default.

# HISTORY

**Velero** (formerly Heptio Ark) was created for Kubernetes backup. Now maintained by VMware as part of the Tanzu portfolio.

# SEE ALSO

[kubectl](/man/kubectl)(1), [restic](/man/restic)(1)
