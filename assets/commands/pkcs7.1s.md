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

**openssl pkcs7** processes PKCS#7 structures. Certificate chain format.

The tool handles .p7b files. Extracts certificates from chains.

openssl pkcs7 manages chains.

# CAVEATS

Part of OpenSSL. Certificate chains only. No private keys.

# HISTORY

PKCS#7 support in OpenSSL handles **certificate chain** structures.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-pkcs12](/man/openssl-pkcs12)(1)

