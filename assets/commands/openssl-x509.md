# TLDR

**View certificate details**

```openssl x509 -in [certificate.crt] -text -noout```

**Get certificate fingerprint**

```openssl x509 -in [certificate.crt] -fingerprint -sha256 -noout```

**Convert PEM to DER**

```openssl x509 -in [cert.pem] -outform DER -out [cert.der]```

**Check expiration date**

```openssl x509 -in [certificate.crt] -enddate -noout```

**Extract public key**

```openssl x509 -in [certificate.crt] -pubkey -noout```

**Create self-signed from key**

```openssl x509 -req -in [csr.pem] -signkey [key.pem] -out [cert.pem] -days [365]```

# SYNOPSIS

**openssl x509** [_options_] [-in _file_] [-out _file_]

# PARAMETERS

**-in** _file_
> Input certificate.

**-out** _file_
> Output file.

**-text**
> Print text form.

**-noout**
> Don't output certificate.

**-fingerprint**
> Print fingerprint.

**-subject**, **-issuer**
> Print subject/issuer.

**-dates**
> Print validity dates.

**-pubkey**
> Output public key.

**-req**
> Input is CSR.

**-signkey** _file_
> Self-sign with key.

# DESCRIPTION

**openssl x509** is a multi-purpose certificate utility. It can display information, convert formats, sign certificates, and modify certificate properties.

One of the most commonly used OpenSSL commands for certificate management.

# COMMON QUERIES

```bash
# Subject
openssl x509 -in cert.pem -subject -noout

# Validity dates
openssl x509 -in cert.pem -dates -noout

# Serial number
openssl x509 -in cert.pem -serial -noout
```

# CAVEATS

Different from openssl req which creates certificates. Use -noout with info commands to suppress PEM output.

# HISTORY

X.509 is the ITU-T standard for PKI, with OpenSSL providing comprehensive tooling since its early versions.

# SEE ALSO

[openssl-req](/man/openssl-req)(1), [openssl-ca](/man/openssl-ca)(1), [openssl-verify](/man/openssl-verify)(1)
