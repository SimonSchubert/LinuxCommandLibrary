# TAGLINE

Create S3 buckets

# TLDR

**Create a new S3 bucket** in the default region

```aws s3 mb s3://[bucket-name]```

**Create a bucket** in a specific region

```aws s3 mb s3://[bucket-name] --region [us-west-1]```

# SYNOPSIS

**aws s3 mb** _S3Uri_ [_options_]

# DESCRIPTION

**aws s3 mb** (make bucket) creates a new Amazon S3 bucket. The bucket name must be globally unique across all AWS accounts and comply with S3 naming rules.

By default, the bucket is created in the region specified in your AWS configuration. Use the **--region** option to create the bucket in a different region.

# PARAMETERS

**S3Uri**
> The S3 URI for the bucket to create in the format s3://bucket-name

**--region** _value_
> Create the bucket in the specified AWS region (overrides default region)

# CAVEATS

Bucket names must be globally unique across all AWS accounts and regions. Names must be 3-63 characters, contain only lowercase letters, numbers, and hyphens, and cannot be formatted as IP addresses. Bucket creation may fail if the name is already taken by another AWS account.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3-rb](/man/aws-s3-rb)(1), [aws-s3-ls](/man/aws-s3-ls)(1)
