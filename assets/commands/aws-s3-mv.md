# TAGLINE

Move files to, from, and between S3 buckets

# TLDR

**Move a local file** to S3

```aws s3 mv [file.txt] s3://[bucket-name]/```

**Move an S3 object** to another S3 location

```aws s3 mv s3://[bucket-name]/[file.txt] s3://[bucket-name]/[new-path/file.txt]```

**Download and delete** an S3 object

```aws s3 mv s3://[bucket-name]/[file.txt] [./local-file.txt]```

**Recursively move** a directory to S3

```aws s3 mv [./local-dir] s3://[bucket-name]/[prefix/] --recursive```

**Move excluding certain files**

```aws s3 mv [./local-dir] s3://[bucket-name]/ --recursive --exclude "*.log"```

**Preview move operation** without executing

```aws s3 mv [./local-dir] s3://[bucket-name]/ --recursive --dryrun```

# SYNOPSIS

**aws s3 mv** _source_ _destination_ [_options_]

# DESCRIPTION

**aws s3 mv** moves files between the local filesystem and Amazon S3, or between S3 locations. The command copies the source to the destination and then deletes the source object or file.

The source and destination can be a LocalPath or an S3Uri (s3://bucket-name/key). For S3 to S3 moves, the command performs a server-side copy followed by deletion of the source.

# PARAMETERS

**--recursive**
> Move all files and objects under the specified directory or S3 prefix

**--dryrun**
> Display operations that would be performed without executing them

**--quiet**
> Suppress output during the move operation

**--include** _pattern_
> Include files matching the pattern (used with --exclude)

**--exclude** _pattern_
> Exclude files matching the pattern from the move operation

**--acl** _value_
> Set access control list: private, public-read, public-read-write, authenticated-read

**--storage-class** _value_
> Specify storage class: STANDARD, REDUCED_REDUNDANCY, STANDARD_IA, GLACIER

**--sse** _value_
> Enable server-side encryption: AES256 or aws:kms

**--no-overwrite**
> Prevent overwriting existing files at the destination

**--validate-same-s3-paths**
> Verify source and destination resolve to different locations (safety check)

# CAVEATS

When using access point ARNs or aliases, ensure source and destination resolve to different buckets to prevent accidental self-deletion. Use **--validate-same-s3-paths** for safety. The source is only deleted after successful copy; if the copy fails, the source remains intact.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3-cp](/man/aws-s3-cp)(1), [aws-s3-rm](/man/aws-s3-rm)(1), [mv](/man/mv)(1)
