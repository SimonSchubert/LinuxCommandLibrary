# TAGLINE

minimal certificate authority application

# TLDR

**Sign certificate request**

```openssl ca -in [request.csr] -out [certificate.crt]```

**Sign with specific CA**

```openssl ca -config [ca.cnf] -cert [ca.crt] -keyfile [ca.key] -in [request.csr] -out [cert.crt]```

**Revoke certificate**

```openssl ca -revoke [certificate.crt]```

**Generate CRL**

```openssl ca -gencrl -out [crl.pem]```

**List issued certificates**

```openssl ca -status [serial_number]```

# SYNOPSIS

**openssl ca** [_options_] [-in _csr_] [-out _cert_]

# PARAMETERS

**-in** _file_
> Input CSR.

**-out** _file_
> Output certificate.

**-config** _file_
> Config file.

**-cert** _file_
> CA certificate.

**-keyfile** _file_
> CA private key.

**-days** _n_
> Validity period.

**-revoke** _file_
> Revoke certificate.

**-gencrl**
> Generate CRL.

# DESCRIPTION

**openssl ca** is a minimal certificate authority application. It signs certificate requests, maintains a database of issued certificates, and generates Certificate Revocation Lists.

# CA SETUP

```
# Initialize CA
mkdir -p demoCA/{certs,crl,newcerts,private}
touch demoCA/index.txt
echo '01' > demoCA/serial
```

# CAVEATS

Use proper CA software for production. Database format is proprietary. Configuration complex for beginners.

# HISTORY

The openssl ca command has been part of OpenSSL since early versions, providing basic CA functionality.

# SEE ALSO

[openssl-req](/man/openssl-req)(1), [openssl-x509](/man/openssl-x509)(1), [openssl-crl](/man/openssl-crl)(1)
