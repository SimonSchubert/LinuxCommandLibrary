# TLDR

**Create PKCS#7 from CRL** and certificates

```openssl crl2pkcs7 -in [crl.pem] -certfile [cert.pem] -out [result.p7b]```

**Create PKCS#7 from CRL** only (no certificates)

```openssl crl2pkcs7 -in [crl.pem] -nocrl -out [result.p7b]```

**Create PKCS#7 from multiple** CRLs

```openssl crl2pkcs7 -in [crl1.pem] -in [crl2.pem] -out [result.p7b]```

**Output in DER format**

```openssl crl2pkcs7 -in [crl.pem] -outform DER -out [result.p7b]```

**Include certificate chain**

```openssl crl2pkcs7 -nocrl -certfile [chain.pem] -out [certs.p7b]```

# SYNOPSIS

**openssl crl2pkcs7** [_options_] [_-in file_] [_-out file_]

# PARAMETERS

**-in** _FILE_
> Input CRL file (can be specified multiple times).

**-out** _FILE_
> Output PKCS#7 file.

**-certfile** _FILE_
> File containing certificates to include.

**-nocrl**
> Don't include the CRL in the output (certificates only).

**-inform** _FORMAT_
> Input CRL format: PEM or DER.

**-outform** _FORMAT_
> Output PKCS#7 format: PEM or DER.

# DESCRIPTION

**openssl crl2pkcs7** converts Certificate Revocation Lists (CRLs) and X.509 certificates into PKCS#7 format. PKCS#7 is a standard format for storing cryptographic data, often used for certificate bundles and signed data.

The command is useful for creating PKCS#7 structures that combine CRLs with their associated CA certificates. This format is commonly required by certain applications and protocols for distributing revocation information along with certificate chains.

The **-nocrl** option allows creating PKCS#7 files containing only certificates, which is useful for distributing certificate bundles in a widely-supported format.

# CAVEATS

The PKCS#7 output is a "degenerate" form containing only certificates and/or CRLs, with no signed content. Some applications expect the .p7b or .p7c extension for these files. The certificates in the output are not validated; any PEM certificates in the certfile are included.

# HISTORY

PKCS#7 was defined by RSA Security as part of the Public-Key Cryptography Standards. OpenSSL's crl2pkcs7 command provides conversion between the X.509 CRL format and PKCS#7, enabling interoperability with systems that use the PKCS#7 container format.

# SEE ALSO

[crl](/man/crl)(1), [pkcs7](/man/pkcs7)(1), [x509](/man/x509)(1), [openssl](/man/openssl)(1)
