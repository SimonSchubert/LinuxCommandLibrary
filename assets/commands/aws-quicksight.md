# TAGLINE

Manage business intelligence dashboards and analytics

# TLDR

**List all dashboards** in an account

```aws quicksight list-dashboards --aws-account-id [account-id]```

**Describe a dashboard**

```aws quicksight describe-dashboard --aws-account-id [account-id] --dashboard-id [dashboard-id]```

**Create a data source** from RDS

```aws quicksight create-data-source --aws-account-id [account-id] --data-source-id [source-id] --name [my-source] --type RDS --data-source-parameters file://[rds-params.json]```

**Create a data set** from a data source

```aws quicksight create-data-set --aws-account-id [account-id] --data-set-id [dataset-id] --name [my-dataset] --physical-table-map file://[table-map.json] --import-mode SPICE```

**Generate an embed URL** for a dashboard

```aws quicksight generate-embed-url-for-registered-user --aws-account-id [account-id] --user-arn [arn:aws:quicksight:region:account:user/default/username] --experience-configuration Dashboard={InitialDashboardId=[dashboard-id]}```

**Register a new user**

```aws quicksight register-user --aws-account-id [account-id] --namespace default --email [user@example.com] --identity-type IAM --user-role READER --iam-arn [arn:aws:iam::account:user/username]```

# SYNOPSIS

**aws quicksight** _command_ [_options_]

# DESCRIPTION

**aws quicksight** is the AWS CLI interface for Amazon QuickSight, a serverless business intelligence service for creating visualizations, dashboards, and performing ad-hoc analysis. QuickSight uses SPICE (Super-fast Parallel In-memory Calculation Engine) for fast query performance.

QuickSight supports connections to various data sources including S3, Athena, Redshift, RDS, and third-party databases. Dashboards can be embedded in applications and shared with users across the organization.

# COMMANDS

**list-dashboards**
> List all dashboards in the account

**describe-dashboard**
> Get dashboard details

**create-data-source**
> Create a connection to a data source

**create-data-set**
> Define a dataset from a source

**create-analysis**
> Create an analysis for exploration

**create-dashboard**
> Publish an analysis as a dashboard

**register-user**
> Add a QuickSight user

**generate-embed-url-for-registered-user**
> Get embed URL for dashboard embedding

**create-ingestion**
> Refresh a SPICE dataset

**list-data-sources**
> List configured data sources

# CAVEATS

SPICE datasets have storage limits based on subscription tier. Dashboard refresh depends on data source refresh schedules. Embedded dashboards require proper CORS and domain configuration. User management is separate from IAM; QuickSight has its own user registry.

# HISTORY

Amazon QuickSight launched in **November 2016** as a cloud-native BI service. Q (natural language querying) was added in **2020**. The service has expanded to include paginated reports, APIs for programmatic dashboard creation, and ML-powered insights.

# SEE ALSO

[aws](/man/aws)(1), [aws-athena](/man/aws-athena)(1), [aws-redshift](/man/aws-redshift)(1)
