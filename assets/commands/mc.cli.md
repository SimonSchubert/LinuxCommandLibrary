# TAGLINE

minIO Client

# TLDR

**List buckets**

```mc ls [alias]```

**Make bucket**

```mc mb [alias/bucket]```

**Copy file**

```mc cp [file] [alias/bucket/]```

**Set alias**

```mc alias set [name] [url] [access_key] [secret_key]```

**Mirror directory**

```mc mirror [dir/] [alias/bucket/]```

**Show object info**

```mc stat [alias/bucket/object]```

# SYNOPSIS

**mc** _command_ [_options_] [_args_]

# PARAMETERS

_COMMAND_
> MinIO operation.

**ls**
> List buckets/objects.

**mb**
> Make bucket.

**cp**
> Copy objects.

**alias**
> Manage aliases.

**mirror**
> Sync directories.

**--help**
> Display help information.

# DESCRIPTION

**mc** is the MinIO Client. It provides cloud storage operations for MinIO and S3-compatible services.

The tool manages buckets, objects, and policies. Works with AWS S3, GCS, and MinIO servers.

# CAVEATS

Configure aliases first. S3 compatible. Distinct from Midnight Commander.

# HISTORY

mc (MinIO Client) was created by **MinIO** for managing object storage across cloud providers.

# SEE ALSO

[minio-server](/man/minio-server)(1), [aws](/man/aws)(1), [s3cmd](/man/s3cmd)(1)

