# TLDR

**Delete an empty S3 bucket**

```aws s3 rb s3://[bucket-name]```

**Force delete a bucket** and all its objects

```aws s3 rb s3://[bucket-name] --force```

# SYNOPSIS

**aws s3 rb** _S3Uri_ [_--force_] [_options_]

# DESCRIPTION

**aws s3 rb** (remove bucket) deletes an S3 bucket. By default, the bucket must be completely empty of objects before it can be deleted.

Use the **--force** option to automatically delete all non-versioned objects in the bucket before removing the bucket itself. This is a destructive operation that cannot be undone.

# PARAMETERS

**S3Uri**
> The S3 URI of the bucket to delete (s3://bucket-name)

**--force**
> Delete all objects in the bucket before deleting the bucket itself

# CAVEATS

The **--force** option only deletes non-versioned objects. If the bucket contains versioned objects or delete markers, the bucket deletion will fail even with **--force**. For buckets with versioning enabled, use **aws s3api delete-object** with **--version-id** to remove all object versions first, or configure a lifecycle policy to expire versions. Bucket deletion is permanent and the bucket name becomes available for others to use.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3-mb](/man/aws-s3-mb)(1), [aws-s3-rm](/man/aws-s3-rm)(1)
