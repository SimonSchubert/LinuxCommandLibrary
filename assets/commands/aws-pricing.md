# TAGLINE

Query AWS service pricing information

# TLDR

**List all AWS services** with pricing information

```aws pricing describe-services --region us-east-1```

**Get attribute values** for a service (e.g., EC2 instance types)

```aws pricing get-attribute-values --service-code AmazonEC2 --attribute-name instanceType --region us-east-1```

**Get product pricing** with filters

```aws pricing get-products --service-code AmazonEC2 --filters Type=TERM_MATCH,Field=instanceType,Value=t3.micro Type=TERM_MATCH,Field=location,Value="US East (N. Virginia)" --region us-east-1```

**List available price lists**

```aws pricing list-price-lists --service-code AmazonEC2 --effective-date [2024-01-01] --currency-code USD --region us-east-1```

**Get URL to download price list file**

```aws pricing get-price-list-file-url --price-list-arn [arn:aws:pricing::123456789012:price-list/...] --file-format json --region us-east-1```

# SYNOPSIS

**aws pricing** _command_ [_options_]

# DESCRIPTION

**aws pricing** is the AWS CLI interface for the AWS Price List API, providing programmatic access to AWS service pricing information. It allows querying prices using standardized product attributes like location, instance type, and storage class.

The API is useful for building cost estimation tools, budget forecasting, and cost optimization analysis. Prices are returned at the SKU level with both on-demand and reserved pricing options.

# COMMANDS

**describe-services**
> List AWS services and their pricing attributes

**get-attribute-values**
> Get valid values for a service attribute

**get-products**
> Query products and their pricing

**list-price-lists**
> List available price list files

**get-price-list-file-url**
> Get download URL for a price list file

# PARAMETERS

**--service-code**
> AWS service identifier (e.g., AmazonEC2, AmazonS3)

**--filters**
> Filter products by attributes

**--region**
> Must be us-east-1 or ap-south-1 (API regional endpoints)

**--effective-date**
> Date for price list (prices change over time)

# CAVEATS

The Price List API is only available in **us-east-1** and **ap-south-1** regions. Price data can be large; use filters to narrow results. Prices are in USD by default; some services support other currencies. Bulk price list downloads are JSON files that can be several gigabytes.

# HISTORY

The AWS Price List API launched in **2017** to provide programmatic access to pricing previously only available through the web console or bulk price list files. It enables automated cost analysis and integration with financial planning tools.

# SEE ALSO

[aws](/man/aws)(1), [aws-ce](/man/aws-ce)(1), [aws-cur](/man/aws-cur)(1)
