# TLDR

**List** S3 buckets

```aws s3 ls```

**Upload** file to S3

```aws s3 cp [file.txt] s3://[bucket-name]/```

**List** EC2 instances

```aws ec2 describe-instances```

**Get** caller identity

```aws sts get-caller-identity```

**Invoke** Lambda function

```aws lambda invoke --function-name [MyFunction] [output.json]```

Use **specific profile**

```aws --profile [production] s3 ls```

# SYNOPSIS

**aws** [_options_] _service_ _command_ [_parameters_]

# DESCRIPTION

**aws** is the unified command-line interface for Amazon Web Services. It provides direct access to AWS services including EC2, S3, Lambda, DynamoDB, and hundreds of others through a consistent interface.

The CLI enables automation, scripting, and management of AWS resources from the terminal without using the web console.

# PARAMETERS

**--profile** _name_
> Use specific AWS credentials profile

**--region** _region_
> Override default region

**--output** _format_
> Output format (json, text, table, yaml)

**--query** _query_
> JMESPath query to filter output

**--debug**
> Enable debug logging

**--no-cli-pager**
> Disable output paging

**--endpoint-url** _url_
> Override service endpoint

**--no-verify-ssl**
> Disable SSL verification

# COMMON SERVICES

- **s3** - Object storage
- **ec2** - Virtual servers
- **lambda** - Serverless functions
- **dynamodb** - NoSQL database
- **iam** - Identity and access management
- **cloudformation** - Infrastructure as code
- **sts** - Security token service
- **logs** - CloudWatch logs

# CONFIGURATION

Credentials stored in:
- **~/.aws/credentials** - Access keys
- **~/.aws/config** - Region and output preferences

# CAVEATS

Requires valid AWS credentials configured. API rate limits apply. Some operations are destructive and immediate. Large outputs may be truncated. Costs may apply for API calls. Use --dry-run when available.

# HISTORY

The **AWS CLI** was released by Amazon in **2013** to provide a unified interface replacing multiple service-specific tools. Version 2 was released in **2020** with improved installation and features.

# SEE ALSO

[aws-configure](/man/aws-configure)(1), [aws-vault](/man/aws-vault)(1), [terraform](/man/terraform)(1)
