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

**-cacerts**
> Output CA certificates only.

**-noenc**
> Do not encrypt output private keys (replaces the deprecated **-nodes**).

**-info**
> Print information about the PKCS#12 structure.

**-certfile** _FILE_
> Additional certificates to include when exporting.

**-name** _NAME_
> Friendly name for the certificate and key.

**-passin** _ARG_
> Input password source.

**-passout** _ARG_
> Output password source.

**-legacy**
> Use legacy algorithms and load the legacy provider.

# DESCRIPTION

**openssl pkcs12** creates and parses PKCS#12 (.p12/.pfx) files, which bundle a private key with its corresponding certificate and optional CA chain into a single password-protected file. This format is widely used for transporting credentials between systems.

In export mode (**-export**), it combines a PEM key and certificate into a PKCS#12 archive. In parse mode (default), it extracts certificates and keys from an existing archive. Filters like **-clcerts**, **-cacerts**, **-nocerts**, and **-nokeys** control which components are extracted.

# CAVEATS

By default keys and certificates are encrypted with AES-256-CBC. Older consumers, and older files such as those using RC2, may need **-legacy**. Passing a password directly on the command line exposes it in the process list, so prefer **-passin file:** or **-passin env:**.

# HISTORY

PKCS#12 support in OpenSSL enables **certificate bundle** operations.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-x509](/man/openssl-x509)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-pkcs12/)```

<!-- verified: 2026-11-08 -->
