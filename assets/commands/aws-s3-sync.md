# TAGLINE

Synchronize directories and S3 prefixes

# TLDR

**Sync a local directory** to an S3 bucket

```aws s3 sync [./local-dir] s3://[bucket-name]/```

**Download S3 bucket** to local directory

```aws s3 sync s3://[bucket-name]/ [./local-dir]```

**Sync between two S3 buckets**

```aws s3 sync s3://[source-bucket] s3://[dest-bucket]```

**Sync and delete** files not in source

```aws s3 sync [./local-dir] s3://[bucket-name]/ --delete```

**Sync excluding** certain file types

```aws s3 sync [./local-dir] s3://[bucket-name]/ --exclude "*.log"```

**Preview sync operation** without executing

```aws s3 sync [./local-dir] s3://[bucket-name]/ --dryrun```

**Sync only new files** without overwriting

```aws s3 sync [./local-dir] s3://[bucket-name]/ --no-overwrite```

# SYNOPSIS

**aws s3 sync** _source_ _destination_ [_options_]

# DESCRIPTION

**aws s3 sync** synchronizes directories and S3 prefixes by recursively copying new and updated files from the source to the destination. It only transfers files that are new or have changed, making it efficient for incremental backups and deployments.

By default, sync compares file size and last modified time to determine which files need updating. It creates folders in the destination only if they contain files.

# PARAMETERS

**--delete**
> Delete destination files that don't exist in the source

**--dryrun**
> Display operations that would be performed without executing them

**--quiet**
> Suppress all output except errors

**--no-overwrite**
> Only transfer files not present at the destination

**--size-only**
> Use file size alone to determine if sync is needed (ignore timestamps)

**--exact-timestamps**
> Match timestamps exactly when syncing from S3 to local

**--include** _pattern_
> Include files matching the pattern

**--exclude** _pattern_
> Exclude files matching the pattern from the sync

**--acl** _value_
> Set access control list: private, public-read, etc.

**--storage-class** _value_
> Specify storage class: STANDARD, STANDARD_IA, GLACIER, etc.

**--source-region** _value_
> Source bucket region (required for cross-region S3 to S3 sync)

# CAVEATS

The **--delete** option removes files from the destination that don't exist in the source; use with caution. Pattern matching with **--include** and **--exclude** is order-dependent. When syncing to local, directories are not created unless they contain files. Sync does not preserve symbolic links.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3-cp](/man/aws-s3-cp)(1), [rsync](/man/rsync)(1)
