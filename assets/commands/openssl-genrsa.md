# TAGLINE

generates RSA private keys

# TLDR

**Generate 2048-bit RSA key**

```openssl genrsa -out [private.key] 2048```

**Generate 4096-bit key**

```openssl genrsa -out [private.key] 4096```

**Generate encrypted key with AES-256**

```openssl genrsa -aes256 -out [private.key] 4096```

**Generate key with a specific public exponent**

```openssl genrsa -F4 -out [private.key] 2048```

**Generate key to stdout**

```openssl genrsa 2048```

# SYNOPSIS

**openssl** **genrsa** [_options_] [_bits_]

# PARAMETERS

**-out** _file_
> Output file for private key. Writes to stdout if omitted.

**-aes256**, **-aes192**, **-aes128**, **-des3**, **-des**
> Encrypt the output key with the specified cipher. Prompts for a passphrase.

**-passout** _arg_
> Password source for encryption (e.g. **pass:password**, **file:pathname**, **env:var**, **fd:number**, **stdin**).

**-F4**
> Use 65537 (0x10001) as the public exponent (default).

**-3**
> Use 3 as the public exponent.

**-traditional**
> Write the key in the traditional PKCS#1 format instead of PKCS#8.

**-verbose**
> Print extra details during key generation.

_bits_
> Key size in bits (default 2048). Minimum 512, but 2048 or higher is recommended.

# DESCRIPTION

**openssl genrsa** generates RSA private keys. The key can optionally be encrypted with a passphrase. Common key sizes are 2048 and 4096 bits. Output is in PEM format by default (PKCS#8 in OpenSSL 3.x, PKCS#1 in older versions).

This command is considered a legacy convenience wrapper. The more general **openssl genpkey -algorithm RSA** is preferred in OpenSSL 3.x and supports additional options.

# CAVEATS

Key sizes below 2048 bits are considered insecure. Some applications require the traditional PKCS#1 format; use **-traditional** if needed. In OpenSSL 3.x the default output format changed from PKCS#1 to PKCS#8, which may affect older tools.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-rsa](/man/openssl-rsa)(1), [openssl-genpkey](/man/openssl-genpkey)(1)

