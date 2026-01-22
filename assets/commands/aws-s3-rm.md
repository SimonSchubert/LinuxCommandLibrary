# TLDR

**Delete a single object** from S3

```aws s3 rm s3://[bucket-name]/[file.txt]```

**Recursively delete** all objects under a prefix

```aws s3 rm s3://[bucket-name]/[prefix/] --recursive```

**Delete all objects** in a bucket

```aws s3 rm s3://[bucket-name] --recursive```

**Delete all except** certain file types

```aws s3 rm s3://[bucket-name]/ --recursive --exclude "*.jpg"```

**Preview delete operation** without executing

```aws s3 rm s3://[bucket-name]/ --recursive --dryrun```

# SYNOPSIS

**aws s3 rm** _S3Uri_ [_options_]

# DESCRIPTION

**aws s3 rm** deletes objects from Amazon S3. By default, it deletes a single object. Use the **--recursive** option to delete all objects under a specified prefix.

The command supports pattern matching with **--include** and **--exclude** options to selectively delete objects matching specific criteria.

# PARAMETERS

**S3Uri**
> The S3 URI of the object or prefix to delete (s3://bucket-name/key)

**--recursive**
> Delete all objects under the specified prefix

**--dryrun**
> Display operations that would be performed without executing them

**--quiet**
> Suppress output during the delete operation

**--include** _pattern_
> Include objects matching the pattern (used with --exclude)

**--exclude** _pattern_
> Exclude objects matching the pattern from deletion

**--only-show-errors**
> Display only errors and warnings, suppressing successful operations

**--page-size** _value_
> Number of objects to retrieve per API call (default: 1000)

# CAVEATS

This command deletes non-versioned objects. For versioned buckets, deletion creates delete markers but does not permanently remove previous versions. To permanently delete versioned objects, use **aws s3api delete-object** with **--version-id**. Deletion is permanent for non-versioned buckets and cannot be undone.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3-rb](/man/aws-s3-rb)(1), [rm](/man/rm)(1)
