# TAGLINE

creates and processes certificate signing requests

# TLDR

**Generate CSR with new key**

```openssl req -new -newkey rsa:[4096] -keyout [private.key] -out [request.csr]```

**Generate CSR from existing key**

```openssl req -new -key [private.key] -out [request.csr]```

**Generate self-signed certificate**

```openssl req -x509 -newkey rsa:[4096] -keyout [key.pem] -out [cert.pem] -days [365] -noenc```

**View CSR contents**

```openssl req -in [request.csr] -text -noout```

**Verify CSR signature**

```openssl req -in [request.csr] -verify -noout```

**Generate CSR with subject on command line**

```openssl req -new -key [private.key] -out [request.csr] -subj "/C=[US]/ST=[State]/L=[City]/O=[Org]/CN=[example.com]"```

**Generate CSR with config file**

```openssl req -new -config [openssl.cnf] -keyout [key.pem] -out [request.csr]```

**Generate self-signed cert with SAN extension**

```openssl req -x509 -newkey rsa:[4096] -keyout [key.pem] -out [cert.pem] -days [365] -noenc -addext "subjectAltName=DNS:[example.com],DNS:[www.example.com]"```

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
> Validity period (only with -x509).

**-noenc**
> Don't encrypt the output key. Replaces deprecated -nodes.

**-nodes**
> Don't encrypt key. Deprecated in OpenSSL 3.0; use -noenc instead.

**-subj** _subj_
> Set subject DN (e.g., /C=US/O=Org/CN=host).

**-addext** _ext_
> Add a certificate extension (e.g., subjectAltName=DNS:example.com).

**-config** _file_
> Use alternative configuration file.

**-text**
> Print the CSR or certificate in human-readable form.

**-noout**
> Suppress output of the encoded request.

**-verify**
> Verify the signature on the CSR.

**-in** _file_
> Input CSR file.

**-inform** _DER|PEM_
> Input format. Default is PEM.

**-outform** _DER|PEM_
> Output format. Default is PEM.

**-*digest***
> Message digest to sign the request (e.g., -sha256, -sha384).

# DESCRIPTION

**openssl req** creates and processes certificate signing requests (CSRs). It can also generate self-signed certificates for testing.

CSRs are submitted to Certificate Authorities to obtain signed certificates.

# SUBJECT FORMAT

```bash
openssl req -new -key key.pem -out csr.pem \
  -subj "/C=US/ST=State/L=City/O=Org/CN=example.com"
```

# CAVEATS

Self-signed certificates are not trusted by browsers without manual import. The -nodes flag is deprecated since OpenSSL 3.0; use -noenc instead. CSR does not contain the private key.

# HISTORY

Certificate request functionality has been part of OpenSSL since its SSL/TLS implementation origins.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-x509](/man/openssl-x509)(1), [openssl-ca](/man/openssl-ca)(1), [openssl-genpkey](/man/openssl-genpkey)(1), [openssl-pkey](/man/openssl-pkey)(1), [openssl-rsa](/man/openssl-rsa)(1)
