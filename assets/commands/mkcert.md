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

**--help**
> Display help information.

# DESCRIPTION

**mkcert** creates locally-trusted certificates. It simplifies HTTPS for development.

The tool installs a local CA and generates trusted certificates. No browser warnings.

mkcert creates dev certificates.

# CAVEATS

Development only. Keep root CA secure. Don't share CA key.

# HISTORY

mkcert was created by **Filippo Valsorda** to simplify local HTTPS development with trusted certificates.

# SEE ALSO

[openssl](/man/openssl)(1), [certbot](/man/certbot)(1)

