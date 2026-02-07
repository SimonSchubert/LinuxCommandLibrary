# TAGLINE

Manage Amazon Elastic File System resources

# TLDR

**List all file systems**

```aws efs describe-file-systems```

**Create a new file system**

```aws efs create-file-system --creation-token [unique_token]```

**Describe a specific file system**

```aws efs describe-file-systems --file-system-id [fs-xxxxxxxx]```

**Create a mount target** in a subnet

```aws efs create-mount-target --file-system-id [fs-xxxxxxxx] --subnet-id [subnet-xxxxxxxx] --security-groups [sg-xxxxxxxx]```

**List mount targets** for a file system

```aws efs describe-mount-targets --file-system-id [fs-xxxxxxxx]```

**Delete a file system**

```aws efs delete-file-system --file-system-id [fs-xxxxxxxx]```

**Add a lifecycle policy** for infrequent access storage

```aws efs put-lifecycle-configuration --file-system-id [fs-xxxxxxxx] --lifecycle-policies TransitionToIA=AFTER_30_DAYS```

# SYNOPSIS

**aws efs** _subcommand_ [_options_]

# DESCRIPTION

**aws efs** is a subcommand of the AWS CLI that manages Amazon Elastic File System, a serverless NFS file system for EC2 instances and on-premises servers. EFS automatically grows and shrinks as files are added or removed.

File systems are accessed through mount targets, which provide IP addresses in your VPC subnets. Multiple EC2 instances can mount the same file system concurrently, making EFS suitable for shared workloads like web serving, content management, and container storage.

EFS supports two storage classes: Standard for frequently accessed data, and Infrequent Access (IA) for cost optimization. Lifecycle policies automatically move files between classes based on access patterns.

# PARAMETERS

**describe-file-systems**
> List file systems and their details.

**create-file-system**
> Create a new EFS file system.

**delete-file-system**
> Remove a file system (must be empty).

**describe-mount-targets**
> List mount targets for a file system.

**create-mount-target**
> Create a mount target in a subnet.

**delete-mount-target**
> Remove a mount target.

**put-lifecycle-configuration**
> Set lifecycle policies for storage class transitions.

**describe-lifecycle-configuration**
> View current lifecycle policies.

**--file-system-id** _id_
> The file system identifier (fs-xxxxxxxx).

**--creation-token** _token_
> Idempotency token for creating file systems.

**--subnet-id** _id_
> Subnet for the mount target.

**--security-groups** _ids_
> Security groups for the mount target.

**--performance-mode** _mode_
> generalPurpose or maxIO.

**--throughput-mode** _mode_
> bursting, provisioned, or elastic.

# CAVEATS

Delete all mount targets before deleting a file system. Mount targets require one per Availability Zone for high availability. Security groups must allow NFS traffic (port 2049). Performance mode cannot be changed after creation. Cross-region access requires VPC peering or Transit Gateway.

# HISTORY

Amazon EFS was announced at **AWS re:Invent 2015** and became generally available in **June 2016**. It was AWS's first managed NFS service. **Infrequent Access** storage class was added in **2019** for cost optimization. **EFS One Zone** storage classes launched in **2021** for single-AZ workloads at lower cost. Elastic throughput mode was introduced in **2022**.

# SEE ALSO

[aws](/man/aws)(1), [mount](/man/mount)(8), [nfs](/man/nfs)(5), [aws-fsx](/man/aws-fsx)(1)
