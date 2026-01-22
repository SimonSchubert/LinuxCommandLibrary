# TLDR

**Request** a new SSL/TLS certificate

```aws acm request-certificate --domain-name [example.com] --validation-method DNS```

**List** all certificates in your account

```aws acm list-certificates```

**Describe** a specific certificate in detail

```aws acm describe-certificate --certificate-arn [arn]```

**Import** a certificate into ACM

```aws acm import-certificate --certificate [file://cert.pem] --private-key [file://key.pem]```

**Export** a private certificate and its private key

```aws acm export-certificate --certificate-arn [arn] --passphrase [file://pass.txt]```

**Delete** a certificate

```aws acm delete-certificate --certificate-arn [arn]```

# SYNOPSIS

**aws acm** _command_ [_options_]

# DESCRIPTION

**AWS Certificate Manager (ACM)** is a service for provisioning, managing, deploying, and renewing SSL/TLS certificates for AWS-based websites and applications. It simplifies certificate lifecycle management by handling complex tasks like certificate creation, validation, renewal, and deployment.

ACM provides **public certificates** at no additional charge for use with AWS services like **Elastic Load Balancing**, **Amazon CloudFront**, **Amazon API Gateway**, and other integrated AWS services. It also supports **private certificates** for internal resources using AWS Certificate Manager Private Certificate Authority (PCA).

The service automates certificate renewal for ACM-issued certificates, eliminating manual renewal processes and reducing the risk of certificate expiration. Certificates can be validated through **DNS validation** (recommended) or **email validation**.

ACM integrates seamlessly with AWS services, allowing automatic deployment and renewal of certificates without manual intervention. Certificates managed by ACM cannot be downloaded but can be exported if they were imported or are private certificates.

# AVAILABLE COMMANDS

**add-tags-to-certificate**
> Add metadata tags to an ACM certificate for organization and billing

**delete-certificate**
> Permanently delete a certificate (must not be in use)

**describe-certificate**
> Retrieve detailed information about a certificate including status, domain names, and validation details

**export-certificate**
> Export a private certificate and its private key (requires passphrase)

**get-account-configuration**
> Retrieve account-level ACM configuration settings

**get-certificate**
> Retrieve certificate and certificate chain in PEM format

**import-certificate**
> Import a third-party certificate into ACM for management

**list-certificates**
> List all certificates with optional filtering by status

**list-tags-for-certificate**
> List all tags attached to a specific certificate

**put-account-configuration**
> Configure account-level ACM settings like expiration events

**remove-tags-from-certificate**
> Remove metadata tags from a certificate

**renew-certificate**
> Manually renew an eligible certificate

**request-certificate**
> Request a new public SSL/TLS certificate from ACM

**resend-validation-email**
> Resend domain validation email for email-based validation

**update-certificate-options**
> Update certificate configuration like certificate transparency logging

**wait**
> Wait for certificate state changes (issued, validated)

# CAVEATS

Certificates managed by ACM cannot be exported unless they were imported or are private certificates. Certificate deletion is permanent and cannot be undone. Certificates must not be associated with any AWS resources before deletion. DNS validation requires the ability to modify DNS records for the domain.

# HISTORY

**AWS Certificate Manager** was launched in **January 2016** to simplify SSL/TLS certificate management on AWS. Initially supporting only Elastic Load Balancing, it expanded to CloudFront, API Gateway, and other services. Private CA support was added in **April 2018**, and DNS validation became available to streamline the validation process.

# SEE ALSO

[aws-acm-pca](/man/aws-acm-pca)(1), [aws-elbv2](/man/aws-elbv2)(1), [aws-cloudfront](/man/aws-cloudfront)(1), [aws-apigateway](/man/aws-apigateway)(1), [aws](/man/aws)(1)
