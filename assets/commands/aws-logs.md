# TLDR

**List all log groups**

```aws logs describe-log-groups```

**List log streams** in a group

```aws logs describe-log-streams --log-group-name [/aws/lambda/function-name]```

**Get log events** from a stream

```aws logs get-log-events --log-group-name [group_name] --log-stream-name [stream_name]```

**Tail logs** in real-time

```aws logs tail [/aws/lambda/function-name] --follow```

**Filter logs** with a pattern

```aws logs filter-log-events --log-group-name [group_name] --filter-pattern "[ERROR]"```

**Create a log group**

```aws logs create-log-group --log-group-name [group_name]```

**Set retention policy** on a log group

```aws logs put-retention-policy --log-group-name [group_name] --retention-in-days [30]```

**Delete a log group**

```aws logs delete-log-group --log-group-name [group_name]```

# SYNOPSIS

**aws logs** _subcommand_ [_options_]

# DESCRIPTION

**aws logs** is a subcommand of the AWS CLI that manages Amazon CloudWatch Logs, a service for monitoring, storing, and accessing log files from AWS resources and applications.

Logs are organized into log groups (containers) and log streams (sequences of events from a single source). Log events contain a timestamp and raw message. Many AWS services like Lambda, ECS, and API Gateway automatically send logs to CloudWatch.

CloudWatch Logs Insights enables SQL-like queries across log data. Metric filters extract metrics from log patterns. Subscription filters stream logs to Lambda, Kinesis, or Firehose in real-time.

# PARAMETERS

**describe-log-groups**
> List log groups with metadata.

**create-log-group**
> Create a new log group.

**delete-log-group**
> Remove a log group and all its data.

**describe-log-streams**
> List log streams in a group.

**get-log-events**
> Retrieve log events from a stream.

**filter-log-events**
> Search logs with a filter pattern.

**tail**
> Stream logs in real-time (like tail -f).

**put-log-events**
> Send log events to a stream.

**put-retention-policy**
> Set log expiration period.

**delete-retention-policy**
> Set logs to never expire.

**put-metric-filter**
> Create a metric filter.

**put-subscription-filter**
> Stream logs to another service.

**--log-group-name** _name_
> Name of the log group.

**--log-stream-name** _name_
> Name of the log stream.

**--filter-pattern** _pattern_
> Pattern to match log events.

**--start-time** _timestamp_
> Start time in milliseconds since epoch.

**--end-time** _timestamp_
> End time in milliseconds since epoch.

**--follow**
> Continuously stream new logs.

**--retention-in-days** _days_
> Retention period (1, 3, 5, 7, 14, 30, 60, 90, 120, 150, 180, 365, 400, 545, 731, 1096, 1827, 2192, 2557, 2922, 3288, 3653, or infinite).

# CAVEATS

Log groups have no default retention; logs are kept forever unless configured. The tail command requires aws-cli v2. Filter patterns have specific syntax different from regex. Stored log data incurs charges based on ingestion and storage volume. Cross-account log sharing requires subscription filters and destination policies.

# HISTORY

**Amazon CloudWatch Logs** launched in **July 2014** as an extension of CloudWatch monitoring. It initially supported EC2 logs via the CloudWatch agent. **CloudWatch Logs Insights** was introduced at **re:Invent 2018** for interactive log analysis. **Live Tail** was added in **2023** for real-time log streaming in the console. The service expanded to handle logs from virtually all AWS services.

# SEE ALSO

[aws](/man/aws)(1), [aws-cloudwatch](/man/aws-cloudwatch)(1), [journalctl](/man/journalctl)(1), [tail](/man/tail)(1)
