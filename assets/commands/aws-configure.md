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

# SYNOPSIS

**aws configure** [_options_] [_command_]

# DESCRIPTION

**aws configure** manages AWS CLI configuration including credentials, default region, and output format. It stores settings in ~/.aws/credentials and ~/.aws/config files.

The tool provides an interactive interface for setting up AWS access or programmatic access to individual configuration values.

# PARAMETERS

**--profile** _name_
> Configure specific named profile

**set** _key_ _value_
> Set configuration value

**get** _key_
> Get configuration value

**list**
> Show current configuration

**list-profiles**
> List all configured profiles

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

# CAVEATS

Credentials stored in plain text. Use IAM roles on EC2 instead of credentials when possible. Never commit credentials to version control. Consider using aws-vault for secure credential management. Use --profile to avoid overwriting default credentials.

# HISTORY

**aws configure** was introduced with the AWS CLI in **2013** as the standard way to set up AWS credentials and configuration.

# SEE ALSO

[aws](/man/aws)(1), [aws-vault](/man/aws-vault)(1), [aws-sso](/man/aws-sso)(1)
