# TAGLINE

generates RSA private keys

# TLDR

**Generate 2048-bit RSA key**

```openssl genrsa -out [private.key] 2048```

**Generate 4096-bit key**

```openssl genrsa -out [private.key] 4096```

**Generate encrypted key**

```openssl genrsa -aes256 -out [private.key] 2048```

**Generate key to stdout**

```openssl genrsa 2048```

# SYNOPSIS

**openssl** **genrsa** [_options_] [_bits_]

# PARAMETERS

**-out** _file_
> Output file for private key.

**-aes256**, **-aes128**, **-des3**
> Encrypt key with algorithm.

**-passout** _arg_
> Password source for encryption.

_bits_
> Key size in bits (default 2048).

# DESCRIPTION

**openssl genrsa** generates RSA private keys. The key can optionally be encrypted with a passphrase. Common key sizes are 2048 and 4096 bits. Output is in PEM format by default.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-rsa](/man/openssl-rsa)(1)

