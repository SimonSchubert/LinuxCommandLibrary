# TAGLINE

Low-level S3 API operations

# TLDR

**List all buckets** in your account

```aws s3api list-buckets```

**Get an object** from S3

```aws s3api get-object --bucket [bucket-name] --key [object-key] [output-file]```

**Upload an object** to S3

```aws s3api put-object --bucket [bucket-name] --key [object-key] --body [file.txt]```

**Delete an object** from S3

```aws s3api delete-object --bucket [bucket-name] --key [object-key]```

**List objects** in a bucket

```aws s3api list-objects-v2 --bucket [bucket-name]```

**Get bucket versioning** status

```aws s3api get-bucket-versioning --bucket [bucket-name]```

**Create a bucket** with a specific configuration

```aws s3api create-bucket --bucket [bucket-name] --create-bucket-configuration LocationConstraint=[us-west-2]```

# SYNOPSIS

**aws s3api** _subcommand_ [_options_]

# DESCRIPTION

**aws s3api** provides low-level access to Amazon S3 API operations. Unlike the high-level **aws s3** commands, s3api exposes the full S3 API with fine-grained control over request parameters and response handling.

Use s3api when you need direct API access for operations not available in the high-level commands, such as managing bucket policies, configuring lifecycle rules, handling multipart uploads, or working with object versions.

# SUBCOMMANDS

**Bucket Operations**
> create-bucket, delete-bucket, list-buckets, head-bucket, get-bucket-location

**Object Operations**
> put-object, get-object, delete-object, delete-objects, head-object, copy-object, list-objects-v2

**Bucket Configuration**
> put-bucket-policy, get-bucket-policy, put-bucket-acl, get-bucket-acl, put-bucket-cors, get-bucket-cors

**Versioning**
> put-bucket-versioning, get-bucket-versioning, list-object-versions

**Lifecycle**
> put-bucket-lifecycle-configuration, get-bucket-lifecycle-configuration, delete-bucket-lifecycle

**Encryption**
> put-bucket-encryption, get-bucket-encryption, delete-bucket-encryption

**Multipart Uploads**
> create-multipart-upload, upload-part, complete-multipart-upload, abort-multipart-upload, list-multipart-uploads

**Tagging**
> put-bucket-tagging, get-bucket-tagging, put-object-tagging, get-object-tagging

# CAVEATS

The s3api commands require more verbose syntax than the high-level **aws s3** commands but provide complete API coverage. When creating buckets outside us-east-1, you must specify **--create-bucket-configuration**. Object keys are case-sensitive. For large file uploads, consider using multipart upload operations.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3-cp](/man/aws-s3-cp)(1), [aws](/man/aws)(1)
