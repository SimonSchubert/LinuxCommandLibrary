# TAGLINE

manages PKCS#11 modules

# TLDR

**List modules**

```p11-kit list-modules```

**List tokens**

```p11-kit list-tokens```

**Show object info**

```p11-kit list-objects```

**Extract CA certificates as PEM bundle**

```p11-kit extract --format=pem-bundle --filter=ca-anchors [path/to/output.pem]```

**Run a PKCS#11 server** on a Unix socket

```p11-kit server --provider [module.so] [pkcs11:token-uri]```

**Generate a key pair** on a token

```p11-kit generate-keypair --type=rsa [pkcs11:token-uri]```

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
> Extract certificates and trust policy from the shared trust store.

**server**
> Run a PKCS#11 server exposing tokens on a local socket.

**remote**
> Expose a PKCS#11 module remotely over stdin/stdout.

**generate-keypair**
> Generate a key pair on a token (rsa, ecdsa, eddsa).

**add-profile**
> Create a new profile object on a token.

**delete-profile**
> Delete a profile object from a token.

**--format** _FORMAT_
> Output format for extract (e.g., pem-bundle, x509-directory).

**--filter** _FILTER_
> Certificate filter for extract (e.g., ca-anchors, trust-policy, blocklist, certificates).

**-v, --verbose**
> Run in verbose mode with debug output.

**-q, --quiet**
> Run in quiet mode without warnings.

# DESCRIPTION

**p11-kit** provides a way to load and enumerate PKCS#11 modules on a system. It acts as a proxy, allowing applications to use a single PKCS#11 module that aggregates access to all registered tokens (smart cards, HSMs, software tokens).

The **extract** command is commonly used to export CA certificates from trust stores into PEM bundles or other formats usable by applications like web servers and curl.

# CAVEATS

Module configuration is system-wide in /etc/pkcs11/modules/. Root privileges required for system trust store changes. Applications using GnuTLS or NSS often depend on p11-kit for certificate trust management.

# HISTORY

p11-kit was created to **unify PKCS#11 module** management across applications.

# SEE ALSO

[trust](/man/trust)(1), [pkcs11-tool](/man/pkcs11-tool)(1), [openssl](/man/openssl)(1)

