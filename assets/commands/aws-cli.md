# TAGLINE

Unified command-line interface for Amazon Web Services.

# TLDR

**Configure AWS credentials**

```aws configure```

**List S3 buckets**

```aws s3 ls```

**Copy file to S3**

```aws s3 cp [path/to/file] s3://[bucket]/[key]```

**Sync directory to S3**

```aws s3 sync [path/to/directory] s3://[bucket]/[prefix]```

**List EC2 instances**

```aws ec2 describe-instances```

**Get caller identity (verify credentials)**

```aws sts get-caller-identity```

**Invoke a Lambda function**

```aws lambda invoke --function-name [function_name] [output.json]```

**Use a specific profile**

```aws --profile [profile_name] s3 ls```

# SYNOPSIS

**aws** [_options_] _service_ _command_ [_parameters_]

# PARAMETERS

**configure**
> Interactive setup for credentials and default region.

**--profile** _name_
> Use named profile from credentials file.

**--region** _region_
> Override the default region.

**--output** _format_
> Output format: json, yaml, text, table.

**--query** _expression_
> JMESPath query to filter output.

**--no-cli-pager**
> Disable paging of output.

**--debug**
> Enable debug logging.

**--dry-run**
> Preview operation without executing (supported commands).

**--cli-auto-prompt**
> Enable interactive auto-prompt mode.

# COMMON SERVICES

**s3**
> Simple Storage Service (object storage).

**ec2**
> Elastic Compute Cloud (virtual servers).

**iam**
> Identity and Access Management.

**lambda**
> Serverless compute functions.

**sts**
> Security Token Service.

**cloudformation**
> Infrastructure as code stacks.

**rds**
> Relational Database Service.

**dynamodb**
> NoSQL database service.

# DESCRIPTION

**aws** is the official command-line interface for Amazon Web Services, providing unified access to all AWS services. It enables managing cloud infrastructure, deploying applications, and automating operations from the terminal.

The CLI uses credentials stored in **~/.aws/credentials** and configuration in **~/.aws/config**. Multiple profiles support working with different AWS accounts or roles. Commands follow the pattern **aws service operation --parameters**.

Output can be formatted as JSON, YAML, text, or tables, and filtered using JMESPath queries with **--query**. The CLI supports shell completion and an interactive auto-prompt mode for discovering commands and parameters.

# CONFIGURATION

**~/.aws/credentials**
> Stores access key ID and secret access key, organized by named profiles.

**~/.aws/config**
> Stores default region, output format, SSO settings, and role assumptions per profile.

# CAVEATS

Credentials stored in plain text; use IAM roles on EC2 or credential helpers for better security. API rate limits apply to most AWS operations. Some commands incur AWS charges. Region must be specified or defaulted for most services. MFA-protected operations require session tokens.

# HISTORY

The AWS CLI was first released in **2012** to replace the older service-specific command-line tools. Version 2, released in **2020**, added features like auto-prompt, SSO integration, and native installers. The CLI is maintained by AWS and updated frequently to support new services and features, making it the primary tool for AWS automation and administration.

# SEE ALSO

[aws-vault](/man/aws-vault)(1), [terraform](/man/terraform)(1), [eksctl](/man/eksctl)(1), [sam](/man/sam)(1)
