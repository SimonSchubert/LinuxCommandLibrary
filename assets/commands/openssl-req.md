# TLDR

**Generate CSR with new key**

```openssl req -new -newkey rsa:[4096] -keyout [private.key] -out [request.csr]```

**Generate CSR from existing key**

```openssl req -new -key [private.key] -out [request.csr]```

**Generate self-signed certificate**

```openssl req -x509 -newkey rsa:[4096] -keyout [key.pem] -out [cert.pem] -days [365] -nodes```

**View CSR contents**

```openssl req -in [request.csr] -text -noout```

**Generate CSR with config file**

```openssl req -new -config [openssl.cnf] -keyout [key.pem] -out [request.csr]```

# SYNOPSIS

**openssl req** [_options_]

# PARAMETERS

**-new**
> Generate new CSR.

**-x509**
> Output certificate instead of CSR.

**-newkey** _type:bits_
> Generate new key.

**-key** _file_
> Use existing key.

**-keyout** _file_
> Output key file.

**-out** _file_
> Output file.

**-days** _n_
> Validity period.

**-nodes**
> Don't encrypt key.

**-subj** _subj_
> Subject DN.

# DESCRIPTION

**openssl req** creates and processes certificate signing requests (CSRs). It can also generate self-signed certificates for testing.

CSRs are submitted to Certificate Authorities to obtain signed certificates.

# SUBJECT FORMAT

```bash
openssl req -new -key key.pem -out csr.pem \
  -subj "/C=US/ST=State/L=City/O=Org/CN=example.com"
```

# CAVEATS

Self-signed certs not trusted by browsers. Use -nodes carefully. CSR doesn't contain private key.

# HISTORY

Certificate request functionality has been part of OpenSSL since its SSL/TLS implementation origins.

# SEE ALSO

[openssl-x509](/man/openssl-x509)(1), [openssl-ca](/man/openssl-ca)(1), [openssl-genpkey](/man/openssl-genpkey)(1)
