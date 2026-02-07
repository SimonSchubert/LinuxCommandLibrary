# TAGLINE

Monitor resources with metrics, alarms, and dashboards.

# TLDR

**Put custom metric data** to CloudWatch

```aws cloudwatch put-metric-data --namespace [MyApp] --metric-name [RequestCount] --value [1] --unit Count```

**Get metric statistics** for an EC2 instance CPU

```aws cloudwatch get-metric-statistics --namespace AWS/EC2 --metric-name CPUUtilization --dimensions Name=InstanceId,Value=[i-1234567890abcdef0] --start-time [2024-01-01T00:00:00Z] --end-time [2024-01-02T00:00:00Z] --period 3600 --statistics Average```

**Create an alarm** for high CPU usage

```aws cloudwatch put-metric-alarm --alarm-name [high-cpu] --metric-name CPUUtilization --namespace AWS/EC2 --statistic Average --period 300 --threshold 80 --comparison-operator GreaterThanThreshold --evaluation-periods 2 --dimensions Name=InstanceId,Value=[i-1234567890abcdef0]```

**List all alarms** in the account

```aws cloudwatch describe-alarms```

**List available metrics** for a namespace

```aws cloudwatch list-metrics --namespace [AWS/EC2]```

**Get metric data** using a query expression

```aws cloudwatch get-metric-data --metric-data-queries '[{"Id":"m1","MetricStat":{"Metric":{"Namespace":"AWS/EC2","MetricName":"CPUUtilization"},"Period":300,"Stat":"Average"}}]' --start-time [2024-01-01T00:00:00Z] --end-time [2024-01-02T00:00:00Z]```

# SYNOPSIS

**aws cloudwatch** _command_ [_options_]

# DESCRIPTION

**aws cloudwatch** is the AWS CLI interface for Amazon CloudWatch, a monitoring and observability service for AWS resources and applications. CloudWatch collects metrics, logs, and events, providing visibility into resource utilization, application performance, and operational health.

CloudWatch enables setting alarms that trigger notifications or automated actions based on metric thresholds. It supports both built-in AWS service metrics and custom application metrics.

# COMMANDS

**put-metric-data**
> Publish custom metric data points

**get-metric-data**
> Retrieve metric values using queries

**get-metric-statistics**
> Get statistics for a specific metric

**list-metrics**
> List available metrics by namespace

**put-metric-alarm**
> Create or update a metric alarm

**describe-alarms**
> List configured alarms and their states

**set-alarm-state**
> Manually set alarm state for testing

**put-dashboard**
> Create or update a CloudWatch dashboard

**put-anomaly-detector**
> Create an anomaly detection model for a metric

# CAVEATS

Metric data older than 15 months is automatically deleted. High-resolution metrics (1-second granularity) incur additional costs. Custom metrics are charged per metric per month. Alarm evaluations may be delayed during service disruptions.

# HISTORY

Amazon CloudWatch launched in **May 2009** alongside EC2 monitoring. Custom metrics were added in **2011**, dashboards in **2015**, and anomaly detection in **2019**. The service has evolved to become the central monitoring hub for all AWS services and is now integrated with CloudWatch Logs and EventBridge.

# SEE ALSO

[aws](/man/aws)(1), [aws-logs](/man/aws-logs)(1), [aws-events](/man/aws-events)(1), [aws-ec2](/man/aws-ec2)(1)
