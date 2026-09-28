# TAGLINE

MinIO Client for S3-compatible object storage

# TLDR

**Set alias** for a server

```mc alias set [myminio] [https://minio.example.com] [access_key] [secret_key]```

**List buckets** of an alias

```mc ls [myminio]```

**Make bucket**

```mc mb [myminio/bucket]```

**Copy file** to a bucket

```mc cp [file] [myminio/bucket/]```

Copy a directory **recursively**

```mc cp --recursive [dir/] [myminio/bucket/dir/]```

**Mirror directory**, deleting remote files that no longer exist locally

```mc mirror --overwrite --remove [dir/] [myminio/bucket/]```

Keep **watching** a directory and mirror changes

```mc mirror --watch [dir/] [myminio/bucket/]```

**Show object info**

```mc stat [myminio/bucket/object]```

Remove all objects under a prefix

```mc rm --recursive --force [myminio/bucket/prefix/]```

Create a **temporary download link**

```mc share download --expire [24h] [myminio/bucket/object]```

Show **disk usage** of a bucket

```mc du [myminio/bucket]```

# SYNOPSIS

**mc** [_global flags_] _command_ [_flags_] [_arguments_]

# PARAMETERS

**alias**
> Manage server aliases (set, list, remove) in the configuration file.

**ls**
> List buckets and objects.

**mb** / **rb**
> Make or remove a bucket.

**cp** / **mv** / **rm**
> Copy, move or remove objects.

**mirror**
> Synchronize objects between directories and buckets.

**cat** / **head** / **pipe**
> Print object contents, or stream stdin to an object.

**find**
> Search for objects.

**diff**
> List differences between two buckets or directories.

**du**
> Summarize disk usage.

**stat**
> Show object or bucket metadata.

**share**
> Generate presigned URLs for temporary access.

**anonymous**
> Manage anonymous (public) access to buckets and objects.

**version**, **ilm**, **replicate**, **retention**, **tag**
> Manage bucket versioning, lifecycle, replication, retention and tags.

**admin**
> Manage MinIO servers (users, policies, info, heal).

**--json**
> Output in JSON lines format.

**--insecure**
> Disable TLS certificate verification.

**-C**, **--config-dir** _DIR_
> Path to the configuration folder (default ~/.mc).

**-q**, **--quiet**
> Disable progress bar display.

**--debug**
> Enable debug output.

**--help**
> Display help information.

# DESCRIPTION

**mc** is the MinIO Client. It provides UNIX-like commands (ls, cat, cp, mirror, diff, find and more) for MinIO and other Amazon S3-compatible object storage services as well as local filesystems.

Servers are addressed through **aliases** stored in ~/.mc/config.json; paths take the form _alias_/_bucket_/_object_. The **play** alias points to MinIO's public test server.

# CAVEATS

Configure aliases first. The binary is named **mc**, which clashes with Midnight Commander; some distributions install it as **mcli** or **minio-client** instead. Most **admin** subcommands only work against MinIO servers, not other S3 providers.

# HISTORY

mc (MinIO Client) was created by **MinIO, Inc.** around **2015**, alongside the MinIO server, and is written in **Go**. After MinIO wound down its open-source community edition in late 2025, the **minio/mc** GitHub repository was archived (read-only) and development moved to the commercial AIStor product line. Existing binaries still work with S3-compatible services.

# SEE ALSO

[minio-client](/man/minio-client)(1), [minio-server](/man/minio-server)(1), [aws](/man/aws)(1), [s3cmd](/man/s3cmd)(1), [rclone](/man/rclone)(1)

# RESOURCES

```[Source code](https://github.com/minio/mc)```

<!-- verified: 2026-09-29 -->
