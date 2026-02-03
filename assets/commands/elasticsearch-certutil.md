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

**elasticsearch-certutil** generates certificates and certificate authorities for securing Elasticsearch clusters. Used for TLS/SSL encryption and node authentication.

# SEE ALSO

[elasticsearch](/man/elasticsearch)(1), [elasticsearch-keystore](/man/elasticsearch-keystore)(1)

