# TAGLINE

Scan for misconfigured S3 buckets across cloud providers

# TLDR

**Scan a list of bucket names from a file**

```s3scanner -bucket-file [names.txt]```

**Scan and enumerate objects in a bucket**

```s3scanner -bucket [my-bucket] -enumerate```

**Scan a GCP bucket**

```s3scanner -provider gcp -bucket [my-bucket]```

**Scan with JSON output**

```s3scanner -bucket [my-bucket] -json```

# SYNOPSIS

**s3scanner** [_options_]

# PARAMETERS

**-bucket** _NAME_
> Single bucket name to scan.

**-bucket-file** _FILE_
> File containing bucket names to scan.

**-enumerate**
> List all objects found in accessible buckets.

**-provider** _PROVIDER_
> Storage provider: aws, gcp, digitalocean, dreamhost, linode, or scaleway.

**-threads** _N_
> Number of concurrent scan workers. Default: 4.

**-json**
> Output results in JSON format.

# DESCRIPTION

**s3scanner** checks permissions on object storage buckets to detect public access misconfigurations. It supports AWS and multiple S3-compatible providers, multi-threaded scanning, database persistence via PostgreSQL, and RabbitMQ integration for scaled operations.

# CAVEATS

Object enumeration is limited to 5,000 pages per bucket. Non-AWS providers support anonymous-user permissions only. Intended for authorized security testing only.

# HISTORY

**s3scanner** was created by **Dan Salmon** (sa7mon) and is written in **Go**.

# SEE ALSO

[aws](/man/aws)(1), [rclone](/man/rclone)(1), [trivy](/man/trivy)(1)
