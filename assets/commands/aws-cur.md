# TAGLINE

Manage AWS Cost and Usage Report definitions.

# TLDR

**List all report definitions** in the account

```aws cur describe-report-definitions```

**Create a new cost and usage report** delivered to S3

```aws cur put-report-definition --report-definition ReportName=[my-report],TimeUnit=DAILY,Format=textORcsv,Compression=GZIP,S3Bucket=[my-bucket],S3Prefix=[reports/],S3Region=[us-east-1]```

**Delete a report definition** by name

```aws cur delete-report-definition --report-name [my-report]```

**Modify an existing report** definition

```aws cur modify-report-definition --report-name [my-report] --report-definition ReportName=[my-report],TimeUnit=HOURLY,Format=Parquet,Compression=Parquet,S3Bucket=[my-bucket],S3Prefix=[reports/],S3Region=[us-east-1]```

**List tags** for a report resource

```aws cur list-tags-for-resource --resource-arn [arn:aws:cur:us-east-1:123456789012:definition/my-report]```

# SYNOPSIS

**aws cur** _command_ [_options_]

# DESCRIPTION

**aws cur** is the AWS CLI interface for AWS Cost and Usage Reports, enabling programmatic management of billing report definitions. Cost and Usage Reports provide comprehensive cost data about your AWS usage, delivered to an S3 bucket in CSV or Parquet format.

Reports can be configured with different time granularities (hourly, daily, monthly) and include resource-level detail. The data can be integrated with analytics services like Athena, Redshift, or QuickSight for cost analysis.

# COMMANDS

**put-report-definition**
> Create a new cost and usage report definition

**describe-report-definitions**
> List all report definitions in the account

**modify-report-definition**
> Update an existing report definition

**delete-report-definition**
> Delete a report definition

**tag-resource**
> Add tags to a report resource

**untag-resource**
> Remove tags from a report resource

**list-tags-for-resource**
> List tags for a report resource

# CAVEATS

Reports can take up to 24 hours to appear in S3 after creation. The API endpoint is only available in **us-east-1** region. Report data may be delayed and is not suitable for real-time cost monitoring. Legacy reports created in the console may not be visible via the API.

# HISTORY

AWS Cost and Usage Reports launched in **2015** as an evolution of the Detailed Billing Reports. The CUR API was added in **2017** to enable programmatic management. Parquet format support was introduced in **2018** for better integration with analytics tools, and resource-level data became available for more services over time.

# SEE ALSO

[aws](/man/aws)(1), [aws-ce](/man/aws-ce)(1), [aws-budgets](/man/aws-budgets)(1)
