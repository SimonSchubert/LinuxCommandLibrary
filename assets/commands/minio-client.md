# TLDR

**Set alias**

```mc alias set [myminio] [https://minio.example.com] [access_key] [secret_key]```

**List buckets**

```mc ls [myminio]```

**Copy file**

```mc cp [file.txt] [myminio/bucket/]```

**Mirror directory**

```mc mirror [local/] [myminio/bucket/]```

**Remove file**

```mc rm [myminio/bucket/file.txt]```

**Make bucket**

```mc mb [myminio/newbucket]```

# SYNOPSIS

**mc** _command_ [_options_] [_args_]

# PARAMETERS

_COMMAND_
> MinIO client command.

**alias**
> Manage server aliases.

**ls**
> List objects.

**cp**
> Copy objects.

**mirror**
> Sync directories.

**rm**
> Remove objects.

**--help**
> Display help information.

# DESCRIPTION

**minio-client** (mc) manages MinIO and S3 storage. It provides file operations for object storage.

The tool works with MinIO servers and AWS S3. Supports multiple cloud providers.

minio-client manages object storage.

# CAVEATS

Configure aliases first. S3 compatible. Different from Midnight Commander mc.

# HISTORY

MinIO Client was created by **MinIO** for managing object storage across cloud providers.

# SEE ALSO

[minio-server](/man/minio-server)(1), [aws](/man/aws)(1), [s3cmd](/man/s3cmd)(1)

