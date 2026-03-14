# TAGLINE

manages PKCS#11 modules

# TLDR

**List modules**

```p11-kit list-modules```

**List tokens**

```p11-kit list-tokens```

**Show object info**

```p11-kit list-objects```

**Extract certificates**

```p11-kit extract --format=pem-bundle --filter=ca-anchors [output]```

# SYNOPSIS

**p11-kit** [_command_] [_options_]

# PARAMETERS

**list-modules**
> List PKCS#11 modules.

**list-tokens**
> List tokens.

**list-objects**
> List objects.

**extract**
> Extract certificates.

**--format** _FORMAT_
> Output format.

**--help**
> Display help information.

# DESCRIPTION

**p11-kit** provides a way to load and enumerate PKCS#11 modules on a system. It acts as a proxy, allowing applications to use a single PKCS#11 module that aggregates access to all registered tokens (smart cards, HSMs, software tokens).

The **extract** command is commonly used to export CA certificates from trust stores into PEM bundles or other formats usable by applications like web servers and curl.

# CAVEATS

Module configuration is system-wide in /etc/pkcs11/modules/. Root privileges required for system trust store changes. Applications using GnuTLS or NSS often depend on p11-kit for certificate trust management.

# HISTORY

p11-kit was created to **unify PKCS#11 module** management across applications.

# SEE ALSO

[pkcs11-tool](/man/pkcs11-tool)(1), [openssl](/man/openssl)(1)

