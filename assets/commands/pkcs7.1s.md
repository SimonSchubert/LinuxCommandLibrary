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
> No output.

# DESCRIPTION

**openssl pkcs7** processes PKCS#7 structures (.p7b files), which contain certificate chains without private keys. This format is commonly used to distribute CA certificate bundles and intermediate certificates.

The **-print_certs** option extracts individual PEM certificates from the chain. Format conversion between PEM and DER encodings is supported with **-inform** and **-outform**. The **-text** option displays the structure in human-readable form.

# CAVEATS

Part of OpenSSL. Certificate chains only. No private keys.

# HISTORY

PKCS#7 support in OpenSSL handles **certificate chain** structures.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-pkcs12](/man/openssl-pkcs12)(1)

