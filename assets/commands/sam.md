# TLDR

**Initialize** a serverless application

```sam init```

Initialize with specific **runtime**

```sam init -r python3.7```

**Package** a SAM application

```sam package```

**Build** Lambda function code

```sam build```

Run serverless application **locally**

```sam local start-api```

**Deploy** an AWS SAM application

```sam deploy```

# SYNOPSIS

**sam** _command_ [_options_]

# PARAMETERS

**init**
> Initialize a new serverless application

**-r**, **--runtime** _runtime_
> Specify Lambda runtime (python3.7, nodejs18.x, etc.)

**package**
> Package application for deployment

**build**
> Build Lambda function code

**local start-api**
> Run API Gateway locally

**deploy**
> Deploy application to AWS

# DESCRIPTION

**sam** is the AWS Serverless Application Model CLI. It provides tools for building, testing, and deploying serverless applications using AWS Lambda, API Gateway, and other AWS services.

The CLI supports local development and testing before cloud deployment.

# CAVEATS

Requires AWS credentials configured. Local testing requires Docker. Deployment creates AWS resources that may incur costs.

# HISTORY

Developed by **AWS** to simplify serverless application development and deployment using Infrastructure as Code.

# SEE ALSO

[aws](/man/aws)(1), [docker](/man/docker)(1)
