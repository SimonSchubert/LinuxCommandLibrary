# TAGLINE

CRL to PKCS#7 format converter

# TLDR

**Create PKCS#7 from CRL** and certificates

```openssl crl2pkcs7 -in [crl.pem] -certfile [cert.pem] -out [result.p7b]```

**Bundle certificates only** (no CRL) into a .p7b file

```openssl crl2pkcs7 -nocrl -certfile [chain.pem] -out [certs.p7b]```

**Add certificates from multiple files**

```openssl crl2pkcs7 -nocrl -certfile [root.pem] -certfile [intermediate.pem] -out [chain.p7b]```

**Convert a DER CRL** and write DER output

```openssl crl2pkcs7 -inform DER -in [crl.der] -outform DER -out [result.p7b]```

**Inspect the result** by listing the contained certificates

```openssl pkcs7 -in [result.p7b] -print_certs -noout```

# SYNOPSIS

**openssl crl2pkcs7** [_options_] [_-in file_] [_-out file_]

# PARAMETERS

**-in** _FILE_
> Input CRL file (default: standard input). Only one CRL can be read.

**-out** _FILE_
> Output PKCS#7 file (default: standard output).

**-certfile** _FILE_
> PEM file containing one or more certificates to include. Can be given more than once.

**-nocrl**
> Don't include a CRL in the output and don't read one from the input (certificates only).

**-inform** _FORMAT_
> Input CRL format: PEM (default) or DER.

**-outform** _FORMAT_
> Output PKCS#7 format: PEM (default) or DER.

**-provider** _NAME_
> Load and initialize the named provider (OpenSSL 3.0+).

**-help**
> Print a usage message.

# DESCRIPTION

**openssl crl2pkcs7** converts Certificate Revocation Lists (CRLs) and X.509 certificates into PKCS#7 format. PKCS#7 is a standard format for storing cryptographic data, often used for certificate bundles and signed data.

The command is useful for creating PKCS#7 structures that combine CRLs with their associated CA certificates. This format is commonly required by certain applications and protocols for distributing revocation information along with certificate chains.

The **-nocrl** option allows creating PKCS#7 files containing only certificates, which is useful for distributing certificate bundles in a widely-supported format.

# CAVEATS

The PKCS#7 output is a "degenerate" form containing only certificates and/or CRLs, with no signed content. Some applications expect the .p7b or .p7c extension for these files. The certificates in the output are not validated; any PEM certificates in the certfile are included. **-certfile** only accepts PEM; convert DER certificates first with **openssl x509 -inform DER**.

# HISTORY

PKCS#7 was defined by RSA Security as part of the Public-Key Cryptography Standards. OpenSSL's crl2pkcs7 command provides conversion between the X.509 CRL format and PKCS#7, enabling interoperability with systems that use the PKCS#7 container format.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-crl](/man/openssl-crl)(1), [openssl-x509](/man/openssl-x509)(1), [x509](/man/x509)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Homepage](https://openssl-library.org)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-crl2pkcs7/)```

<!-- verified: 2026-11-23 -->
