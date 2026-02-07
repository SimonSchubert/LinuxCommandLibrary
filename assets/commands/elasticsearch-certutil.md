# TAGLINE

Elasticsearch TLS certificate generator

# TLDR

**Generate CA certificate**

```elasticsearch-certutil ca```

**Generate node certificate**

```elasticsearch-certutil cert --ca [elastic-stack-ca.p12]```

**Generate CSR**

```elasticsearch-certutil csr```

**Generate HTTP certificates**

```elasticsearch-certutil http```

**Output in PEM format**

```elasticsearch-certutil ca --pem```

# SYNOPSIS

**elasticsearch-certutil** _mode_ [_options_]

# SUBCOMMANDS

**ca**
> Generate certificate authority.

**cert**
> Generate X.509 certificates.

**csr**
> Generate certificate signing requests.

**http**
> Generate HTTP layer certificates.

# PARAMETERS

**--ca** _file_
> CA certificate to use.

**--out** _file_
> Output file path.

**--pem**
> Output in PEM format.

**--dns** _names_
> DNS names for certificate.

**--ip** _addresses_
> IP addresses for certificate.

**--pass** _password_
> Password for output file.

# DESCRIPTION

**elasticsearch-certutil** generates certificates and certificate authorities for securing Elasticsearch clusters. It simplifies the certificate management process by automating the creation of self-signed certificates, certificate authorities, and certificate signing requests.

The tool is essential for enabling TLS/SSL encryption on both the transport layer (node-to-node communication) and the HTTP layer (client API access). It generates certificates in PKCS#12 or PEM format and can include multiple DNS names and IP addresses for cluster deployments.

elasticsearch-certutil streamlines security configuration required for production Elasticsearch deployments and enables features like Elastic Stack security.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-keystore](/man/elasticsearch-keystore)(1)

