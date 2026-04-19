# TAGLINE

Exoscale S3-compatible object storage management

# TLDR

**List buckets**

```exo storage list```

**Create a bucket**

```exo storage mb --zone [ch-gva-2] sos://[bucket-name]```

**Upload file**

```exo storage upload [file] sos://[bucket]/[path]```

**Download file**

```exo storage download sos://[bucket]/[file] [local_path]```

**List bucket contents**

```exo storage list sos://[bucket]```

**Delete object**

```exo storage delete sos://[bucket]/[file]```

# SYNOPSIS

**exo** **storage** _command_ [_options_]

# SUBCOMMANDS

**list**
> List buckets or objects.

**mb**
> Create (make) a bucket.

**rb**
> Remove a bucket.

**upload**
> Upload files to a bucket.

**download**
> Download files from a bucket.

**delete**
> Delete an object.

**show**
> Show bucket or object details.

**presign**
> Generate a presigned URL for an object.

**setacl**
> Set bucket/object ACL permissions.

**cors**
> Manage CORS configuration (add, delete).

**headers**
> Manage custom HTTP headers (add, delete).

**metadata**
> Manage object metadata (add, delete).

**bucket**
> Manage bucket settings (object-ownership, replication, versioning).

**purge**
> Remove all objects from a bucket.

# DESCRIPTION

**exo storage** manages Exoscale Simple Object Storage (SOS), an S3-compatible object storage service. Store and retrieve files with HTTP access.

SOS provides scalable object storage for backups, static assets, media files, and data lakes. Being S3-compatible, it works with standard tools like s3cmd, rclone, and AWS SDKs.

The tool supports bucket management, file uploads/downloads, presigned URLs for temporary access, and CORS configuration for web applications.

# SEE ALSO

[exo](/man/exo)(1), [aws-s3](/man/aws-s3)(1)

