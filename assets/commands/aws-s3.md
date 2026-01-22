# TLDR

**List all buckets** in your account

```aws s3 ls```

**List objects** in a bucket

```aws s3 ls s3://[bucket-name]/```

**Copy a local file** to S3

```aws s3 cp [file.txt] s3://[bucket-name]/```

**Download a file** from S3

```aws s3 cp s3://[bucket-name]/[file.txt] [./local-file.txt]```

**Sync a local directory** to an S3 bucket

```aws s3 sync [./local-dir] s3://[bucket-name]/[prefix/]```

**Create a new bucket**

```aws s3 mb s3://[bucket-name]```

**Remove an empty bucket**

```aws s3 rb s3://[bucket-name]```

**Delete an object** from S3

```aws s3 rm s3://[bucket-name]/[file.txt]```

# SYNOPSIS

**aws s3** _command_ [_arguments_] [_options_]

# DESCRIPTION

**aws s3** provides high-level commands for managing Amazon S3 buckets and objects. It offers a simplified interface for common S3 operations like copying, syncing, and listing files, abstracting away the complexity of the underlying S3 API.

The command uses two types of path arguments: **LocalPath** (absolute or relative path to local files) and **S3Uri** (S3 resource path in the form **s3://bucket-name/key**). Most commands accept a source as the first argument and an optional destination as the second.

For low-level S3 API access with full control over request parameters, use **aws s3api** instead.

# SUBCOMMANDS

**cp**
> Copy files between local filesystem and S3, or between S3 locations

**ls**
> List S3 buckets or objects within a bucket/prefix

**mb**
> Make (create) a new S3 bucket

**mv**
> Move files between local filesystem and S3, or between S3 locations

**presign**
> Generate a pre-signed URL for time-limited access to an S3 object

**rb**
> Remove (delete) an S3 bucket

**rm**
> Remove (delete) S3 objects

**sync**
> Synchronize directories and S3 prefixes (uploads new/changed files)

**website**
> Configure S3 bucket website hosting settings

# PARAMETERS

**--recursive**
> Apply command recursively to all files under a directory or S3 prefix

**--exclude** _pattern_
> Exclude files matching the pattern from the operation

**--include** _pattern_
> Include files matching the pattern (used with --exclude)

**--dryrun**
> Display operations that would be performed without executing them

**--acl** _value_
> Set the access control list (private, public-read, etc.)

**--storage-class** _value_
> Specify storage class (STANDARD, REDUCED_REDUNDANCY, GLACIER, etc.)

# CAVEATS

The **sync** command only copies new or modified files by default; use **--delete** to remove files in the destination that don't exist in the source. Pattern matching with **--exclude** and **--include** is order-dependent; filters are applied in the order specified. The **rb** command fails on non-empty buckets unless **--force** is used.

# HISTORY

Amazon S3 (Simple Storage Service) launched in **March 2006** as one of AWS's first services. The **aws s3** high-level CLI commands were introduced with AWS CLI version 1 in **2013** to simplify common operations that previously required multiple API calls through **s3api**. The sync command and multipart upload support have been enhanced over subsequent releases.

# SEE ALSO

[aws](/man/aws)(1), [aws-s3api](/man/aws-s3api)(1), [aws-s3-cp](/man/aws-s3-cp)(1), [aws-s3-sync](/man/aws-s3-sync)(1)
