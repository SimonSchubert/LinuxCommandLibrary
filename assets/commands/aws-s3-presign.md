# TAGLINE

Generate pre-signed URLs for temporary S3 object access

# TLDR

**Generate a pre-signed URL** with default 1-hour expiration

```aws s3 presign s3://[bucket-name]/[file.txt]```

**Generate a pre-signed URL** valid for 1 week (maximum)

```aws s3 presign s3://[bucket-name]/[file.txt] --expires-in 604800```

**Generate a pre-signed URL** valid for 5 minutes

```aws s3 presign s3://[bucket-name]/[file.txt] --expires-in 300```

**Generate a pre-signed URL** for a specific region

```aws s3 presign s3://[bucket-name]/[file.txt] --region [us-west-2]```

# SYNOPSIS

**aws s3 presign** _S3Uri_ [_--expires-in value_] [_options_]

# DESCRIPTION

**aws s3 presign** generates a pre-signed URL for an Amazon S3 object. Anyone with the pre-signed URL can retrieve the S3 object using an HTTP GET request without AWS credentials.

Pre-signed URLs are useful for sharing private S3 objects temporarily, embedding download links in applications, or providing time-limited access to files. All pre-signed URLs use Signature Version 4 (SigV4) authentication.

# PARAMETERS

**S3Uri**
> The S3 URI of the object to generate a pre-signed URL for (s3://bucket-name/key)

**--expires-in** _value_
> Number of seconds until the pre-signed URL expires (default: 3600, maximum: 604800)

**--region** _value_
> The AWS region of the bucket (required for SigV4; overrides config/env settings)

# CAVEATS

The maximum expiration time is 604800 seconds (7 days). The region must be configured explicitly since all pre-signed URLs use SigV4 authentication. Pre-signed URLs grant read-only access; they cannot be used to upload or modify objects. The URL expires based on the credentials used to sign it; if using temporary credentials (STS), the URL cannot outlive those credentials.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3-cp](/man/aws-s3-cp)(1), [aws-s3api](/man/aws-s3api)(1)
