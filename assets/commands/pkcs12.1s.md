# TAGLINE

Create and parse PKCS#12 certificate bundles

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

**openssl pkcs12** creates and parses PKCS#12 (.p12/.pfx) files, which bundle a private key with its corresponding certificate and optional CA chain into a single password-protected file. This format is widely used for transporting credentials between systems.

In export mode (**-export**), it combines a PEM key and certificate into a PKCS#12 archive. In parse mode (default), it extracts certificates and keys from an existing archive. Filters like **-clcerts**, **-cacerts**, **-nocerts**, and **-nokeys** control which components are extracted.

# CAVEATS

Part of OpenSSL. Password protected. Cross-platform format.

# HISTORY

PKCS#12 support in OpenSSL enables **certificate bundle** operations.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-x509](/man/openssl-x509)(1)

