# TLDR

**List buckets**

```exo storage list```

**Create a bucket**

```exo storage create sos://[bucket-name] --zone [ch-gva-2]```

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

**create**
> Create a bucket.

**upload**
> Upload files.

**download**
> Download files.

**delete**
> Delete bucket or object.

**show**
> Show bucket details.

**presign**
> Generate presigned URL.

# DESCRIPTION

**exo storage** manages Exoscale Simple Object Storage (SOS), an S3-compatible object storage service. Store and retrieve files with HTTP access.

# SEE ALSO

[exo](/man/exo)(1), [aws-s3](/man/aws-s3)(1)

