# TLDR

**Create PKCS#12 file**

```openssl pkcs12 -export -out [cert.p12] -inkey [key.pem] -in [cert.pem]```

**Extract certificate**

```openssl pkcs12 -in [cert.p12] -clcerts -nokeys -out [cert.pem]```

**Extract private key**

```openssl pkcs12 -in [cert.p12] -nocerts -out [key.pem]```

**View PKCS#12 info**

```openssl pkcs12 -in [cert.p12] -info -noout```

# SYNOPSIS

**openssl** **pkcs12** [_options_]

# PARAMETERS

**-export**
> Create PKCS#12 file.

**-in** _FILE_
> Input file.

**-out** _FILE_
> Output file.

**-inkey** _FILE_
> Private key.

**-clcerts**
> Output client certs only.

**-nocerts**
> No certificates.

**-nokeys**
> No private keys.

# DESCRIPTION

**openssl pkcs12** manages PKCS#12 files. Certificate bundle format.

The tool creates and extracts .p12/.pfx files. Certificate with key.

openssl pkcs12 handles bundles.

# CAVEATS

Part of OpenSSL. Password protected. Cross-platform format.

# HISTORY

PKCS#12 support in OpenSSL enables **certificate bundle** operations.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-x509](/man/openssl-x509)(1)

