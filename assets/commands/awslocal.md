# TAGLINE

AWS CLI wrapper for LocalStack

# TLDR

**List Kinesis streams** on LocalStack

```awslocal kinesis list-streams```

**Same as aws with LocalStack endpoint**

```awslocal s3 ls```

**Create a local bucket**

```awslocal s3 mb s3://[my-bucket]```

**Invoke Lambda** locally

```awslocal lambda list-functions```

# SYNOPSIS

**awslocal** [*aws-cli-arguments*...]

# DESCRIPTION

**awslocal** is a thin wrapper around the **aws** CLI for use with [LocalStack](https://github.com/localstack/localstack). Instead of passing **--endpoint-url=http://localhost:4566** on every call, run the same subcommands via **awslocal**.

Install with **pip install awscli-local** (wrapper only) or **pip install awscli-local[ver1]** to also pull AWS CLI v1. Usage matches **aws**; see **aws help**.

# PARAMETERS

All arguments are forwarded to the underlying **aws** CLI (services, subcommands, and flags). There is no separate command tree.

# CONFIGURATION

Environment variables:

**AWS_ENDPOINT_URL**

> Endpoint to use (takes precedence over deprecated vars below).

**LOCALSTACK_HOST** (deprecated)

> **hostname:port** for LocalStack (default **localhost:4566**).

**USE_SSL** (deprecated)

> Whether to use SSL when connecting (default false).

Standard AWS credential and region variables still apply for the CLI; LocalStack often accepts test credentials.

# CAVEATS

AWS CLI v2 is not auto-installed from PyPI; **awslocal** can still work if v2 is already on PATH, with known gaps (for example some **cloudformation package** endpoint cases). Prefer LocalStack docs for service coverage and ports. Not a substitute for production **aws** against real AWS.

# SEE ALSO

[aws](/man/aws)(1), [localstack](/man/localstack)(1)

# RESOURCES

```[Source code](https://github.com/localstack/awscli-local)```

```[Homepage](https://localstack.cloud)```

<!-- verified: 2026-07-19 -->
