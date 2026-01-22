# TLDR

**Get cost and usage data** for the last month grouped by service

```aws ce get-cost-and-usage --time-period Start=[YYYY-MM-DD],End=[YYYY-MM-DD] --granularity MONTHLY --metrics "BlendedCost" --group-by Type=DIMENSION,Key=SERVICE```

**Get a cost forecast** for the next month

```aws ce get-cost-forecast --time-period Start=[YYYY-MM-DD],End=[YYYY-MM-DD] --metric BLENDED_COST --granularity MONTHLY```

**List all cost anomalies** detected in the last 30 days

```aws ce get-anomalies --date-interval StartDate=[YYYY-MM-DD],EndDate=[YYYY-MM-DD]```

**Get reservation utilization** for the current month

```aws ce get-reservation-utilization --time-period Start=[YYYY-MM-DD],End=[YYYY-MM-DD]```

**Get savings plans coverage** by service

```aws ce get-savings-plans-coverage --time-period Start=[YYYY-MM-DD],End=[YYYY-MM-DD] --group-by Type=DIMENSION,Key=SERVICE```

**Get rightsizing recommendations** for EC2 instances

```aws ce get-rightsizing-recommendation --service AmazonEC2```

# SYNOPSIS

**aws ce** _command_ [_options_]

# DESCRIPTION

**aws ce** is the AWS CLI interface for AWS Cost Explorer, enabling programmatic access to cost and usage data. It allows querying aggregated data like total monthly costs or granular metrics such as daily operations for specific services.

Cost Explorer provides insights into spending patterns, forecasting, anomaly detection, and recommendations for reserved instances and savings plans. All requests go through the **us-east-1** regional endpoint.

# COMMANDS

**get-cost-and-usage**
> Retrieve cost and usage metrics with filtering and grouping

**get-cost-forecast**
> Generate cost predictions based on historical data

**get-anomalies**
> List detected spending anomalies

**get-reservation-utilization**
> Check reserved instance utilization rates

**get-savings-plans-coverage**
> Analyze savings plans coverage across services

**get-rightsizing-recommendation**
> Get EC2 instance rightsizing suggestions

**create-anomaly-monitor**
> Set up automatic anomaly detection monitoring

**create-cost-category-definition**
> Define custom cost categorization rules

# CAVEATS

Cost Explorer API has usage charges beyond the free tier. Data is typically delayed by 24-48 hours. Historical data is available for the last 13 months only. The **us-east-1** endpoint must be used regardless of where resources are deployed.

# HISTORY

AWS Cost Explorer launched in **2017** as a visualization tool in the AWS Console. The Cost Explorer API was introduced in **2018** to enable programmatic access. Anomaly detection was added in **2020**, and commitment purchase analysis features expanded through **2023-2024**.

# SEE ALSO

[aws](/man/aws)(1), [aws-budgets](/man/aws-budgets)(1), [aws-pricing](/man/aws-pricing)(1)
