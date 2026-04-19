# TAGLINE

creates locally-trusted certificates

# TLDR

**Install local CA**

```mkcert -install```

**Generate certificate**

```mkcert [localhost]```

**Multiple domains**

```mkcert [localhost] [127.0.0.1] [::1]```

**Wildcard certificate**

```mkcert [*.local.dev]```

**Specify output names**

```mkcert -key-file [key.pem] -cert-file [cert.pem] [localhost]```

**Generate a PKCS#12 bundle**

```mkcert -pkcs12 [example.test]```

**Show CA root directory**

```mkcert -CAROOT```

**Uninstall CA**

```mkcert -uninstall```

# SYNOPSIS

**mkcert** [_options_] [_domains_]

# PARAMETERS

_DOMAINS_
> Domain names for certificate.

**-install**
> Install local CA.

**-uninstall**
> Uninstall local CA.

**-key-file** _FILE_
> Key output file.

**-cert-file** _FILE_
> Certificate output file.

**-p12-file** _FILE_
> PKCS#12 output file (used with **-pkcs12**).

**-pkcs12**
> Produce a ".p12"/".pfx" file with certificate and key (for Java/legacy tools).

**-client**
> Generate a certificate for client authentication.

**-ecdsa**
> Use ECDSA keys instead of RSA.

**-csr** _CSR_
> Generate a certificate based on the supplied CSR.

**-CAROOT**
> Print the CA certificate and key storage location.

**--help**
> Display help information.

# DESCRIPTION

**mkcert** creates locally-trusted certificates. It simplifies HTTPS for development.

The tool installs a local CA and generates trusted certificates. No browser warnings.

# CAVEATS

Development only. Keep root CA secure. Don't share CA key.

# HISTORY

mkcert was created by **Filippo Valsorda** to simplify local HTTPS development with trusted certificates.

# SEE ALSO

[openssl](/man/openssl)(1), [certbot](/man/certbot)(1)

