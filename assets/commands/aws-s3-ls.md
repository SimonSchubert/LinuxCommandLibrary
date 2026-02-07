# TAGLINE

List S3 buckets and objects

# TLDR

**List all S3 buckets** in your account

```aws s3 ls```

**List objects** in a bucket

```aws s3 ls s3://[bucket-name]/```

**List objects** under a specific prefix

```aws s3 ls s3://[bucket-name]/[prefix/]```

**Recursively list** all objects in a bucket

```aws s3 ls s3://[bucket-name] --recursive```

**List with human-readable sizes** and summary

```aws s3 ls s3://[bucket-name] --recursive --human-readable --summarize```

**List buckets** starting with a specific prefix

```aws s3 ls --bucket-name-prefix [my-prefix]```

# SYNOPSIS

**aws s3 ls** [_S3Uri_] [_options_]

# DESCRIPTION

**aws s3 ls** lists S3 objects and common prefixes under a specified prefix, or lists all S3 buckets when no URI is provided. The output shows the last modified date, size, and object key for each item.

When listing bucket contents, objects are displayed with timestamps and sizes, while common prefixes (similar to directories) are shown with a **PRE** indicator. The command supports recursive listing to show all objects under a prefix.

# PARAMETERS

**--recursive**
> List all objects under the specified prefix, including nested objects

**--human-readable**
> Display file sizes in human-readable format (KB, MB, GB)

**--summarize**
> Display summary information including total number of objects and total size

**--page-size** _value_
> Number of results to return in each response (default: 1000)

**--request-payer** _value_
> Confirm that the requester will pay for request and data transfer costs

**--bucket-name-prefix** _value_
> Filter bucket list to names beginning with the specified prefix

**--bucket-region** _value_
> Filter bucket list to buckets in the specified AWS Region

# CAVEATS

The **--output** and **--no-paginate** global arguments are ignored for this command. Output format is fixed and cannot be changed to JSON or other formats. For programmatic access to S3 listings with flexible output, use **aws s3api list-objects-v2** instead.

# SEE ALSO

[aws-s3](/man/aws-s3)(1), [aws-s3-cp](/man/aws-s3-cp)(1), [aws-s3api](/man/aws-s3api)(1), [ls](/man/ls)(1)
