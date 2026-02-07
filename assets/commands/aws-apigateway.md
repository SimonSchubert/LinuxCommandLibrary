# TAGLINE

Create and manage REST APIs for applications

# TLDR

**List all REST APIs**

```aws apigateway get-rest-apis```

**Create a new REST API**

```aws apigateway create-rest-api --name "[MyAPI]" --description "[API description]"```

**Create a regional API** endpoint

```aws apigateway create-rest-api --name "[MyAPI]" --endpoint-configuration types=REGIONAL```

**Get API details** by ID

```aws apigateway get-rest-api --rest-api-id [api-id]```

**Create a resource** (path) in an API

```aws apigateway create-resource --rest-api-id [api-id] --parent-id [parent-id] --path-part "[users]"```

**Create a deployment** to a stage

```aws apigateway create-deployment --rest-api-id [api-id] --stage-name [prod]```

**Delete a REST API**

```aws apigateway delete-rest-api --rest-api-id [api-id]```

# SYNOPSIS

**aws apigateway** _command_ [_options_]

# PARAMETERS

**create-rest-api**
> Create a new REST API

**get-rest-apis**
> List all REST APIs in the account

**get-rest-api**
> Get details of a specific REST API

**delete-rest-api**
> Delete a REST API

**create-resource**
> Create a resource (URL path segment) in an API

**get-resources**
> List resources in an API

**put-method**
> Add an HTTP method to a resource

**put-integration**
> Set up backend integration for a method

**create-deployment**
> Deploy an API to a stage

**get-stages**
> List deployment stages

**get-api-keys**
> List API keys

**create-api-key**
> Create a new API key

**--rest-api-id** _id_
> The identifier of the REST API

**--name** _name_
> Name for the API or resource

**--description** _text_
> Description of the API

**--endpoint-configuration** _config_
> Endpoint type: EDGE, REGIONAL, or PRIVATE

**--stage-name** _name_
> Deployment stage name (dev, staging, prod)

# DESCRIPTION

**aws apigateway** manages Amazon API Gateway REST APIs through the AWS CLI. It creates and configures APIs that act as front doors for applications to access backend services, Lambda functions, or other AWS services.

The typical workflow involves creating an API with **create-rest-api**, defining resources (URL paths) with **create-resource**, adding HTTP methods with **put-method**, configuring backend integrations with **put-integration**, and deploying to a stage with **create-deployment**.

Endpoint types control how the API is accessed: **EDGE** for CloudFront distribution (global), **REGIONAL** for same-region access, and **PRIVATE** for VPC-only access.

API keys and usage plans provide access control and throttling. Stages represent different environments (dev, staging, prod) with independent configurations.

# CAVEATS

Requires AWS credentials configured via **aws configure** or environment variables. REST API changes require deployment to take effect. API Gateway has quotas on resources, methods, and request rates. Private APIs require VPC endpoint configuration.

# HISTORY

**Amazon API Gateway** was launched in **July 2015** as a fully managed service for creating, publishing, and managing APIs. The AWS CLI commands provide programmatic access to API Gateway features. REST APIs were the original offering, with HTTP APIs (simpler, lower cost) and WebSocket APIs added later.

# SEE ALSO

[aws](/man/aws)(1), [aws-lambda](/man/aws-lambda)(1), [aws-iam](/man/aws-iam)(1)
