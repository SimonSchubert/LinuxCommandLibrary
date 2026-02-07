# TAGLINE

Configure S3 bucket static website hosting

# TLDR

**Configure a bucket** as a static website

```aws s3 website s3://[bucket-name]/ --index-document [index.html] --error-document [error.html]```

**Set only the index document**

```aws s3 website s3://[bucket-name]/ --index-document [index.html]```

# SYNOPSIS

**aws s3 website** _S3Uri_ [_--index-document value_] [_--error-document value_] [_options_]

# DESCRIPTION

**aws s3 website** configures an S3 bucket to host a static website. Once configured, the bucket contents are accessible via an S3 website endpoint URL.

The index document is returned when visitors request the website root or any directory path. The error document is displayed when a 4XX error occurs (such as 404 Not Found).

# PARAMETERS

**S3Uri**
> The S3 bucket URI to configure (s3://bucket-name/)

**--index-document** _value_
> Suffix appended to directory requests (e.g., index.html); cannot be empty or contain slashes

**--error-document** _value_
> Object key name to display when a 4XX class error occurs

# CAVEATS

This command only configures website hosting; you must separately configure bucket policy and object permissions to allow public access. The website endpoint URL differs from the standard S3 endpoint (e.g., **http://bucket-name.s3-website-region.amazonaws.com**). HTTPS is not supported on the website endpoint; use CloudFront for HTTPS. Block Public Access settings must be disabled for public website hosting.

# HISTORY

S3 static website hosting was introduced in **February 2011**, enabling buckets to serve static content directly. The **aws s3 website** CLI command simplifies configuration that previously required multiple API calls through **s3api put-bucket-website**.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3api](/man/aws-s3api)(1)
