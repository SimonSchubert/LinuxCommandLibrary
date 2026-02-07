# TAGLINE

Manage content delivery network distributions and caching.

# TLDR

**Create a cache invalidation** for specific paths

```aws cloudfront create-invalidation --distribution-id [EDFDVBD6EXAMPLE] --paths "/[path/to/file.jpg]" "/[images/*]"```

**Invalidate all files** in a distribution

```aws cloudfront create-invalidation --distribution-id [EDFDVBD6EXAMPLE] --paths "/*"```

**List all distributions**

```aws cloudfront list-distributions```

**Get distribution details**

```aws cloudfront get-distribution --id [EDFDVBD6EXAMPLE]```

**Create a distribution** from config file

```aws cloudfront create-distribution --distribution-config file://[distribution.json]```

**List invalidations** for a distribution

```aws cloudfront list-invalidations --distribution-id [EDFDVBD6EXAMPLE]```

**Get invalidation status**

```aws cloudfront get-invalidation --distribution-id [EDFDVBD6EXAMPLE] --id [I2J0I21PCUYOIK]```

# SYNOPSIS

**aws cloudfront** _command_ [_options_]

# PARAMETERS

**create-invalidation**
> Invalidate cached objects in edge locations

**list-invalidations**
> List invalidation requests for a distribution

**get-invalidation**
> Get status of an invalidation request

**create-distribution**
> Create a new CloudFront distribution

**get-distribution**
> Get distribution configuration and status

**list-distributions**
> List all distributions in the account

**update-distribution**
> Modify distribution settings

**delete-distribution**
> Remove a distribution (must be disabled first)

**create-origin-access-control**
> Create OAC for secure S3 access

**--distribution-id** _id_
> Distribution identifier (e.g., EDFDVBD6EXAMPLE)

**--paths** _paths_
> Space-separated paths to invalidate (supports wildcards with *)

**--invalidation-batch** _json_
> JSON with paths and caller reference

**--distribution-config** _json_
> Distribution configuration file

**--id** _id_
> Resource identifier (invalidation, distribution)

**--if-match** _etag_
> ETag for conditional updates/deletes

# DESCRIPTION

**aws cloudfront** manages Amazon CloudFront, a content delivery network (CDN) that caches content at edge locations worldwide for low-latency delivery.

**Invalidations** remove cached objects from edge locations before their TTL expires. Paths support wildcards (/images/*) to invalidate multiple files. The first 1,000 invalidation paths per month are free.

**Distributions** define origins (S3, ALB, custom HTTP), cache behaviors, SSL certificates, and other delivery settings. Changes propagate globally and may take 15-30 minutes.

**Origin Access Control (OAC)** secures S3 origins by restricting direct bucket access, requiring requests to go through CloudFront.

Use quotes around paths with wildcards in shell commands to prevent glob expansion.

# CAVEATS

Distribution deletion requires disabling first, then waiting for status to change. Invalidations have a cost after the free tier. Distribution changes take time to propagate globally. Config updates require the current ETag value via **--if-match**.

# HISTORY

**Amazon CloudFront** launched in **November 2008** as AWS's content delivery network service. It has grown from basic static content delivery to support dynamic content, streaming, WebSocket, and serverless compute at the edge via Lambda@Edge (2016) and CloudFront Functions (2021).

# SEE ALSO

[aws](/man/aws)(1), [aws-s3](/man/aws-s3)(1), [aws-acm](/man/aws-acm)(1), [aws-route53](/man/aws-route53)(1)
