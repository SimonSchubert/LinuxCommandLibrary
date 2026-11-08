# TAGLINE

Process PKCS#7 certificate chain structures

# TLDR

**View PKCS#7 structure**

```openssl pkcs7 -in [file.p7b] -print_certs```

**Convert to PEM**

```openssl pkcs7 -in [file.p7b] -out [certs.pem] -print_certs```

**View structure info**

```openssl pkcs7 -in [file.p7b] -text -noout```

**Convert DER to PEM**

```openssl pkcs7 -in [file.der] -inform DER -out [file.pem]```

# SYNOPSIS

**openssl** **pkcs7** [_options_]

# PARAMETERS

**-in** _FILE_
> Input file.

**-out** _FILE_
> Output file.

**-print_certs**
> Print certificates.

**-text**
> Print text form.

**-inform** _FORMAT_
> Input format (PEM, DER).

**-noout**
> Do not output the encoded structure.

**-outform** _FORMAT_
> Output format (PEM, DER).

**-print**
> Print the full structure.

**-quiet**
> Print certificates without their subject and issuer lines.

# DESCRIPTION

**openssl pkcs7** processes PKCS#7 structures (.p7b files), which contain certificate chains without private keys. This format is commonly used to distribute CA certificate bundles and intermediate certificates.

The **-print_certs** option extracts individual PEM certificates from the chain. Format conversion between PEM and DER encodings is supported with **-inform** and **-outform**. The **-text** option displays the structure in human-readable form.

# CAVEATS

Only understands PKCS#7 v1.5 as specified in RFC 2315.

# HISTORY

PKCS#7 support in OpenSSL handles **certificate chain** structures.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-pkcs12](/man/openssl-pkcs12)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-pkcs7/)```

<!-- verified: 2026-11-08 -->
