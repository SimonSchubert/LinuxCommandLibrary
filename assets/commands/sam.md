# TAGLINE

AWS Serverless Application Model CLI

# TLDR

**Initialize** a serverless application

```sam init```

Initialize with specific **runtime**

```sam init --runtime [python3.12]```

**Build** Lambda function code

```sam build```

Run serverless application **locally**

```sam local start-api```

**Invoke** a Lambda function locally

```sam local invoke [FunctionName]```

**Deploy** with guided prompts

```sam deploy --guided```

**Validate** a SAM template

```sam validate```

# SYNOPSIS

**sam** _command_ [_options_]

# PARAMETERS

**init**
> Initialize a new serverless application

**build**
> Build Lambda function code

**deploy**
> Deploy application to AWS

**delete**
> Delete a deployed application and its resources

**validate**
> Validate a SAM template

**sync**
> Sync local changes to a deployed application

**logs**
> Fetch and display Lambda function logs

**local invoke**
> Invoke a Lambda function locally

**local start-api**
> Run API Gateway locally

**local start-lambda**
> Start a local Lambda endpoint

**local generate-event**
> Generate sample event payloads for testing

# DESCRIPTION

**sam** is the AWS Serverless Application Model CLI. It provides tools for building, testing, and deploying serverless applications using AWS Lambda, API Gateway, and other AWS services.

The CLI supports local development and testing before cloud deployment.

# CAVEATS

Requires AWS credentials configured. Local testing requires Docker. Deployment creates AWS resources that may incur costs.

# HISTORY

Developed by **AWS** to simplify serverless application development and deployment using Infrastructure as Code.

# SEE ALSO

[aws](/man/aws)(1), [docker](/man/docker)(1)
