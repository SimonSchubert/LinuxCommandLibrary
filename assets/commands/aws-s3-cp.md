# TLDR

**Copy a local file** to an S3 bucket

```aws s3 cp [file.txt] s3://[bucket-name]/```

**Download an S3 object** to local filesystem

```aws s3 cp s3://[bucket-name]/[file.txt] [./local-file.txt]```

**Copy an object** between S3 locations

```aws s3 cp s3://[source-bucket]/[file.txt] s3://[dest-bucket]/[file.txt]```

**Recursively copy** a directory to S3

```aws s3 cp [./local-dir] s3://[bucket-name]/[prefix/] --recursive```

**Copy with specific storage class**

```aws s3 cp [file.txt] s3://[bucket-name]/ --storage-class [STANDARD_IA]```

**Copy excluding certain files**

```aws s3 cp [./local-dir] s3://[bucket-name]/ --recursive --exclude "*.log"```

**Preview copy operation** without executing

```aws s3 cp [./local-dir] s3://[bucket-name]/ --recursive --dryrun```

# SYNOPSIS

**aws s3 cp** _source_ _destination_ [_options_]

# DESCRIPTION

**aws s3 cp** copies files between the local filesystem and Amazon S3, or between S3 locations. The source and destination can be a LocalPath (local file/directory) or an S3Uri (s3://bucket-name/key).

The command supports single file transfers, recursive directory copies, and streaming data to/from S3. It handles multipart uploads automatically for large files and can preserve or modify object metadata during copies.

# PARAMETERS

**--recursive**
> Copy all files and objects under the specified directory or S3 prefix

**--dryrun**
> Display operations that would be performed without executing them

**--quiet**
> Suppress all output during the copy operation

**--include** _pattern_
> Include files matching the pattern (used with --exclude)

**--exclude** _pattern_
> Exclude files matching the pattern from the copy operation

**--acl** _value_
> Set access control list: private, public-read, public-read-write, authenticated-read, bucket-owner-full-control

**--storage-class** _value_
> Specify storage class: STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, ONEZONE_IA, INTELLIGENT_TIERING, GLACIER, DEEP_ARCHIVE, GLACIER_IR

**--sse** _value_
> Enable server-side encryption: AES256 or aws:kms

**--sse-kms-key-id** _value_
> KMS key ID for server-side encryption with AWS KMS

**--metadata** _value_
> Custom metadata to store with the S3 object (JSON format)

**--content-type** _value_
> Override the MIME type of the uploaded object

**--expires** _value_
> Set the Expires header (e.g., 2024-12-31T23:59:59Z)

**--no-overwrite**
> Prevent overwriting existing files at the destination

**--expected-size** _value_
> Expected stream size in bytes (required for streams over 50GB)

**--follow-symlinks** / **--no-follow-symlinks**
> Follow symbolic links when copying (default: follow)

# CAVEATS

When copying directories recursively, use trailing slashes consistently to control prefix behavior. Pattern matching with **--include** and **--exclude** is order-dependent. Copying to/from Glacier storage class requires special flags (**--force-glacier-transfer**). Streaming operations from stdin require **--expected-size** for files larger than 50GB.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3-sync](/man/aws-s3-sync)(1), [aws-s3-mv](/man/aws-s3-mv)(1), [aws-s3api](/man/aws-s3api)(1)
