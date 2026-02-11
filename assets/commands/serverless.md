# TAGLINE

Deploy serverless functions to cloud providers

# TLDR

**Create new service**

```serverless create --template [aws-nodejs] --name [my-service]```

**Deploy service**

```serverless deploy```

**Deploy single function**

```serverless deploy function -f [functionName]```

**Invoke function**

```serverless invoke -f [functionName]```

**View logs**

```serverless logs -f [functionName]```

**Remove service**

```serverless remove```

**Run locally**

```serverless invoke local -f [functionName]```

**Print config**

```serverless print```

# SYNOPSIS

**serverless** [_create_] [_deploy_] [_invoke_] [_logs_] [_remove_] [_options_]

# PARAMETERS

**create**
> Create new service.

**deploy**
> Deploy service.

**deploy function**
> Deploy single function.

**invoke** **-f** _FUNC_
> Invoke function.

**invoke local**
> Invoke locally.

**logs** **-f** _FUNC_
> View function logs.

**remove**
> Remove service.

**package**
> Package without deploying.

**print**
> Print configuration.

**--template**, **-t** _TPL_
> Project template.

**--name**, **-n** _NAME_
> Service name.

**--stage**, **-s** _STAGE_
> Deployment stage.

**--region**, **-r** _REGION_
> AWS region.

**--config**, **-c** _FILE_
> Config file.

# DESCRIPTION

**serverless** (sls) is a framework for building serverless applications. It deploys functions to AWS Lambda, Azure Functions, Google Cloud Functions, and others.

Service configuration in serverless.yml defines functions, events, and resources. Events trigger functions from HTTP, queues, schedules, and other sources.

Deployment packages code and provisions infrastructure. CloudFormation (AWS) or equivalent handles resource creation.

Local invocation tests functions without deployment. This speeds up development iteration.

Logs stream function output from cloud providers. They show invocations, errors, and execution details.

Plugins extend functionality: custom domains, monitoring, optimization, and framework integrations.

# CONFIGURATION

**serverless.yml**
> Main service configuration file defining functions, events, resources, plugins, and provider settings.

**~/.serverlessrc**
> User-level configuration for tracking and telemetry preferences.

**AWS_ACCESS_KEY_ID** / **AWS_SECRET_ACCESS_KEY**
> AWS credentials for deployment (or configured via AWS CLI profiles).

# CAVEATS

Cloud provider credentials required. Deployment creates many resources. Cold starts affect latency. Provider lock-in considerations.

# HISTORY

**Serverless Framework** was created by **Austen Collins** in **2015**, originally named JAWS. It pioneered serverless deployment tooling and became the most popular framework for Lambda development.

# SEE ALSO

[aws](/man/aws)(1), [sam](/man/sam)(1), [terraform](/man/terraform)(1), [pulumi](/man/pulumi)(1)
