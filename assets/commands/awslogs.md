# TAGLINE

Query and stream CloudWatch log groups from the terminal.

# TLDR

**Stream** CloudWatch logs in real-time

```awslogs get [/aws/lambda/my-function] --watch```

Get logs from a **specific time** range

```awslogs get [/aws/lambda/my-function] --start='[2h ago]'```

**Filter** logs by pattern

```awslogs get [/aws/lambda/my-function] --filter-pattern '[ERROR]'```

List available **log groups**

```awslogs groups```

List **log streams** within a group

```awslogs streams [/aws/lambda/my-function]```

# SYNOPSIS

**awslogs** _command_ [_options_] _log-group_

# DESCRIPTION

**awslogs** is a command-line tool for querying and streaming AWS CloudWatch Logs. It provides a simple interface for viewing logs from Lambda functions, EC2 instances, ECS containers, and other AWS services.

The tool offers real-time log streaming and time-based filtering without using the AWS Console.

# PARAMETERS

**get** _log-group_ [_stream-expression_]
> Fetch logs matching the optional stream expression from a log group.

**groups**
> List available log groups.

**streams** _log-group_
> List streams within a log group.

**--watch**, **-w**
> Watch logs as they are created (stream in real-time).

**--watch-interval**, **-i** _seconds_
> Interval in seconds to poll for new log events with --watch.

**--start** _time_, **-s** _time_
> Start time (e.g., '2h ago', '2023-01-01').

**--end** _time_, **-e** _time_
> End time.

**--filter-pattern** _pattern_, **-f** _pattern_
> CloudWatch Logs filter pattern.

**--query** _query_, **-q** _query_
> JMESPath-style query to extract fields from JSON log events.

**--timestamp**
> Print the timestamp of each event.

**--ingestion-time**
> Print the ingestion time of each event.

**--profile** _profile_
> AWS CLI profile to use.

**--aws-region** _region_
> AWS region (or set the AWS_REGION environment variable).

**--no-group**, **-G**
> Do not display the log group name.

**--no-stream**, **-S**
> Do not display the log stream name.

# TIME SPECIFICATIONS

- **2h ago** - 2 hours ago
- **30m ago** - 30 minutes ago
- **2d ago** - 2 days ago
- **2023-01-01** - Specific date
- **2023-01-01 10:30** - Specific datetime

# CAVEATS

Requires AWS credentials configured. Large log queries may be slow. CloudWatch Logs costs apply. Time specifications are in UTC. --watch can consume API calls quickly.

# HISTORY

**awslogs** was created by Jorge Bastida around **2015** to provide a better command-line experience for viewing CloudWatch Logs compared to the official AWS CLI.

# SEE ALSO

[aws](/man/aws)(1), [aws-logs](/man/aws-logs)(1), [tail](/man/tail)(1)

# RESOURCES

```[Source code](https://github.com/jorgebastida/awslogs)```

<!-- verified: 2026-06-18 -->
