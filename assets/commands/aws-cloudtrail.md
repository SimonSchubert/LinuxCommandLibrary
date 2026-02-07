# TAGLINE

Track and audit API activity across cloud services.

# TLDR

**Look up recent events** by username

```aws cloudtrail lookup-events --lookup-attributes AttributeKey=Username,AttributeValue=[user@example.com]```

**Look up events** by event name

```aws cloudtrail lookup-events --lookup-attributes AttributeKey=EventName,AttributeValue=[RunInstances]```

**Look up events** in a time range

```aws cloudtrail lookup-events --start-time [2024-01-01T00:00:00Z] --end-time [2024-01-02T00:00:00Z]```

**Create a multi-region trail**

```aws cloudtrail create-trail --name [my-trail] --s3-bucket-name [my-bucket] --is-multi-region-trail```

**Start logging** for a trail

```aws cloudtrail start-logging --name [my-trail]```

**List all trails**

```aws cloudtrail describe-trails```

**Get trail status**

```aws cloudtrail get-trail-status --name [my-trail]```

# SYNOPSIS

**aws cloudtrail** _command_ [_options_]

# PARAMETERS

**lookup-events**
> Search management events from the last 90 days

**create-trail**
> Create a new trail for logging API activity

**describe-trails**
> List trails and their configuration

**get-trail-status**
> Get logging status of a trail

**start-logging**
> Begin logging events to a trail

**stop-logging**
> Pause logging events to a trail

**update-trail**
> Modify trail configuration

**delete-trail**
> Remove a trail (logs remain in S3)

**put-event-selectors**
> Configure which events to log

**put-insight-selectors**
> Enable CloudTrail Insights

**--name** _trail-name_
> Trail name or ARN

**--s3-bucket-name** _bucket_
> S3 bucket for log storage

**--is-multi-region-trail**
> Log events from all regions

**--is-organization-trail**
> Log events for all accounts in organization

**--kms-key-id** _key_
> KMS key for log encryption

**--lookup-attributes** _attr_
> Filter events (AttributeKey=Type,AttributeValue=Value)

**--start-time** _timestamp_
> Start of time range for lookup

**--end-time** _timestamp_
> End of time range for lookup

# LOOKUP ATTRIBUTES

**EventId** - Unique event identifier

**EventName** - API action (RunInstances, CreateBucket)

**Username** - IAM user or role name

**ResourceType** - AWS resource type

**ResourceName** - Resource identifier

**EventSource** - Service (ec2.amazonaws.com)

**AccessKeyId** - Access key used

# DESCRIPTION

**aws cloudtrail** manages AWS CloudTrail, which logs API activity and events across AWS services for auditing, compliance, and security analysis.

**lookup-events** searches management events from the last 90 days without needing a trail configured. It's rate-limited to 2 requests per second per region.

**Trails** deliver logs to S3 buckets for long-term storage. Multi-region trails capture activity from all regions. Organization trails log events for all accounts in AWS Organizations.

**Event selectors** filter which events to log (management events, data events for S3/Lambda, or Insights events for anomaly detection).

Logs include who made the request, services used, actions performed, parameters, and response elements.

# CAVEATS

lookup-events only searches the last 90 days; use Athena on S3 logs for older events. Rate limited to 2 requests/second. Only one lookup attribute per query. Trail creation requires S3 bucket and bucket policy configuration. Log delivery has a delay of several minutes.

# HISTORY

**AWS CloudTrail** launched in **November 2013** as AWS's audit logging service. It became a critical component for security, compliance, and governance. CloudTrail Insights for anomaly detection was added in **2019**. CloudTrail Lake for SQL-based event querying launched in **2022**.

# SEE ALSO

[aws](/man/aws)(1), [aws-s3](/man/aws-s3)(1), [aws-athena](/man/aws-athena)(1), [aws-config](/man/aws-config)(1)
