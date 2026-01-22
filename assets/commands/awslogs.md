# TLDR

**Stream** CloudWatch logs

```awslogs get [/aws/lambda/my-function] --watch```

Get logs from **specific time**

```awslogs get [/aws/lambda/my-function] --start='[2h ago]'```

**Filter** logs by pattern

```awslogs get [/aws/lambda/my-function] --filter-pattern '[ERROR]'```

**List** log groups

```awslogs groups```

**List** log streams

```awslogs streams [/aws/lambda/my-function]```

# SYNOPSIS

**awslogs** _command_ [_options_] _log-group_

# DESCRIPTION

**awslogs** is a command-line tool for querying and streaming AWS CloudWatch Logs. It provides a simple interface for viewing logs from Lambda functions, EC2 instances, ECS containers, and other AWS services.

The tool offers real-time log streaming and time-based filtering without using the AWS Console.

# PARAMETERS

**get** _log-group_
> Fetch logs from log group

**groups**
> List available log groups

**streams** _log-group_
> List streams in log group

**--watch**, **-w**
> Stream logs in real-time

**--start=**_time_
> Start time (e.g., '2h ago', '2023-01-01')

**--end=**_time_
> End time

**--filter-pattern=**_pattern_
> CloudWatch filter pattern

**--profile=**_profile_
> AWS profile to use

**--region=**_region_
> AWS region

**--no-group**
> Don't group streams together

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
