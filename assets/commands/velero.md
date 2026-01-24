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

**velero** backs up Kubernetes clusters. It protects resources and persistent volumes.

Backups capture cluster state. Resources and volume snapshots included.

Restores recreate from backups. Disaster recovery and migration.

Schedules automate backups. Cron expressions define timing.

Storage providers include S3, GCS, Azure. Also supports Minio.

Namespace filtering targets specific resources. Selective backup and restore.

# CAVEATS

Requires object storage. Volume snapshots depend on provider. Some resources excluded by default.

# HISTORY

**Velero** (formerly Heptio Ark) was created for Kubernetes backup. Now maintained by VMware as part of the Tanzu portfolio.

# SEE ALSO

[kubectl](/man/kubectl)(1), [restic](/man/restic)(1)
