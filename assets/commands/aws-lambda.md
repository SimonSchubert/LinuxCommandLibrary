# TAGLINE

Manage serverless functions and event-driven compute.

# TLDR

**Create a function** from a ZIP file

```aws lambda create-function --function-name [my-function] --runtime python3.11 --role [arn:aws:iam::account:role/lambda-role] --handler [index.handler] --zip-file fileb://[function.zip]```

**Invoke a function** and get the response

```aws lambda invoke --function-name [my-function] --payload '{"key": "value"}' response.json```

**List all functions** in the account

```aws lambda list-functions```

**Update function code** from a ZIP file

```aws lambda update-function-code --function-name [my-function] --zip-file fileb://[function.zip]```

**Update function configuration** (memory, timeout)

```aws lambda update-function-configuration --function-name [my-function] --memory-size 512 --timeout 30```

**Create an event source mapping** from SQS

```aws lambda create-event-source-mapping --function-name [my-function] --event-source-arn [arn:aws:sqs:region:account:queue-name]```

**Publish a new version**

```aws lambda publish-version --function-name [my-function]```

# SYNOPSIS

**aws lambda** _command_ [_options_]

# DESCRIPTION

**aws lambda** is the AWS CLI interface for AWS Lambda, a serverless compute service that runs code in response to events without provisioning or managing servers. Lambda automatically scales and handles high availability.

Lambda supports multiple runtimes including Python, Node.js, Java, Go, Ruby, .NET, and custom runtimes. Functions can be triggered by AWS services, HTTP requests via API Gateway, or direct invocation.

# COMMANDS

**create-function**
> Create a new Lambda function

**delete-function**
> Delete a function

**invoke**
> Execute a function synchronously

**list-functions**
> List all functions

**update-function-code**
> Deploy new function code

**update-function-configuration**
> Change function settings

**publish-version**
> Create an immutable version snapshot

**create-alias**
> Create a pointer to a function version

**create-event-source-mapping**
> Connect function to event source

**publish-layer-version**
> Create a reusable code layer

**add-permission**
> Grant invoke access to other services

# CAVEATS

Functions have a 15-minute maximum timeout. Deployment package size is limited to 50MB zipped (250MB unzipped). Cold starts add latency on first invocation. Concurrent execution limits apply per account and region. VPC-connected functions may have longer cold starts.

# HISTORY

AWS Lambda launched in **November 2014** as the first major serverless compute service. It initially supported only Node.js. Python support came in **2015**, and custom runtimes in **2018**. Lambda@Edge for CloudFront, container image support, and Lambda URLs have expanded its use cases significantly.

# SEE ALSO

[aws](/man/aws)(1), [aws-apigateway](/man/aws-apigateway)(1), [aws-events](/man/aws-events)(1)
