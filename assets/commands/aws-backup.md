# TAGLINE

Centrally manage backups across AWS services

# TLDR

**Create** a backup vault

```aws backup create-backup-vault --backup-vault-name [vault_name]```

**Create** a backup plan

```aws backup create-backup-plan --backup-plan [file://plan.json]```

**Start** an on-demand backup job

```aws backup start-backup-job --backup-vault-name [vault] --resource-arn [arn] --iam-role-arn [role_arn]```

**List** all backup vaults

```aws backup list-backup-vaults```

**List** recovery points in a vault

```aws backup list-recovery-points-by-backup-vault --backup-vault-name [vault]```

**Start** a restore job from a recovery point

```aws backup start-restore-job --recovery-point-arn [arn] --iam-role-arn [role_arn] --metadata [restore_metadata]```

# SYNOPSIS

**aws backup** _command_ [_options_]

# DESCRIPTION

**AWS Backup** is a unified, fully managed backup service designed to protect AWS resources and their associated data across multiple AWS services. It centralizes and automates backup operations, eliminating the need to create custom scripts and manual processes for each AWS service.

The service simplifies backup management by providing:

> **Centralized Backup Management** - Create backup plans with retention policies and schedules that apply across AWS services including Amazon EBS, Amazon RDS, Amazon DynamoDB, Amazon EFS, Amazon FSx, AWS Storage Gateway, Amazon EC2, and more

> **Policy-Based Backup Plans** - Define backup policies that specify frequency, retention, and lifecycle rules, automatically applying them to resources via tags or resource IDs

> **Cross-Region and Cross-Account Backup** - Copy backups to different AWS regions or accounts for disaster recovery and compliance requirements

> **Backup Vaults** - Organize and secure recovery points in encrypted vaults with access policies and resource-based permissions

> **Compliance and Audit** - Monitor backup activity through AWS Backup Audit Manager frameworks, generate compliance reports, and track backup coverage across your organization

The service integrates with **AWS Organizations** for centralized backup policies, **AWS CloudTrail** for audit logging, and **Amazon EventBridge** for event-driven workflows. It supports **point-in-time recovery** for continuous backup services and **incremental backups** to minimize storage costs.

# AVAILABLE COMMANDS

**create-backup-vault**
> Create a vault to store recovery points

**delete-backup-vault**
> Delete an empty backup vault

**list-backup-vaults**
> List all backup vaults in the account

**create-backup-plan**
> Create a backup plan with rules and schedules

**update-backup-plan**
> Modify an existing backup plan

**delete-backup-plan**
> Remove a backup plan

**list-backup-plans**
> List all backup plans

**create-backup-selection**
> Define which resources a backup plan applies to

**start-backup-job**
> Initiate an on-demand backup for a resource

**stop-backup-job**
> Cancel a running backup job

**list-backup-jobs**
> View backup job history and status

**start-restore-job**
> Restore a resource from a recovery point

**list-restore-jobs**
> View restore job history and status

**list-recovery-points-by-backup-vault**
> List all recovery points in a vault

**delete-recovery-point**
> Delete a specific recovery point

**start-copy-job**
> Copy a recovery point to another vault or region

**create-framework**
> Create compliance framework for backup auditing

**create-report-plan**
> Generate reports on backup activity and compliance

**create-legal-hold**
> Apply legal hold to prevent deletion of recovery points

**put-backup-vault-access-policy**
> Configure vault access permissions

**tag-resource**
> Add tags to backup resources for organization

# CAVEATS

IAM roles with appropriate permissions are required for backup and restore operations. Some services require specific backup configurations or have limitations on restore options. Cross-region copy incurs data transfer costs. Deleting a vault requires it to be empty of all recovery points.

# HISTORY

**AWS Backup** was announced at **AWS re:Invent 2018** and launched in **January 2019** as a centralized backup service. Over time, it expanded support to include more AWS services and added features like cross-account backup, audit frameworks, and legal hold capabilities.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-rds](/man/aws-rds)(1), [aws-dynamodb](/man/aws-dynamodb)(1), [aws-efs](/man/aws-efs)(1), [aws](/man/aws)(1)
