# TAGLINE

Set up AWS CLI credentials, region, and output format.

# TLDR

**Configure** default credentials

```aws configure```

Configure **specific profile**

```aws configure --profile [production]```

**Set** individual value

```aws configure set region [us-west-2]```

**Get** configuration value

```aws configure get region```

**List** all profiles

```aws configure list-profiles```

**Configure** an SSO session interactively

```aws configure sso```

# SYNOPSIS

**aws configure** [_options_] [_command_]

# DESCRIPTION

**aws configure** manages AWS CLI configuration including credentials, default region, and output format. It stores settings in ~/.aws/credentials and ~/.aws/config files.

The tool provides an interactive interface for setting up AWS access or programmatic access to individual configuration values.

# PARAMETERS

**--profile** _name_
> Configure specific named profile

# SUBCOMMANDS

**list**
> Show current configuration with the source of each value

**get** _key_
> Get a single configuration value

**set** _key_ _value_
> Set a single configuration value

**import** _--csv file_
> Import credentials from an IAM-generated CSV file

**list-profiles**
> List all configured profiles

**sso**
> Interactively configure an AWS IAM Identity Center (SSO) profile

**sso-session**
> Interactively configure a reusable SSO session

**add-model**
> Add a custom service model to the CLI

# CONFIGURATION VALUES

**aws_access_key_id**
> AWS access key

**aws_secret_access_key**
> AWS secret key

**region**
> Default AWS region

**output**
> Output format (json, text, table, yaml)

# WORKFLOW

Interactive setup:
```bash
aws configure
```

# CONFIGURATION

**~/.aws/credentials**
> Stores access key ID and secret access key for each named profile.

**~/.aws/config**
> Stores region, output format, and other settings for each named profile.

# CAVEATS

Credentials stored in plain text. Use IAM roles on EC2 instead of credentials when possible. Never commit credentials to version control. Consider using aws-vault for secure credential management. Use --profile to avoid overwriting default credentials.

# HISTORY

**aws configure** was introduced with the AWS CLI in **2013** as the standard way to set up AWS credentials and configuration.

# SEE ALSO

[aws](/man/aws)(1), [aws-vault](/man/aws-vault)(1), [aws-sso](/man/aws-sso)(1)

# RESOURCES

```[Source code](https://github.com/aws/aws-cli)```

```[Homepage](https://aws.amazon.com/cli/)```

```[Documentation](https://docs.aws.amazon.com/cli/latest/reference/configure/index.html)```

<!-- verified: 2026-06-18 -->
