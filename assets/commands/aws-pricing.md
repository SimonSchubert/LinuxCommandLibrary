# TAGLINE

Query AWS service pricing information

# TLDR

**List AWS services** available via the Price List API

```aws pricing describe-services --region us-east-1```

**Get attribute values** for a service (e.g. EC2 instance types)

```aws pricing get-attribute-values --service-code [AmazonEC2] --attribute-name [instanceType] --region us-east-1```

**Get product pricing** with filters

```aws pricing get-products --service-code [AmazonEC2] --filters "Type=TERM_MATCH,Field=instanceType,Value=[t3.micro]" "Type=TERM_MATCH,Field=location,Value=[US East (N. Virginia)]" --region us-east-1```

**List available price lists** for a service

```aws pricing list-price-lists --service-code [AmazonEC2] --effective-date [2024-01-01] --currency-code USD --region us-east-1```

**Get download URL** for a bulk price list file

```aws pricing get-price-list-file-url --price-list-arn [arn:aws:pricing:::price-list/...] --file-format [json] --region us-east-1```

# SYNOPSIS

**aws pricing** _command_ [_options_]

# DESCRIPTION

**aws pricing** is the AWS CLI interface to the AWS Price List Query API, providing programmatic access to AWS service pricing. It allows querying prices using standardized product attributes like location, instance type, storage class, and operating system.

The API is primarily used for building cost-estimation tools, budget forecasting, and cost-optimization analysis. Prices are returned at the SKU level with both On-Demand and Reserved Instance pricing options.

# COMMANDS

**describe-services**
> Return service codes and attribute names used for filtering.

**get-attribute-values**
> Return valid values for a given service attribute.

**get-products**
> Return products and their pricing matching the supplied filters.

**list-price-lists**
> List bulk price list files available for a service and date.

**get-price-list-file-url**
> Return a pre-signed URL to download a bulk price list file.

# PARAMETERS

**--service-code** _code_
> AWS service identifier (e.g. `AmazonEC2`, `AmazonS3`, `AmazonRDS`).

**--filters** _filter_ ...
> Filter products by attributes using `Type=TERM_MATCH,Field=_name_,Value=_value_`.

**--region** _region_
> API endpoint region; must be `us-east-1`, `eu-central-1`, or `ap-south-1`.

**--effective-date** _date_
> Date for which to retrieve prices (prices change over time).

**--currency-code** _code_
> Currency for the price list (e.g. `USD`, `CNY`).

**--format-version** _version_
> Response format version (`aws_v1`).

# CAVEATS

The Price List Query API is only reachable through a small set of regional endpoints (commonly **us-east-1** and **ap-south-1**). Result sets can be very large; use **--filters** aggressively. Bulk price list files downloaded via **get-price-list-file-url** can be several gigabytes. Prices are typically USD; not every service supports alternate currencies.

# HISTORY

The AWS Price List API was launched in **2015** to expose pricing data previously only available through the AWS console or static bulk JSON files. The Query API (**aws pricing**) was added later to allow filtered, on-demand queries and has become a standard building block for cost-aware automation.

# SEE ALSO

[aws](/man/aws)(1), [aws-ce](/man/aws-ce)(1), [aws-cur](/man/aws-cur)(1), [aws-budgets](/man/aws-budgets)(1)
