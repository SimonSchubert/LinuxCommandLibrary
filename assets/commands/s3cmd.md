# TLDR

**Configure s3cmd** (interactive setup)

```s3cmd --configure```

**List all buckets**

```s3cmd ls```

**List contents of a bucket**

```s3cmd ls s3://[bucket_name]```

**Create a bucket**

```s3cmd mb s3://[bucket_name]```

**Upload a file**

```s3cmd put [file] s3://[bucket_name]/```

**Download a file**

```s3cmd get s3://[bucket_name]/[file]```

**Sync local directory to S3**

```s3cmd sync [local_dir]/ s3://[bucket_name]/[path]/```

**Delete a file**

```s3cmd del s3://[bucket_name]/[file]```

**Delete a bucket** (must be empty)

```s3cmd rb s3://[bucket_name]```

# SYNOPSIS

**s3cmd** [_options_] _command_ [_parameters_]

# PARAMETERS

**ls** [_s3://bucket_]
> List buckets or objects

**mb** _s3://bucket_
> Make bucket

**rb** _s3://bucket_
> Remove bucket

**put** _file_ _s3://bucket/path_
> Upload file

**get** _s3://bucket/path_ [_local_]
> Download file

**del** _s3://bucket/path_
> Delete object

**sync** _source_ _dest_
> Sync directories (local to S3 or S3 to local)

**cp** _src_ _dst_
> Copy object

**mv** _src_ _dst_
> Move object

**info** _s3://bucket/object_
> Get info on bucket or object

**du** [_s3://bucket_]
> Disk usage

**--configure**
> Interactive configuration

**--recursive**, **-r**
> Recursive operation

**--delete-removed**
> Delete files not in source during sync

**--dry-run**, **-n**
> Show what would be done

**--acl-public**
> Make uploaded files public

**--acl-private**
> Make uploaded files private

**--exclude** _pattern_
> Exclude files matching pattern

**--include** _pattern_
> Include files matching pattern

# DESCRIPTION

**s3cmd** is a command-line tool for managing Amazon S3 and S3-compatible storage services. It provides a familiar interface for uploading, downloading, and managing files in cloud object storage.

Configuration is stored in **~/.s3cfg** and includes access keys, encryption settings, and default options. Run **--configure** for interactive setup.

The **sync** command is particularly powerful for backups, mirroring directories to S3 while only transferring changed files. With **--delete-removed**, it creates exact mirrors.

S3cmd supports server-side encryption, multipart uploads for large files, and can work with S3-compatible services like MinIO, DigitalOcean Spaces, and Wasabi.

# CAVEATS

AWS credentials in ~/.s3cfg should have restricted permissions (600). Never commit credentials to version control.

Sync operations compare by size and modification time by default. Use **--check-md5** for checksum verification at the cost of speed.

Large file uploads automatically use multipart upload. For very large files, increase **--multipart-chunk-size-mb**.

Bucket names must be globally unique across all AWS accounts and follow DNS naming conventions.

# SEE ALSO

[aws](/man/aws)(1), [rclone](/man/rclone)(1), [gsutil](/man/gsutil)(1), [mc](/man/mc)(1)
