# TLDR

**Create** a private certificate authority

```aws acm-pca create-certificate-authority --certificate-authority-configuration [file://config.json] --certificate-authority-type ROOT```

**List** all certificate authorities in your account

```aws acm-pca list-certificate-authorities```

**Describe** a specific certificate authority

```aws acm-pca describe-certificate-authority --certificate-authority-arn [arn]```

**Issue** a certificate from a private CA

```aws acm-pca issue-certificate --certificate-authority-arn [ca_arn] --csr [file://csr.pem] --signing-algorithm SHA256WITHRSA --validity [value]```

**Revoke** a certificate

```aws acm-pca revoke-certificate --certificate-authority-arn [ca_arn] --certificate-serial [serial] --revocation-reason KEY_COMPROMISE```

**Delete** a certificate authority

```aws acm-pca delete-certificate-authority --certificate-authority-arn [arn]```

# SYNOPSIS

**aws acm-pca** _command_ [_options_]

# DESCRIPTION

**AWS Certificate Manager Private Certificate Authority (ACM PCA)** is a managed service that enables creation and management of private certificate authorities (CAs) for your organization. It provides a secure, scalable infrastructure for issuing and managing private SSL/TLS certificates without the overhead of operating your own CA infrastructure.

Unlike public certificates from ACM, **private certificates** from ACM PCA are used for internal applications, microservices, VPNs, IoT devices, and other resources within your private networks. The service supports both **root CAs** and **subordinate CAs**, allowing you to build a complete public key infrastructure (PKI) hierarchy.

ACM PCA handles the cryptographic operations and certificate lifecycle management, including certificate issuance, revocation via **Certificate Revocation Lists (CRL)** and **Online Certificate Status Protocol (OCSP)**, and audit reporting. It integrates with **AWS CloudTrail** for comprehensive logging of all API calls and certificate operations.

The service provides API-driven access through AWS SDKs, enabling automation of certificate issuance and management workflows. It supports various **signing algorithms** including RSA and ECDSA with different key sizes and hash functions.

# AVAILABLE COMMANDS

**create-certificate-authority**
> Create a new private or subordinate certificate authority

**delete-certificate-authority**
> Permanently delete a certificate authority (must be disabled first)

**describe-certificate-authority**
> Retrieve detailed information about a specific CA

**issue-certificate**
> Issue a private certificate from a CA using a CSR

**get-certificate**
> Retrieve an issued certificate in PEM format

**revoke-certificate**
> Revoke a certificate and add it to the CRL

**list-certificate-authorities**
> List all CAs in your account with optional filtering

**create-certificate-authority-audit-report**
> Generate an audit report for CA activity

**create-permission**
> Grant ACM permission to use the CA for certificate renewal

**put-policy**
> Attach a resource-based policy to a CA

**tag-certificate-authority**
> Add metadata tags to a CA for organization

**update-certificate-authority**
> Modify CA configuration including CRL and OCSP settings

**wait**
> Wait for CA state changes (active, created, deleted)

# CAVEATS

Operations have API rate limits; exceeding them returns **ThrottlingException** errors. Deleted CAs cannot be restored after the restoration period expires. Certificate issuance requires a valid CSR (Certificate Signing Request). Private certificates are not trusted by public browsers and are intended for internal use only.

# HISTORY

**AWS Certificate Manager Private Certificate Authority** was launched in **April 2018** to provide managed private CA services on AWS. It eliminated the need for organizations to operate their own certificate authority infrastructure, offering a scalable and secure alternative for private PKI management.

# SEE ALSO

[aws-acm](/man/aws-acm)(1), [aws-iot](/man/aws-iot)(1), [aws-cloudtrail](/man/aws-cloudtrail)(1), [aws](/man/aws)(1)
